package com.yajigrill;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCustomer = findViewById(R.id.btnCustomer);
        Button btnAdmin = findViewById(R.id.btnAdmin);
        Button btnKitchen = findViewById(R.id.btnKitchen);

        btnCustomer.setOnClickListener(v -> startActivity(new Intent(this, CustomerActivity.class)));
        btnAdmin.setOnClickListener(v -> startActivity(new Intent(this, AdminActivity.class)));
        btnKitchen.setOnClickListener(v -> startActivity(new Intent(this, KitchenDeliveryActivity.class)));
    }
}
