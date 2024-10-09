package com.example.planirovshikzadach;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(intent);
                Toast to = Toast.makeText(MainActivity.this, "Вы перешли в раздел списка задач", Toast.LENGTH_SHORT);
                to.setGravity(Gravity.END | Gravity.CENTER_HORIZONTAL, 0, 0);
                to.show();
            }
        });
        Button but = findViewById(R.id.button3);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(intent);
                Toast to = Toast.makeText(MainActivity.this, "Вы перешли в настройки", Toast.LENGTH_SHORT);
                to.setGravity(Gravity.END | Gravity.CENTER_HORIZONTAL, 0, 0);
                to.show();
            }
        });
    }
    public void NavigateTo(View view){
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
        Toast to = Toast.makeText(MainActivity.this, "Вы перешли в раздел добавления задач", Toast.LENGTH_SHORT);
        to.setGravity(Gravity.END | Gravity.CENTER_HORIZONTAL, 0, 0);
        to.show();
    }
}
