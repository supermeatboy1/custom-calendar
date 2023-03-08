package com.example.customcalendar;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listViewEvents;
    private String eventsList[] = {
            "8:30 Wake up",
            "10:00 Breakfast",
            "12:00 Lunch",
            "18:00 Dinner",
            "21:00 Sleep",
    };
    private ImageButton imageButtonPlus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewEvents = (ListView) findViewById(R.id.listViewEvents);
        ArrayAdapter<String> aAdapter = new ArrayAdapter<String>(this, R.layout.activity_event_list_view, R.id.textView, eventsList);
        listViewEvents.setAdapter(aAdapter);

        Dialog add_dialog = new Dialog(MainActivity.this);

        imageButtonPlus = (ImageButton) findViewById(R.id.imageButtonPlus);
        imageButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(view.getContext(), AddEventActivity.class);
                //startActivity(intent);

                add_dialog.setContentView(R.layout.activity_add_event);
                add_dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                add_dialog.setCancelable(false);

                Button buttonAddEventCancel = add_dialog.findViewById(R.id.buttonAddEventCancel);
                buttonAddEventCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        add_dialog.dismiss();
                    }
                });

                Button buttonAddEventAdd = add_dialog.findViewById(R.id.buttonAddEventAdd);
                buttonAddEventAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        add_dialog.dismiss();
                    }
                });

                add_dialog.show();
            }
        });
    }
}