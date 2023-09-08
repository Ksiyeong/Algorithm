n = int(input())
nums = list(map(int, input().split()))
arr = [False, False] + [True] * (max(nums) - 1)
answer = 0

for i in range(2, len(arr)):
    if arr[i]:
        for j in range(i + i, len(arr), i):
            arr[j] = False

for num in nums:
    if arr[num]:
        answer += 1

print(answer)