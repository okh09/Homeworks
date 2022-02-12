package lesson5;

public class Personal {

    private String name;
    private String email;
    private String position;
    private int age;
    private int salary;
    private String phone;

    public Personal (String name, String email, String position, String phone, int age, int salary) {
        this.name = name.toUpperCase();
        this.email = email.toLowerCase();
        this.position = position;
        this.age = age;
        this.salary = salary;
        this.phone = phone;
    }


    public String toString() {
        return String.format("%nФ.И.О: %s%n | e-mail: %s%n | Должность: %s%n | Тел: %s%n | Возраст: %d%n | Зарплата: %d", name, email, position, phone, age, salary);
    }

    public int getAge() {
        return age;
    }
}
