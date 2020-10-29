package com.NorthFish.service;
import com.NorthFish.entity.eStudyWordLetter;
import com.NorthFish.repository.WordLetterRepository;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Optional;

@Service
public class WordLetterService {

    @Resource
    private WordLetterRepository wordLetterRepository;

    public Iterable<eStudyWordLetter> getAll(){
        return wordLetterRepository.findAll();
    }

    public eStudyWordLetter getSingle(String id){
        Optional<eStudyWordLetter> op = wordLetterRepository.findById(Long.parseLong(id));
        return op.get();

    }
}
