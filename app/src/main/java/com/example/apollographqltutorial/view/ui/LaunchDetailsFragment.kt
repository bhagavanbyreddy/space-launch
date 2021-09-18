package com.example.apollographqltutorial.view.ui

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.apollographqltutorial.databinding.LaunchDetailsBinding
import com.example.apollographqltutorial.view.state.ViewState
import com.example.apollographqltutorial.viewmodel.LaunchesViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import androidx.lifecycle.observe


@ExperimentalCoroutinesApi
@AndroidEntryPoint
class LaunchDetailsFragment : Fragment() {

    private lateinit var binding: LaunchDetailsBinding
    private val args: LaunchDetailsFragmentArgs by navArgs()
    private val viewModel by viewModels<LaunchesViewModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = LaunchDetailsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.queryLaunchDetails(args.id)
        observeLiveData()
    }

    private fun observeLiveData() {
        viewModel.launchData.observe(viewLifecycleOwner) { response ->
            when (response) {
                is ViewState.Loading -> {
                    binding.characterDetailsFetchProgress.visibility = View.VISIBLE
                    binding.characterDetailsNotFound.visibility = View.GONE
                }
                is ViewState.Success -> {
                    if (response.value?.data?.launch == null) {
                        binding.characterDetailsFetchProgress.visibility = View.GONE
                        binding.characterDetailsNotFound.visibility = View.VISIBLE
                    } else {
                        binding.query = response.value.data
                        binding.characterDetailsFetchProgress.visibility = View.GONE
                        binding.characterDetailsNotFound.visibility = View.GONE
                    }
                    binding.mainCl.visibility = View.VISIBLE
                }
                is ViewState.Error -> {
                    binding.characterDetailsFetchProgress.visibility = View.GONE
                    binding.characterDetailsNotFound.visibility = View.VISIBLE
                    binding.mainCl.visibility = View.VISIBLE
                }
            }
        }
    }
}

@BindingAdapter("flickerImage")
fun setImageUrl(imageView: ImageView, url: String?) {
    url?.let {
        imageView.load(url) { crossfade(true) }
    }
}

