import java.util.*;

public class MatchingEarrings {
    // Rotate polygon 90 degrees clockwise around the origin
    private static List<int[]> rotatePolygon(List<int[]> polygon) {
        List<int[]> rotated = new ArrayList<>();
        for (int[] point : polygon) {
            rotated.add(new int[]{point[1], -point[0]}); // Rotate 90 degrees clockwise
        }
        return rotated;
    }

    // Normalize polygon coordinates to a canonical form
    private static String normalizePolygon(List<int[]> polygon) {
        // Translate the polygon so the smallest x, y point becomes the origin (0, 0)
        int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        for (int[] point : polygon) {
            minX = Math.min(minX, point[0]);
            minY = Math.min(minY, point[1]);
        }

        List<int[]> normalized = new ArrayList<>();
        for (int[] point : polygon) {
            normalized.add(new int[]{point[0] - minX, point[1] - minY});
        }

        // Sort points to ensure a canonical order
        normalized.sort((a, b) -> (a[0] == b[0]) ? a[1] - b[1] : a[0] - b[0]);

        // Return the normalized representation as a string
        return normalized.toString();
    }

    // Check if two polygons are equivalent (rotation allowed)
    private static boolean areEquivalent(List<int[]> poly1, List<int[]> poly2) {
        // Normalize the first polygon
        String normalized1 = normalizePolygon(poly1);

        // Rotate and normalize the second polygon up to 4 times (360 degrees)
        for (int i = 0; i < 4; i++) {
            String normalized2 = normalizePolygon(poly2);
            if (normalized1.equals(normalized2)) {
                return true;
            }
            poly2 = rotatePolygon(poly2); // Rotate 90 degrees
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of earrings
        List<List<int[]>> earrings = new ArrayList<>();

        // Read input
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt(); // Number of vertices for this earring
            List<int[]> polygon = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                polygon.add(new int[]{x, y});
            }
            earrings.add(polygon);
        }

        // Find and print the matching pair of earrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (areEquivalent(earrings.get(i), earrings.get(j))) {
                    System.out.println((i + 1) + " " + (j + 1)); // Print 1-based indices
                    sc.close();
                    return;
                }
            }
        }

        // If no pair is found
        System.out.println("No matching pair found");
        sc.close();
    }
}
