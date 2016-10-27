package com.suriosity.learnhindi;

public class Words {
    private String defaultWord;
    private String hindi;

    public Words(String defaultWord, String hindi){
        this.defaultWord=defaultWord;
        this.hindi=hindi;
    }

    public String getDefaultWord(){
        return defaultWord;
    }

    public String getHindi(){
        return hindi;
    }

    public void setDefaultWord(String defaultWord){
        this.defaultWord=defaultWord;
    }

    public void setHindi(String hindi){
        this.hindi = hindi;
    }
}
