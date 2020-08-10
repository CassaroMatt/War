
public class Stack<T> extends List<T> {
    T pop()
    {
        count--; 
        T old = items[count];
        return old;
    }
    
    T peek()
    {
        return items[count-1];
    }
}