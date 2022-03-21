# 다리 놓기

import math

t = int(input())

for i in range(t):
    n, m = map(int, input().split())
    print(math.comb(m,n))

# 조합(combination)으로 풀기