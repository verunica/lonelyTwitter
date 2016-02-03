package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * This creates a list of Tweets for storage and later to use in
 * LonelyTwitterActivity
 *
 * @see LonelyTwitterActivity
 *
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet) throws IllegalArgumentException{
        for(int i = 0; i < tweets.size(); i++){
            if(tweets.get(i).getMessage().matches(tweet.getMessage())){
                throw new IllegalArgumentException();
            }
        }
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index){
       return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets(){
        Collections.sort(tweets);
        return tweets;
    }
    public void removeTweet(Tweet tweet){
        tweets.remove(tweet);
    }

    public int getCount(){
        return tweets.size();
    }



}
