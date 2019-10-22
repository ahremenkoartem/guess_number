package com.jcourse.guess.models;

import java.util.Random;

public class GreateSmallModel implements IModel{
    private int secretDigit;
    private int tryCount;
    private Random random = new Random();

    public GreateSmallModel() {
        clear();
    }

    @Override
    public void clear() {
        tryCount = 1;
        secretDigit = random.nextInt(100)+1;
    }

    @Override
    public ModelResponse tryGuess(String tryMessage) throws Exception{
        int tryDigit = 0;
        try {
            tryDigit = Integer.parseInt(tryMessage);
        }catch (RuntimeException e){
            throw new Exception("Неверный формат числа") ;
        }

        String prefix = "Попытка " + tryCount + ": ";

        if (tryCount > 7){
            return new ModelResponse("Очень жаль, но Вы проиграли. Загаданное число: " + secretDigit, true);
        }

        if (tryDigit == secretDigit){
            return new ModelResponse(prefix + "Поздравляем, Вы победили!", true);
        }

        tryCount++;

        if (secretDigit < tryDigit)
            return new ModelResponse(prefix + "Загаданное число меньше!", false);
        else if (secretDigit > tryDigit)
            return new ModelResponse(prefix + "Загаданное число больше!", false);
        return null;
    }
}
