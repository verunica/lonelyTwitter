package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by verunica on 1/12/16.
 */
public class sadmood extends MoodABC {

    protected String mood;

    sadmood(){
        super();
    }

    sadmood(Date date){
        super(date);
    }


    public String displayMood(){
        return "Sad";
    }
}
