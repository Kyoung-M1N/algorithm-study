# 문자열 반복

t = int(input())

for _ in range(t):
    s = input().split()
    n = int(s[0])
    m = list(s[1])
    for i in range(len(m)):
        m[i] *= n
    print(''.join(m))