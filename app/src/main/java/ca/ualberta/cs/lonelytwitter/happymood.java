package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

/**
 * Created by verunica on 1/12/16.
 */
public class happymood extends MoodABC{
    protected String mood;

    happymood(){
        super();
    }

    happymood(Date date){
        super(date);
    }


    public String displayMood(){
        return "happy";
    }
}
