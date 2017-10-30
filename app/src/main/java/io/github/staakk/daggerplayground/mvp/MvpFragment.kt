package io.github.staakk.daggerplayground.mvp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import io.github.staakk.daggerplayground.R
import io.github.staakk.daggerplayground.di.scope.ActivityScoped
import kotlinx.android.synthetic.main.fragment_mvp.*
import javax.inject.Inject

/**
 * Created 19.10.2017.
 */

@ActivityScoped
class MvpFragment @Inject constructor(): DaggerFragment(), MvpContract.View {

    @Inject
    lateinit var presenter: MvpContract.Presenter

    override fun showText(text: String) {
        this.text.text = text
    }

    override fun onStart() {
        super.onStart()
        presenter.takeView(this)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_mvp, container, false)
    }


}