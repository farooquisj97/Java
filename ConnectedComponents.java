import java.util.*;

public class ConnectedComponents {
  
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

    static class Pair {
        int src;
        String psf;
        Pair (int src, String psf){
            this.src = src;
            this.psf = psf;
        }
    }

    static class SrcTime {
        int src;
        int t;
        SrcTime (int src, int t){
            this.src =  src;
            this.t = t;
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

        // spread of infection (src infected at t=1)
        // int src = sc.nextInt();
        // int ref = sc.nextInt();
        // Queue<SrcTime> q = new ArrayDeque<>();
        // q.add(new SrcTime(src, 1));
        // ArrayList<Integer> list = new ArrayList<>();
        // while (q.size()>0){
        //     // r
        //     SrcTime temp = q.remove();
        //     // m*
        //     if (vis[temp.src]) {
        //         continue;
        //     }
        //     vis[temp.src] = true;
        //     // w
        //     if (temp.t <= ref){
        //         list.add(temp.src);
        //     }
        //     else{
        //         break;
        //     }
        //     // a*
        //     for (Edge ed: graph[temp.src]){
        //         if(!vis[ed.nbr]) q.add(new SrcTime(ed.nbr, temp.t+1));
        //     }
        // }
        // System.out.println(list);

        // is graph cyclic
        // boolean flag = false;
        // for (int i = 0; i < vtces; i++) {
        //     if (vis[i] == false){
        //         flag = bsf(graph, i, vis);
        //         if (flag){
        //             break;
        //         }
        //     }
        // }
        // System.out.println(flag);

        // level order for graphs
        // System.out.print("input for bsf: ");
        // int src = sc.nextInt();
        // Queue<Pair> que = new ArrayDeque<>();
        // que.add(new Pair(src, src+""));
        // ArrayList<Integer> al = new ArrayList<>();
        // while (que.size() > 0){
        //     // r, m*, w, a*
        //     // r
        //     Pair p = que.remove();
        //     // m*
        //     if (vis[p.src]) continue;
        //     vis[p.src] = true;
        //     // w
        //     al.add(p.src);
        //     // a*
        //     for (Edge t : graph[p.src]){
        //         if (!vis[t.nbr])
        //         que.add(new Pair(t.nbr, p.psf+t.nbr));
        //     }
        // }
        // System.out.println(al);

        // get connected components
        // ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        // for (int i = 0; i < vtces; i++) {
        //     if (vis[i] == false) {
        //         ArrayList<Integer> curr = new ArrayList<>();
        //         dfs(graph, i, vis, curr);
        //         ans.add(curr);
        //     }
        // }
        // System.out.println(ans);

    }



    // breadth first search
    static boolean bsf(ArrayList<Edge>[] graph, int src, boolean[] vis){
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(src, src+""));
        while(q.size()>0){
            // r
            Pair rem = q.remove();
            // m*
            if (vis[rem.src]) {
                return true;
            }
            vis[rem.src] = true;
            // w
            // a
            for (Edge e : graph[rem.src]){
                if (!vis[e.nbr]){
                    q.add(new Pair(e.nbr, rem.psf+e.nbr));
                }
            }
        }
        return false;
    }

    // depth first search
    static void dfs(ArrayList<Edge>[] graph, int src, boolean[] vis, ArrayList<Integer> curr){
        vis[src] = true;
        curr.add(src);
        for (Edge e : graph[src]){
            if (vis[e.nbr] == false){
                dfs(graph, e.nbr, vis, curr);
            }
        }
        return;
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
