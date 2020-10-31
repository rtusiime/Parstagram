package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("uzZyLs6BCpmZNxBcySlM65d4C2Ye2BoV65cnxIhs")
                .clientKey("hjYsWbjOWfpyDBDCBPDKrzjdYGgKYMXwAjwJAoiV")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
