package com.ai.dataSet;

import java.util.ArrayList;
import java.util.List;

public class DataSet {
    final private String fileName;
    private List<Data> dataSet;

    public DataSet(String fileName){
        this.fileName = fileName;
        dataSet = CSVReader.datasetCsvReader(fileName);

    }

    public List<Data> getDataSet(){
        return dataSet;
    }

    public double[][] getInputWeights(){ //получаем данные в виде массива double
        double[][] res = new double[dataSet.size()][];
        for(int i = 0; i < dataSet.size(); i++){
            res[i] = dataSet.get(i).getWeightedData().presentAsArray(); // present as array
        }
        return res;
    }

    public double[][] getOutputWeights(){
        double[][] res = new double[dataSet.size()][];
        for(int i = 0; i < dataSet.size(); i++){
            res[i] = new double[1];
            res[i][0] = dataSet.get(i).getWeightedData().getBurnRateWeight();
        }
        return res;
    }

}