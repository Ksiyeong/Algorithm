from sys import stdin
input = stdin.readline

def solution(depth: int):
    if depth == M:
        print(' '.join(map(str, arr)))
        return

    for i in range(N):
        if not visit[i]:
            visit[i] = True
            arr[depth] = nums[i]
            solution(depth + 1)
            visit[i] = False

N, M = map(int, input().split())
nums = list(map(int, input().split()))
nums.sort()
visit = [False] * N
arr = [0] * M

solution(0)