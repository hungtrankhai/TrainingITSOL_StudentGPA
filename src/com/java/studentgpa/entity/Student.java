package com.java.studentgpa.entity;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
    private int id;
    private String name;
    private String address;
    private String phoneNum;
    private String className;

    public Student(){}

    public Student(int id){
        this.id = id+100;
    }

    public void inputStudent() {
        System.out.println("Nhập tên: ");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Nhập địa chỉ: ");
        this.address = new Scanner(System.in).nextLine();
        System.out.println("Nhập sdt: ");
        this.phoneNum = new Scanner(System.in).nextLine();
        System.out.println("Nhập tên lớp: ");
        this.className = new Scanner(System.in).nextLine();
    }

    public void outputStudent() {

        System.out.println("| ID: "+this.id
                +" | Tên: " + this.name
                +" | Địa chỉ: " + this.address
                +" | SĐT: " + this.phoneNum
                +" | Tên lớp: " + this.className);
    }

    public void writeStudents(Student[] students){
        try{
            FileOutputStream f = new FileOutputStream("E:\\StudentGPA\\src\\com\\java\\studentgpa\\file\\student.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(f);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
            f.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }


    public int getId() {
        return id++;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
