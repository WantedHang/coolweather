package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 航舟 on 2017/3/5 0005.
 */

public class Now {
    @SerializedName("tmp")
    public String temerature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
