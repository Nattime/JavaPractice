package javapractice;

import java.util.ArrayList;

public class PriorityQueue<T>{
    private int mySize;
    private ArrayList<T> myList;

    public PriorityQueue(){
        myList = new ArrayList<T>(32);
        myList.add(null);
        mySize = 0;
    }

    public boolean add(T val){
        myList.add(val);
        mySize++;
        return true;
    }

    public void clear(){
    }

    boolean offer(T val){
        return false;
    }

    T peek(){
        return null;
    }

    T poll(){
        return null;
    }

    public int size(){
        return mySize;
    }
}
