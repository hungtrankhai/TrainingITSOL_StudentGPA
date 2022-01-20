package com.java.studentgpa;

import com.java.studentgpa.entity.Student;
import com.java.studentgpa.entity.Subject;
import com.java.studentgpa.handle.Management;

import java.io.Serializable;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Management management = new Management();

        Student student = new Student();
        Subject subject = new Subject();

        int choose;

        do {
            showMenu();
            choose = new Scanner(System.in).nextInt();

            switch (choose) {
                case 1:

                    System.out.println("Nhập số lượng sinh viên mới: ");
                    int quantityStudent = new Scanner(System.in).nextInt();

                    Student[] students = new Student[quantityStudent];

                    for (int i=0; i<quantityStudent;i++){
                        System.out.printf("Nhập student thứ %d \n", i+1);
                        students[i] = new Student(i+1);
                        students[i].inputStudent();
                    }
                    student.writeStudents(students);


                    for (int i=0; i<quantityStudent;i++){
                        students[i].outputStudent();
                    }
                    break;

                case 2:
                    System.out.println("Nhập số lượng môn học mới: ");
                    int quantitySubject = new Scanner(System.in).nextInt();

                    Subject[] subjects = new Subject[quantitySubject];

                    for (int i=0;i<quantitySubject;i++){
                        System.out.printf("Nhập môn thứ %d \n",i+1);
                        subjects[i] = new Subject(i+1);
                        subjects[i].inputSubject();
                    }

                    subject.writeSubjects(subjects);

                    for (int i=0; i<quantitySubject;i++){
                        subjects[i].outputSubject();
                    }
                    break;

                case 3:

                    management.inputTranscript();
                    break;

                case 4:

                    break;
                case 5:

                    break;
            }
        } while (choose != 5);


//        Student[] students = new Student[100];
//
//        Student student = new Student();
//
//        for (int i = 0; i < 2; i++) {
//            System.out.printf("Nhập sinh viên thứ %d \n",i+1);
//            students[i] = new Student();
//            students[i].input();
//        }
//
//        for (int i = 0; i < 2; i++) {
//            System.out.printf("Thông tin sinh viên thứ %d \n",i+1);
//            students[i].output();
//        }

    }

    static void showMenu(){
        System.out.println("Bạn cần làm gì ?");
        System.out.println("1. Nhập danh sách sinh viên mới.");
        System.out.println("2. Nhập danh sách môn học mới.");
        System.out.println("3. Nhập điểm cho mỗi sinh viên và in ra");
        System.out.println("4. Sắp xếp");
        System.out.println("5. Tính điểm tổng kết.");
    }
}
