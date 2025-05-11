def DFS(graph, node, visited):
    visited[node] = True
    print(node)  # Process the node
    for neighbor in graph[node]:
        if not visited[neighbor]:
            DFS(graph, neighbor, visited)

# Example Usage
graph = {
    0: [1, 2],
    1: [0, 3, 4],
    2: [0, 5],
    3: [1],
    4: [1],
    5: [2]
}
visited = [False] * len(graph)
DFS(graph, 0, visited)









