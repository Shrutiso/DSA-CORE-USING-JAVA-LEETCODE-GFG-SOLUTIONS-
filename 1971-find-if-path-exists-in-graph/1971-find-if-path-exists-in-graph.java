class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
          ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

       
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();

        
        visited[source] = true;
        queue.add(source);

        
        while (!queue.isEmpty()) {
            int node = queue.poll();

            
            if (node == destination) {
                return true;
            }

            
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

       
       
        return false;
    }
}