package com.ai.dataSet;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class DataNormalize {

    private static double PresentAsDouble(String sValue) throws IncorrectDataFormat{
        try {
            return Double.parseDouble(sValue);
        }
        catch (Exception exc)
        {
            throw new IncorrectDataFormat("Invalid double type, please check dataset.");
        }
    }

    public static double normalizeJoinDate(String joinDate) throws IncorrectDataFormat //string
    {
        try
        {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate joinDateLocal = LocalDate.parse(joinDate, formatter);

            LocalDate countdownDateLocal = LocalDate.of(Year.now().getValue(), 1, 1);

            // Extract year from a LocalDate
            int yearOfJoinDate = joinDateLocal.getYear();
            int yearOfCountdown = countdownDateLocal.getDayOfYear();

            return (double) yearOfCountdown - yearOfJoinDate;
        }
        catch (Exception e)
        {
            throw new IncorrectDataFormat("Date format isn't correct, please check dataset.");
        }
    }

    public static double normalizeGender(String gender) throws IncorrectDataFormat //string
    {
            gender = gender.toLowerCase().trim();
            if(gender.equals("male"))
            {
                return 1;
            }
            else if(gender.equals("female"))
            {
                return 0;
            }
            throw new IncorrectDataFormat("Gender format isn't correct, please check dataset.");

    }

    public static double normalizeCompanyType(String companyType) throws  IncorrectDataFormat //string
    {
        companyType = companyType.toLowerCase().trim();
        if(companyType.equals("service"))
        {
            return 1;
        }
        else if(companyType.equals("product"))
        {
            return 0;
        }
        throw new IncorrectDataFormat("Company type format isn't correct, please check dataset.");
    }

    public static double normalizeDistWork(String distWork) throws IncorrectDataFormat{ //string
        distWork = distWork.toLowerCase().trim();
        if(distWork.equals("yes"))
        {
            return 1;
        }
        else if(distWork.equals("no"))
        {
            return 0;
        }
        throw new IncorrectDataFormat("Work from home format isn't correct, please check dataset.");
    }

    public static double normalizeWorkload(String workload) throws IncorrectDataFormat{
        double value = PresentAsDouble(workload) / 5;
        if(value < 0 || value > 1)
        {
            throw new IncorrectDataFormat("Workload not in range 0-5. Check the dataset.");
        }
        return value;
    }

    public static double normalizeWorkingTime(String worktime) throws IncorrectDataFormat{
        double value = (PresentAsDouble(worktime) - 1) / (10 - 1);
        if(value < 0 || value > 1)
        {
            throw new IncorrectDataFormat("Working time not in range 0-5. Check the dataset.");
        }
        return value;
    }

    public static double normalizeFatigueScore(String fatigueScore) throws IncorrectDataFormat{
        double value = PresentAsDouble(fatigueScore) / 10; //warn:
        if(value < 0 || value > 1)
        {
            throw new IncorrectDataFormat("Fatigue score not in range 0-10. Check the dataset.");
        }
        return value;
    }

    public static double normalizeBurnRate(String burnRate) throws IncorrectDataFormat
    {
        if(burnRate == null)
        {
            return 0;
        }
        double value = PresentAsDouble(burnRate) / 10;
        if(value < 0 || value > 1)
        {
            throw new IncorrectDataFormat("Burn rate not in range 0-10. Check the dataset.");
        }
        return value;
    }
}
