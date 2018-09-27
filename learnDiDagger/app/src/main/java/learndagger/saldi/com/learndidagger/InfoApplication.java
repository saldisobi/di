package learndagger.saldi.com.learndidagger;

import android.app.Application;

public class InfoApplication extends Application {

    private InfoComponent infoComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        infoComponent = createMyComponent();
    }

    InfoComponent getMyComponent() {
        return infoComponent;
    }

    private InfoComponent createMyComponent() {
        return DaggerInfoComponent
                .builder()
                .build();

    }

}
