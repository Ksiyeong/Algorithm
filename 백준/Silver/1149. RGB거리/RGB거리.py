from sys import stdin
input = stdin.readline

N = int(input())
rgb = [list(map(int, input().split())) for _ in range(N)]

for idx in range(1, N):
    # RED 0
    rgb[idx][0] += min(rgb[idx-1][1], rgb[idx-1][2])
    # GREEN 1
    rgb[idx][1] += min(rgb[idx-1][0], rgb[idx-1][2])
    # BLUE 2
    rgb[idx][2] += min(rgb[idx-1][0], rgb[idx-1][1])

print(min(rgb[N-1]))