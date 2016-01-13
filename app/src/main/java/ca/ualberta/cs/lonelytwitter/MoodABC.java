package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by verunica on 1/12/16.
 */
public abstract class MoodABC {

    protected Date date;

    public MoodABC() {
        this.date = new Date();
    }

    public MoodABC(Date date){
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String displayMood();

}
