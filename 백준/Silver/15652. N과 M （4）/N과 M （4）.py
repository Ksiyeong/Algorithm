from sys import stdin
input = stdin.readline

def solution(start: int, depth: int):
    if depth == M:
        print(' '.join(map(str, arr)))
        return

    for i in range(start, N + 1):
        arr[depth] = i
        solution(i, depth + 1)

N, M = map(int, input().split())
arr = [0] * M
solution(1, 0)