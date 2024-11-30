package com.ai;

import com.ai.dataSet.Data;
import com.ai.dataSet.DataSet;
import com.ai.neuralNetwork.train.TrainingNeuralNetwork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sparkle {

    private final String workdir;
    private final Ensemble ensemble;

    public Sparkle()
    {
        workdir = System.getProperty("user.dir");
        ensemble = new Ensemble(workdir + "/weight/");
        /* todo: check weight directory, if not present, get the train csv and save as train folder */
    }

    public static void main(String[] args) {
        Sparkle sp = new Sparkle();
        Data testData = new Data("2020-03-04", "Male", "Service", "No",
                "1.0", "3.1", "4.2", "4.1");
        System.out.println(sp.getBurnRate(testData));
    }

    private void displayTestDatasetResult()
    {
        try(BufferedReader br = new BufferedReader(new FileReader(workdir  + "/test.csv"))) {
            Ensemble ensemble = new Ensemble(workdir + "/weight/");
            String dataLine = br.readLine();
            while ((dataLine = br.readLine()) != null){
                ensemble.description(dataLine);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private void train()
    { //метод для тренировки нейросети
        String csv_dataset = workdir + "/train.csv";
        DataSet dataSet = new DataSet(csv_dataset);

        String weightsFile = workdir + "/weight/weight9.csv"; //почему

        double speed = 0.0005;
        double alpha = 0.08;
        double maxWeight = 10;

        TrainingNeuralNetwork tnn = new TrainingNeuralNetwork(weightsFile, speed, alpha, maxWeight);

                tnn = new TrainingNeuralNetwork(new int[]{7, 3, 1}, 0.0005, 0.08, 10);
                tnn.save(weightsFile);

    }
    public String resultExplain(Data data, double result){return null;}

    public double getBurnRate(Data data){
        return ensemble.getResult(data);
    }
}
