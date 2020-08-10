
/**
 *
 * @author Matthew Cassaro
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int battles = 0;
        int war = 0;
        Deck d = new Deck();
        d.shuffle();
        Player player1 = new Player();
        Player player2 = new Player();
        Pile pile1 = new Pile();
        Pile pile2 = new Pile();
        
        player1.takeHalf(d);
        player2.takeHalf(d);
        System.out.println("Player 1 has " +player1.getNumberOfCards()+ " cards.");
        System.out.println("Player 2 has " +player2.getNumberOfCards()+ " cards.");
        
        
        //compare to see who wins
        //winner takes the cards(tell the user)
        
        do
        {
            pile1.push(player1.playCard());
            pile2.push(player2.playCard());
            System.out.println("Player 1 played " +pile1.peek());
            System.out.println("Player 2 played " +pile2.peek());
            
            if(pile1.peek().getValue() > pile2.peek().getValue())
            {
                pile1.consolidate(pile2);
                pile1.shuffle();
                player1.collectWinnings(pile1);
            }
            
            else if(pile2.peek().getValue() > pile1.peek().getValue())
            {
                pile2.consolidate(pile1);
                pile2.shuffle();
                player2.collectWinnings(pile2);
            }
            
            else while(pile1.peek().getValue() == pile2.peek().getValue())
            {           
                System.out.println("It's a war");
                war++;               
                if(player1.hand.count < 2)
                {
                    pile1.consolidate(pile2);
                    pile1.shuffle();
                    player1.collectWinnings(pile1);
                    System.out.println("Player 1 doesn't have enough cards, Player 2 wins.");
                    System.out.println("There were a total of " +battles+ " battles and " +war+ " wars.");
                    return;
                }
                if(player2.hand.count < 2)
                {
                    pile1.consolidate(pile2);
                    pile1.shuffle();
                    player1.collectWinnings(pile1);
                    System.out.println("Player 2 doesn't have enough cards, Player 1 wins.");
                    System.out.println("There were a total of " +battles+ " battles and " +war+ " wars.");
                    return;
                }
                for(int i = 0; i < 2; i++)
                {
                    pile1.push(player1.playCard());
                    pile2.push(player2.playCard());                    
                }
                System.out.println("Player 1 placed " +pile1.peek());
                System.out.println("Player 2 placed " +pile2.peek());
                if(pile1.peek().getValue() > pile2.peek().getValue())
                {
                    System.out.println("Player 1 has won the war!");
                    player1.collectWinnings(pile1);
                    player1.collectWinnings(pile2);
                    break;
                }
                else if(pile2.peek().getValue() > pile1.peek().getValue())
                {
                    System.out.println("Player 2 has won the war!");                    
                    player2.collectWinnings(pile2);
                    player2.collectWinnings(pile1);
                    break;
                }                            
            } 
            System.out.println("Player 1 has " +player1.getNumberOfCards()+ " cards.");
            System.out.println("Player 2 has " +player2.getNumberOfCards()+ " cards.");  
            battles++;
        }while(player1.hand.count != 0 && player2.hand.count != 0);  
        
        if(player1.hand.count == 0)
        {
            System.out.println("Player 2 has won!");
        }
        else
        {
            System.out.println("Player 1 has won!");
        }
        System.out.println("There were a total of " +battles+ " battles and " +war+ " wars.");   
    }   
}