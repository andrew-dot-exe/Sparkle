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
            return "Работает над продукцией, меньше расположен к выгоранию.";
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
        if(normalizedInput <= 2.5)
        {
            return "Низкая нагруженность на работе.";
        }
        else if(normalizedInput <= 4.0)
        {
            return "Средняя нагруженность на работе.";
        }
        else if (normalizedInput <= 5.0)
        {
            return "Высокая нагруженность на работе.";
        }
        throw new RuntimeException("Workload not normalized");
    }
    public static String explainworkTime(double normalizedInput)
    {
        if(normalizedInput <= 2.5)
        {
            return "Работник чаще всего уходит в срок, переработки редки";
        }
        else if(normalizedInput <= 4.0)
        {
            return "Работник может задержаться на работе";
        }
        else if (normalizedInput <= 5.0)
        {
            return "Работник часто перерабатывает";
        }
        throw new RuntimeException("Worktime not normalized");
    }
    public static String explainFatigueScore(double normalizedInput)
    {
        if(normalizedInput <= 3.0)
        {
            return "Сотрудник чувствует себя хорошо, усталости нет.";
        }
        else if(normalizedInput <= 6.0)
        {
            return "У работника присутствует небольшая усталость.";
        }
        else if(normalizedInput <= 9.0)
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
        if(normalizedInput <= 5.0)
        {
            return "Выгорание маловероятно.";
        }
        else if(normalizedInput <= 8.0)
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
