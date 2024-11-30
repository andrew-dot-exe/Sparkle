package com.ai.Utility;

public class DataExplain {
    public static String explainDate(double normalizedInput)
    {
        return null;
    }
    public static String explainGender(double normalizedInput)
    {
        if(normalizedInput == 1)
        {
            return "Мужчины меньше расположены к выгоранию";
        }
        else if(normalizedInput == 0)
            return "Женщины больше расположены к выгоранию";
        throw new RuntimeException("Gender not normalized");
    }
    public static String explainCompanyType(double normalizedInput)
    {
        if(normalizedInput == 1)
        {
            return "Работает в сфере услуг, расположенность к выгоранию выше.";
        }
        else if(normalizedInput == 0){
            return "Работает над продукцией, меньше расположен к выгоранию.";}
        throw new RuntimeException("Company type not normalized");
    }
    public static String explainWFH(double normalizedInput)
    {
        if(normalizedInput == 1)
        {
            return "Работает из дома";
        }
        else if(normalizedInput == 0){return "Работает на месте";}
        throw new RuntimeException("Work from home not normalized");
    }
    public static String explainworkLoad(double normalizedInput)
    {
        if(normalizedInput <= 0.35)
        {
            return "Низкая нагруженность на работе.";
        }
        else if(normalizedInput <= 0.65)
        {
            return "Средняя нагруженность на работе.";
        }
        else if (normalizedInput <= 1)
        {
            return "Высокая нагруженность на работе.";
        }
        throw new RuntimeException("Workload not normalized");
    }
    public static String explainworkTime(double normalizedInput)
    {
        if(normalizedInput <= 0.45)
        {
            return "Короткий рабочий день";
        }
        else if(normalizedInput <= 0.7)
        {
            return "Средний рабочий день";
        }
        else if (normalizedInput <= 1.0)
        {
            return "Длинный рабочий день";
        }
        throw new RuntimeException("Worktime not normalized");
    }
    public static String explainFatigueScore(double normalizedInput)
    {
        if(normalizedInput <= 0.3)
        {
            return "Сотрудник чувствует себя хорошо, усталости нет.";
        }
        else if(normalizedInput <= 0.6)
        {
            return "У работника присутствует небольшая усталость.";
        }
        else if(normalizedInput <= 1.0)
        {
            return "Работнику в скором времени понадобится отдых";
        }
        else
        {
            return "Работник сильно устал, требуется внимание специалиста.";
        }
    }
    public static String explainBurnRate(double normalizedInput)
    {
        if(normalizedInput <= 0.4)
        {
            return "Выгорание маловероятно.";
        }
        else if(normalizedInput <= 0.8)
        {
            return "Работник близок к выгоранию, просьба обратить внимание.";
        }
        else
        {
            return "Работник выгорел, ему необходим отдых или консультация психолога.";
        }

    }

    public static String replaceService(String input)
    {
        if(input.equals("Service")) return "услуг";
        else return "продукции";
    }
}
