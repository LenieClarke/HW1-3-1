package com.example.hw1_3_1;

public class BasicData {
    String valueName;
    Integer valueAge;

    public BasicData(String valueName, Integer valueAge){
        this.valueName = valueName;
        this.valueAge = valueAge;
    }

    public String getValueName() { return valueName; }

    public void setValueName(String valueName) { this.valueName = valueName; }
}
