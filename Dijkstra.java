import java.util.*;

public class Dijkstra {
    
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

    static class Triplet implements Comparable<Triplet> { 
        int src;
        String psf;
        int wsf;
        Triplet (int src, String psf, int wsf){
            this.src = src;
            this.psf = psf;
            this.wsf = wsf;
        }
        public int compareTo(Triplet obj){
            return this.wsf - obj.wsf;
        }
    }
    

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

        int src = sc.nextInt();
        int des = sc.nextInt();

        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(src, src+"", 0));

        while (pq.size()>0){
            // remove
            Triplet temp = pq.remove();
            // mark*
            if (vis[temp.src]) continue;
            vis[temp.src] = true;
            // work
            if (temp.src==des){
                System.out.println(temp.wsf + " via " + temp.psf);
                break;
            }
            // add children*
            for (Edge e : graph[temp.src]) {
                if (!vis[temp.src]) pq.add(new Triplet(e.nbr, temp.psf+e.nbr, temp.wsf+e.wt));
            }
        }

    }
}

// 7
// 8
// 0 1 10
// 1 2 10
// 2 3 10
// 0 3 40
// 3 4 5
// 4 5 3
// 5 6 6
// 4 6 8


/*
 * 
 * understanding priority queue of object
 * static class Pair implements Comparable<Pair> {
        int i;
        int j;
        Pair (int i, int j){
            this.i = j;
            this.i = j;
        }
        // compare two objects
        public int compareTo(Pair o){
            // compare on basis of i
            return this.i - o.i;
            // reverse order
            // return o.i - this.i;
        }
    }
 */


 /*
  * 
  */