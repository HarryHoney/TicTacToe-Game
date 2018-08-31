
package tictactoe_game;
import java.util.*;
import java.io.*;
/**
 *
 * @author Harpreet Singh
 */
public class TicTacToe_Game{

        private String Player1;
        private char symbolplayer1;
        private String Player2="Robot";
        private char symbolplayer2;
    public void StartGame() throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------Let's Start Tic Tac Toe------------------" );
        //First Player Created
        System.out.println("Enter the Name of First Player");
        Player1=sc.nextLine();
        System.out.println("Enter the Symbol of First Player");
        symbolplayer1=sc.next().charAt(0);
        Players player_one = new Players(Player1,symbolplayer1);
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        //Second Player Created
        System.out.println("Enter the Name of Second Player");
        Player2=reader.readLine();
        System.out.println("Enter the Symbol of Second Player");
        symbolplayer2=sc.next().charAt(0);
        Players player_two = new Players(Player2,symbolplayer2);
        
        
        while(symbolplayer1==symbolplayer2)
        {
           
            System.out.println("That symbol is already by "+player_one.getName());
            System.out.println("Enter some other Symbol");
            symbolplayer2=sc.next().charAt(0);
            player_two.setSymbol(symbolplayer2);
        }
    
        Board board = new Board();
        board.printBoard();
        boolean myturn=true;
        int x,y,result;
        while(true)
        {
            if(myturn)
            {
                System.out.println("It's "+player_one.getName()+"'s turn");
                System.out.println("Enter the X co-ordinate");
                try
                {
                    x=sc.nextInt();
                }
                catch(Exception e)
                {
                   System.out.println("Please Enter Valid Index of Matrix");
                   continue;
                }
                System.out.println("Enter the Y co-ordinate");
               try
               {
                   y=sc.nextInt();
               }
               catch(Exception e)
               {
                   System.out.println("Please Enter Valid Index of Matrix");
                   continue;
               }
                result=board.move(x,y,player_one.getSymbol());
                if(result==board.win)
                {
                    board.printBoard();
                    System.out.println(player_one.getName()+" Wins!!!!");
                    break;
                }
                if(result==board.Draw)
                {
                    board.printBoard();
                   System.out.println("OOps it's a Draw");
                   break;
                }
                if(result==board.Invalid)
                {
                    System.out.println("That Co-ordinates are in valid");
                    System.out.println("Enter again");
                }
                else
                {
                    myturn = false;
                }
            }
            else
            {
               System.out.println("It's "+player_two.getName()+"'s turn");
                System.out.println("Enter the X co-ordinate");
                try{
                    x=sc.nextInt();
                }
                catch(Exception e)
                {
                    System.out.println("Please Enter Valid Index of Matrix");
                    continue;
                    
                }
                System.out.println("Enter the Y co-ordinate");
                try
                {
                    y=sc.nextInt();
                }
                catch(Exception e)
                {
                    System.out.println("Please Enter Valid Index of Matrix");
                    continue;
                }
                result=board.move(x,y,player_two.getSymbol());
                if(result==board.win)
                {
                    board.printBoard();
                    System.out.println(player_two.getName()+" Wins!!!!");
                    break;
                }
                if(result==board.Draw)
                {
                    board.printBoard();
                   System.out.println("OOps it's a Draw");
                   break;
                }
                if(result==board.Invalid)
                {
                    System.out.println("That Co-ordinates are in valid");
                    System.out.println("Enter again");
                }
                else
                {
                    myturn = true;
                } 
            }
            board.printBoard();
        }
        int s=sc.nextInt();
    }
    
    
    
}
