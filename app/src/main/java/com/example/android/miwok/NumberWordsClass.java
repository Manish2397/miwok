package com.example.android.miwok;

public class NumberWordsClass {
    private String defaultTranslation,miwokTranslation;
    private int imageResourceId;
    private int musicResourceId;
    NumberWordsClass(String d,String m,int imageResourceId,int musicResourceId){
        defaultTranslation = d;
        miwokTranslation = m;
        this.imageResourceId=imageResourceId;
        this.musicResourceId=musicResourceId;

    }
    public String getDefaultTranslation(){
        return defaultTranslation;
    }
    public String getMiwokTranslation(){
        return miwokTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public int getMusicResourceId() {
        return musicResourceId;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public void setMusicResourceId(int musicResourceId) {
        this.musicResourceId = musicResourceId;
    }
}
