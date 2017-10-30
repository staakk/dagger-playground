package io.github.staakk.daggerplayground.injectactivity

import dagger.Binds
import dagger.Module
import io.github.staakk.daggerplayground.di.scope.ActivityScoped

/**
 * Created 19.10.2017.
 */
@Module abstract class InjectActivityModule {

    @Binds
    @ActivityScoped
    abstract fun someDependency(dependencyImpl: SomeDependencyImpl): SomeDependency

}