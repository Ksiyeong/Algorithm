from sys import stdin
input = stdin.readline

def solution(n, cards, m, nums):
    cards.sort()

    for num in nums:
        s = 0
        e = n - 1
        isFind = False
        while s <= e:
            index = (s + e) // 2
            # up
            if num > cards[index]:
                s = index + 1
            
            # down
            elif num < cards[index]:
                e = index - 1
                
            # answer
            elif num == cards[index]:
                isFind = True
                break

        if isFind:
            print('1', end=' ')
        else:
            print('0', end=' ')

n = int(input())
cards = list(map(int, input().split()))
m = int(input())
nums = list(map(int, input().split()))

# n = 5
# cards = [6, 3, 2, 10, -10]
# m = 8
# nums = [10, 9, -5, 2, 3, 4, 5, -10]

solution(n, cards, m, nums)