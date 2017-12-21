package com.example.lenovo.newrecyclerview;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Promotion> promotionList;

    RecyclerView recyclerView;

    @Override

    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        promotionList = new ArrayList<>();



        promotionList.add(
                new Promotion(
                        1,
                        "Khaadi",
                        "50% off on Pret",
                        "Category: Apparel",
                        "Pret",
                        R.drawable.khaadi));

        promotionList.add(
                new Promotion(
                        1,
                        "Bonanza",
                        "40% off on Men's Wear",
                        "Category: Apparel",
                        "Men's Wear",
                        R.drawable.bonanza));

        promotionList.add(
                new Promotion(
                        1,
                        "Universal Cinemas",
                        "Flat 50% off on All Movies for Students",
                        "Entertainment",
                        "Movies",
                        R.drawable.universalcinemas));

        promotionList.add(
                new Promotion(
                        1,
                        "Bounce",
                        "Flat 50% off for Children below 10",
                        "Entertainment",
                        "Trampoline Park",
                        R.drawable.bounce));
        promotionList.add(
                new Promotion(
                        1,
                        "Nando's",
                        "40% off on Deal of the Day",
                        "Food Place",
                        "Continental",
                        R.drawable.nandos));

        promotionList.add(
                new Promotion(
                        1,
                        "Hyperstar",
                        "40% off on Grocery",
                        "Supermarket",
                        "Grocery",
                        R.drawable.alfatah));
        promotionList.add(
                new Promotion(
                        1,
                        "Metro Cash & Carry",
                        "30% off on Electronics",
                        "Supermarket",
                        "Electronics",
                        R.drawable.metro));
        PromotionAdapter adapter = new PromotionAdapter(this, promotionList);


        recyclerView.setAdapter(adapter);
    }
}
