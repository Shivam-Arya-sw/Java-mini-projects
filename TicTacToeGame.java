import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    char[][] board = new char[3][3];
    String check="yes";
    while(check.equals("yes")){
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        board[row][col] = ' ';
      }
    }

    char player = 'X';
    boolean gOver = false;
    Scanner sc = new Scanner(System.in);

    while (!gOver) {
      printBoard(board);
      System.out.print("Player " + player + " enter: ");
      int row = sc.nextInt();
      int col = sc.nextInt();
      System.out.println();

      if (board[row][col] == ' ') {
        board[row][col] = player; // place the element
        gOver = Won(board, player);
        if (gOver) {
          System.out.println("Player " + player + " has won: ");
        } else {
          player = (player == 'X') ? 'O' : 'X';
        }
      } else {
        System.out.println("Invalid move. Try again!");
      }
    }
    printBoard(board);
    System.out.print("You want to play again? yes or no: " );
    check = sc.next().toLowerCase();
    }
    if(!check.equals("yes")){
        System.out.println("THANKS FOR PLAYING." );
        System.out.println();
    }
  }

  public static boolean Won(char[][] board, char player) {
    // check the rows
    for (int row = 0; row < board.length; row++) {
      if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
        return true;
      }
    }

    // check for col
    for (int col = 0; col < board[0].length; col++) {
      if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
        return true;
      }
    }

    // diagonal
    if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
      return true;
    }

    if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
      return true;
    }
    return false;
  }

  public static void printBoard(char[][] board) {
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        System.out.print(board[row][col] + " | ");
      }
      System.out.println();
    }
  }
}