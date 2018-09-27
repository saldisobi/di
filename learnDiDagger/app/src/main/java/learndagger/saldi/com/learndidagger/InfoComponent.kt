package learndagger.saldi.com.learndidagger

import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(InfoModule::class, OtherModule::class))
interface InfoComponent {

    fun inject(activity: MainActivity)

    fun inject(activity: BaseActivity)
}
