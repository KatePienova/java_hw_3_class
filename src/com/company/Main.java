package com.company;

class Collaborator{
    String name;
    String post;
    String email;
    String number;
    int age;

    public Collaborator(String name, String post, String email, String number, int age)
    {
        this.name=name;
        this.post=post;
        this.email=email;
        this.number=number;
        this.age=age;
    }
}
public class Main {

    public static void main(String[] args)
    {
        Collaborator[] people = new Collaborator[3];
        people[0] = new Collaborator("Mike", "HR", "mike2020@gmail.com", "0674597797", 25);
        people[1] = new Collaborator("Olena", "dev", "olena2020@gmail.com", "0684567798", 32);
        people[2] = new Collaborator("Nik","UI", "nik2020@gmail.com", "0985023465", 23);
    }
}
