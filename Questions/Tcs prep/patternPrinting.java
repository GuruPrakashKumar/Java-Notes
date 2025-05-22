class patternPrinting {
    public static void star1(int n) {
        /*
         * 
         * *
         * * *
         * * * *
         * * * * *
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void star2(int n) {
        /*
         * * * * *
         * * * *
         * * *
         * *
         */
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void star3(int n) {
    /*
         * 
       * *
     * * *
   * * * *
 * * * * *
            */
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }
            // stars
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void star4(int n) {
        /*
         * * * * *
         * * * *
         * * *
         * *
         */
        for (int i = n; i > 0; i--) {
            // spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printTriagle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) { //Loop for blank space
                System.out.print(" "); //Print Space
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* "); //Print Star
            }
            System.out.println(); //Newline
        }
    }
    public static void diamond(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n-i; j > 0; j--){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i > 0; i--) {
            for(int j = n-i; j > 0; j--){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printChar(){
        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.print(ch+" ");
        }
    }
    public static void butterfly(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for (int j = 1; j <= (n-i)*2; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for (int j = 1; j <= (n-i)*2; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        // star1(5);
        // star2(4);
        // star3(5);
        // star4(5);
        // printTriagle(5);
        // printChar();
        // diamond(4);
        butterfly(4);
    }
}