package com.example.ezy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    Button mainBtn;

    private RecyclerView rv;
    private String[] productName = {"Jus1","Jus2","Jus3","Jus4","Jus5","Jus6","Jus7","Jus8","Jus9","Jus10","Jus11","Jus12","Jus13","Jus14",
            "Jus15","Jus16","Jus17"};
    private int[] productPrice = {1523,1264,1725,1286,1278,1258,1234,4165,7563,8773,1123,54545,6667,545,678,986,5456};

    private LastAdapter adapter;
    private RecyclerView.LayoutManager ltManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        rv = findViewById(R.id.listAkhir);
        ltManager = new LinearLayoutManager(this);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(ltManager);
        adapter = new LastAdapter(productName,productPrice);
        rv.setAdapter(adapter);



        mainBtn = findViewById(R.id.balikMain);
        mainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityMain();
            }
        });
    }

    public void startActivityMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}