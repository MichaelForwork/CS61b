/**
 * 
 * generics for this class
 */
public class Intlist<>{
        /* inner class */
        private class Node{
            
        }
 
 
    public int first;
    public Intlist rest;

    public Intlist(int f, Intlist r){
        first = f;
        rest = r;
    }

    // return the number of link list elements using recursion !
    public int size(){
        if(rest == null){
            return 1;
        }
        return rest.size();
    }
    
    // return a new intlist with all elements are incresed by bias
    // using recursion !
    public static Intlist incrList(Intlist l, int bias){
        Intlist newlist; 
        if(l != null){

        }
    }

    public static void main(String[] args) {
        
    }


   
}