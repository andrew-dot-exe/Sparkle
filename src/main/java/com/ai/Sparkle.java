package com.ai;

import com.ai.dataSet.Data;

public class Sparkle {

    private final Ensemble ensemble;

    public Sparkle()
    {
        String workdir = System.getProperty("user.dir");
        ensemble = new Ensemble(workdir + "/weight/");
        /* todo: check weight directory, if not present, get the train csv and save as train folder */
    }

    public static void main(String[] args) {
        Sparkle sp = new Sparkle();
        Data testData = new Data("2020-03-04", "Male", "Service", "No",
                "1.0", "3.1", "4.2", "4.1");
        System.out.println(sp.getBurnRate(testData));
    }

    public String resultExplain(Data data, double result){return null;}

    public double getBurnRate(Data data){
        return ensemble.getResult(data);
    }
}
