package chuckharpke.com.toad;

import android.app.Application;

import com.parse.Parse;


public class ToadApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "iIYrauuOyMkEMF68bcimwLshiKT5x78k1dan60uw", "Xw5rfIsIVPDAszTnXijZYWBz5OuHy24DE9x9vkt6");




    }
}

