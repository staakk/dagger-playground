package io.github.staakk.daggerplayground.mvp

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import io.github.staakk.daggerplayground.R
import javax.inject.Inject

class MvpActivity : DaggerAppCompatActivity() {

    companion object {
        const val ARG_SOME_STRING = "str"
    }

    @Inject
    lateinit var mvpFragmentProvider : dagger.Lazy<MvpFragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp)

        var mvpFragment: MvpFragment?
                = supportFragmentManager.findFragmentById(R.id.fragmentContainer) as MvpFragment?

        if (mvpFragment == null) {
            mvpFragment = mvpFragmentProvider.get()

            supportFragmentManager.beginTransaction()
                    .add(R.id.fragmentContainer, mvpFragment)
                    .commit()
        }
    }

}
