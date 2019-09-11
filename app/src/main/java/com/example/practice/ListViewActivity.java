package com.example.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ListViewActivity extends AppCompatActivity {
//    private String[] data = {"apple", "banana", "cherry", "grape", "peach", "pineapple"};
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListViewActivity.this, android.R.layout.simple_list_item_1, data);
        initFruit();
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);
        FruitaRecyclerAdapter adapter = new FruitaRecyclerAdapter(fruitList);
        recyclerView.setAdapter(adapter);

    }

    public void initFruit(){
        for(int i = 0; i< 20; i++){
            Fruit apple = new Fruit("apple", getRandomLengthColor("red"));
            fruitList.add(apple);
            Fruit banana = new Fruit("banana", getRandomLengthColor("yellow"));
            fruitList.add(banana);
        }
    }

    private String getRandomLengthColor(String color){
        Random random = new Random();
        int length = random.nextInt(20)+1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0;  i<length; i++){
            builder.append(color);
        }
        return builder.toString();
    }
}
