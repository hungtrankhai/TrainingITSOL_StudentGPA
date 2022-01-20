package com.java.studentgpa.handle;

import com.java.studentgpa.entity.Student;
import com.java.studentgpa.entity.Subject;
import com.java.studentgpa.entity.SubjectType;
import com.java.studentgpa.entity.Transcript;

import java.io.Serializable;
import java.util.Scanner;

public class Management implements IManagement, Serializable {

    Subject subject = new Subject();
    Subject[] subjects = new Subject[100];

    Student student = new Student();
    Student[] students = new Student[100];

//    int quantitySubject = 0;
    // subject __________________________________________________________________________________________________________


    @Override
    public void inputTranscript() {

            try{
                System.out.println("Nhap thong tin hsinh ");
                student.inputStudent();

                System.out.println("Nhap so luong mon cua hoc sinh "+student.getName()+" : ");
                int soLuongMonHoc = new Scanner(System.in).nextInt();

                for (int j=0; j<soLuongMonHoc;j++){
                    subject.inputSubject();
                }

                System.out.println("Nhap vao diem cho mon "+subject.getName()+" : ");
                float diem = new Scanner(System.in).nextFloat();
                subject.setPoint(diem);

                for (int i=0;i<soLuongMonHoc;i++){
                    System.out.println("_____TABLE____\n  "+student.getId()+" | "+student.getName()+" | "+subjects[i].getPoint()+" | ");
                }
            } catch (Exception e){
                e.printStackTrace();
            } finally {
                System.out.println("Quay lại");
            }



    }

    @Override
    public void sortByStudentName() {

    }

    @Override
    public void sortBySubJectName() {

    }
}
