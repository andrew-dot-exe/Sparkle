package com.ai;

import com.ai.dataSet.Data;
import com.ai.dataSet.WeightData;
import com.ai.neuralNetwork.NeuralNetwork;

public class Ensemble {
    // Количество перцептронов
    private static final byte COUNT = 10;
    // Массив перцептронов
    private final NeuralNetwork[] neuralNetworks;

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
            throw new RuntimeException("Data error, check data");
        }
    }
}
