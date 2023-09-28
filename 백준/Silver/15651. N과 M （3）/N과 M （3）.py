from sys import stdin
input = stdin.readline

def solution(depth: int):
    if depth == M:
        print(*arr)
        return

    for i in range(1, N + 1):
        arr[depth] = i
        solution(depth + 1)

N, M = map(int, input().split())
arr = [0] * M
solution(0)