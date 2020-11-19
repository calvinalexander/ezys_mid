package com.example.ezy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity4 extends AppCompatActivity {
    Button payBtn;
    private RecyclerView rv;
    private String[] productName = {"Jus1","Jus2","Jus3","Jus4","Jus5","Jus6","Jus7","Jus8","Jus9","Jus10","Jus11","Jus12","Jus13","Jus14",
            "Jus15","Jus16","Jus17"};
    private int[] productPrice = {1523,1264,1725,1286,1278,1258,1234,4165,7563,8773,1123,54545,6667,545,678,986,5456};

    private RvCartAdapter adapter;
    private RecyclerView.LayoutManager ltManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        rv = findViewById(R.id.rvCart);
        ltManager = new LinearLayoutManager(this);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(ltManager);
        adapter = new RvCartAdapter(productName,productPrice);
        rv.setAdapter(adapter);

        payBtn = findViewById(R.id.payment);
        payBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity5();
            }
        });
    }
    public void startActivity5(){
        Intent intent = new Intent(this,  MainActivity5.class);
        startActivity(intent);
        finish();
    }
}