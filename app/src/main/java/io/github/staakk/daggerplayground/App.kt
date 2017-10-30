package io.github.staakk.daggerplayground

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import io.github.staakk.daggerplayground.di.DaggerAppComponent

/**
 * Created 19.10.2017.
 */
class App: DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val appComponent = DaggerAppComponent.builder()
                .application(this)
                .build()

        appComponent.inject(this)
        return appComponent
    }

}