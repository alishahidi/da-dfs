package org.alishahidi;

import org.alishahidi.graph.Node;
import org.alishahidi.graph.matrix.MatrixGraph;
import org.alishahidi.search.DepthFirstSearch;

public class Main {
    public static void main(String[] args) {
        MatrixGraph matrixGraph = new MatrixGraph(5);

        matrixGraph.addNode(new Node('A'));
        matrixGraph.addNode(new Node('B'));
        matrixGraph.addNode(new Node('C'));
        matrixGraph.addNode(new Node('D'));
        matrixGraph.addNode(new Node('E'));

        matrixGraph.addEdge(0, 1);
        matrixGraph.addEdge(1, 2);
        matrixGraph.addEdge(2, 3);
        matrixGraph.addEdge(2, 4);
        matrixGraph.addEdge(4, 0);
        matrixGraph.addEdge(4, 2);

        DepthFirstSearch dfs = new DepthFirstSearch(matrixGraph);
        dfs.search(0);
    }
}