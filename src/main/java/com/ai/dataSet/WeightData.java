package com.ai.dataSet;

public class WeightData {

    // weights
    private final double joinDate;
    private final double gender;
    private final double companyType;
    private final double distWork;
    private final double workload;
    private final double workingTime;
    private final double fatigueScore;
    private final double burnRate;

    public WeightData(double joinDate, double gender, double companyType,
                      double distWork, double workload, double workingTime,
                      double fatigueScore, double burnRate) {
        this.joinDate = joinDate;
        this.gender = gender;
        this.companyType = companyType;
        this.distWork = distWork;
        this.workload = workload;
        this.workingTime = workingTime;
        this.fatigueScore = fatigueScore;
        this.burnRate = burnRate;
    }

    public WeightData(String joinDate, String gender, String companyType, String worksFromHome, String workload,
                String workTime, String fatigueScore, String burnRate)
    {
        this.joinDate = DataNormalize.normalizeJoinDate(joinDate);
        this.gender = DataNormalize.normalizeGender(gender);
        this.companyType = DataNormalize.normalizeCompanyType(companyType);
        this.distWork = DataNormalize.normalizeDistWork(worksFromHome);
        this.workload = DataNormalize.normalizeWorkload(workload);
        this.workingTime = DataNormalize.normalizeWorkingTime(workTime);
        this.fatigueScore = DataNormalize.normalizeFatigueScore(fatigueScore);
        this.burnRate = DataNormalize.normalizeBurnRate(burnRate);
    }

    public WeightData(String joinDate, String gender, String companyType, String worksFromHome, String workload,
                      String workTime, String fatigueScore)
    {
        this.joinDate = DataNormalize.normalizeJoinDate(joinDate);
        this.gender = DataNormalize.normalizeGender(gender);
        this.companyType = DataNormalize.normalizeCompanyType(companyType);
        this.distWork = DataNormalize.normalizeDistWork(worksFromHome);
        this.workload = DataNormalize.normalizeWorkload(workload);
        this.workingTime = DataNormalize.normalizeWorkingTime(workTime);
        this.fatigueScore = DataNormalize.normalizeFatigueScore(fatigueScore);
        this.burnRate = -1;
    }


    public double[] presentAsArray()
    {
        double[] array = new double[7];
        array[0] = joinDate;
        array[1] = gender;
        array[2] = companyType;
        array[3] = distWork;
        array[4] = workload;
        array[5] = workingTime;
        array[6] = fatigueScore;
        return array;
    }

    public double getJoinDateWeight() {
        return joinDate;
    }

    public double getGenderWeight() {
        return gender;
    }

    public double getCompanyTypeWeight() {
        return companyType;
    }

    public double getDistWorkWeight() {
        return distWork;
    }

    public double getWorkloadWeight() {
        return workload;
    }

    public double getWorkingTimeWeight() {
        return workingTime;
    }

    public double getFatigueScoreWeight() {
        return fatigueScore;
    }

    public double getBurnRateWeight() {
        return burnRate;
    }
}

