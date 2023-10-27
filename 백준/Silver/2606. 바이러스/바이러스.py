from sys import stdin
input = stdin.readline

def solution(idx:int):
    if not virus[idx]:
        global answer
        virus[idx] = True
        answer += 1
        for i in network[idx]:
            solution(i)

n = int(input())
m = int(input())
network = [[] for _ in range(n+1)]
for _ in range(m):
    a, b = map(int, input().split())
    network[a].append(b)
    network[b].append(a)

virus = [False] * (n+1)
answer = -1

solution(1)
print(answer)