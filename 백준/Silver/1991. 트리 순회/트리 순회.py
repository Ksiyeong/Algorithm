from sys import stdin
input = stdin.readline

def solution(node:int):
    if node < 0:
        return
    global preorder_traversal
    global inorder_traversal
    global postorder_traversal
    
    chr_node = chr(node + 65)

    preorder_traversal += chr_node # 전위 순회
    solution(graph[node][0])
    inorder_traversal += chr_node # 중위 순회
    solution(graph[node][1])
    postorder_traversal += chr_node # 후위 순회

N = int(input())
graph = [[] for _ in range(26)]
for _ in range(N):
    a, b, c = map(lambda x: ord(x) - 65, input().split())
    graph[a].append(b)
    graph[a].append(c)

preorder_traversal = ''
inorder_traversal = ''
postorder_traversal = ''

solution(0)

print(preorder_traversal)
print(inorder_traversal)
print(postorder_traversal)