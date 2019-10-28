package com.by3vsby4.flatexpenses.data;

import lombok.Data;
import org.apache.commons.math3.ml.clustering.Clusterable;
import java.lang.Object;
@Data
public class Statistics implements Clusterable {


    @Override
    public double[] getPoint() {
        return new double[0];
    }
}
