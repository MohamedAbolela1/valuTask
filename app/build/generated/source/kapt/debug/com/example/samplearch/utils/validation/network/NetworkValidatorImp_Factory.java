// Generated by Dagger (https://dagger.dev).
package com.example.samplearch.utils.validation.network;

import android.content.Context;
import com.example.samplearch.utils.platform.Versions;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkValidatorImp_Factory implements Factory<NetworkValidatorImp> {
  private final Provider<Context> contextProvider;

  private final Provider<Versions> versionsProvider;

  public NetworkValidatorImp_Factory(Provider<Context> contextProvider,
      Provider<Versions> versionsProvider) {
    this.contextProvider = contextProvider;
    this.versionsProvider = versionsProvider;
  }

  @Override
  public NetworkValidatorImp get() {
    return newInstance(contextProvider.get(), versionsProvider.get());
  }

  public static NetworkValidatorImp_Factory create(Provider<Context> contextProvider,
      Provider<Versions> versionsProvider) {
    return new NetworkValidatorImp_Factory(contextProvider, versionsProvider);
  }

  public static NetworkValidatorImp newInstance(Context context, Versions versions) {
    return new NetworkValidatorImp(context, versions);
  }
}
