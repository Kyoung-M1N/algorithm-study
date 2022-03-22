# 탕수육

n = int(input())

for _ in range(n):
    str = input()
    lstr = str * 2
    result = ''
    for i in range(len(str)):
        result += lstr[(2*i)]
    print(result)

# 아직 푸는 중