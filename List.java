
public abstract class List<T> {
    T[] items;
    int count;
    List()
    {
        items = (T[])new Object[52];
    }
    
    void push(T value)
    {
        items[count] = value;
        count++;                
    }
    
    abstract T pop();
    abstract T peek();//looks at next thing in stack or queue
    
    void clear()
    {
        count = 0;
    }
}