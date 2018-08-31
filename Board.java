
package tictactoe_game;

/**
 *
 * @author Harpreet Singh
 */
public class Board {
    private char board[][];
    private int order=3;
    public final int win=1;
    
    public final int Draw=3;
    public final int Invalid=4;
    public final int Incomplete=5;
    int count;
    public Board()
    {
        board=new char[order][order];
        for(int i=0;i<order;i++)
        {
            for(int j=0;j<order;j++)
            {
             board[i][j]=' ';
            }
        }
        
        count=order*order;
    }
    public void printBoard()
    {
        for(int i=0;i<order;i++)
        {
            for(int j=0;j<order;j++)
            {
                System.out.print("|"+board[i][j]+"|");
            }
            System.out.println();
            for(int j=0;j<order*5;j++)
                System.out.print("-");
            System.out.println();
        }
    }
    public int move(int x,int y,char s)
    {
        if(x>=order||y>=order||x<0||y<0||board[x][y]!=' ')
            return Invalid;
        board[x][y]=s;
        count--;
        if(board[x][0]==board[x][1]&&board[x][0]==board[x][2])
            return win;
        if(board[0][y]==board[1][y]&&board[1][y]==board[2][y])
            return win;
        if(board[0][0]==board[1][1]&&board[1][1]==board[2][2]&&board[0][0]!=' ')
            return win;
        if(board[0][2]==board[2][0]&&board[1][1]==board[2][0]&&board[2][0]!=' ')
            return win;
        if(count==0)
            return Draw;
       
        return Incomplete;
    }
    
}
