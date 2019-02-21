package com.example.abinshibuthomas.designproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class     availablebook extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_availablebook);
        btn=(Button)findViewById(R.id.issueid);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(availablebook.this, "Book Reserved", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(availablebook.this,smartlibrary.class);
                startActivity(intent);
            }
        });
    }
}
