package learndagger.saldi.com.learndidagger

import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class InfoModule {

    @Provides
    @Singleton
    fun provideAuthor(): Author {
        return Author()
    }

}