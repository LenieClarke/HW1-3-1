package com.example.hw1_3_1;

public class LifeIndicators {
    private Double valueWeight;
    private Integer valueStepsNumber;

    public LifeIndicators(Double valueWeight, Integer valueStepsNumber) {
        this.valueWeight = valueWeight;
        this.valueStepsNumber = valueStepsNumber;
    }

    public Double getValueWeight() { return valueWeight; }

    public void setValueWeight(Double valueWeight) { this.valueWeight = valueWeight; }

    public Integer getValueStepsNumber() { return valueStepsNumber; }

    public void setValueStepsNumber(Integer valueStepsNumber) { this.valueStepsNumber = valueStepsNumber; }
}
