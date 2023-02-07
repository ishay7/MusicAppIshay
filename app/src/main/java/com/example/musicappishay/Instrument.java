package com.example.musicappishay;
import android.net.Uri;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class Instrument
{
    private String name;
    private String information;
    private String history;
    private Uri musicAdress;

    public Instrument ()
    {

    }

    public Instrument (String name, String information, String history, Uri musicAdress)
    {
        this.name = name;
        this.information = information;
        this.history = history;
        this.musicAdress = musicAdress;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public Uri getMusicAdress() {
        return musicAdress;
    }

    public void setMusicAdress(Uri musicAdress) {
        this.musicAdress = musicAdress;
    }
}
