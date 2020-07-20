class IntList{

    public int value;
    public IntList rest;

    public IntList(int x,IntList L){
        value = x;
        rest = L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(20,null);           // at the end point 
        L = new IntList(30, L);
        L = new IntList(40, L);
        L = new IntList(60, L);
        
        System.out.println(L.size());
        System.out.println(L.get(2));
        
        IntList newlist = IntList.dincrList(L, 5);
        while(newlist != null){
            System.out.println(newlist.value);
            newlist = newlist.rest;
        }
    }
    
    /**
     * return the value of ith element in linear time complexity
     * @param i
     * @return
     */
    public int get(int i) {
        IntList l = this;
        while (i > 0) {
            l = l.rest;
            i -= 1;
        }
        return l.value;
    }

    /**
     * return the linked list length 
     * @return
     */
    public int size() {
       IntList p = this;
       int totalSize = 0;
       while(p != null){
           totalSize += 1;
           p = p.rest;
       }
       return totalSize;
    }

    /**
     * with all elements incresed by value x
     * @param L
     * @param x
     * @return a new Intlist 
     */
    // public static IntList incrList(IntList L, int x){
    //     IntList newList;
    //     while(L != null){
    //         newList = new IntList(L.value + x, null);
            
    //         L = L.rest;
    //     }
    //     return newList;
    // }

    /**
     * with all elements incresed by value x 
     * @param L
     * @param x
     * @return the old intlist 
     */
    public static IntList dincrList(IntList L, int x){
        IntList index = L;
        while(index != null){
            index.value += x; 
            index = index.rest;
        }
        return L; 
    }
}