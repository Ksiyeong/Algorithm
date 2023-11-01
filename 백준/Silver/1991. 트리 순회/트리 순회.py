from sys import stdin
input = stdin.readline

def solution(node:chr):
    if node != '.':
        global preorder
        global inorder
        global postorder

        preorder += node # 전위 순회
        solution(tree[node][0])
        inorder += node # 중위 순회
        solution(tree[node][1])
        postorder += node # 후위 순회

N = int(input())
tree = {}
for _ in range(N):
    a, b, c = input().split()
    tree[a] = [b, c]

preorder = ''
inorder = ''
postorder = ''

solution('A')

print(preorder)
print(inorder)
print(postorder)