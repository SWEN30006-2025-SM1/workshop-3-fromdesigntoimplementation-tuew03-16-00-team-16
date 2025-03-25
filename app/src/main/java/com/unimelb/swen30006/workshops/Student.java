package com.unimelb.swen30006.workshops;

public class Student {
    private Integer StudentID;
    private String Name;
    private String Username;
    private String Password;
    private Integer TotalMarks;


    public Student(){
        this.StudentID = 12353;
        this.Name = "dwads";
        this.Username = "dwads";
        this.Password = "dwuahsnd";
        this.TotalMarks = 298;
    }

    public Integer getStudentID() {
        return StudentID;
    }

    public String getName() {
        return Name;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public Integer getTotalMarks() {
        return TotalMarks;
    }
}
