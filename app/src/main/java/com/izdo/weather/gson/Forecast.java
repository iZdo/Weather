package com.izdo.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 计创 on 2017/3/20.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;
    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }
}
