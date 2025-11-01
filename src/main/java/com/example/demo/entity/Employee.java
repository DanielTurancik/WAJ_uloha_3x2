package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "birth_date")
    private String birth_date;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "job_title")
    private String job_title;
    @Column(name = "salary")
    private Integer salary;
    @Column(name = "full_time")
    private String employementType;

    public Employee(String first_name, String last_name, String birth_date, String email, String phone, String job_title, Integer salary, String full_time) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.email = email;
        this.phone = phone;
        this.job_title = job_title;
        this.salary = salary;
        this.employementType = full_time;
    }

    public Employee() {
    }

    public String getEmployementType() {
        return employementType;
    }

    public void setEmployementType(String em) {
        this.employementType = em;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birth_date='" + birth_date + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", job_title='" + job_title + '\'' +
                ", salary=" + salary +
                ", full_time=" + employementType +
                '}';
    }
}