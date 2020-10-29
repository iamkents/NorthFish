package com.NorthFish.api;

import com.NorthFish.common.ResultObject;
import com.NorthFish.entity.eStudyWordLetter;
import com.NorthFish.service.WordLetterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wordLetter")
public class wordLetterController {

    @Autowired
    WordLetterService wordLetterService;

    @RequestMapping(value = "/selectOne/{sid}", method = RequestMethod.GET, headers = {"Accept=application/json;charset=UTF-8"})
    public ResultObject selectOne(@PathVariable String sid) {
       ResultObject re=ResultObject.createInstance();
       re.setSuccess(true);
       re.setData("hello");
       return re;
    }

    @CrossOrigin
    @RequestMapping(value = "/getAll", method = RequestMethod.GET, headers = {"Accept=application/json;charset=UTF-8"})
    public ResultObject getAll() {
        ResultObject re=ResultObject.createInstance();
        Iterable<eStudyWordLetter> wordLetter = wordLetterService.getAll();
        re.setData(wordLetter);
        return re;
    }

    @CrossOrigin
    @RequestMapping(value = "/getWordLetter/{id}", method = RequestMethod.GET, headers = {"Accept=application/json;charset=UTF-8"})
    public ResultObject getWordLetter(@PathVariable String id) {
        ResultObject re=ResultObject.createInstance();
        eStudyWordLetter wordLetter = wordLetterService.getSingle(id);
        re.setData(wordLetter);
        return re;
    }


}
