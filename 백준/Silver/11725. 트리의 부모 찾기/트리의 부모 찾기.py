from sys import stdin
input = stdin.readline

N = int(input())
tree = [[] for _ in range(N+1)]
for _ in range(N-1):
    a, b = map(int, input().split())
    tree[a].append(b)
    tree[b].append(a)

parents = [0] * (N+1)
parents[1] = 1

q = [1]
while q:
    node = q.pop()
    for next in tree[node]:
        if not parents[next]:
            parents[next] = node
            q.append(next)

print(*parents[2:], sep='\n')