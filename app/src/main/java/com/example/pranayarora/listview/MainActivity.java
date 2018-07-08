package com.example.pranayarora.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
ListView lv;
    String []a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView)findViewById(R.id.listview);
        String z[] = {"red" , "blue" ,"green" , "orange"};
        ArrayAdapter < String> ad = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,z);
        lv.setAdapter(ad);
        lv.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        Toast.makeText(getApplicationContext(),"you have selected"  + position, Toast.LENGTH_LONG).show();
    }
}
