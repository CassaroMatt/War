

import java.util.Random;


public class Pile extends Stack<Card> {
    void consolidate(Pile other)
    {
        //add all the piles cards into my own
        while(other.count > 0)
        {
            push(other.pop());
        }
    }
    
    void shuffle()
    {
        //mix up the cards like we did 
        Random r = new Random();
        Object[] items2 = items;
        for(int i = 0; i < count; i++)
        {
            Card c1 = (Card)items2[i];
            int ri = r.nextInt(count);
            Card c2 = (Card)items2[ri];
            items2[i] = c2;
            items2[ri] = c1;
        }
    }
}