from sys import stdin
input = stdin.readline

def solution(index:int, used:list):
    global C, USED
    if index == N:
        p, f, s, v, c = 0, 0, 0, 0, 0
        for i in used:
            p += PFSVC[i-1][0]
            f += PFSVC[i-1][1]
            s += PFSVC[i-1][2]
            v += PFSVC[i-1][3]
            c += PFSVC[i-1][4]
        if p >= P and f >= F and s >= S and v >= V:
            if c < C or (c == C and used < USED):
                C = c
                USED = used
        return
    
    # 사용하거나
    solution(index+1, used + [index+1])
    # 사용하지 않거나
    solution(index+1, used)

N = int(input())
P, F, S, V = map(int, input().split())
PFSVC = [list(map(int, input().split())) for _ in range(N)]
C = 1e9
USED = []

solution(0,[])

if C != 1e9:
    print(C)
    print(*USED)
else:
    print(-1)