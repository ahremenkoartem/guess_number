package com.jcourse.guess.models;


public interface IModel {
    public void clear();
    public ModelResponse tryGuess(String tryMessage) throws Exception;
}
