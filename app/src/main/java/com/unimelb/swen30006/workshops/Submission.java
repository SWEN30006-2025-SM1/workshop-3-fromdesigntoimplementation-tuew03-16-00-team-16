package com.unimelb.swen30006.workshops;

// Sample private submission class to be replaced by your implementation
class Submission {
    // Return two fake files
    File[] submittedFiles;
    String Note;
    Integer AssignmentID;

    public File[] includedFiles(){
        File[] files = new File[2];
        files[0] = new File();
        files[1] = new File();
        return files;
    }

    public Submission(String Note, Integer AssignmentID){
        submittedFiles = includedFiles();
        this.Note = Note;
        this.AssignmentID = AssignmentID;
    }
}
