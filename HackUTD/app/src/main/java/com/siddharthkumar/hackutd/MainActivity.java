package com.siddharthkumar.hackutd;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.MapsInitializer;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    CardView cv;
    TextView tv;
    SwipeRefreshLayout srl;
    RecyclerViewAdapter adapter;
    ArrayList<Holder> holders=new ArrayList<Holder>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        srl= (SwipeRefreshLayout)findViewById(R.id.refresh);

        rv = (RecyclerView)findViewById(R.id.list);

        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        holders.add(new Holder("Hello"));
        holders.add(new Holder("World"));
        holders.add(new Holder("This"));
        holders.add(new Holder("Is"));
        holders.add(new Holder("An"));
        holders.add(new Holder("Array"));
        holders.add(new Holder("Array"));
        holders.add(new Holder("Array"));
        holders.add(new Holder("Array"));
        holders.add(new Holder("Array"));
        holders.add(new Holder("Array"));
        holders.add(new Holder("Array"));
        holders.add(new Holder("Array"));
        holders.add(new Holder("Array"));
        holders.add(new Holder("Array"));
        holders.add(new Holder("Array"));
        holders.add(new Holder("Array"));
        holders.add(new Holder("Array"));
        holders.add(new Holder("Array"));
        adapter = new RecyclerViewAdapter(holders, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MapActivity.class);
                startActivity(i);
            }
        });
        rv.setAdapter(adapter);

        srl.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refresh();

            }
        });



    }

    public void refresh(){

        //call
        for (Holder h: holders){
            h.text+="hehe";

        }

        srl.setRefreshing(false);
        adapter.notifyDataSetChanged();

    }


    public class Holder{

        String text;
        //...

        public Holder(String s){
            text=s;
        }


    }



    public class FetchTask extends AsyncTask<String, Void, Void>{


        @Override
        protected Void doInBackground(String... strings) {




            return null;
        }
    }


}
