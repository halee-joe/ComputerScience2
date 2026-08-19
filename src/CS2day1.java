public class CS2day1 {
    public static void main(String[] args) {
        /// Problem 1 
        int total = 0;
        for (int i = 1; i <= 5; i++){
            total += i;
        }
        System.out.println(total/2);
        // Problem 2 
        //int[] a = {3,7,2,9};
        //for (int i = 0; i <= a.length; i++) {
          //  System.out.println(a[i]);
        //}

        // Problem 3 
       // System.out.println("Problem 3");
        //String s1 = "cs2050";
        //String s2 = new String("cs2050");
        //System.out.println(s1 == s2);
        //System.out.println(s1.equals(s2));

     // Problem 4 
        int x = 5;
        bump(x);
        System.out.println(x);
        //Problem5 

        int[] y = {5};
        bump(y);
        System.out.println(y[0]);

        //Problem 6
        //String[] names = new String[3];
        //System.out.println(names[0].length());

        //Problem 7
        ///Counter c = new Counter();
        //c.setCount(10);
        //System.out.println(c.getCount());

        //Problem 8
        //int[] scores = {88, 92, 79};
        //for (int i = 0; i < scores.length; i++){
            //int doubled = scores[i] * 2;
        //}
        //System.out.println(doubled);

    }

    // Problem 7
    public class Counter {
        private int count = 0;

        public void setCount(int count){
            count = count;
        }
        public int getCount(){
            return count;
        }
    }

    // Problem 4
    public static void bump(int n){
        n = n + 1; 
    }
    // Priblem 5
    public static void bump(int[] arr){
        arr[0] = arr[0] + 1;
    }

}
