package com.example.twitter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import twitter4j.TwitterException;

import java.util.List;

@RestController
public class TwitterController {
    @Autowired
    private TwitterService twitterService;


    @RequestMapping(value="tag", method = RequestMethod.GET)
    public List<WordItem>  getTwitterTag(@RequestParam("tag") String tag) {

        throw new IllegalArgumentException("My error message");
//        List<WordItem> words = null;
//        try {
//            words = twitterService.handleRequest(tag);
//        } catch (TwitterException e) {
//            e.printStackTrace();
//        }
//
//        return words;
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
        ErrorResponse error = new ErrorResponse();
        error.setErrorCode(HttpStatus.PRECONDITION_FAILED.value());
        error.setMessage(ex.getMessage());
        return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
    }
}
