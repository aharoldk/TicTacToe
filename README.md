Tic-tac-toe - What is the current state of the game?
In a game of Tic-Tac-Toe, two players take turns marking an available cell in a 3-by-3 grid with their respective tokens (either X or O). When one player has placed three tokens in a horizontal, vertical, or diagonal row on the grid, the game is over and that player has won. A draw (no winner) occurs when all the cells on the grid have been filled with tokens and neither player has achieved a win. More details on the game here : https://en.wikipedia.org/wiki/Tic-tac-toe
Problem statement:
Given a string of ‘X’, ‘O’ and ‘-’ as input, which represents a game board, print the state of the game as output. The states must be one of:
• X wins
• O wins
• Draw
• Game in progress 
• Invalid grid

Examples :
1) X wins - when X occupies either all cells in a vertical line, or all cells in a horizontal line, or all cells in a diagonal. 
  Sample Input  : XOXXOOXXO.
  Sample Output : X wins!.

2) O wins - when O occupies either all cells in a vertical line, or all cells in a horizontal line, or all cells in a diagonal.
  Sample Input  : XOOXOXOXO.
  Sample Output : O Wins!.

3) Draw - no player has won. 
  Sample Input  : OXOXOXXOX.
  Sample Output : Its a draw!.

4) Game in progress - if no player has won and its not a draw.
  Sample Input  : XOXX--O--.
  Sample Output : Game still in progress!.

5) Invalid Grid - a grid thats not possible to achieve in a real game.
  Sample Input  : XXXOOOXXO.
  Sample Output : Invalid game board.
