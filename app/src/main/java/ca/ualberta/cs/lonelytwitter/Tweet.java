package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/12/16.
 */
public abstract class Tweet implements Comparable{
    protected Date date;
    protected String message;

    public abstract Boolean isImportant();

    public Tweet(Date date, String message) {
        this.date = date;
        this.message = message;
    }

    public Tweet(String message) {
        this.message = message;
        this.date = new Date(System.currentTimeMillis());
    }


    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        }
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }
    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

    //got this code from http://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/ on jan 25 2016
    public int compareTo(Object a){
        Date compareDate = ((Tweet) a).getDate();
        long d1 = compareDate.getTime();
        long d2 = this.getDate().getTime();

        return (int) (d2 - d1);
    }

}
