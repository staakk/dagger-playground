package io.github.staakk.daggerplayground.injectactivity

import android.content.Intent
import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import io.github.staakk.daggerplayground.R
import io.github.staakk.daggerplayground.mvp.MvpActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class InjectActivity : DaggerAppCompatActivity() {

    @Inject lateinit var someDependency : SomeDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        someDependency.doSomething()

        goToMvpActivity.setOnClickListener {
            val intent = Intent(this, MvpActivity::class.java)
            intent.putExtra(MvpActivity.ARG_SOME_STRING, "some string")
            startActivity(intent)
            finish()
        }
    }

}
