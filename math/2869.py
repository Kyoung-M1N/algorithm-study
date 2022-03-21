# 달팽이는 올라가고 싶다

a,b,v = map(int, input().split())
day = 0

while v > 0:
    day += 1
    v -= a
    if(v <= 0):
        print(day)
        break
    v += b
