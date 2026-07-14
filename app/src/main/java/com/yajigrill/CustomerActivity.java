package com.yajigrill;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class CustomerActivity extends AppCompatActivity {
    private final List<String> orders = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        EditText customerName = findViewById(R.id.customerName);
        EditText customerPhone = findViewById(R.id.customerPhone);
        EditText customerAddress = findViewById(R.id.customerAddress);
        RadioGroup menuGroup = findViewById(R.id.menuGroup);
        Button btnPlaceOrder = findViewById(R.id.btnPlaceOrder);
        TextView orderSummary = findViewById(R.id.orderSummary);

        btnPlaceOrder.setOnClickListener(v -> {
            String name = customerName.getText().toString().trim();
            String phone = customerPhone.getText().toString().trim();
            String address = customerAddress.getText().toString().trim();

            if (name.isEmpty() || phone.isEmpty() || address.isEmpty()) {
                Toast.makeText(this, "Please fill in your details", Toast.LENGTH_SHORT).show();
                return;
            }

            String selectedItem = "";
            int checkedId = menuGroup.getCheckedRadioButtonId();
            if (checkedId == R.id.rbJollof) {
                selectedItem = "Jollof Rice";
            } else if (checkedId == R.id.rbSuya) {
                selectedItem = "Suya Plate";
            } else if (checkedId == R.id.rbYaji) {
                selectedItem = "Yaji Special";
            }

            if (selectedItem.isEmpty()) {
                Toast.makeText(this, "Please choose a meal", Toast.LENGTH_SHORT).show();
                return;
            }

            String order = name + " | " + phone + " | " + address + " | " + selectedItem;
            orders.add(order);
            orderSummary.setText("Recent order:\n" + order + "\n\nOrder status: Pending Kitchen Review");
            Toast.makeText(this, "Order placed successfully", Toast.LENGTH_SHORT).show();
        });
    }
}
