# Depth-First Search (DFS) Algorithm

## Introduction
This project implements the Depth-First Search (DFS) algorithm for traversing a graph. The DFS algorithm is a popular graph traversal algorithm that explores as far as possible along each branch before backtracking.

The project consists of the following components:
- `org.alishahidi.graph.matrix.MatrixGraph`: A matrix-based graph representation.
- `org.alishahidi.search.DepthFirstSearch`: An implementation of the Depth-First Search algorithm.

## Usage
To use the Depth-First Search algorithm on a graph, follow these steps:

1. Create an instance of `org.alishahidi.graph.matrix.MatrixGraph`.
2. Add nodes to the graph using the `addNode` method.
3. Add edges between nodes using the `addEdge` method.
4. Create an instance of `org.alishahidi.search.DepthFirstSearch`, passing the graph as a constructor argument.
5. Perform the DFS search by calling the `search` method on the `DepthFirstSearch` instance and passing the index of the source node.

```java
import org.alishahidi.graph.Node;
import org.alishahidi.graph.matrix.MatrixGraph;
import org.alishahidi.search.DepthFirstSearch;

public class Main {
    public static void main(String[] args) {
        MatrixGraph graph = new MatrixGraph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        DepthFirstSearch dfs = new DepthFirstSearch(graph);
        dfs.search(0);
    }
}
```

## Output
The Depth-First Search algorithm will traverse the graph from the source node and output the visited nodes:

```text
A = visited
B = visited
C = visited
D = visited
E = visited
```

## Dependencies
The project uses the `org.alishahidi.graph.matrix.MatrixGraph` class from the Graph project. Ensure that the Graph project is set up correctly and added as a dependency in your build configuration.

## License
This project is licensed under the [MIT License](LICENSE).
