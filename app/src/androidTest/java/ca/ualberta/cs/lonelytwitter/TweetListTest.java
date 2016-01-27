package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by verunica on 1/26/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2{
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");
        Tweet dupTweet = new NormalTweet("Test tweet");

        try{
            tweets.addTweet(tweet);
            tweets.addTweet(dupTweet);
        }catch (IllegalArgumentException iae){
            fail();
        }
    }

    public void testGetTweets(){

        TweetList tweets = new TweetList();
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException("Not Sleeping");
        }
        Tweet tweet = new NormalTweet("Test tweet");

        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException("Not Sleeping");
        }
        Tweet tweet1 = new NormalTweet("Test tweet1");

        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException("Not Sleeping");
        }
        Tweet tweet2 = new NormalTweet("Test tweet2");

        tweets.addTweet(tweet);
        tweets.addTweet(tweet1);
        tweets.addTweet(tweet2);

        ArrayList<Tweet> sortedTweets = tweets.getTweets();

        for(int i = 0; i < tweets.getCount() -  1; i++){
            assertTrue((sortedTweets.get(i+1).getDate().getTime() - sortedTweets.get(i).getDate().getTime()) >= 0);
        }

    }
    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Hello");

        assertFalse(tweets.hasTweet(tweet));

        tweets.addTweet(tweet);
        tweets.hasTweet(tweet);

        assertTrue(tweets.hasTweet(tweet));

    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.addTweet(tweet);
        tweets.removeTweet(tweet);

        assertFalse(tweets.hasTweet(tweet));

    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.addTweet(tweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());

    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.addTweet(tweet);

        assertTrue(tweets.getCount() == 1);
    }


}
