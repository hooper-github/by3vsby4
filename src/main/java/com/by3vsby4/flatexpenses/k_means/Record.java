package com.by3vsby4.flatexpenses.k_means;

import lombok.Data;

import java.util.Map;

@Data
public class Record {
    private final String description;
    private final Map<String, Double> features;

}
