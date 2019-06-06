package com.example.android.miwok;

public class Family {
    private String familyDefaultTranslation,familyMiwokTranslaation;
    private int imageResourceId;
    public Family(String familyDefaultTranslation,String familyMiwokTranslaation,int imageResourceId){
        this.familyDefaultTranslation = familyDefaultTranslation;
        this.familyMiwokTranslaation = familyMiwokTranslaation;
        this.imageResourceId = imageResourceId;
    }

    public void setFamilyDefaultTranslation(String familyDefaultTranslation) {
        this.familyDefaultTranslation = familyDefaultTranslation;
    }

    public void setFamilyMiwokTranslaation(String familyMiwokTranslaation) {
        this.familyMiwokTranslaation = familyMiwokTranslaation;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public String getFamilyDefaultTranslation() {
        return familyDefaultTranslation;
    }

    public String getFamilyMiwokTranslaation() {
        return familyMiwokTranslaation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
