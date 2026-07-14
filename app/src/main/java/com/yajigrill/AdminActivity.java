package com.yajigrill;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class AdminActivity extends AppCompatActivity {
    private final List<String> menuItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        EditText adminMenuItem = findViewById(R.id.adminMenuItem);
        Button btnAddMenu = findViewById(R.id.btnAddMenu);
        TextView adminSummary = findViewById(R.id.adminSummary);

        btnAddMenu.setOnClickListener(v -> {
            String item = adminMenuItem.getText().toString().trim();
            if (item.isEmpty()) {
                Toast.makeText(this, "Enter a menu item", Toast.LENGTH_SHORT).show();
                return;
            }
            menuItems.add(item);
            adminMenuItem.setText("");
            adminSummary.setText("Menu items:\n" + String.join("\n", menuItems));
            Toast.makeText(this, "Menu item added", Toast.LENGTH_SHORT).show();
        });
    }
}
