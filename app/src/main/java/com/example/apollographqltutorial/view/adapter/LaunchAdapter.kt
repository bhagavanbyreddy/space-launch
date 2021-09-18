package com.example.apollographqltutorial.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.apollographqltutorial.R
import com.example.apollographqltutorial.SpaceLaunchesListQuery
import com.example.apollographqltutorial.databinding.ItemCharacterBinding


class LaunchAdapter :
    ListAdapter<SpaceLaunchesListQuery.LaunchesPast, LaunchViewHolder>(LaunchDiffUtil()) {

    var onItemClicked: ((SpaceLaunchesListQuery.LaunchesPast) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaunchViewHolder {
        val binding: ItemCharacterBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_character,
            parent,
            false
        )
        return LaunchViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LaunchViewHolder, position: Int) {
        holder.binding.character = getItem(position)

        val character = getItem(position)
        holder.binding.root.setOnClickListener {
            onItemClicked?.invoke(character)
        }

    }

}

class LaunchViewHolder(val binding: ItemCharacterBinding) : RecyclerView.ViewHolder(binding.root)

class LaunchDiffUtil : DiffUtil.ItemCallback<SpaceLaunchesListQuery.LaunchesPast>() {

    override fun areItemsTheSame(
        oldItem: SpaceLaunchesListQuery.LaunchesPast,
        newItem: SpaceLaunchesListQuery.LaunchesPast
    ): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(
        oldItem: SpaceLaunchesListQuery.LaunchesPast,
        newItem: SpaceLaunchesListQuery.LaunchesPast
    ): Boolean {
        return oldItem == newItem
    }

}

@BindingAdapter("missionImage")
fun setImageUrl(imageView: ImageView, url: String?) {
    imageView.load(url) { crossfade(true) }
}