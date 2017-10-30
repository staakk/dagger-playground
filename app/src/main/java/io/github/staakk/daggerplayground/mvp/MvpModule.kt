package io.github.staakk.daggerplayground.mvp

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import io.github.staakk.daggerplayground.di.scope.ActivityScoped
import io.github.staakk.daggerplayground.di.scope.FragmentScope
import javax.inject.Named

/**
 * Created 19.10.2017.
 */
@Module
abstract class MvpModule {

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun mvpFragment(): MvpFragment

    @ActivityScoped
    @Binds
    abstract fun mvpPresenter(presenter: MvpPresenter): MvpContract.Presenter

    @Module
    companion object {

        @ActivityScoped
        @Provides
        @Named(MvpActivity.ARG_SOME_STRING)
        @JvmStatic
        fun provideSomeString(mvpActivity: MvpActivity): String {
            return mvpActivity.intent.getStringExtra(MvpActivity.ARG_SOME_STRING)
        }

    }

}