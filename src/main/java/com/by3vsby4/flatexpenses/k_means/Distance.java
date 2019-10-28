package com.by3vsby4.flatexpenses.k_means;

import java.util.Map;

public interface Distance {

    double calculate(Map<String, Double> f1, Map<String, Double> f2);
}
