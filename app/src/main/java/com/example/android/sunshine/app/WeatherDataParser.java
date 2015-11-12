package com.example.android.sunshine.app;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherDataParser {
    String LOG_TAG = WeatherDataParser.class.getSimpleName();

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {

        JSONObject jsonString = new JSONObject(weatherJsonStr);
        JSONArray obj =  jsonString.getJSONArray("list");
        JSONObject dayInfo = obj.getJSONObject(dayIndex);
        JSONObject temp = dayInfo.getJSONObject("temp");

        return temp.getDouble("max");
    }


}
