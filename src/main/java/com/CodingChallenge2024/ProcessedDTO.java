package com.CodingChallenge2024;

import jakarta.persistence.*;
import lombok.Builder;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;

@Entity
@Table(name = "pDTO")
//@TypeDef(name = "json")
/**
 * ProcessedDTO dto = new ProcessedDto(submission.getSubmitter(), content, source);
 * SubmissionDto submission;
 *
 * ProcessedDto.builder().setSubmitter(submission.getSubmitter()).setcontent().setSource(submission.getSource()).build();
 */



public class ProcessedDTO{
    private String submitter;
    @ElementCollection
    private LinkedHashMap<String, Integer> content;
    //      @Type(type = "json")
    //  private HashMap<String, Integer> content;

    @OneToOne
    private Source source;

    private Timestamp cTimestamp;

    @Id
    @GeneratedValue
    private Long id;

    public ProcessedDTO() {

    }



        // superclass getters for nested field attributes


    // will ich source als object passen als eingabeparameter?
    // WrapperKlasse für int oder nicht?
    public ProcessedDTO(String submitter, LinkedHashMap<String, Integer> content, Source source) {
        this.submitter = submitter;
        this.content = content;
        this.source = source;
        this.cTimestamp = Timestamp.from(new Date().toInstant());
    }

    public String getSubmitter() {
        return submitter;
    }

    public LinkedHashMap<String, Integer> getContent() {
        return content;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;

    }

    public void setContent(LinkedHashMap<String, Integer> content) {
        this.content = content;
    }

    public void setCurrentTimestamp(Timestamp currentTimestamp){
        this.cTimestamp = currentTimestamp;
    }

}
