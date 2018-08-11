/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 18055842
 */
public class TicTacToeTest {
    
    private TicTacToe view;
    private TicTacToePresenter instance;
    private final String[] inputs = new String[5];
    private final String[] winningList = new String[8];
        
    public TicTacToeTest() {
    }
    
    @Before
    public void setUp() {
        winningList[0] = "012";
        winningList[1] = "345";
        winningList[2] = "678";
        winningList[3] = "036";
        winningList[4] = "147";
        winningList[5] = "258";
        winningList[6] = "048";
        winningList[7] = "246";
        
        inputs[0] = "xoxxooxxo";
        inputs[1] = "xooxoxoxo";
        inputs[2] = "oxoxoxxox";
        inputs[3] = "xoxx--o--";
        inputs[4] = "xxxoooxxo";
        
        view = new TicTacToe();
        instance = new TicTacToePresenter(view);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCheckArrayTicTacToe() {
        for(String input : inputs){
            assertTrue("Error Inputs ", instance.checkArrayTicTacToe(input));
        }
    }
    
    @Test
    public void testGetStrikeCondition(){
        for(String input : inputs){
            for(String winString : winningList){
                assertNotNull("Get Strike Condition ", instance.getStrikeCondition(winString, input));
            }
        }
    }
    
    @Test
    public void testGetResult(){
        assertEquals("Not Same Result : ", "Invalid Game Board", instance.getResult(true, true, 0));
        assertEquals("Not Same Result : ", "X Wins", instance.getResult(true, false, 0));
        assertEquals("Not Same Result : ", "O Wins", instance.getResult(false, true, 0));
        assertEquals("Not Same Result : ", "Game still in progress", instance.getResult(false, false, 4));
        assertEquals("Not Same Result : ", "Its a draw!", instance.getResult(false, false, 0));
    }
    
    @Test
    public void testCheckTicTacToeWinner(){
        for(String input : inputs){
            instance.setListTicTacToe(input);
        }
    }
}
