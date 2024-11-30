//package com.ai.dataSet;
//
//public class ShittyData {
//    private final static byte joinDay = 0;
//    private final static byte gender = 1;
//    private final static byte companyType = 2;
//    private final static byte distanceWork = 3;
//    private final static byte workLoad = 4;
//    private final static byte workingTime = 5;
//    private final static byte mentalFatigueScore = 6;
//    private final static byte burnRate = 7;
//
//    private final static byte countIn = 7;
//    private final static byte countOut = 1;
//
//    private final double[] in;
//    private final double[] out; //нахуя они???
//
//    public ShittyData(double[] doubleData){
//        in = new double[countIn];
//        out = new double[countOut];
//
//        in[joinDay] = doubleData[joinDay];
//        in[gender] = doubleData[gender];
//        in[companyType] = doubleData[companyType];
//        in[distanceWork] = doubleData[distanceWork];
//        in[workLoad] = doubleData[workLoad];
//        in[workingTime] = doubleData[workingTime];
//        in[mentalFatigueScore] = doubleData[mentalFatigueScore];
//
//        out[0] = doubleData[burnRate];
//    }
//
//    public ShittyData(double  joinDay, double gender, double companyType, double distanceWork, double workLoad, double workingTime, double mentalFatigueScore, double burnRate){
//        in = new double[countIn];
//        out = new double[countOut];
//
//        in[WeightData.joinDay] = joinDay;
//        in[WeightData.gender] = gender;
//        in[WeightData.companyType] = companyType;
//        in[WeightData.distanceWork] = distanceWork;
//        in[WeightData.workLoad] = workLoad;
//        in[WeightData.workingTime] = workingTime;
//        in[WeightData.mentalFatigueScore] = mentalFatigueScore;
//
//        out[0] = burnRate;
//    }
//
//    public double getJoinDay(){
//        return in[joinDay];
//    }
//
//    public double getGender(){
//        return in[gender];
//    }
//
//    public double getCompanyType(){
//        return in[companyType];
//    }
//
//    public double getDistanceWork(){
//        return in[distanceWork];
//    }
//
//    public double getWorkLoad(){
//        return in[workLoad];
//    }
//
//    public double getWorkingTime(){
//        return in[workingTime];
//    }
//
//    public double getMentalFatigueScore(){
//        return in[mentalFatigueScore];
//    }
//
//    public double getBurnRate(){
//        return out[0];
//    }
//
//    public void setJoinDay(double joinDay){
//        in[WeightData.joinDay] = joinDay;
//    }
//
//    public void setGender(double gender){
//        in[WeightData.gender] = gender;
//    }
//
//    public void setCompanyType(double companyType){
//        in[WeightData.companyType] = companyType;
//    }
//
//    public void setDistanceWork(double distanceWork){
//        in[WeightData.distanceWork] = distanceWork;
//    }
//
//    public void setWorkLoad(double workLoad){
//        in[WeightData.workLoad] = workLoad;
//    }
//
//    public void setWorkingTime(double workingTime){
//        in[WeightData.workingTime] = workingTime;
//    }
//
//    public void setMentalFatigueScore(double mentalFatigueScore){
//        in[WeightData.mentalFatigueScore] = mentalFatigueScore;
//    }
//
//    public void setBurnRate(double burnRate){
//        out[0] = burnRate;
//    }
//
//    public double[] getIn() {
//        return in;
//    }
//
//    public double[] getOut() {
//        return out;
//    }
//}
