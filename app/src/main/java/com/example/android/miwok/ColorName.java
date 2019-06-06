package com.example.android.miwok;

public class ColorName
{
    private String defaultColorTranslation,miwokColorTranslation;
    private int imageResoureId;
    public ColorName(String defaultColorTranslation,String miwokColorTranslation,int imageResoureId){
        this.defaultColorTranslation=defaultColorTranslation;
        this.miwokColorTranslation = miwokColorTranslation;
        this.imageResoureId = imageResoureId;
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

    public String getDefaultColorTranslation() {
        return defaultColorTranslation;
    }

    public String getMiwokColorTranslation() {
        return miwokColorTranslation;
    }

    public int getImageResoureId() {
        return imageResoureId;
    }
}
