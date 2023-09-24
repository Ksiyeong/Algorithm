from sys import stdin
input = stdin.readline

N, H = map(int, input().split())

arr = [0] * H
for i in range(0, N, 2):
    arr[0] += 1
    arr[int(input())] -= 1
    arr[H - int(input())] += 1

for i in range(1, H):
    arr[i] += arr[i - 1]

minimum = min(arr)
count = arr.count(minimum)

print(minimum, count)