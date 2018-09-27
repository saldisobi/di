package learndagger.saldi.com.learndidagger

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class OtherModule {

    @Provides
    @Singleton
    fun provideLogger(): Logger {
        return Logger()
    }

}