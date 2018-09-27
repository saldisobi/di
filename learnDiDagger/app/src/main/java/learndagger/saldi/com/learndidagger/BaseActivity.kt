package learndagger.saldi.com.learndidagger

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import javax.inject.Inject

open class BaseActivity : AppCompatActivity() {

    @Inject
    lateinit var mLogger: Logger

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        (application as InfoApplication)
                .getMyComponent()
                .inject(this@BaseActivity)
    }

    fun log(msg: String) {
        mLogger.log(msg + " from base")
    }


}