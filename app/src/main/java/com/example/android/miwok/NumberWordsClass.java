package com.example.android.miwok;

public class NumberWordsClass {
    private String defaultTranslation,miwokTranslation;
    private int imageResourceId;
    NumberWordsClass(String d,String m,int imageResourceId){
        defaultTranslation = d;
        miwokTranslation = m;
        this.imageResourceId=imageResourceId;

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

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
