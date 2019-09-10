package com.example.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class ListViewActivity extends AppCompatActivity {
//    private String[] data = {"apple", "banana", "cherry", "grape", "peach", "pineapple"};
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListViewActivity.this, android.R.layout.simple_list_item_1, data);
        initFruit();
        FruitAdapter adapter = new FruitAdapter(ListViewActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    public void initFruit(){
        for(int i = 0; i< 3; i++){
            Fruit apple = new Fruit("apple", "red");
            fruitList.add(apple);
            Fruit banana = new Fruit("banana", "yellow");
            fruitList.add(banana);

        }
    }
}
