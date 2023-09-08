n = int(input())
nums = list(map(int, input().split()))
arr = list(range(2, max(nums) + 1))
answer = 0

for i in range(len(arr)):
    if arr[i] != 0:
        for j in range(i + arr[i], len(arr), i + 2):
            arr[j] = 0

for num in nums:
    if num in arr:
        answer += 1

print(answer)