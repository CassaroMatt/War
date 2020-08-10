
public class Player {
    Queue<Card> hand;    
    Player()
    {
        hand = new Queue<Card>();
    }
    
    void acuireCard(Card card)//get card
    {
        hand.push(card);
    }
   
    Card playCard()//play card
    {
        return hand.pop();
    }
    
    int getNumberOfCards()//get number of cards
    {
        return hand.count;
    }

    void takeHalf(Deck d)//recieve half the deck
    {
        for(int i = 0; i < 26; i++)
        {
            hand.push(d.draw());
        }
    }    
    
    void collectWinnings(Pile p)//collect winnings
    {
        for(int i = p.count; i > 0; i--)
        {
            hand.push(p.pop());
        }
    }
}