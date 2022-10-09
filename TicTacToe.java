import java.util.Scanner;
public class TicTacToe {
    private Scanner scan = new Scanner(System.in);
    private String[][] game_board;
    private boolean game_over = false;
    private int turn_number = 0;
    private boolean player1_Win = false;
    private boolean player2_Win = false;
    private boolean try_again = false;
    
    //constructor
    public TicTacToe()
    {
        int count = 1;
        game_board = new String[3][3];
        for (int r=0 ; r < game_board.length ; r++)
        {
            for (int c=0 ; c < game_board[0].length ; c++)
            {
                game_board[r][c] = "  " + count + "  ";
                count++;
            }
        }
    }
    //player1's move
    public void player1_move(int move)
    {
        boolean found = false;
        for (int r=0 ; r < game_board.length ; r++)
        {
            for (int c=0 ; c < game_board[0].length ; c++)
            {
                if (game_board[r][c].equals("  " + move + "  "))
                {
                    game_board[r][c] = "  X  ";
                    found = true;
                }
                
            }
        }
        if (found == false)
        {
            try_again = true;
        }
    }
    //player2's move
    public void player2_move(int move)
    {
        boolean found = false;
        for (int r=0 ; r < game_board.length ; r++)
        {
            for (int c=0 ; c < game_board[0].length ; c++)
            {
                if (game_board[r][c].equals("  " + move + "  "))
                {
                    game_board[r][c] = "  O  ";
                    found = true;
                }
            } 
        }
        if (found == false)
        {
            try_again = true;
        }

    }

    //game end algorithm
    public void game_decided()
    {
        //vertical left
            //player1's win condition
            int vertical_left_countp1 = 0;
            for (int r = 0 ; r < game_board.length ; r++)
            {
                if (game_board[r][0].equals("  X  "))
                {
                    vertical_left_countp1++;
                }
            }
            if (vertical_left_countp1 == 3)
            {
                player1_Win = true;
                game_over = true;
            }
            //player2's win condition
            int vertical_left_countp2 = 0;
            for (int r = 0 ; r < game_board.length ; r++)
            {
                if (game_board[r][0].equals("  O  "))
                {
                    vertical_left_countp2++;
                }
            }
            if (vertical_left_countp2 == 3)
            {
                player2_Win = true;
                game_over = true;
            }
        
        //horizontal top
            //player1's win condition
            int horizontal_top_countp1 = 0;
            for (int c = 0 ; c < game_board[0].length ; c++)
            {
                if (game_board[0][c].equals("  X  "))
                {
                    horizontal_top_countp1++;
                }
            }
            if (horizontal_top_countp1 == 3)
            {
                player1_Win = true;
                game_over = true;
            }
            //player2's win condition
            int horizontal_top_countp2 = 0;
            for (int c = 0 ; c < game_board[0].length ; c++)
            {
                if (game_board[0][c].equals("  O  "))
                {
                    horizontal_top_countp2++;
                }
            }
            if (horizontal_top_countp2 == 3)
            {
                player2_Win = true;
                game_over = true;
            }
    
        //vertical right
            //player1's win condition
            int vertical_right_countp1 = 0;
            for (int r = 0 ; r < game_board.length ; r++)
            {
                if (game_board[r][2].equals("  X  "))
                {
                    vertical_right_countp1++;
                }
            }
            if (vertical_right_countp1 == 3)
            {
                player1_Win = true;
                game_over = true;
            }
            //player2's win condition
            int vertical_right_countp2 = 0;
            for (int r = 0 ; r < game_board.length ; r++)
            {
                if (game_board[r][2].equals("  O  "))
                {
                    vertical_right_countp2++;
                }
            }
            if (vertical_right_countp2 == 3)
            {
                player2_Win = true;
                game_over = true;
            }

        //horizontal bottom
            //player1's win condition
            int horizontal_bottom_countp1 = 0;
            for (int c = 0 ; c < game_board[0].length ; c++)
            {
                if (game_board[2][c].equals("  X  "))
                {
                    horizontal_bottom_countp1++;
                }
            }
            if (horizontal_bottom_countp1 == 3)
            {
                player1_Win = true;
                game_over = true;
            }
            //player2's win condition
            int horizontal_bottom_countp2 = 0;
            for (int c = 0 ; c < game_board[0].length ; c++)
            {
                if (game_board[2][c].equals("  O  "))
                {
                    horizontal_bottom_countp2++;
                }
            }
            if (horizontal_bottom_countp2 == 3)
            {
                player2_Win = true;
                game_over = true;
            }
        
        //vertical middle
            //player1's win condition
            int vertical_middle_countp1 = 0;
            for (int r = 0 ; r < game_board.length ; r++)
            {
                if (game_board[r][1].equals("  X  "))
                {
                    vertical_middle_countp1++;
                }
            }
            if (vertical_middle_countp1 == 3)
            {
                player1_Win = true;
                game_over = true;
            }
            //player2's win condition
            int vertical_middle_countp2 = 0;
            for (int r = 0 ; r < game_board.length ; r++)
            {
                if (game_board[r][1].equals("  O  "))
                {
                    vertical_middle_countp2++;
                }
            }
            if (vertical_middle_countp2 == 3)
            {
                player2_Win = true;
                game_over = true;
            }
        
        //horizontal middle
            //player1's win condition
            int horizontal_middle_countp1 = 0;
            for (int c = 0 ; c < game_board[0].length ; c++)
            {
                if (game_board[1][c].equals("  X  "))
                {
                    horizontal_middle_countp1++;
                }
            }
            if (horizontal_middle_countp1 == 3)
            {
                player1_Win = true;
                game_over = true;
            }
            //player2's win condition
            int horizontal_middle_countp2 = 0;
            for (int c = 0 ; c < game_board[0].length ; c++)
            {
                if (game_board[1][c].equals("  O  "))
                {
                    horizontal_middle_countp2++;
                }
            }
            if (horizontal_middle_countp2 == 3)
            {
                player2_Win = true;
                game_over = true;
            }
        //diagonal negative
            //player1's win condition
            int diagonal_negative_countp1 = 0;
            for (int r = 0 ; r < game_board.length ; r++)
            {
                if (game_board[r][r].equals("  X  "))
                {
                    diagonal_negative_countp1++;
                }
            }
            if (diagonal_negative_countp1 == 3)
            {
                player1_Win = true;
                game_over = true;
            }
            //player2's win condition
            int diagonal_negative_countp2 = 0;
            for (int r = 0 ; r < game_board.length ; r++)
            {
                if (game_board[r][r].equals("  O  "))
                {
                    diagonal_negative_countp2++;
                }
            }
            if (diagonal_negative_countp2 == 3)
            {
                player2_Win = true;
                game_over = true;
            }
        
        //diagonal positive
            //player1's win condition
            int diagonal_positive_countp1 = 0;
            int count = 0;
            for (int r = game_board.length-1 ; r >= 0 ; r--)
            {
                if (game_board[r][count].equals("  X  "))
                {
                    diagonal_positive_countp1++;
                }
                count++;
            }
            if (diagonal_positive_countp1 == 3)
            {
                player1_Win = true;
                game_over = true;
            }
            //player2's win condition
            int diagonal_positive_countp2 = 0;
            int count2 = 0;
            for (int r = game_board.length-1 ; r >= 0 ; r--)
            {
                if (game_board[r][count2].equals("  O  "))
                {
                    diagonal_positive_countp2++;
                }
                count2++;
            }
            if (diagonal_positive_countp2 == 3)
            {
                player2_Win = true;
                game_over = true;
            }

        
    }

    //print out board
    public String[][] printBoard()
    {
        for (int r=0 ; r < game_board.length ; r++)
        {
            for (int c=0 ; c < game_board[0].length ; c++)
            {
                System.out.print(game_board[r][c]);
                if (c != 2)
                {
                    System.out.print("|");
                }
                
            }
            System.out.println();
            if (r != game_board.length-1)
            {
                System.out.println("—————|—————|—————");
            }
        }
        return game_board;
    }
    
    public void play()
    {
        printBoard();
        while (game_over == false)
        {
            System.out.println("Player 1(X) where woud you like to place your mark?");
            int player1_move = scan.nextInt();
            player1_move(player1_move);
            if (try_again == true && turn_number != 0)
            {
                System.out.println("You can't do that. Please try again");
                int player1_move2 = scan.nextInt();
                player1_move(player1_move2);
                try_again = false;
            }
            game_decided();
            printBoard();
            if (game_over == true)
            {
                break;
            }
            turn_number++;
            if (turn_number == 9)
            {
                break;
            }
            System.out.println("Player 2(O) where would you like to place your mark?");
            int player2_move = scan.nextInt();
            player2_move(player2_move);
            if (try_again == true)
            {
                System.out.println("You can't do that. Please try again");
                int player1_move2 = scan.nextInt();
                player2_move(player1_move2);
                try_again = false;
            }
            game_decided();
            printBoard();
            if (game_over == true)
            {
                break;
            }
            turn_number++;
        }
        if (player1_Win == true)
        {
            System.out.print("Player1(X) Wins!");
        }
        else if (player2_Win == true)
        {
            System.out.print("Player2(O) Wins!");
        }
        else
        {
            System.out.print("Tie!");
        }
    }

}