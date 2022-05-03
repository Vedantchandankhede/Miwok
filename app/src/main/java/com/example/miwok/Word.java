package com.example.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private int mAudioResourceID;
    
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word( String defaultTranslation , String miwokTranslation , int audioResource){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResource;
    }

    public Word( String defaultTranslation , String miwokTranslation , int imageResourceId , int audioResource){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceID = audioResource;
    }

    public String getDefaulttranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResource(){
        return mAudioResourceID;
    }
}
