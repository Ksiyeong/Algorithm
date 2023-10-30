def solution(s: str):
    if len(s) % 2 == 1:
        return 0
    
    stack = []
    for char in s:
        if not(stack) or stack[-1] != char:
            stack.append(char)
        else: # stack[-1] == char:
            stack.pop()
    
    return 1 if not(stack) else 0