package com.example.constantinekim.menuapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        TextView textView = findViewById(R.id.header_text);

        switch (id) {
            case R.id.action_settings:
                textView.setText("Settings");
                return true;
            case R.id.open_settings:
                textView.setText("Open settings");
                return true;
            case R.id.save_settings:
                textView.setText("Save Settings");
                return true;
            case R.id.feedback:
                textView.setText("Feedback");
                return true;
            case R.id.forward:
                textView.setText("Forward");
                return true;
            case R.id.back:
                textView.setText("Back");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}