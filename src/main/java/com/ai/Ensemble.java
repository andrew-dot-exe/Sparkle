package com.ai;

import com.ai.dataSet.Data;
import com.ai.dataSet.NormalizeData;
import com.ai.dataSet.WeightData;
import com.ai.neuralNetwork.NeuralNetwork;

import java.util.List;

public class Ensemble {
    // Количество перцептронов
    private static final byte COUNT = 10;
    // Массив перцептронов
    private NeuralNetwork[] neuralNetworks = null;

    //private List<NeuralNetwork> neurons = null;
    // Конструктор, принимающий путь к папке, хранящей веса
    public Ensemble(String directory){
        neuralNetworks = new NeuralNetwork[COUNT];
        String weight;
        for(int i = 0; i < COUNT; i++){
            weight = directory + "weight" + i + ".csv";
            neuralNetworks[i] = new NeuralNetwork(weight);
        }
    }

    public double getResult(Data data)
    {
        try {
            WeightData weights = data.getWeightedData();
            double result = 0;
            for(int i = 0; i < COUNT; i++)
            {
                result += neuralNetworks[i].counting(weights.presentAsArray())[0];
            }
            return result / COUNT;
        }
        catch (Exception exc)
        {
            throw exc;
        }
    }

    // Подсчет и вывод описаний причин выгорания
    public void description(String in){
        double[] doubleData = new double[7];
        boolean status = false;
        String[] splitLine = in.split(",");
        int len = splitLine.length;
        if(len != 8) return;
        for (int i = 1; i < len; i++){
            double normResult = NormalizeData.normalize(splitLine[i], i);
            if (normResult == -1) {
                status = true; break;
            }
            doubleData[i - 1] = normResult;
        }
        if(status) return;
        double res = 0;//counting(doubleData);
        System.out.print("Employee " + splitLine[0] + ".\nDegree of burnout " + res + ".\nProbable causes: ");
        boolean f = false;
        for(int i = 1; i < len; i++){
            String s = NormalizeData.descriptionOfData(splitLine[i], i);
            if(!s.isEmpty()){
                System.out.print((f ? ", " : "") + s);
                f = true;
            }
        }
        System.out.println((f ? "." : "no problem causes."));
    }
}
