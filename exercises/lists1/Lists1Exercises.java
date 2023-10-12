public class Lists1Exercises {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
        /*
        * create a new IntList
        * and increment each element by x
        * */

        IntList L1 = new IntList(L.first + x, null);
        for (;  L.rest != null; L = L.rest){
            L1.rest = new IntList(L.rest.first + x ,null);
        }
        System.out.println(L1.first);
        System.out.println(L1);
        return L;        
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        /* Your code here. */
//        for (IntList p = new IntList(L.first, null); p.rest != null; p = p.rest){
//            p.first = p.first + x;
//        }
        for ( ; L.rest != null; L = L.rest){
            L.first = L.first + x;
        }
        return L;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        // System.out.println(L.get(1));
         System.out.println(incrList(L, 3));
//         System.out.println(dincrList(L, 3));
         System.out.println(L.get(0));
    }
}