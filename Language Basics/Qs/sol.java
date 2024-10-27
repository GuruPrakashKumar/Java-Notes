package Qs;
import java.util.*;

class sol {
    public static void main(String[] args) throws Exception {
        // Reading input from STDIN
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // Get the number of unique combinations
        int count = countUniqueCombinations(A, K);
        
        // Print the result
        System.out.println(count);
    }

    private static int countUniqueCombinations(int[] A, int K) {
        Arrays.sort(A); // Sort to help with combination generation
        Set<List<Integer>> uniqueCombinations = new HashSet<>();
        findCombinations(A, K, 0, new ArrayList<>(), uniqueCombinations);
        return uniqueCombinations.size();
    }

    private static void findCombinations(int[] A, int K, int start, List<Integer> current, Set<List<Integer>> uniqueCombinations) {
        if (K == 0) {
            uniqueCombinations.add(new ArrayList<>(current));
            return;
        }
        
        for (int i = start; i < A.length; i++) {
            if (i > start && A[i] == A[i - 1]) continue; // Skip duplicates
            
            if (A[i] > K) break; // No need to continue if the number is greater than K
            
            current.add(A[i]);
            findCombinations(A, K - A[i], i + 1, current, uniqueCombinations);
            current.remove(current.size() - 1);
        }
    }
}