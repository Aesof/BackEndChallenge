package com.CodingChallenge2024;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;


@Entity
public class Source {
    private String url;
    private Timestamp timestamp;
    //wird die ID bei source weitergegeben an SubmissionDTO und ProcessedDTO?
    @Id
    private Long id;

    //default constructor deleted
    public Source(String url, Timestamp timestamp){
        this.url = url;
        this.timestamp = timestamp;
    }

    //nested class getters
    public String getUrl() {
        return url;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }



    //nested class setters

    //no implementation for DTO Class
    public void setUrl(String url) {
        if (url != null) {
            this.url = url;
        } else {
            throw new IllegalArgumentException("Input has to be a String!");
        }
    }

    public void setTimestamp(Timestamp timestamp) {
        if (timestamp != null) {
            this.timestamp = timestamp;
        } else {
            throw new IllegalArgumentException("Input has to be a String!");
        }
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

