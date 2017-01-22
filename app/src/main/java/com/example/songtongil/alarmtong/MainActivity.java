package com.example.songtongil.alarmtong;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView mAlarmList;
    AlarmAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAlarmList=(RecyclerView)findViewById(R.id.main_recyclerview);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        mAlarmList.setLayoutManager(layoutManager);
        mAlarmList.setHasFixedSize(true);

        mAdapter=new AlarmAdapter(this);

        mAlarmList.setAdapter(mAdapter);


    }
}
