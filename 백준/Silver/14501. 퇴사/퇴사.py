from sys import stdin
input = stdin.readline

def solution(index:int, p:int):
    global P
    if index == N:
        P = max(P, p)
        return
    elif index < N:
        solution(index+TP[index][0],p+TP[index][1]) # 일을 하거나
        solution(index+1, p) # 하지 않거나

N = int(input())
TP = [list(map(int, input().split())) for _ in range(N)]
P = 0

solution(0, 0)
print(P)