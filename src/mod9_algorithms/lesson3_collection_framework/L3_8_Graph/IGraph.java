package mod9_algorithms.lesson3_collection_framework.L3_8_Graph;

import java.util.List;
import java.util.Map;

public interface IGraph<V> {
    void addVertex(V vertex);
    void addEdge(V source, V destination, int weight);
    List<V> getVertices();
    List<V> getNeighbors(V vertex);
    int getEdgeWeight(V source, V destination);
    Map<V, Integer> dijkstra(V a);
}
