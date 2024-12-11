package Exo3;

import java.util.Objects;

public class Employees {
    private int id;
    private String name;
    private String job;
    private double salary;

    public Employees(int id, String name, String job, double salary) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return id == employees.id && Double.compare(salary, employees.salary) == 0 && Objects.equals(name, employees.name) && Objects.equals(job, employees.job);
    }


    public int getId() {
        return this.id;
    }
}