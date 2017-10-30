package io.github.staakk.daggerplayground.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.github.staakk.daggerplayground.di.scope.ActivityScoped
import io.github.staakk.daggerplayground.injectactivity.InjectActivity
import io.github.staakk.daggerplayground.injectactivity.InjectActivityModule
import io.github.staakk.daggerplayground.mvp.MvpActivity
import io.github.staakk.daggerplayground.mvp.MvpModule

/**
 * Created 19.10.2017.
 */
@Module abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = arrayOf(InjectActivityModule::class))
    abstract fun injectActivity(): InjectActivity

    @ActivityScoped
    @ContributesAndroidInjector(modules = arrayOf(MvpModule::class))
    abstract fun mvpActivity(): MvpActivity

}