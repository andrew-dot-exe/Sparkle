package com.ai;

import com.ai.Utility.DataExplain;
import com.ai.dataSet.Data;
import com.ai.dataSet.WeightData;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Sparkle {

    private final Ensemble ensemble;

    public Sparkle()
    {
        String workdir = System.getProperty("user.dir");
        ensemble = new Ensemble(workdir + "/weight/");
        /* todo: check weight directory, if not present, get the train csv and save as train folder */
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        Sparkle sp = new Sparkle();
        Data testData = new Data("2020-03-04", "male", "Service", "No",
                "2.0", "9.1", "9.2");
        double response = sp.getBurnRate(testData);
        System.out.println(response);
        PrintStream printStream = new PrintStream(System.out, true, "UTF-8");
        printStream.println(sp.resultExplain(testData, response));
    }

    public String resultExplain(Data data, double result) {
        String ans = "";
        WeightData weights = data.getWeightedData();
        ans += "Работник в компании c " + data.getJoinDate() +
                "\nПол работника " + data.getGender() + "," + DataExplain.explainGender(weights.getGenderWeight()) +
                "\n" + DataExplain.explainCompanyType(data.getWeightedData().getCompanyTypeWeight()) +
                "\n" + DataExplain.explainWFH(weights.getDistWorkWeight()) +
                "\n" + DataExplain.explainworkLoad(weights.getWorkloadWeight()) +
                "\n" + DataExplain.explainworkTime(weights.getWorkingTimeWeight()) +
                "\n" + DataExplain.explainFatigueScore(weights.getFatigueScoreWeight()) +
                "\n" + DataExplain.explainBurnRate(result);
        return ans;
    }

    public double getBurnRate(Data data){
        return ensemble.getResult(data);
    }
}
