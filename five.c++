#include <iostream>
#include <vector>
#include <queue>
using namespace std;

// Function to perform BFS traversal
void bfs(int start, vector<vector<int>> &adj, int n)
{
    vector<bool> visited(n, false);  // To keep track of visited nodes
    queue<int> q;                   // Queue for BFS

    visited[start] = true;          // Mark starting node as visited
    q.push(start);                  // Push starting node into queue

    cout << "BFS Traversal: ";

    while (!q.empty())
    {
        int node = q.front();       // Get front node
        q.pop();                    // Remove it from queue

        cout << node << " ";        // Print the node

        // Traverse all adjacent nodes
        for (int i = 0; i < adj[node].size(); i++)
        {
            int neighbor = adj[node][i];

            if (!visited[neighbor]) // If not visited
            {
                visited[neighbor] = true;
                q.push(neighbor);   // Add to queue
            }
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

    int start;
    cout << "Enter starting vertex: ";
    cin >> start;

    bfs(start, adj, n);

    return 0;
}