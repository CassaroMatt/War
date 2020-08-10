
import java.util.Random;


public class Deck {
    private Card[] cards;
    private int drawn;
    Deck()
    {
    cards = new Card[52];
        for(int i = 0; i < 13; i++)// this will happen 13 times
        {
            cards[i] = new Card("Spades",i+1); //but change it for each i
        }
        for(int i = 13; i < 26; i++)
        {
            cards[i] = new Card("Hearts",i-12);
        }
        for(int i = 26; i < 39; i++)
        {
            cards[i] = new Card("Diamonds",i-25);
        }
        for(int i = 39; i < 52; i++)
        {
            cards[i] = new Card("Clubs",i-38);
        }
    }
    
    Card draw()
    {
       Card draw = cards[drawn];
       drawn++;       
       return draw;
    }
    
    int remaining()
    {
        return 52 - drawn;
    }
    
    void shuffle()
    {
        Random r = new Random();
        for(int i = 0; i < 52; i++)
        {
            int index = r.nextInt(52);
            Card a = cards[i];
            Card b = cards[index];
            cards[i] = b;
            cards[index] = a;
        }
    }
}