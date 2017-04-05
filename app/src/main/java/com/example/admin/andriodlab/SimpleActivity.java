package com.example.admin.andriodlab;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ADMIN on 2017/3/28.
 */

public class SimpleActivity extends  Activity{
    private String []names=new String[]{"Lion","Tiger","Monkey","Dog","Cat","Elephant"};
    private int []images = new int[]{R.drawable.lion,R.drawable.tiger,R.drawable.monkey,
            R.drawable.dog,R.drawable.cat,R.drawable.elephant};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        //建立一个List集合，List集合的元素是Map
        List<Map<String ,Object>> ListItems=new ArrayList<Map<String,Object>>();
        for(int i=0;i<names.length;i++){
            Map<String ,Object>ListItem = new HashMap<String,Object>();
            ListItem.put("animalName",names[i]);
            ListItem.put("header",images[i]);
            ListItems.add(ListItem);
        }
        //创建一个SimpleAdapter
        SimpleAdapter simpleAdapter = new SimpleAdapter(this,ListItems,R.layout.simpleadapter,
                new String[]{"animalName","header"},new int[]{R.id.name,R.id.image});
        ListView list = (ListView) findViewById(R.id.mylist);
        //为List设置Adapter
        list.setAdapter(simpleAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),names[i],Toast.LENGTH_LONG).show();//show the selected image in toast according to position
            }
        });
    }


}

