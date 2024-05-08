package com.CodingChallenge2024;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;

//new class for processed data
//timestamp noch hinzufügen in source sowieso timestamp vorhanden
public class SubmissionDTO {

    private String submitter;
    private String content;
    private String comment;
    private Source source;





    //AllArgsConstructor

    public SubmissionDTO(String submitter, String content, String comment, Source source) {
        this.submitter = submitter;
        this.content = content;
        this.comment = comment;
        this.source = source;
        //nested class instance fields?
        //Source als JSON nested Klammern?
    }


    //default Constructor

    //getter

    public String getSubmitter() {
        return submitter;
    }

    public String getContent() {
        return content;
    }

    public String getComment() {
        return comment;
    }

    public Source getSource(){
        return source;
    }

    //Setter
    //IllegalArgumentExceptionHandling implementieren
    //woanders implementieren
    //unnötige argument exception
    public void setSubmitter(String submitter) {
        if (submitter instanceof java.lang.String) {
            this.submitter = submitter;
        } else {
            throw new IllegalArgumentException("Input has to be a String!");
        }
    }

    //Validieren dass inhalt vorhanden in service klasse
    public void setContent(String content) {
        if (content instanceof java.lang.String) {
            this.content = content;
        } else {
            throw new IllegalArgumentException("Input has to be a String!");
        }
    }

    public void setComment(String comment) {
        if (comment instanceof java.lang.String) {
            this.comment = comment;
        } else {
            throw new IllegalArgumentException("Input has to be a String!");
        }
    }

    //ToString funktion?
}
