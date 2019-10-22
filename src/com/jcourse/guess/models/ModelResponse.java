package com.jcourse.guess.models;

public class ModelResponse{

    private boolean isWin;
    private String message;

    public ModelResponse(String message, boolean isWin){
        this.isWin = isWin;
        this.message = message;
    }

    public boolean getResult() {
        return isWin;
    }

    public String getMessage() {
        return message;
    }
}
