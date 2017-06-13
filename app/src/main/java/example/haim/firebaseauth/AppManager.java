package example.haim.firebaseauth;

import android.app.Application;

import com.beardedhen.androidbootstrap.TypefaceProvider;

/**
 * Created by DELL e7440 on 12/06/2017.
 */


//Application Object (see Application tag at AndroidManifest)
public class AppManager extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //Load the bootstrap (Font-Awesome) icons.
        TypefaceProvider.registerDefaultIconSets();
    }
}
