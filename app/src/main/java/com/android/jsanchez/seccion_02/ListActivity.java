package com.android.jsanchez.seccion_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private ListView listView;
    private List<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        names = new ArrayList<>();
        names.add("Jesus");
        names.add("Gabriel");
        names.add("Ruth");
        names.add("Emily");
        names.add("Jesus");
        names.add("Gabriel");
        names.add("Ruth");
        names.add("Emily");
        names.add("Jesus");
        names.add("Gabriel");
        names.add("Ruth");
        names.add("Emily");

//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names);
//
//        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(ListActivity.this, "Clicked: " + names.get(position), Toast.LENGTH_SHORT).show();
            }
        });

        MyAdapter myAdapter = new MyAdapter(this, R.layout.list_item, names);
        listView.setAdapter(myAdapter);
    }
}

