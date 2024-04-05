package observer;

import java.util.Random;

public class Developer implements Observer {
    private String name;
    private int salary;
    private int startSalary;

    private TypeOfVacancy type;

    public Developer(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.startSalary = salary;
        this.type = TypeOfVacancy.specialist;

    }

    public int getStartSalary() {
        return startSalary;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public void receiveVacancy(Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary() && vacancy.getTypeOfVacancy().equals(type)){
            System.out.printf("Разработчик %s(желаемая должность: %s): Мне нужна эта работа! (компания: %s; заработная плата: %d; должность: %s)\n",
                    name, type, vacancy.getCompanyName(), vacancy.getSalary(), vacancy.getTypeOfVacancy());
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("Разработчик %s(желаемая должность: %s): Я найду работу получше! (компания: %s; заработная плата: %d; должность: %s)\n",
                    name, type, vacancy.getCompanyName(), vacancy.getSalary(), vacancy.getTypeOfVacancy());
        }
    }
}