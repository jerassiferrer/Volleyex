package com.mobile.jera.volleyex;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mobile.jera.volleyex.pojo.Pojo;
import com.mobile.jera.volleyex.pojo.RelatedTopic;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivityTAG_";

    private String jsonResponse;
    final ArrayList<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final TextView txtResponse = (TextView)findViewById(R.id.txtResponse);
        final ListView listview = (ListView) findViewById(R.id.listview);
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://api.duckduckgo.com/?q=simpsons+characters&format=json";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {


                        Log.d(TAG, "onResponse: " + "Response is: " + response.substring(0, 500));
                        Log.d(TAG, response.toString());

                        // Parsing json object response
                        // response will be a json object
                        String name = response;

                        //Check response
                        // jsonResponse += "Name: " + name + "\n\n";
                        // txtResponse.setText(jsonResponse);

                        ObjectMapper mapper = new ObjectMapper();

                        try {
                            Pojo pojo = mapper.readValue(response, Pojo.class);


                            for (RelatedTopic relatedtopic : pojo.getRelatedTopics()) {
                                Log.d(TAG, "onResponse:" + relatedtopic.getText());
                                list.add(relatedtopic.getText());
                                //pojo.getRelatedTopics().toString();

                            }
                            // pojo.getRelatedTopics();


                            // Define a new Adapter
                            // First parameter - Context
                            // Second parameter - Layout for the row
                            // Third parameter - ID of the TextView to which the data is written
                            // Forth - the Array of data




                            ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                                    android.R.layout.simple_list_item_1, android.R.id.text1, list);


                            // Assign adapter to ListView
                            listview.setAdapter(adapter);


                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        try {
                            JSONObject jsonObject = new JSONObject(response);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(TAG, "onResponse: " + "Failed " + error.getMessage());
            }
        });
        queue.add(stringRequest);





    }



}