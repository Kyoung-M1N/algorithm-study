# 상수

num = input().split()
result = 0

for i in range(len(num)):
    if (result < int(num[i][::-1])):
        result = int(num[i][::-1])
print(result)