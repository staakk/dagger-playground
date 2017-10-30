package io.github.staakk.daggerplayground.mvp

import io.github.staakk.daggerplayground.di.scope.ActivityScoped
import javax.inject.Inject
import javax.inject.Named

/**
 * Created 19.10.2017.
 */
@ActivityScoped
class MvpPresenter @Inject constructor(@Named(MvpActivity.ARG_SOME_STRING) someString: String) : MvpContract.Presenter {

    // when it`s declared in constructor @Named qualifier doesn't work even with @field:Named annotation
    val someString = someString

    var view: MvpContract.View? = null

    override fun takeView(view: MvpContract.View) {
        this.view = view
        view.showText(someString)
    }

}