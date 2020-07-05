package com.example.hw1_3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class LifeIndicatorsActivity extends AppCompatActivity {
    private static final String TAG = "MyAppIndicators";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_indicators);

        Init();
    }

    private void Init() {
        final List<LifeIndicators> indicatorsList = new ArrayList<>();

        Button buttonSaveLI = findViewById(R.id.buttonSaveLI);
        buttonSaveLI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Пользователь нажал кнопку Сохранить");
                EditText weight = findViewById(R.id.weight);
                EditText stepsNumber = findViewById(R.id.stepsNumber);

                try {
                    LifeIndicators li = new LifeIndicators(Double.parseDouble(weight.getText().toString()),
                            Integer.parseInt(stepsNumber.getText().toString()));
                    indicatorsList.add(li);
                }
                catch (Exception ex) {
                    Toast.makeText(LifeIndicatorsActivity.this, R.string.txtEx2, Toast.LENGTH_LONG).show();
                    Log.e(TAG, "Получено исключение", ex);
                }
            }
        });
    }
}
