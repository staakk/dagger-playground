package io.github.staakk.daggerplayground.mvp

/**
 * Created 19.10.2017.
 */
interface MvpContract {

    interface View {

        fun showText(text: String)

    }

    interface Presenter {

        fun takeView(view: View)

    }

}