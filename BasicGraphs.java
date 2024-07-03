import java.util.*;

public class BasicGraphs {
    static class Edge {
        int src;
        int nbr;
        int wt;
        Edge (int source, int neighbour, int weight){
            src = source;
            nbr = neighbour;
            wt = weight;
        }
    }

    static int minWt = Integer.MAX_VALUE;
    static String minWtPath = "";
    static int maxWt = Integer.MIN_VALUE;
    static String maxWtPath = "";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vtces = Integer.parseInt(sc.nextLine());
        int eNo = Integer.parseInt(sc.nextLine());

        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        // String buffer = sc.nextLine();   // coz int ke baad string input lene me problem aati hai ""
        for (int i = 0; i < eNo; i++) {
            String str = sc.nextLine();

            String[] arr = str.split(" ");

            int u = Integer.parseInt(arr[0]);
            int v = Integer.parseInt(arr[1]);
            int wt = Integer.parseInt(arr[2]);

            graph[u].add(new Edge(u, v, wt));
            graph[v].add(new Edge(v, u, wt));

        }

        boolean[] vis = new boolean[vtces];
        int src = 0;
        int des = 6;
        // allPaths(graph, src, des, vis, src+"");


        // better method exists to print minwt path
        // HashMap<String, Integer> map = new HashMap<>();
        // hm_allPathsWeight(graph, src, des, vis, src+"", 0, map);
        // String spath = "12345678990";
        // int min_wt = Integer.MAX_VALUE;
        // String min_wtPath = "";
        // for (String key : map.keySet()){
        //     if (map.get(key)< min_wt){
        //         min_wt = map.get(key);
        //         min_wtPath = key;
        //     }
        //     spath  = (key.length()<spath.length())? key : spath;
        // }
        // System.out.println(spath + " : " + map.get(spath));
        // System.out.println(min_wt);

        CeilWeightPath(graph, src, des, vis, src+"", 0, 40);        
        System.out.println("Ceil: " + ceilWt + " " + ceilString);
        FloorWeightPath(graph, src, des, vis, src+"", 0, 40);
        System.out.println("Floor: " + floorWt + " " + floorString);

    }


    // gobal variable static hota hai
    static int ceilWt = Integer.MAX_VALUE;
    static String ceilString = "";
    static int floorWt = Integer.MIN_VALUE;
    static String floorString = "";


    static void CeilFloor(ArrayList<Edge>[] graph, int src, int des, boolean[] visited, String psf, int wt, int ref){
        if (src == des) {
            if (wt>ref && wt < ceilWt ){
                    ceilWt = wt;
                    ceilString = psf;
            }
            if (wt<ref && wt > floorWt){
                floorWt = wt;
                floorString = psf;
            }
            return;
        }
        visited[src] = true;
        int n = graph[src].size();
        for (int i = 0; i < n; i++) {
            Edge temp = graph[src].get(i);
            if (!visited[temp.nbr]){
                CeilFloor(graph, temp.nbr, des, visited, psf+temp.nbr, wt+temp.wt, ref);
            }
        }
        visited[src] = false;
        return;
    }


    static boolean hasPath(int src, int des, ArrayList<Edge>[] graph, boolean[] visited){
        if (src == des) {
            return true;
        }

        // preorder me true mark karna hai
        visited[src] = true;
        int n = graph[src].size();
        for (int i = 0; i < n; i++) {
            Edge temp = graph[src].get(i);

            if (!visited[temp.nbr]){
                boolean flag = hasPath(temp.nbr, des, graph, visited);
                if (flag) return true;
            }
        }
        return false;
    }

    static void allPaths(ArrayList<Edge>[] graph, int src, int des, boolean[] visited, String psf){
        if (src == des) {
            System.out.println(psf);
            return;
        }

        visited[src] = true;
        int n = graph[src].size();
        for (int i = 0; i < n; i++) {
            Edge temp = graph[src].get(i);

            if (!visited[temp.nbr]){
                allPaths(graph, temp.nbr, des, visited, psf+temp.nbr);
            }
        }
        // post order me false mark karna hai firse
        visited[src] = false;
        return;
    }

    static void allPathsWeight(ArrayList<Edge>[] graph, int src, int des, boolean[] visited, String psf, int wt){
        if (src == des) {
            System.out.println(psf + " : " + wt);
            return;
        }

        visited[src] = true;
        int n = graph[src].size();
        for (int i = 0; i < n; i++) {
            Edge temp = graph[src].get(i);

            if (!visited[temp.nbr]){
                allPathsWeight(graph, temp.nbr, des, visited, psf+temp.nbr, wt+temp.wt);
            }
        }
        // post order me false mark karna hai firse
        visited[src] = false;
        return;
    }

    static String WeightPath(ArrayList<Edge>[] graph, int src, int des, boolean[] visited, String psf, int wt){
        if (src == des) {
            minWtPath = (wt<minWt)? psf : minWtPath;
            maxWtPath = (wt>maxWt)? psf : maxWtPath;
            return minWtPath;
        }

        visited[src] = true;
        int n = graph[src].size();
        for (int i = 0; i < n; i++) {
            Edge temp = graph[src].get(i);

            if (!visited[temp.nbr]){
                WeightPath(graph, temp.nbr, des, visited, psf+temp.nbr, wt+temp.wt);
            }
        }
        // post order me false mark karna hai firse
        visited[src] = false;
        return null;
    }

    static void hm_allPathsWeight(ArrayList<Edge>[] graph, int src, int des, boolean[] visited, String psf, int wt, HashMap<String, Integer> map){
        if (src == des) {
            map.put(psf, wt);
            //System.out.println(psf + " : " + wt);
            return;
        }

        visited[src] = true;
        int n = graph[src].size();
        for (int i = 0; i < n; i++) {
            Edge temp = graph[src].get(i);

            if (!visited[temp.nbr]){
                hm_allPathsWeight(graph, temp.nbr, des, visited, psf+temp.nbr, wt+temp.wt, map);
            }
        }
        // post order me false mark karna hai firse
        visited[src] = false;
        return;
    }
    
}

// 7
// 8
// 0 1 10
// 1 2 10
// 2 3 10
// 0 3 20
// 3 4 5 
// 4 5 3
// 5 6 3 
// 4 6 8

/*
 *
 * GRAPHS       USE CASE
 * vertices     cities
 * edges        routes
 * weigths      distance/cost/etc
 * 
 * bidirectional (by default) but can be unidirectional as well
 * (undirected)                          (uni-directed)
 * 
 * 
 * questons:
 * has path
 * no of paths
 * min cost
 * 
 * input: no of vertices, no of edges,[from to weight] <-- no of triplets = no of edges
 * eg       7               8            0   1   10   
 * 
 * 
 * implementation: 1. adjacency matrix  2. adjacency list
 * 
 * 
 * 
 * allPath---------
 *      mark kar (visited == true)
 *      next steps
 *      post order me remove mark 
 * 
 * 
 */