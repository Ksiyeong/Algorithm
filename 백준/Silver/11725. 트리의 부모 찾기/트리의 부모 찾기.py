import sys

sys.setrecursionlimit(10**6)
input = sys.stdin.readline

def solution(node:int):
    for next_node in tree[node]:
        if parents[next_node] == -1:
            parents[next_node] = node
            solution(next_node)

N = int(input())
tree = [[] for _ in range(N+1)]
for _ in range(N-1):
    a, b = map(int, input().split())
    tree[a].append(b)
    tree[b].append(a)

parents = [-1 for _ in range(N+1)]
parents[1] = 0

solution(1)
for i in range(2, N+1):
    print(parents[i])