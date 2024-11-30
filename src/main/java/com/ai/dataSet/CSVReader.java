package com.ai.dataSet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReader{

    public static List<Data> datasetCsvReader(String filename, String delimeter)
    {
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(delimeter);
                Data lineData = new Data(
                        values[0], // join date
                        values[1], // gender
                        values[2], // company type
                        values[3], // wfh
                        values[4], // workload
                        values[5], // work time
                        values[6], // fatigue
                        values[7] // burn rate
                );

            }
        }
        catch (Exception exc){
            return null;
        }
        return null;
    }


    public static List<Data> datasetCsvReader(String filename) {
        return datasetCsvReader(filename, ",");
    }
}
