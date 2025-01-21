/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa;

/**
 *
 * @author Naveed Ahmed
 */public class DFS {

    static class Vertex {
        String label;
        boolean isVisited;
        Vertex[] neighbours;

        public Vertex(String label) {
            this.label = label;
            this.isVisited = false;
        }

        public void addNeighbours(Vertex[] vertices) {
            this.neighbours = vertices;
        }
    }

    static class LinkedListStack {
        Node top;

        static class Node {
            Vertex data;
            Node next;

            public Node(Vertex data) {
                this.data = data;
                this.next = null;
            }
        }

        public void push(Vertex vertex) {
            Node newNode = new Node(vertex);
            newNode.next = top;
            top = newNode;
        }

        public Vertex pop() {
            if (isEmpty()) {
                return null;
            }
            Vertex popped = top.data;
            top = top.next;
            return popped;
        }

        public Vertex peek() {
            return isEmpty() ? null : top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }

    static class Graph {
        Vertex[] vertices;

        public Graph(int size) {
            vertices = new Vertex[size];
        }

        public Vertex createVertex(String label) {
            return new Vertex(label);
        }

        public void dfs(Vertex start) {
            LinkedListStack stack = new LinkedListStack();
            stack.push(start);
            start.isVisited = true;

            System.out.println("Depth-First Traversal:");

            while (!stack.isEmpty()) {
                Vertex current = stack.pop();
                System.out.print(current.label + " ");

                if (current.neighbours != null) {
                    for (Vertex neighbour : current.neighbours) {
                        if (!neighbour.isVisited) {
                            stack.push(neighbour);
                            neighbour.isVisited = true;
                        }
                    }
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);

        Vertex a = graph.createVertex("A");
        Vertex b = graph.createVertex("B");
        Vertex c = graph.createVertex("C");
        Vertex d = graph.createVertex("D");
        Vertex e = graph.createVertex("E");

        a.addNeighbours(new Vertex[]{b, d});
        b.addNeighbours(new Vertex[]{a, c});
        c.addNeighbours(new Vertex[]{b});
        d.addNeighbours(new Vertex[]{a, e});
        e.addNeighbours(new Vertex[]{d});

        graph.dfs(a);
    }
}
