#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

// Structure to represent an edge
struct Edge {
    int u, v, weight;
};

// Compare edges based on weight
bool compare(Edge a, Edge b) {
    return a.weight < b.weight;
}

// Disjoint Set (Union-Find)
class DisjointSet {
    vector<int> parent, rank;

public:
    DisjointSet(int n) {
        parent.resize(n);
        rank.resize(n);

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    // Find with path compression
    int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    // Union by rank
    void unite(int x, int y) {
        int px = find(x);
        int py = find(y);

        if (px == py) return;

        if (rank[px] < rank[py])
            parent[px] = py;
        else if (rank[px] > rank[py])
            parent[py] = px;
        else {
            parent[py] = px;
            rank[px]++;
        }
    }
};

void kruskal(int V, vector<Edge>& edges) {
    // Step 1: Sort edges by weight
    sort(edges.begin(), edges.end(), compare);

    DisjointSet ds(V);

    cout << "Edges in Minimum Spanning Tree:\n";
    int totalCost = 0;

    // Step 2: Pick smallest edge and check cycle
    for (auto edge : edges) {
        if (ds.find(edge.u) != ds.find(edge.v)) {
            ds.unite(edge.u, edge.v);
            cout << edge.u << " - " << edge.v 
                 << " : " << edge.weight << endl;
            totalCost += edge.weight;
        }
    }

    cout << "Total Cost of MST = " << totalCost << endl;
}

int main() {
    int V = 4; // Number of vertices

    vector<Edge> edges = {
        {0, 1, 10},
        {0, 2, 6},
        {0, 3, 5},
        {1, 3, 15},
        {2, 3, 4}
    };

    kruskal(V, edges);

    return 0;
}