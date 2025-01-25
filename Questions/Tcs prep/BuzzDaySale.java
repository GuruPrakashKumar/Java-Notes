import java.util.*;

public class BuzzDaySale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] ids = new int[n];
        int[] costs = new int[n];
        
        // Input ids
        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }
        
        // Input costs
        for (int i = 0; i < n; i++) {
            costs[i] = sc.nextInt();
        }
        
        // Input budget
        int budget = sc.nextInt();
        
        int mfi = 0, mfw = 0;
        
        for (int i = 0; i < n; i++) {
            int buyCost = costs[i];
            int maxQty = budget / buyCost;
            
            if (maxQty > 0) {
                int cfi = 0;
                int cfw = 0;
                
                for (int j = 0; j < n; j++) {
                    if (i != j && ids[i] % ids[j] == 0) {
                        cfi += maxQty;
                        cfw += costs[j] * maxQty;
                    }
                }
                
                if (cfi > mfi || (cfi == mfi && cfw > mfw)) {
                    mfi = cfi;
                    mfw = cfw;
                }
            }
        }
        
        System.out.println(mfi + " " + mfw);
    }
}
