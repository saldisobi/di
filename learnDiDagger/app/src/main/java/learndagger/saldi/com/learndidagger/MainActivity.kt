package learndagger.saldi.com.learndidagger

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var mAuthor: Author

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as InfoApplication)
                .getMyComponent()
                .inject(this@MainActivity)

        super.log(mAuthor.mFirstName)

        fab.setOnClickListener { view ->
            Snackbar.make(view, mAuthor.mFirstName, Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()


        }
    }

}
