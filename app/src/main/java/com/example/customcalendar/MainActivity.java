package com.example.customcalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listViewEvents;
    String eventsList[] = {
            "8:30 Wake up",
            "10:00 Breakfast",
            "12:00 Lunch",
            "18:00 Dinner",
            "21:00 Sleep",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewEvents = (ListView) findViewById(R.id.listViewEvents);
        ArrayAdapter<String> aAdapter = new ArrayAdapter<String>(this, R.layout.activity_event_list_view, R.id.textView, eventsList);
        listViewEvents.setAdapter(aAdapter);
    }
}