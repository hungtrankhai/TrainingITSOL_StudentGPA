package com.java.studentgpa.entity;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Subject implements Serializable {
    private int id;
    private String name;
    private String unitNum;
    private SubjectType subjectType;
    private float point;



    int quantitySubject =0;
    Subject[] subjects = new Subject[quantitySubject];
    public Subject(){

    }

    public Subject(int id, String name, String unitNum, SubjectType subjectType) {
        this.id = id;
        this.name = name;
        this.unitNum = unitNum;
        this.subjectType = subjectType;
    }

    public Subject(int id){
        this.id = id+100;
    }

    public Subject(String name, String unitNum, SubjectType subjectType_enum) {
        this.name = name;
        this.unitNum = unitNum;
        this.subjectType = subjectType_enum;
    }

    public void inputSubject(){
        try {
            System.out.println("Nhập tên môn: ");
            this.name = new Scanner(System.in).nextLine();
            try{
                System.out.println("Nhập số đơn vị học trình: ");
                this.unitNum = new Scanner(System.in).nextLine();
                System.out.println("Nhập loại môn: (1-Đại cương 2-Cơ sở ngành 3-Chuyên ngành)");
                int type = new Scanner(System.in).nextInt();

                do {
                    switch (type) {
                        case 1:
                            subjectType = SubjectType.DAICUONG;
                            break;
                        case 2:
                            subjectType = SubjectType.COSONGANH;
                            break;
                        case 3:
                            subjectType = SubjectType.CHUYENNGANH;
                            break;
                    }
                }while (type < 0 && type >3);

            } catch (NumberFormatException numEx){
                System.err.println("Chỉ được nhập số!");
            }

            Subject subject = new Subject(id, name, unitNum, subjectType);
            Subject[] temp_subjects = new Subject[quantitySubject+1];
            if(subjects!=null){
                System.arraycopy(subjects, 0, temp_subjects, 0, quantitySubject);
            }
            subjects=temp_subjects;
            subjects[quantitySubject]= subject;
            quantitySubject++;

        } catch (Exception e){
            System.err.println("Lỗi !");
        }
    }

    public void outputSubject(){
        System.out.println("ID: "
                +this.id+" Tên môn: "
                +this.name+" Số đv học trình: "
                +this.unitNum+" Loại môn: "
                +this.subjectType);
    }

    public void writeSubjects(Subject[] subjects){
        try{
            FileOutputStream f = new FileOutputStream("E:\\StudentGPA\\src\\com\\java\\studentgpa\\file\\subject.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(f);
            objectOutputStream.writeObject(subjects);
            objectOutputStream.close();
            f.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public Subject getSubjectById(int id){

        return null;
    }


    public int getId() {
        return id;
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

    public String getUnitNum() {
        return unitNum;
    }

    public void setUnitNum(String unitNum) {
        this.unitNum = unitNum;
    }

    public SubjectType getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(SubjectType subjectType) {
        this.subjectType = subjectType;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }
}
