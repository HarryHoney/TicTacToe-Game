
package tictactoe_game;

/**
 *
 * @author Harpreet Singh
 */
public class Players {
    private String Name;
    private char symbol;
    
    public Players(String Name, Character symbol)
    {
        this.Name=Name;
        this.symbol=symbol;
    }
   public String getName(){
       return Name;
   } 
   public char getSymbol(){
       return symbol;
   }
   public void setSymbol(char symbol)
   {
       this.symbol=symbol;
   }
}
