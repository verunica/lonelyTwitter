package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 *
 * This class creates an important tweet for LonelyTwitterActivity
 *
 */
public class ImportantTweet extends Tweet implements Tweetable {

    /**
     * This sets the importance to true
     * @return returns true
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    /**
     * sets the date of the important tweet
     * @param date
     * @param message
     */
    public ImportantTweet(Date date, String message) {
        super(date, message);
    }

    /**
     * This sets the message of the important tweet
     * @param message
     */
    public ImportantTweet(String message) {
        super(message);
    }

    /**
     * This returns the date
     * @return date
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * This returns that it is an important tweet
     * @return String
     */
    public String getMessage() {
        return "!IMPORTANT! " + this.message;
    }
}
