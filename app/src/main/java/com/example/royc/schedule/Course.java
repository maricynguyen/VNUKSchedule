package com.example.royc.schedule;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dande on 10/29/2017.
 */

public class Course {

    public String title;
    public String time;


    public static ArrayList<Course> getCoursesFromFile(String filename, Context context){
        final ArrayList<Course> courseList = new ArrayList<>();

        try {
            // Load data
            String jsonString = loadJsonFromAsset("courses.json", context);
            JSONObject json = new JSONObject(jsonString);
            JSONArray recipes = json.getJSONArray("courses");

            // Get Recipe objects from data
            for(int i = 0; i < recipes.length(); i++){
                Course course = new Course();

                course.title = recipes.getJSONObject(i).getString("title");
                course.time = recipes.getJSONObject(i).getString("time");


                courseList.add(course);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return courseList;
    }

    private static String loadJsonFromAsset(String filename, Context context) {
        String json = null;

        try {
            InputStream is = context.getAssets().open(filename);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        }
        catch (java.io.IOException ex) {
            ex.printStackTrace();
            return null;
        }

        return json;
    }

}
