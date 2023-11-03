def solution(people:list, limit:int):
    answer = 0
    people.sort()

    s = 0
    e = len(people) - 1
    while s < e:
        if limit >= people[s] + people[e]:
            s += 1
            e -= 1
            answer += 1
        else:
            e -= 1
            answer += 1
        
    if s == e:
        answer += 1
        
    return answer