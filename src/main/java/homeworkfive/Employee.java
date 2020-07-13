package homeworkfive;

import homeworktwo.Array;

import java.util.Arrays;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;
    public Employee (String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

            //if (empArr[])

       // }
    }
        public void printInfo () {
        System.out.println("Name and surname: " + name + ", position: " + position + ", email: " + email +
                ", phone number: " + phoneNumber + ", salary: " + salary + ", age: " + age);
        }
        public void printArr () {
            Employee[] empArr = new Employee[5];
            empArr[0] = new Employee("Angela Mercel", "senior dev", "angela@java.ru",
                    "+79263173701", 400000, 32);
            empArr[1] = new Employee("Ivan Ivanov", "developer", "ivanivanov@java.ru",
                    "+79161234567", 150000, 25);
            empArr[2] = new Employee("Boris Johnson", "lead manager", "Johnson@java.ru",
                    "+79851234567", 450000, 53);
            empArr[3] = new Employee("Barrack Obama", "junior developer", "barrack.barrack@java.ru",
                    "+79002345678", 60000, 59);
            empArr[4] = new Employee("Kim Chan Yn", "middle developer", "Kimmy@java.ru",
                    "+791034567890", 100000, 64);
            for (int i = 0; i < empArr.length; i++) {
               // System.out.println(empArr[i].age);
                if (empArr[i].age >40) {
                    System.out.println(empArr[i].age);
                }
            }
        }
}
