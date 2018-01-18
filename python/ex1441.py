while True:
    h = int(input())
    if h == 0:
        break
    maior = 0
    hn = h
    while hn != 1:
        hn = hn * .5 if hn % 2 == 0 else (hn * 3) + 1
        maior = hn if maior < hn else maior
    print(int(maior if h < maior else h))
