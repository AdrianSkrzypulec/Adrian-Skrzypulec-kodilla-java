package com.kodilla.patterns.social;

import com.kodilla.patterns.strategy.social.Millenials;
import com.kodilla.patterns.strategy.social.TwitterPublisher;
import com.kodilla.patterns.strategy.social.YGeneration;
import com.kodilla.patterns.strategy.social.ZGeneration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {

        //Given
        Millenials millenials = new Millenials("Jacek");
        YGeneration yGeneration = new YGeneration("Placek");
        ZGeneration zGeneration = new ZGeneration("Agatka");

        //When
        String jacekPost = millenials.sharePost();
        System.out.println("Publisher: " + jacekPost);

        String placelPost = yGeneration.sharePost();
        System.out.println("Publisher: " + placelPost);

        String agatkaPost = zGeneration.sharePost();
        System.out.println("Publisher: " + agatkaPost);

        //Then
        assertEquals("Facebook", jacekPost);
        assertEquals("Twitter", placelPost);
        assertEquals("Snapchat", agatkaPost);
        }

    @Test
    void testIndividualSharingStrategy() {

        //Given
        Millenials millenials = new Millenials("Jacek");

        //When
        String jacekPost;
        jacekPost = millenials.sharePost();
        System.out.println("Publisher: " + jacekPost);
        millenials.setSocialPublisher(new TwitterPublisher());
        jacekPost = millenials.sharePost();
        System.out.println("New publisher: " + jacekPost);
        //Then
        assertEquals("Twitter", jacekPost);
    }
}
