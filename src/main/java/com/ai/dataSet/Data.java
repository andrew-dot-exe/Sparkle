package com.ai.dataSet;

public class Data {
    private String joinDate; // todo: represent date as Date object and count days before today
    private String gender;
    private String companyType; // only service or product
    private String worksFromHome;
    //    private final double workload;
    //    private final double workingTime;
    //    private final double fatigueScore;
    //    private final double burnRate;
    private String workload;
    private String workTime;
    private String fatigueScore;
    private String burnRate;

    private WeightData weightedData = null;

    public Data(String joinDate, String gender, String companyType, String worksFromHome, String workload,
                String workTime, String fatigueScore, String burnRate) {
        this.joinDate = joinDate;
        this.gender = gender;
        this.companyType = companyType;
        this.worksFromHome = worksFromHome;
        this.workload = workload;
        this.workTime = workTime;
        this.fatigueScore = fatigueScore;
        this.burnRate = burnRate;
    }

    private void weightData()
    {
        weightedData = new WeightData(joinDate, gender, companyType,
                            worksFromHome, workload, workTime,
                            fatigueScore, burnRate);
    }

    public WeightData getWeightedData()
    {
        if(weightedData == null)
        {
            weightData();
        }
        return weightedData;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public String getGender() {
        return gender;
    }

    public String getCompanyType() {
        return companyType;
    }

    public String getWorksFromHome() {
        return worksFromHome;
    }

    public String getWorkload() {
        return workload;
    }

    public String getWorkTime() {
        return workTime;
    }

    public String getFatigueScore() {
        return fatigueScore;
    }

    public String getBurnRate() {
        return burnRate;
    }
}
