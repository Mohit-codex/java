#include <iostream>
#include <vector>
using namespace std;

// Function to perform DFS traversal
void dfs(int node, vector<vector<int>> &adj, vector<bool> &visited)
{
    visited[node] = true;           // Mark node as visited
    cout << node << " ";            // Print the node

    // Visit all adjacent nodes
    for (int i = 0; i < adj[node].size(); i++)
    {
        int neighbor = adj[node][i];

        if (!visited[neighbor])
        {
            dfs(neighbor, adj, visited); // Recursive call
        }
    }
}

int main()
{
    int n, edges;
    cout << "Enter number of vertices: ";
    cin >> n;

    vector<vector<int>> adj(n); // Adjacency list

    cout << "Enter number of edges: ";
    cin >> edges;

    cout << "Enter edges (u v):\n";
    for (int i = 0; i < edges; i++)
    {
        int u, v;
        cin >> u >> v;

        adj[u].push_back(v);
        adj[v].push_back(u); // For undirected graph
    }

    vector<bool> visited(n, false);

    int start;
    cout << "Enter starting vertex: ";
    cin >> start;

    cout << "DFS Traversal: ";
    dfs(start, adj, visited);

    return 0;
}