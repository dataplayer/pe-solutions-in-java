package datastructures;

import java.util.*;

/**
 * Created by nicflores on 9/14/14.
 */
public class GraphLib {

    public class Node<T> {
        private T data;

        private int deg;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public int getDeg() {
            return deg;
        }

        public void setDeg(int deg) {
            this.deg = deg;
        }

        public String toString() {
            return data.toString();
        }
    }

    public class Edge {

        private Node source;
        private Node destination;

        public Edge(Node source, Node destination) {
            this.setSource(source);
            this.setDestination(destination);
        }

        public String toString() {
            return source + " => " + destination;
        }

        public Node getSource() {
            return source;
        }

        public void setSource(Node source) {
            this.source = source;
        }

        public Node getDestination() {
            return destination;
        }

        public void setDestination(Node destination) {

            this.destination = destination;
        }

    }

    public class AdjacencyList {
        Map<Node,List<Node>> adj;

        public AdjacencyList() {

            adj = new HashMap<Node, List<Node>>();
        }

        public String toString() {
            return adj.toString();
        }

        // O(1)
        public void addEdge(Edge e) {
            Node sourceNode = e.getSource();
            Node destinationNode = e.getDestination();
            if (adj.containsKey(sourceNode)) {
                if(adj.get(sourceNode) == null) {
                    adj.put(sourceNode,new LinkedList<Node>());
                    adj.get(sourceNode).add(destinationNode);
                } else {
                    adj.get(sourceNode).add(destinationNode);
                }
            } else {
                adj.put(sourceNode,new LinkedList<Node>());
                adj.get(sourceNode).add(destinationNode);
            }
        }

        // O(deg(source node of x))
        public void removeEdge(Edge e) {
            Node sourceNode = e.getSource();
            Node destinationNode = e.getDestination();

            if(adj.containsKey(sourceNode)) {
              adj.get(sourceNode).remove(destinationNode);
            }
        }

        // O(deg(source node of x))
        public boolean hasEdge(Edge e) {
            Node sourceNode = e.getSource();
            Node destinationNode = e.getDestination();
            if(adj.containsKey(sourceNode)) {
                return adj.get(sourceNode).contains(destinationNode);
            }
            return false;
        }

        // O(1)
        public List<Edge> outEdges(Node n) {
            List<Edge> result = new LinkedList<Edge>();
            if(adj.containsKey(n)) {
                for (Node target : adj.get(n)) {
                    result.add(new Edge(n,target));
                }
                return result;
            }
            return result;

        }

        // O(V + E)
        public List<Edge> inEdges(Node n) {
            List<Edge> result = new LinkedList<Edge>();
            for (Map.Entry<Node,List<Node>> entry : adj.entrySet()) {
                for (Node node : entry.getValue()) {
                    if (node.equals(n)) {
                        result.add(new Edge(entry.getKey(),node));
                    }
                }
            }
            return result;
        }

    }

    public static void main(String[] args) {
        GraphLib al = new GraphLib();

        GraphLib.Node<Integer> node2 = al.new Node<Integer>(2);
        GraphLib.Node<Integer> node3 = al.new Node<Integer>(3);
        GraphLib.Node<Integer> node4 = al.new Node<Integer>(4);
        GraphLib.Node<Integer> node5 = al.new Node<Integer>(5);
        GraphLib.Node<Integer> node6 = al.new Node<Integer>(6);



        GraphLib.Edge edge1 = al.new Edge(node2,node4);
        GraphLib.Edge edge2 = al.new Edge(node3,node4);
        GraphLib.Edge edge3 = al.new Edge(node3,node6);
        GraphLib.Edge edge4 = al.new Edge(node5,node6);

        //System.out.println("Node a: " + nodeA.toString());
        //System.out.println("Node b: " + nodeB.toString());
        //System.out.println("Edge: " + anedge.toString());

        GraphLib.AdjacencyList adjlist = al.new AdjacencyList();
        adjlist.addEdge(edge1);
        adjlist.addEdge(edge2);
        adjlist.addEdge(edge3);
        adjlist.addEdge(edge4);

        // Print the adj list
        System.out.println(adjlist.toString());

        // Remove and edge and print adj list
        //adjlist.removeEdge(edge4);
        //System.out.println(adjlist.toString());

        // Print out deges of node 3 and node 5
        //System.out.println(adjlist.outEdges(node3).toString());
        //System.out.println(adjlist.outEdges(node5).toString());

        // Print in edges of node 4.
        //System.out.println(adjlist.inEdges(node4).toString());

        // find nodes with no incoming edges

























    }
}
