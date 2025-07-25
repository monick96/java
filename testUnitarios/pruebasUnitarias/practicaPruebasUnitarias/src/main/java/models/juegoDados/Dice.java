package models.juegoDados;

import java.util.Random;

//dado = dice
public class Dice {
    private int sides;

    public Dice (int sides){
        this.sides = sides;
    }

    //devuelve aleatoriamente el valor de la cara del dado
    public int roll(){
        return new Random().nextInt(this.sides) + 1;
    }

}
