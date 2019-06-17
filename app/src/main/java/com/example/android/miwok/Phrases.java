package com.example.android.miwok;

public class Phrases {
    private String defaultTranslation,miwokTranslation;
    private int musicResourceId;
    public Phrases(String defaultTranslation,String miwokTranslation,int musicResourceId){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.musicResourceId=musicResourceId;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public void setMusicResourceId(int musicResourceId) {
        this.musicResourceId = musicResourceId;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getMusicResourceId() {
        return musicResourceId;
    }
}
