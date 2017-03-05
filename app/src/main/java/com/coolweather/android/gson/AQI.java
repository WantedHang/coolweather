package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 航舟 on 2017/3/5 0005.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
