package io.github.staakk.daggerplayground.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import io.github.staakk.daggerplayground.App
import javax.inject.Singleton

/**
 * Created 19.10.2017.
 */
@Singleton
@Component(modules = arrayOf(
        AndroidSupportInjectionModule::class,
        ActivityBindingModule::class
))
interface AppComponent : AndroidInjector<DaggerApplication> {

    fun inject(application: App)

    override fun inject(instance: DaggerApplication?)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent

    }


}