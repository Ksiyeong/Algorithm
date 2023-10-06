from sys import stdin
input = stdin.readline

def solution(depth:int, used:int, S:int, B:int):
    if depth == N:
        if used != 0:
            results.append(abs(S-B))
        return
    # 사용하거나
    solution(depth+1, used+1, S*SB[depth][0], B+SB[depth][1])
    # 사용하지 않거나
    solution(depth+1, used, S, B)

N = int(input())
SB = [list(map(int, input().split())) for _ in range(N)]
results = []

solution(0,0,1,0)
print(min(results))