package ru.netology.services;

public class RestService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать в этом месяце?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3; // траты на отдых
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
