package com.example.hw1_3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PressureActivity extends AppCompatActivity {
    private static final String TAG = "MyAppPressure";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);

        Init();
    }

    private void Init() {
        final List<Pressure> pressureList = new ArrayList<>();

        Button buttonSaveP = findViewById(R.id.buttonSaveP);
        buttonSaveP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Пользователь нажал кнопку Сохранить");
                EditText pressureUp = findViewById(R.id.pressureUp);
                EditText pressureDown = findViewById(R.id.pressureDown);
                EditText pulse = findViewById(R.id.pulse);
                CheckBox tachycardia = findViewById(R.id.tachycardia);
                EditText date = findViewById(R.id.date);

                try {
                    Pressure p = new Pressure(Integer.parseInt(pressureUp.getText().toString()),
                            Integer.parseInt(pressureDown.getText().toString()),
                            Integer.parseInt(pulse.getText().toString()), tachycardia, date.getText().toString());
                    pressureList.add(p);
                }
                catch (Exception ex) {
                    Toast.makeText(PressureActivity.this, R.string.txtEx, Toast.LENGTH_LONG).show();
                    Log.e(TAG, "Получено исключение", ex);
                }
            }
        });
    }
}