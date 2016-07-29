package sample.android.actovoice.com.actovoicesampleapp;

import android.app.Application;

import com.ActoVoice;

/**
 * Created by jitesh on 7/29/2016.
 */
public class AplicationClass extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ActoVoice.init(this, "496fbeb5-7291-44cb-823b-f4a381ad550a", "demoAppUser");
    }
}
