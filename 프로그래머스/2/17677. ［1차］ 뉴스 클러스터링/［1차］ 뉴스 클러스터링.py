def solution(str1, str2):
    intersection = 0
    union = 0

    multiset1 = to_multiset(str1)
    multiset2 = to_multiset(str2)

    for i in range(26):
        for j in range(26):
            intersection += min(multiset1[i][j], multiset2[i][j])
            union += max(multiset1[i][j], multiset2[i][j])

    if union == 0:
        return 65536
    else:
        return int(intersection / union * 65536)

def to_multiset(string:str):
    multiset = [[0]*26 for __ in range(26)]

    for i in range(len(string)-1):
        if string[i].isalpha() and string[i+1].isalpha():
            multiset[ord(string[i].upper())-65][ord(string[i+1].upper())-65] += 1
    
    return multiset