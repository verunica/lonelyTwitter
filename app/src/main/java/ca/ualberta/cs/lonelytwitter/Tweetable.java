package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This is the interface for tweets
 * @see Tweet
 *
 */
public interface Tweetable {
    // getMessage returns the tweet message.
    public String getMessage();
    public Date getDate();
}
