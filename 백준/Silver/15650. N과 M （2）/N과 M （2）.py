from sys import stdin
input = stdin.readline

def solution(start: int, depth: int):
    if depth == M:
        print(*arr)
        return

    for i in range(start, N):
        if not visit[i]:
            visit[i] = True
            arr[depth] = i + 1
            solution(i + 1, depth + 1)
            visit[i] = False

N, M = map(int, input().split())
arr = [0] * M
visit = [False] * N
solution(0, 0)