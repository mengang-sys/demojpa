package com.my.demojpa.array;

public class JavaDemo {

    public static void main(String[] args) {
        Person person = new Person("小红", 29);
        Person childA = new Person("小明", 30);
        Person childB = new Person("小金", 31);
        childA.setCar(new Car("宝马",3000.00));
        childB.setCar(new Car("奔驰",4000.00));
        person.setCar(new Car("法拉利",5000.00));
        person.setChildren(new Person[]{childA,childB});
        Car car = new Car("奔驰G50", 6000.00);
        car.setPerson(person);
        System.out.println(person.getCar().getInfo());
        System.out.println(car.getPerson().getInfo());

        for (int i = 0; i < person.getChildren().length; i++) {
            System.out.println("\t|-"+person.getChildren()[i].getInfo());
            System.out.println("\t\t-"+person.getChildren()[i].getCar().getInfo());
        }
    }
}
