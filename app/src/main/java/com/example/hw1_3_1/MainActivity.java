package com.example.hw1_3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyAppStart";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Init();
    }

    private void Init() {
        Button buttonSave = findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Пользователь нажал кнопку Сохранить");
                EditText editTextName = findViewById(R.id.editTextName);
                EditText editTextAge = findViewById(R.id.editTextAge);

                try {
                    new BasicData(editTextName.getText().toString(),
                            Integer.parseInt(editTextAge.getText().toString()));
                }
                catch (Exception ex) {
                    Toast.makeText(MainActivity.this, R.string.txtEx, Toast.LENGTH_LONG).show();
                    Log.e(TAG, "Получено исключение", ex);
                }
            }
        });

        Button buttonPressure = findViewById(R.id.buttonPressure);
        Button buttonIndicators = findViewById(R.id.buttonIndicators);

        buttonPressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Пользователь нажал кнопку Давление");
                Intent intent = new Intent(MainActivity.this, PressureActivity.class);
                startActivity(intent);
            }
        });

        buttonIndicators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Пользователь нажал кнопку Показатели");
                Intent intent = new Intent(MainActivity.this, LifeIndicatorsActivity.class);
                startActivity(intent);
            }
        });
    }
}