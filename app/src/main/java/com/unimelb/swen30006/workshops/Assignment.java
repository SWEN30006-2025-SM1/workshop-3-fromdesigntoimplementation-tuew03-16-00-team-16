package com.unimelb.swen30006.workshops;

public class Assignment {
    private String description;
    private Date dueDate;
    private int maxAttempts;
    private String name;



    public Assignment(String description, Date dueDate, int maxAttempts, String name) {
        this.description = description;
        this.dueDate = dueDate;
        this.maxAttempts = maxAttempts;
        this.name = name;
    }

    public Submission[] invalidSubmissions() {}

    public Submission[] validSubmissions() {}
}
