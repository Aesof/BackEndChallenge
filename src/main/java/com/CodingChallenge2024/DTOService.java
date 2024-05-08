package com.CodingChallenge2024;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.HashSet;
import java.util.Set;


@Service
public class DTOService {

    private final DTORepository dtoRepository;

    public DTOService(DTORepository dtoRepository){
        this.dtoRepository = dtoRepository;
    }

    public List<ProcessedDTO> getAll(){
        return this.dtoRepository.findAll();
    }

    public ProcessedDTO createDTO(ProcessedDTO processedDTO) {
        return this.dtoRepository.save(processedDTO);
    }

    public ProcessedDTO processData(SubmissionDTO submissionDTO){

       //DTOConverter.filterContent(submissionDTO);
       ProcessedDTO newEntity = new ProcessedDTO(submissionDTO.getSubmitter(), DTOConverter.filterContent(submissionDTO), submissionDTO.getSource());
        return dtoRepository.save(newEntity);
    }

    /*
    public ProcessedDTO findById(Long id) {
        return this.dtoRepository.findById(id);
    }

    public List<ProcessedDTO> findBySubmitter(String submitter){
        return this.dtoRepository.findBySubmitter(submitter);}

    public List<ProcessedDTO> findByContent(HashMap<String, Integer> content){
        return this.dtoRepository.findByContent(content);}

    public List<ProcessedDTO> findByTimeStamp(Instant timestamp){
        return this.dtoRepository.findByTimestamp(timestamp);}

    public List<ProcessedDTO> findBySource(source) {
        return this.dtoRepository.findBySource(source);
    }

     */

    public long getCount() {
        return this.dtoRepository.count();
    }

    public void deleteById(Long id) {
        this.dtoRepository.deleteById(id);
    }


    public ProcessedDTO save(ProcessedDTO processedDTO) {
        //save function in JPARepo
        return dtoRepository.save(processedDTO);
    }
}




/*
    public ProcessedDTO processEntity(SubmissionDTO) {

        String[] arr = content.split(" ");
        Set<String> words = new HashSet<>(Arrays.asList(arr));
        Object[][] mArr = new Object[arr.length][length];
        int length = words.size();
        String[] noDupl = words.toArray(new String[length]);
        // create int arr (Integer Wrapper type?)
        int[] cArr = new int[length];

        /*
         * //iteration over set
         * Iterator<String> iter = words.iterator();
         * while(iter.hasNext()){
         * String word = iter.next();
         *
         * for(int j = 0;j<words.size(); j++){
         * mArr[j][] = word;
         * //nesting an integer array into an string 1d array
         * }
         *
         * }
         */

        // create a new object with class

        // write into
        //for (String value : words) {
        //  int count = 0;


/*
        for (int i = 0; i < arr.length; i++) {
            mArr[i][0] = value;
            count = 0;
            for(int j = 0; j<arr[i].length(); j++){
                mArr[i][1] = value;
                //nested for loop for iterating through array on second position of first array
                if (value.equals(arr[i])) {
                    // create processed object when true
                    // nach ablauf der ganzen schleife soll obj erstellt werden
                    // word2Count.put((arr[i]),cArr[i]);
                    // wenn bereits vorhanden soll
                    count++;
                    mArr[i][1] = count;

                    System.out.println("Found " + value + " " + count + "times.");

                }

                //sort the arrays values according to the highest integer and alphabetically
                //return the top 3 entries of the array
                //save the processed information after, map dto to processed dto in repository class with @Transactional Annotation
            }
        }

        // create processedDTO Object using constructor of nested class above
        // save processedDTO with CRUD operations
    }





    //Algorithm for counting words and saving the processed data into h2
    //Create REGEX to crawl through each word individually
    //Creating an ArrayList, add one entry for each different word and a counter
    //sort the ArrayList alphabetically
    //save the first 3 entrys with their counts
    //create new JSON DTO with processed data and save it into h2

    //split the string into words by splitting with each whitespace

    //return type lieber als processedDTO oder als 2D-Array
    public String[][] process(String content){
        String[] arr = toString().split(" ");
        for(String word : arr){

*/


