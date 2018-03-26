package com.example.twitter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import twitter4j.TwitterException;

import java.util.List;

@RestController
public class TwitterController {


    @RequestMapping(value="tag", method = RequestMethod.GET)
    public List<WordItem>  getTwitterTag(@RequestParam("tag") String tag) {
        TwitterService twitterService = new TwitterService();
        List<WordItem> words = null;
        try {
            words = twitterService.handleRequest(tag);
        } catch (TwitterException e) {
            e.printStackTrace();
        }

        return words;
    }
}
