# 음계

n = list(map(int, input().split()))

if n == sorted(n):
    print('ascending')
elif n == sorted(n, reverse=True):
    print('descending')
else:
    print('mixed')

# .sort()는 원래의 값을 바꾸지만 sorted는 원래 값은 바꾸지 않고 비교에만 쓰임