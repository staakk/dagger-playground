package io.github.staakk.daggerplayground.injectactivity

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created 19.10.2017.
 */
@Singleton class SomeDependencyImpl @Inject constructor(): SomeDependency {
    val TAG = "SomeDependencyImpl"

    override fun doSomething() {
        Log.d(TAG, "doSomething()")
    }

}