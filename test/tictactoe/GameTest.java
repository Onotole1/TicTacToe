/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author anatoliy
 */
public class GameTest {
    
   
    
    @Test
    public void testStep1() {
        Game game = new Game();
        this.gameStep(game, 0, 0);
        assertEquals(game.getField()[0][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][1][0], Game.ORDER.TIC.value);
         
        assertEquals(game.getField()[0][1][0], 0);
        assertEquals(game.getField()[0][2][0], 0);
        assertEquals(game.getField()[1][0][0], 0);
        assertEquals(game.getField()[1][2][0], 0);
        assertEquals(game.getField()[2][0][0], 0);
        assertEquals(game.getField()[2][1][0], 0);
        assertEquals(game.getField()[2][2][0], 0);
        
    }
    
    @Test
    public void testStep2() {
        Game game = new Game();
        this.gameStep(game, 0, 0);
        assertEquals(game.getField()[0][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][1][0], Game.ORDER.TIC.value);
         
        assertEquals(game.getField()[0][1][0], 0);
        assertEquals(game.getField()[0][2][0], 0);
        assertEquals(game.getField()[1][0][0], 0);
        assertEquals(game.getField()[1][2][0], 0);
        assertEquals(game.getField()[2][0][0], 0);
        assertEquals(game.getField()[2][1][0], 0);
        assertEquals(game.getField()[2][2][0], 0);
         
        this.gameStep(game, 0, 1);
          
        assertEquals(game.getField()[0][1][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[0][2][0], Game.ORDER.TIC.value);
         
        assertEquals(game.getField()[1][0][0], 0);
        assertEquals(game.getField()[1][2][0], 0);
        assertEquals(game.getField()[2][0][0], 0);
        assertEquals(game.getField()[2][1][0], 0);
        assertEquals(game.getField()[2][2][0], 0);
         
    }
    
    @Test
    public void testStep3() {
        Game game = new Game();
        this.gameStep(game, 0, 0);
        assertEquals(game.getField()[0][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][1][0], Game.ORDER.TIC.value);
         
        assertEquals(game.getField()[0][1][0], 0);
        assertEquals(game.getField()[0][2][0], 0);
        assertEquals(game.getField()[1][0][0], 0);
        assertEquals(game.getField()[1][2][0], 0);
        assertEquals(game.getField()[2][0][0], 0);
        assertEquals(game.getField()[2][1][0], 0);
        assertEquals(game.getField()[2][2][0], 0);
         
        this.gameStep(game, 0, 1);
          
        assertEquals(game.getField()[0][1][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[0][2][0], Game.ORDER.TIC.value);
         
        assertEquals(game.getField()[1][0][0], 0);
        assertEquals(game.getField()[1][2][0], 0);
        assertEquals(game.getField()[2][0][0], 0);
        assertEquals(game.getField()[2][1][0], 0);
        assertEquals(game.getField()[2][2][0], 0);
         
        this.gameStep(game, 2, 0);
         
        assertEquals(game.getField()[0][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][1][0], Game.ORDER.TIC.value);
        assertEquals(game.getField()[0][1][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[0][2][0], Game.ORDER.TIC.value);
       
        assertEquals(game.getField()[1][2][0], 0);
        assertEquals(game.getField()[2][1][0], 0);
        assertEquals(game.getField()[2][2][0], 0);
        assertEquals(game.getField()[2][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][0][0], Game.ORDER.TIC.value);
         
    }
    
    @Test
    public void testStep4() {
        Game game = new Game();
        this.gameStep(game, 0, 0);
        assertEquals(game.getField()[0][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][1][0], Game.ORDER.TIC.value);
         
        assertEquals(game.getField()[0][1][0], 0);
        assertEquals(game.getField()[0][2][0], 0);
        assertEquals(game.getField()[1][0][0], 0);
        assertEquals(game.getField()[1][2][0], 0);
        assertEquals(game.getField()[2][0][0], 0);
        assertEquals(game.getField()[2][1][0], 0);
        assertEquals(game.getField()[2][2][0], 0);
         
        this.gameStep(game, 0, 1);
          
        assertEquals(game.getField()[0][1][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[0][2][0], Game.ORDER.TIC.value);
         
        assertEquals(game.getField()[1][0][0], 0);
        assertEquals(game.getField()[1][2][0], 0);
        assertEquals(game.getField()[2][0][0], 0);
        assertEquals(game.getField()[2][1][0], 0);
        assertEquals(game.getField()[2][2][0], 0);
        
        this.gameStep(game, 2, 0);
         
        assertEquals(game.getField()[0][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][1][0], Game.ORDER.TIC.value);
        assertEquals(game.getField()[0][1][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[0][2][0], Game.ORDER.TIC.value);
       
        assertEquals(game.getField()[1][2][0], 0);
        assertEquals(game.getField()[2][1][0], 0);
        assertEquals(game.getField()[2][2][0], 0);
        assertEquals(game.getField()[2][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][0][0], Game.ORDER.TIC.value);
       
        this.gameStep(game, 1, 2);
       
        assertEquals(game.getField()[0][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][1][0], Game.ORDER.TIC.value);
        assertEquals(game.getField()[0][1][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[0][2][0], Game.ORDER.TIC.value);
        assertEquals(game.getField()[1][2][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[2][1][0], Game.ORDER.TIC.value);
       
        assertEquals(game.getField()[2][2][0], 0);
        assertEquals(game.getField()[2][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][0][0], Game.ORDER.TIC.value);
         
    }
    
    @Test
    public void testStep5() {
        Game game = new Game();
        this.gameStep(game, 0, 0);
        assertEquals(game.getField()[0][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][1][0], Game.ORDER.TIC.value);
         
        assertEquals(game.getField()[0][1][0], 0);
        assertEquals(game.getField()[0][2][0], 0);
        assertEquals(game.getField()[1][0][0], 0);
        assertEquals(game.getField()[1][2][0], 0);
        assertEquals(game.getField()[2][0][0], 0);
        assertEquals(game.getField()[2][1][0], 0);
        assertEquals(game.getField()[2][2][0], 0);
         
        this.gameStep(game, 0, 1);
          
        assertEquals(game.getField()[0][1][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[0][2][0], Game.ORDER.TIC.value);
        
        assertEquals(game.getField()[1][0][0], 0);
        assertEquals(game.getField()[1][2][0], 0);
        assertEquals(game.getField()[2][0][0], 0);
        assertEquals(game.getField()[2][1][0], 0);
        assertEquals(game.getField()[2][2][0], 0);
         
        this.gameStep(game, 2, 0);
         
        assertEquals(game.getField()[0][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][1][0], Game.ORDER.TIC.value);
        assertEquals(game.getField()[0][1][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[0][2][0], Game.ORDER.TIC.value);
       
        assertEquals(game.getField()[1][2][0], 0);
        assertEquals(game.getField()[2][1][0], 0);
        assertEquals(game.getField()[2][2][0], 0);
        assertEquals(game.getField()[2][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][0][0], Game.ORDER.TIC.value);
       
        this.gameStep(game, 1, 2);
       
        assertEquals(game.getField()[0][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][1][0], Game.ORDER.TIC.value);
        assertEquals(game.getField()[0][1][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[0][2][0], Game.ORDER.TIC.value);
        assertEquals(game.getField()[1][2][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[2][1][0], Game.ORDER.TIC.value);
       
        assertEquals(game.getField()[2][2][0], 0);
        assertEquals(game.getField()[2][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][0][0], Game.ORDER.TIC.value);
       
        this.gameStep(game, 2, 2);
       
        assertEquals(game.getField()[0][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][1][0], Game.ORDER.TIC.value);
        assertEquals(game.getField()[0][1][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[0][2][0], Game.ORDER.TIC.value);
        assertEquals(game.getField()[1][2][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[2][1][0], Game.ORDER.TIC.value);
        assertEquals(game.getField()[2][2][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[2][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][0][0], Game.ORDER.TIC.value);
        
        assertEquals(game.getStatus(), Game.STATUS.FINISHED_STANDOFF);
         
    }
    
    //Проигрыш
    @Test
    public void testStep6() {
        Game game = new Game();
        this.gameStep(game, 0, 0);
        assertEquals(game.getField()[0][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][1][0], Game.ORDER.TIC.value);
         
        assertEquals(game.getField()[0][1][0], 0);
        assertEquals(game.getField()[0][2][0], 0);
        assertEquals(game.getField()[1][0][0], 0);
        assertEquals(game.getField()[1][2][0], 0);
        assertEquals(game.getField()[2][0][0], 0);
        assertEquals(game.getField()[2][1][0], 0);
        assertEquals(game.getField()[2][2][0], 0);
        
    }
    
    @Test
    public void testStep7() {
        Game game = new Game();
        this.gameStep(game, 0, 0);
        assertEquals(game.getField()[0][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][1][0], Game.ORDER.TIC.value);
         
        assertEquals(game.getField()[0][1][0], 0);
        assertEquals(game.getField()[0][2][0], 0);
        assertEquals(game.getField()[1][0][0], 0);
        assertEquals(game.getField()[1][2][0], 0);
        assertEquals(game.getField()[2][0][0], 0);
        assertEquals(game.getField()[2][1][0], 0);
        assertEquals(game.getField()[2][2][0], 0);
         
        this.gameStep(game, 0, 2);
          
        assertEquals(game.getField()[0][2][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[0][1][0], Game.ORDER.TIC.value);
         
        assertEquals(game.getField()[1][0][0], 0);
        assertEquals(game.getField()[1][2][0], 0);
        assertEquals(game.getField()[2][1][0], 0);
        assertEquals(game.getField()[2][0][0], 0);
        assertEquals(game.getField()[2][2][0], 0);
         
    }
    
    @Test
    public void testStep8() {
        Game game = new Game();
        this.gameStep(game, 0, 0);
        assertEquals(game.getField()[0][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][1][0], Game.ORDER.TIC.value);
         
        assertEquals(game.getField()[0][1][0], 0);
        assertEquals(game.getField()[0][2][0], 0);
        assertEquals(game.getField()[1][0][0], 0);
        assertEquals(game.getField()[1][2][0], 0);
        assertEquals(game.getField()[2][0][0], 0);
        assertEquals(game.getField()[2][1][0], 0);
        assertEquals(game.getField()[2][2][0], 0);
         
        this.gameStep(game, 0, 2);
          
        assertEquals(game.getField()[0][2][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[0][1][0], Game.ORDER.TIC.value);
         
        assertEquals(game.getField()[1][0][0], 0);
        assertEquals(game.getField()[1][2][0], 0);
        assertEquals(game.getField()[2][1][0], 0);
        assertEquals(game.getField()[2][0][0], 0);
        assertEquals(game.getField()[2][2][0], 0);
         
         
        this.gameStep(game, 2, 2);
         
        assertEquals(game.getField()[0][0][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[0][1][0], Game.ORDER.TIC.value);
        assertEquals(game.getField()[0][2][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[1][1][0], Game.ORDER.TIC.value);
        assertEquals(game.getField()[2][2][0], Game.ORDER.TAC.value);
        assertEquals(game.getField()[2][1][0], Game.ORDER.TIC.value);
       
        assertEquals(game.getField()[1][0][0], 0);
        assertEquals(game.getField()[2][0][0], 0);
        assertEquals(game.getField()[1][2][0], 0);
        
        assertEquals(game.getStatus(), Game.STATUS.FINISHED_TIC);
         
    }
    
    private void gameStep(Game game, int x, int y) {
        game.gameStep(x, y);
        game.compStep();
        
    }
    
}
