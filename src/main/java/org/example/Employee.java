package org.example;

public class Employee {
    private String name;
    private String work;
    private String mail;
    private String PhoneNumber;
    private int money;
    private int age;

    public Employee(String name, String work, String mail, String PhoneNumber, int money, int age) {
        this.name = name;
        this.work = work;
        this.mail = mail;
        this.PhoneNumber = PhoneNumber;
        this.money = money;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getWork() {
        return work;
    }

    public String getMail() {
        return mail;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public int getMoney() {
        return money;
    }

    public int getAge() {
        return age;
    }

    public void ageUpSearch(int age) {
        if (this.age > age) {
            System.out.println(name);
            System.out.println(work);
            System.out.println(mail);
            System.out.println(PhoneNumber);
            System.out.println(money);
            System.out.println(this.age);
            System.out.println("\n\n");
        }
    }
}
