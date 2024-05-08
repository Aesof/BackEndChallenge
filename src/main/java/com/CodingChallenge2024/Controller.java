package com.CodingChallenge2024;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

@RestController
@RequestMapping("/api/v2/")
public class Controller {

    @Autowired
    private DTOService dtoService;

    //testing Endpoint
    @GetMapping("/hello")
    public String hello(){
        return "Hello You";
    }


   /* @GetMapping("/getAll")
    public List<ProcessedDTO> getAll(){
        return dtoService.getAll();

    }

    @GetMapping("/findById/{id}")
    public ProcessedDTO findById(@PathVariable Long id)
    {return dtoService.findById(id);}

    @GetMapping("/findBySubmitter/{submitter}")
    public List<ProcessedDTO> findBySubmitter(@PathVariable String submitter)
    {return dtoService.findBySubmitter(submitter);}

    @GetMapping("/findByContent/{content}")
    public List<ProcessedDTO> findByContent(@PathVariable HashMap<String, Integer> content)
    {return dtoService.findByContent(content);}

    @GetMapping("/findByTimestamp/{timestamp}")
    public List<ProcessedDTO> findByTimestamp(@PathVariable Instant currentTimestamp)
    {return dtoService.findByTimestamp(currentTimestamp);}

    //how to access nested class variables
    @GetMapping("/findBySource/{source}")
    public List<ProcessedDTO> findBySource(@PathVariable class source)
    {return dtoService.findBySource(source);}

    */
//Muss hier das filtern passieren?
    @PostMapping("/request/add")
    public ProcessedDTO receiveAndFilterDTO(@RequestBody SubmissionDTO submissionDTO)
    {

        return dtoService.processData(submissionDTO);}

    /* @PutMapping("/request/update/{id}")
    public ProcessedDTO updateDTO(@PathVariable Long id, @RequestBody ProcessedDTO processedDTO){
        return dtoService.updateBookBy(id, processedDTO);
     }

    @PatchMapping("/request/patch/{id}")
    public ProcessedDTO updateDTOFields(@PathVariable Long id, @RequestBody ProcessedDTO processedDTO){
        return dtoService.updateBookFields(id, processedDTO);
     }


    /* @DeleteMapping("/request/deleteBy/{id}")
    public void deleteProcessedDTO(@PathVariable Long id)
     {return dtoService.deleteById(id);}
        */










    //CRUD API for processed Data
    //h2 Databasse implementation
}
