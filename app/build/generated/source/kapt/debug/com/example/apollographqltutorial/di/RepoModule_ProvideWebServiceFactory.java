// Generated by Dagger (https://dagger.dev).
package com.example.apollographqltutorial.di;

import com.example.apollographqltutorial.networking.ApolloClientBuilder;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepoModule_ProvideWebServiceFactory implements Factory<ApolloClientBuilder> {
  @Override
  public ApolloClientBuilder get() {
    return provideWebService();
  }

  public static RepoModule_ProvideWebServiceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ApolloClientBuilder provideWebService() {
    return Preconditions.checkNotNullFromProvides(RepoModule.INSTANCE.provideWebService());
  }

  private static final class InstanceHolder {
    private static final RepoModule_ProvideWebServiceFactory INSTANCE = new RepoModule_ProvideWebServiceFactory();
  }
}