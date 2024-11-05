package mod9_algorithms.lesson3_collection_framework.L3_8_Graph;

import kotlin.HashCodeKt;

import java.util.*;

public class Graph<V> implements IGraph<V> {

    Map<V, List<Edge<V>>> adjacencyList = new HashMap<>();

    private static class Edge<V> {
        V destination;
        int weight;

        public Edge(V destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    @Override
    //O(1)
    public void addVertex(V vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    @Override
    public void addEdge(V source, V destination, int weight) {
        //O(1)..O(n)
        addVertex(source);
        addVertex(destination);
        adjacencyList.get(source).add(new Edge<>(destination, weight));
    }

    @Override
    //O(n)
    public List<V> getVertices() {
        return new ArrayList<>(adjacencyList.keySet());
    }

    @Override
    public List<V> getNeighbors(V vertex) {
        //O(n), где n- степень вершины (кол-во ребер, исходящих из вершины)
        List<V> neighbors = new ArrayList<>();
        List<Edge<V>> edges = getEdgesByVertex(vertex);
        if (edges != null) {
            for (Edge<V> edge : edges) {
                neighbors.add(edge.destination);
            }
        }
        return neighbors;
    }

    @Override
    public int getEdgeWeight(V source, V destination) {
        //O(n), где n- степень вершины (кол-во ребер, исходящих из вершины)
        List<Edge<V>> edges = getEdgesByVertex(source);
        if (edges != null) {
            for (Edge<V> edge : edges) {
                if (edge.destination.equals(destination)) {
                    return edge.weight;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public Map<V, Integer> dijkstra(V start) {
//        O((n + m) log n), где n-кол-во вершин, m- кол-во ребер
        Map<V, Integer> distances = new HashMap<>();
        PriorityQueue<Edge<V>> priorityQueue = new PriorityQueue<>(
                Comparator.comparingInt(edge -> edge.weight));
        //O(n) - инициализация расстояний
        for (V vertex : getVertices()) {
            distances.put(vertex, Integer.MAX_VALUE);
        }

        distances.put(start, 0);
        priorityQueue.add(new Edge<>(start, 0));

        while (!priorityQueue.isEmpty()) {
            Edge<V> currentEdge = priorityQueue.poll();
            V currentVertex = currentEdge.destination;
            int currentDistance = currentEdge.weight;

            if (currentDistance > distances.get(currentVertex)) continue;

            for (Edge<V> neighbor: adjacencyList.get(currentVertex)){
                //O(log n)..O(m), где n- кол-во вершин, m- кол-во ребер
                int newDistance=currentDistance+ neighbor.weight;
                if (newDistance < distances.get(neighbor.destination)){
                    distances.put(neighbor.destination,newDistance);
                    priorityQueue.add(new Edge<>(neighbor.destination, newDistance));
                }
            }
        }

        return distances;
    }

    //O(1)
    private List<Edge<V>> getEdgesByVertex(V vertex) {
        return adjacencyList.get(vertex);
    }


}
