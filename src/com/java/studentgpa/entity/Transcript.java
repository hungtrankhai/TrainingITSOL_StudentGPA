package com.java.studentgpa.entity;

import com.java.studentgpa.entity.Student;
import com.java.studentgpa.entity.Subject;

import java.io.Serializable;

public class Transcript implements Serializable {
    // mot hoc sinh hoc nhieu mon, bang diem dua vao hoc sinh chu yeu
    private Student student;
    private Subject[] subjects;
    private float diem;

    public Transcript(Student student, Subject[] subjects, float diem) {
        if(diem>10 || diem <0) try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.student = student;
        this.subjects = subjects;
        this.diem = diem;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    public Student getStudent() {
        return student;
    }


    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }


}
