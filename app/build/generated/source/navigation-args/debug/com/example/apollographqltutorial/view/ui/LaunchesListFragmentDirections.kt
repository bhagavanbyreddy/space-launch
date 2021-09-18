package com.example.apollographqltutorial.view.ui

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.apollographqltutorial.R
import kotlin.Int
import kotlin.String

public class LaunchesListFragmentDirections private constructor() {
  private data class NavigateToCharacterDetailsFragment(
    public val id: String
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.navigate_to_character_details_fragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putString("id", this.id)
      return result
    }
  }

  public companion object {
    public fun navigateToCharacterDetailsFragment(id: String): NavDirections =
        NavigateToCharacterDetailsFragment(id)
  }
}
