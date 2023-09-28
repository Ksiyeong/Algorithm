from sys import stdin
input = stdin.readline

def solution(depth: int):
    if depth == M:
        print(' '.join(map(str, arr)))
        return

    for i in range(N):
        arr[depth] = nums[i]
        solution(depth + 1)

N, M = map(int, input().split())
nums = list(map(int, input().split()))
nums.sort()
arr = [0] * M

solution(0)