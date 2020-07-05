package com.example.hw1_3_1;

import android.widget.CheckBox;

public class Pressure {
    private Integer valuePressureUp;
    private Integer valuePressureDown;
    private Integer valuePulse;
    private CheckBox valueTachycardia;
    private String valueDate;

    public Pressure(Integer valuePressureUp, Integer valuePressureDown,
                    Integer valuePulse, CheckBox valueTachycardia, String valueDate) {
        this.valuePressureUp = valuePressureUp;
        this.valuePressureDown = valuePressureDown;
        this.valuePulse = valuePulse;
        this.valueTachycardia = valueTachycardia;
        this.valueDate = valueDate;
    }

    public Integer getValuePressureUp() { return valuePressureUp; }

    public void setValuePressureUp(Integer valuePressureUp) { this.valuePressureUp = valuePressureUp; }

    public Integer getValuePressureDown() { return valuePressureDown; }

    public void setValuePressureDown(Integer valuePressureDown) { this.valuePressureDown = valuePressureDown; }

    public Integer getValuePulse() { return valuePulse; }

    public void setValuePulse(Integer valuePulse) { this.valuePulse = valuePulse; }

    public CheckBox getValueTachycardia() { return valueTachycardia; }

    public void setValueTachycardia(CheckBox valueTachycardia) { this.valueTachycardia = valueTachycardia; }

    public String getValueDate() { return valueDate; }

    public void setValueDate(String valueDate) { this.valueDate = valueDate; }
}
