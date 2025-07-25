package models;

import models.juegoDados.Dice;
import models.juegoDados.Player;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void lostWhenDiceNumberIsLowOrEqual(){
        //sin mockito
        //Dice dice = new Dice(6);
        //con mockito
        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(3);

        Player player = new Player(dice,4);

        assertFalse(player.play());
    }

    @Test
    public void winWhenDiceNumberIsHigh(){
        //sin mockito
        //Dice dice = new Dice(6);
        //con mockito
        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(3);

        Player player = new Player(dice,2);

        assertTrue(player.play());
    }

}