//package com.ai;
//
//
//import com.ai.neuralNetwork.train.TrainingNeuralNetwork;
//
//import java.io.*;
//
//
//public class NotMain {
//
//    static boolean res = true; // что это блять?
//    static boolean testIn = true;
//    // static boolean newNetwork = true; //изменить
//
//    // true - при открытии через IDE, false - при открытии через исполняемый файл
//    static boolean InIDE = true; // это что за хуйня?
//
//    public static void main(String[] args) {
//        //пусть имя файла для тренировки передается через аргументы
//        // true - при открытии через IDE, false - при открытии через исполняемый файл
//
//        // рабочая папка проекта
//        String path = System.getProperty("user.dir") + ((InIDE) ? "/src/main/java/com/ai" : ""); //TODO: заменить на статический метод обработки путей
//
//        if(res){ // Вывод подсчитанных результатов тествого датасета
//            try(BufferedReader br = new BufferedReader(new FileReader(path  + "/test.csv"))) {
//                Ensemble ensemble = new Ensemble(path + "/weight/");
//                String dataLine = br.readLine();
//                while ((dataLine = br.readLine()) != null){
////                    ensemble.description(dataLine);
//
//                }
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//        else if(!testIn) { // Обучение/создание перцептрона
//            String csv_dataset = path + "/train.csv";
////            DataSet dataSet = new DataSet();
////            dataSet.loadFromCsv(csv_dataset);
//
//            String weightsFile = path + "/weight/weight9.csv"; //почему
//
//            double speed = 0.0005;
//            double alpha = 0.08;
//            double maxWeight = 10;
//
//            TrainingNeuralNetwork tnn = new TrainingNeuralNetwork(weightsFile, speed, alpha, maxWeight);
///*            if (newNetwork) {
//                tnn = new TrainingNeuralNetwork(new int[]{7, 3, 1}, 0.0005, 0.08, 10);
//                tnn.save(weight);
//            } else tnn = new TrainingNeuralNetwork(weight, 0.0005, 0.08, 10);*/
////            train(tnn, dataSet);
//        }
//        else{ // Проверка ансамбля на обучающем датасете
//            Ensemble ensemble = new Ensemble(path);
//
//            String dataset = path + "/train.csv";
//            DataSet ds = new DataSet();
//            ds.loadFromCsv(dataset);
//
//            //ensembleChck
//        }
//
//    }
//
//    private void ensembleCheck(Ensemble ensemble, DataSet dataset, String outputFile)
//    {
//
//        double max = 0;
//        double avg = 0;
//        System.out.println("dataset output weights length: " + dataset.getOutputWeights().length);
//        try(FileWriter fw = new FileWriter(outputFile)) {
//
//            for(int i = 0; i < dataset.getInputWeights().length; i++){
//                double t = Math.abs(ensemble.counting(dataset.getInputWeights()[i]) - dataset.getOutputWeights()[i][0]);
//                max = Math.max(max, t);
//                avg += t;
//                fw.write(dataset.getOutputWeights()[i][0] + " " + ensemble.counting(dataset.getOutputWeights()[i]) + "\n");
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("maximum difference" + max); // Максимальная разница
//        System.out.println("average difference" + avg / dataset.getOutputWeights().length); // Средняя разница
//    }
//////    public static String resultExplain(String line, int i){
//////        switch(i)
//////        {
//////            case 1: // Дата прихода
//////                try {
//////                    double res = (Double.parseDouble("" + line.charAt(5) + line.charAt(6)) - 1) / (12 - 1);
//////                    return (res > 0.6 ? "More 6 month" : "");
//////                } catch (Exception e) {
//////                    return "";
//////                }
//////            case 2: // Пол
//////                /*if ("Male".equals(line)) return 1;
//////                if ("Female".equals(line)) return 0;*/
//////                return "";
//////            case 3: // Тип работы
//////                /*if ("Service".equals(line)) return line;
//////                if ("Product".equals(line)) return 0;*/
//////                return line;
//////            case 4: // Удаленка
//////                if ("Yes".equals(line)) return "";
//////                if ("No".equals(line)) return "Have not ";
//////            case 5: // Нагрузка (0 - 5)
//////                try {
//////                    double temp = Double.parseDouble(line) / 5;
//////                    return (temp < 0 || temp > 1) ? "" : (temp > 0.65 ? "Big load" : "");
//////                } catch (Exception e) {
//////                    return "";
//////                }
//////            case 6: // Рабочее время (1 - 10)
//////                try {
//////                    double temp = (Double.parseDouble(line) - 1) / (10 - 1);
//////                    return (temp < 0 || temp > 1) ? "" : (temp > 0.65 ? "Long work time" : "");
//////                } catch (Exception e) {
//////                    return "";
//////                }
//////            case 7: // Уровень психического переутомления (0 - 10)
//////                try {
//////                    double temp = Double.parseDouble(line) / 10;
//////                    return (temp < 0 || temp > 1) ? "" : (temp > 0.65 ? "pcix" : ""); // ахаххахахаа сукааа
//////                } catch (Exception e) {
//////                    return "";
//////                }
//////            default:
//////                return "";
//////        }
//////    }
//}