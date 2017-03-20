package com.izdo.weather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.izdo.weather.db.MyDatabaseHelper;
import com.izdo.weather.util.HttpUtil;

/**
 * Created by iZdo on 2017/3/20.
 */
public class MainActivity extends AppCompatActivity {

    private MyDatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHelper = new MyDatabaseHelper(this, "Weather.db", null, 1);
        dbHelper.getWritableDatabase();

        String address = "https://cdn.heweather.com/china-city-list.json";
        HttpUtil.sendRequestWithHttpURLConnection(address);
    }
}
