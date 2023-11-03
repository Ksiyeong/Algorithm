def solution(people:list, limit:int):
    people.sort()

    s = 0
    e = len(people) - 1
    while s < e:
        if limit >= people[s] + people[e]:
            s += 1
        e -= 1

    return len(people) - s