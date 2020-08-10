
public class Queue<T> extends List<T> {
    T pop()
    {
        T r = items[0];
        count--;
        for(int i = 0; i < items.length-1; i++)
        {
            items[i] = items[i+1];
        }
        return r;
    }
    
    T peek()
    {
        return items[0];
    }
}