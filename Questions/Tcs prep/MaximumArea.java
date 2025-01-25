import java.util.*;

public class MaximumArea {

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }

    static int polygonArea(List<Point> vertices) {
        int area = 0;
        int n = vertices.size();

        for (int i = 0; i < n; i++) {
            Point p1 = vertices.get(i);
            Point p2 = vertices.get((i + 1) % n);
            area += (p1.x * p2.y) - (p2.x * p1.y);
        }

        return Math.abs(area / 2);
    }

    static int findMaximumArea(int n, int[][] segments) {
        Map<Point, List<Point>> graph = new HashMap<>();

        // Build graph from line segments
        for (int[] segment : segments) {
            Point p1 = new Point(segment[0], segment[1]);
            Point p2 = new Point(segment[2], segment[3]);

            graph.computeIfAbsent(p1, k -> new ArrayList<>()).add(p2);
            graph.computeIfAbsent(p2, k -> new ArrayList<>()).add(p1);
        }

        // Debug: Print the graph
        System.out.println("Graph:");
        for (Map.Entry<Point, List<Point>> entry : graph.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        Set<String> visitedEdges = new HashSet<>();
        int maxArea = 0;

        // Traverse each edge
        for (Point start : graph.keySet()) {
            for (Point next : graph.get(start)) {
                String edge = start.x + "," + start.y + "-" + next.x + "," + next.y;

                if (!visitedEdges.contains(edge)) {
                    List<Point> polygon = new ArrayList<>();
                    visitedEdges.add(edge);
                    dfs(graph, visitedEdges, next, start, polygon, start);

                    // Validate and calculate area of closed polygon
                    // if (polygon.get(0).equals(polygon.get(polygon.size() - 1))) {
                        // polygon.remove(polygon.size() - 1);
                        int area = polygonArea(polygon);
                        maxArea = Math.max(maxArea, area);

                        // Debug: Print detected polygon and area
                        System.out.println("Polygon: " + polygon + ", Area: " + area);
                    
                }
            }
        }

        return maxArea;
    }

    static void dfs(Map<Point, List<Point>> graph, Set<String> visitedEdges, Point current, Point start, List<Point> polygon, Point origin) {
        polygon.add(current);

        for (Point neighbor : graph.get(current)) {
            String edge = current.x + "," + current.y + "-" + neighbor.x + "," + neighbor.y;
            String reverseEdge = neighbor.x + "," + neighbor.y + "-" + current.x + "," + current.y;

            if (!visitedEdges.contains(edge)) {
                visitedEdges.add(edge);

                if (neighbor.equals(origin)) {
                    polygon.add(neighbor);
                    return;
                } else {
                    dfs(graph, visitedEdges, neighbor, start, polygon, origin);
                    if (polygon.get(polygon.size() - 1).equals(origin)) {
                        return;
                    }
                }
            }
        }
    }
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] segments = new int[n][4];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                segments[i][j] = sc.nextInt();
            }
        }

        System.out.println(findMaximumArea(n, segments));
    }
}
