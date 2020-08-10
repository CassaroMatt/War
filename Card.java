
public class Card {
    private int value;
    private String suit;
    Card(String suit, int value)
    {
        this.suit = suit;
        this.value = value;
    }
    
    public String toString()
    {
        if(value == 1)
        {
            return "the ace of " +suit;
        }
        else if(value == 11)
        {
            return "the jack of " +suit; 
        }
        else if(value == 12)
        {
            return "the queen of " +suit;
        }
        else if(value == 13)
        {
            return "the king of "  +suit;
        }
        else
        {
        return "the " +value+ " of " +suit;
        }
    }
    
    int getValue()
    {
        return value;
    }
    
    String getSuit()
    {
        return suit;
    }       
}