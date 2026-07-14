package com.yajigrill;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayDeque;
import java.util.Deque;

public class KitchenDeliveryActivity extends AppCompatActivity {
    private final Deque<String> orders = new ArrayDeque<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen_delivery);

        TextView kitchenSummary = findViewById(R.id.kitchenSummary);
        Button btnPrepareNext = findViewById(R.id.btnPrepareNext);
        Button btnDeliverNext = findViewById(R.id.btnDeliverNext);

        orders.add("Customer A - Jollof Rice");
        orders.add("Customer B - Suya Plate");

        btnPrepareNext.setOnClickListener(v -> {
            if (!orders.isEmpty()) {
                String next = orders.removeFirst();
                Toast.makeText(this, next + " prepared", Toast.LENGTH_SHORT).show();
                kitchenSummary.setText("Prepared: " + next + "\nRemaining: " + orders.size());
            } else {
                Toast.makeText(this, "No pending orders", Toast.LENGTH_SHORT).show();
            }
        });

        btnDeliverNext.setOnClickListener(v -> {
            if (!orders.isEmpty()) {
                String next = orders.removeFirst();
                Toast.makeText(this, next + " delivered", Toast.LENGTH_SHORT).show();
                kitchenSummary.setText("Delivered: " + next + "\nRemaining: " + orders.size());
            } else {
                Toast.makeText(this, "No pending orders", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
