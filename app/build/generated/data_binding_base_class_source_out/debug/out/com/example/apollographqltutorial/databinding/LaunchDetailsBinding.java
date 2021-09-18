// Generated by data binding compiler. Do not edit!
package com.example.apollographqltutorial.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.apollographqltutorial.R;
import com.example.apollographqltutorial.SpaceLaunchDetailsQuery;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LaunchDetailsBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar characterDetailsFetchProgress;

  @NonNull
  public final TextView characterDetailsNotFound;

  @NonNull
  public final TextView descriptionTv;

  @NonNull
  public final ImageView flickerIv;

  @NonNull
  public final TextView idTv;

  @NonNull
  public final TextView launchStatusTv;

  @NonNull
  public final ConstraintLayout mainCl;

  @NonNull
  public final TextView missionDateValTv;

  @NonNull
  public final TextView missionNameValTv;

  @NonNull
  public final TextView rocketNameTv;

  @NonNull
  public final TextView siteNameTv;

  @Bindable
  protected SpaceLaunchDetailsQuery.Data mQuery;

  protected LaunchDetailsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ProgressBar characterDetailsFetchProgress, TextView characterDetailsNotFound,
      TextView descriptionTv, ImageView flickerIv, TextView idTv, TextView launchStatusTv,
      ConstraintLayout mainCl, TextView missionDateValTv, TextView missionNameValTv,
      TextView rocketNameTv, TextView siteNameTv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.characterDetailsFetchProgress = characterDetailsFetchProgress;
    this.characterDetailsNotFound = characterDetailsNotFound;
    this.descriptionTv = descriptionTv;
    this.flickerIv = flickerIv;
    this.idTv = idTv;
    this.launchStatusTv = launchStatusTv;
    this.mainCl = mainCl;
    this.missionDateValTv = missionDateValTv;
    this.missionNameValTv = missionNameValTv;
    this.rocketNameTv = rocketNameTv;
    this.siteNameTv = siteNameTv;
  }

  public abstract void setQuery(@Nullable SpaceLaunchDetailsQuery.Data query);

  @Nullable
  public SpaceLaunchDetailsQuery.Data getQuery() {
    return mQuery;
  }

  @NonNull
  public static LaunchDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.launch_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LaunchDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LaunchDetailsBinding>inflateInternal(inflater, R.layout.launch_details, root, attachToRoot, component);
  }

  @NonNull
  public static LaunchDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.launch_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LaunchDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LaunchDetailsBinding>inflateInternal(inflater, R.layout.launch_details, null, false, component);
  }

  public static LaunchDetailsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static LaunchDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (LaunchDetailsBinding)bind(component, view, R.layout.launch_details);
  }
}