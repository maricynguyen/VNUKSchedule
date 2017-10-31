package com.example.royc.schedule;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by dande on 10/29/2017.
 */

public class MainActivity extends AppCompatActivity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.course_list_view);
        final ArrayList<Course> courseActivityList = Course.getCoursesFromFile("courses.json", this);
        String[] listItems = new String[courseActivityList.size()];
        for(int i = 0; i < courseActivityList.size(); i++){
            Course course = courseActivityList.get(i);
            listItems[i] = course.title;

        }

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems);
        mListView.setAdapter(adapter);

        final Context context = this;
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Course selectedCourse = courseActivityList.get(position);
                Intent detailIntent = new Intent(context, ScheduleActivity.class);
                detailIntent.putExtra("title", selectedCourse.title);
                detailIntent.putExtra("time", selectedCourse.time);
                startActivity(detailIntent);
            }

        });
    }
}
