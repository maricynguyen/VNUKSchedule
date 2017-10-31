package com.example.royc.schedule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ScheduleActivity extends AppCompatActivity {

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        String title = this.getIntent().getExtras().getString("title");
        String time = this.getIntent().getExtras().getString("time");

        setTitle(title);

        }

    }

