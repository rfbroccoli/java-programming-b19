package oop;

import constructor.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello OOP!");
        Student aungaung = new Student("Aung Aung", "San Chaung", "Yangon");
        Student maungmaung = new Student("Maung Maung", "Ahlone", "Yangon");
    
        System.out.println(aungaung.name);
        System.out.println(aungaung.address.townshipName);
        System.out.println(aungaung.address.cityName);

        System.out.println(maungmaung.name);
        System.out.println(maungmaung.address.townshipName);
        System.out.println(maungmaung.address.cityName);
    }
}