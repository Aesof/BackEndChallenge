package com.CodingChallenge2024;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Repository
public interface DTORepository extends JpaRepository<ProcessedDTO, Long> {

   /* ProcessedDTO findById(Long id);

    List<ProcessedDTO> findBySubmitter(String submitter);

    List<ProcessedDTO> findByContent(Map<String,Integer> content);

    List<ProcessedDTO> findByTimestamp(Instant currentTimestamp);

    List<ProcessedDTO> findBySource(class Source);

    */

//h2 integrieren






}