package ru.geekbrains.alexbu.lesson5;

public class Main {

    public static void main(String[] args) {
        Employer[] employers = new Employer[5];
        employers[0] = new Employer("Ivanov Ivan","Engineer","ivanov@gmail.com","789456123",28000,39);
        employers[1] = new Employer("Sidorov Sasha","Manager","sidorov@gmail.com","435345335",21000,41);
        employers[2] = new Employer("Smirnov Andrew","Lawyer","smirnov@gmail.com","656556563",18000,26);
        employers[3] = new Employer("Petrov Egor","Dispatcher","petrov@gmail.com","676767673",31000,45);
        employers[4] = new Employer("Sokolov Ivan","Constructor","sokolov@gmail.com","7544544545",38000,48);
        final int maxAge = 40;
        for (int i = 0; i < employers.length; i++) {
            Employer employer = employers[i];
            if (employer.getAge() > maxAge) {
                System.out.println(employer.toString());
            }
        }

    }

}
