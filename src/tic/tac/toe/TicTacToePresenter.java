package tic.tac.toe;

/**
 *
 * @author 18055842
 */
public class TicTacToePresenter {
    private TicTacToe view;
    private String listTicTacToe;
    private int xCount;
    private int oCount;
    private int nonCount;
    private boolean xWin = false;
    private boolean oWin = false;
    private final String[] winningList = {
        "012",
        "345",
        "678",
        "036",
        "147",
        "258",
        "048",
        "246"
    };
    
    TicTacToePresenter(TicTacToe view) {
        this.view = view;
    }

    public void setListTicTacToe(String tictactoe) {
        listTicTacToe = tictactoe.toLowerCase();
        
        if(checkArrayTicTacToe(listTicTacToe)) {
            checkTicTacToeWinner(listTicTacToe);
        }
    }
    
    public boolean checkArrayTicTacToe(String listTicTacToe1) {
        xCount = 0;
        oCount = 0;
        nonCount = 0;
        
        for(char input : listTicTacToe1.toCharArray()){
            switch (input) {
                case 'x':
                    xCount++;
                    break;
                case 'o':
                    oCount++;
                    break;
                case '-':
                    nonCount++;
                    break;
                default:
                    view.printResult("Invalid Game Board");
                    return false;
            }
        }
        
        if(Math.abs(xCount - oCount) > 1 || listTicTacToe1.length() != 9){
            view.printResult("Invalid Game Board");
            return false;
        }
        
        return true;
    }
    
    public void checkTicTacToeWinner(String listTicTacToe1){
        xWin = false;
        oWin = false;
        
        for (String winningList1 : winningList) {
            String strike = getStrikeCondition(winningList1, listTicTacToe1);
            
            if(strike.equals("xxx")){
                xWin = true;
            } else if (strike.equals("ooo")){
                oWin = true;
            }
        }
        
        view.printResult(getResult(xWin, oWin, nonCount));
    }
    
    public String getStrikeCondition(String winningList1, String listTicTacToe1) {
        String strike = "";
        for (int j = 0; j < winningList1.length(); j++) {
            String sPosition = String.valueOf(winningList1.charAt(j));
            int iPosition = Integer.parseInt(sPosition);
            strike += listTicTacToe1.charAt(iPosition);
        }
        
        return strike;
    }
    
    public String getResult(boolean xWin1, boolean oWin1, int nonCount1) {
        String result;
        
        if(xWin1 == true && oWin1 == true) {
            result = "Invalid Game Board";
        } else if(xWin1 == true){
            result = "X Wins";
        } else if(oWin1 == true) {
            result = "O Wins";
        } else if(nonCount1 > 0){
            result = "Game still in progress";
        } else {
            result = "Its a draw!";
        }
        
        return result;
    }
}
