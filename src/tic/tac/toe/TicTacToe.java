package tic.tac.toe;

import java.util.Scanner;

/**
 *
 * @author 18055842
 */
public class TicTacToe implements TicTacToeInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TicTacToe view = new TicTacToe();
        TicTacToePresenter presenter = new TicTacToePresenter(view);
        
        System.out.print("Sample Input : ");
        Scanner scan = new Scanner(System.in);
        
        String inputs = scan.next();
        presenter.setListTicTacToe(inputs);
    }

    @Override
    public void printResult(String result) {
        System.out.println(result);
    }
    
}
