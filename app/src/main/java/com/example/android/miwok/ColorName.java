package com.example.android.miwok;

public class ColorName
{
    private String defaultColorTranslation,miwokColorTranslation;
    private int imageResoureId,musicResourceId;
    public ColorName(String defaultColorTranslation,String miwokColorTranslation,int imageResoureId,int musicResourceId){
        this.defaultColorTranslation=defaultColorTranslation;
        this.miwokColorTranslation = miwokColorTranslation;
        this.imageResoureId = imageResoureId;
        this.musicResourceId=musicResourceId;
    }

    public void setDefaultColorTranslation(String defaultColorTranslation) {
        this.defaultColorTranslation = defaultColorTranslation;
    }

    public void setMiwokColorTranslation(String miwokColorTranslation) {
        this.miwokColorTranslation = miwokColorTranslation;
    }

    public void setImageResoureId(int imageResoureId) {
        this.imageResoureId = imageResoureId;
    }

    public void setMusicResourceId(int musicResourceId) {
        this.musicResourceId = musicResourceId;
    }

    public String getDefaultColorTranslation() {
        return defaultColorTranslation;
    }

    public String getMiwokColorTranslation() {
        return miwokColorTranslation;
    }

    public int getImageResoureId() {
        return imageResoureId;
    }

    public int getMusicResourceId() {
        return musicResourceId;
    }
}
