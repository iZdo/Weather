package com.izdo.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 计创 on 2017/3/20.
 */

public class Now {

    @SerializedName("tmp")
    public int temperature;

    @SerializedName("cond")
    public More mMore;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
