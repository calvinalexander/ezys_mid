package com.example.ezy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    Button myOrder;
    private RecyclerView rv;
    private int[] product = {R.drawable.d1,R.drawable.d2,R.drawable.d3,R.drawable.d4,R.drawable.d5,R.drawable.d6,R.drawable.d7,R.drawable.d8,
            R.drawable.d9,R.drawable.d10};

    private String[] productName = {"Jus1","Jus2","Jus3","Jus4","Jus5","Jus6","Jus7","Jus8","Jus9","Jus10"};

    private int[] productPrice = {1523,1264,1725,1286,1278,1258,1234,4165,7563,8773};

    private RVAdapter adapter;

    private RecyclerView.LayoutManager ltManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        rv = findViewById(R.id.rvProduct);
        ltManager = new GridLayoutManager(this, 2);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(ltManager);
        adapter = new RVAdapter(product,productName,productPrice);
        rv.setAdapter(adapter);

        myOrder = findViewById(R.id.cart);
        myOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity4();
            }
        });
    }
    public void startActivity4(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}