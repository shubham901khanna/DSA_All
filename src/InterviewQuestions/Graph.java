package InterviewQuestions;


import java.util.ArrayList;

class Graph {

    public static  int v;
    public ArrayList<Integer>[] adList;

    private Graph(int vertices) {
        this.v = vertices;
    }

    public void addEdge(int u, int v) {
        adList[u].add(v);
    }

    public static void printAllPaths(int source, int dest) {
        boolean[] isVisited = new boolean[v];
        ArrayList<Integer> pathlist = new ArrayList<>();
        pathlist.add(source);
        printAllPathUtils(source,dest,isVisited,pathlist);
    }

    public static void printAllPathUtils(int s,int v, boolean[] isVisited, ArrayList<Integer> pathList) {


    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(2, 0);
        graph.addEdge(2, 1);
        graph.addEdge(1, 3);
        int s = 2;
        int d = 3;
      //  System.out.println(printAllPaths(2, 3));
    }
}