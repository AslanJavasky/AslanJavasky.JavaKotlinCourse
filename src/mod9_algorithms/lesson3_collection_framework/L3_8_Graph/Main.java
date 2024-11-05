package mod9_algorithms.lesson3_collection_framework.L3_8_Graph;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        IGraph<String> graph = new Graph<>();

        graph.addEdge("A", "B", 1);
        graph.addEdge("A", "C", 4);
        graph.addEdge("B", "C", 2);
        graph.addEdge("B", "D", 5);
        graph.addEdge("C", "D", 1);

        Map<String, Integer> distances = graph.dijkstra("A");
        for (String vertex : graph.getVertices()) {
            System.out.println("Distance from A to " + vertex + " : " + distances.get(vertex));
        }

    }
}
