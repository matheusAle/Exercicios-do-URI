mapa = {
    'a': 0, 'k': 0, 'u': 0, 'G': 0, 'Q': 0,
    'b': 1, 'l': 1, 'v': 1, 'I': 1, 'S': 1,
    'c': 2, 'm': 2, 'w': 2, 'E': 2, 'O': 2, 'Y': 2,
    'd': 3, 'n': 3, 'x': 3, 'F': 3, 'P': 3, 'Z': 3,
    'e': 4, 'o': 4, 'y': 4, 'J': 4, 'T': 4,
    'f': 5, 'p': 5, 'z': 5, 'D': 5, 'N': 5, 'X': 5,
    'g': 6, 'q': 6, 'A': 6, 'K': 6, 'U': 6,
    'h': 7, 'r': 7, 'C': 7, 'M': 7, 'W': 7,
    'i': 8, 's': 8, 'B': 8, 'L': 8, 'V': 8,
    'j': 9, 't': 9, 'H': 9, 'R': 9,
}
n = int(input())
for n in range(n):
    for char in input().replace(' ', '')[:12:]:
        print(str(mapa[char]), end='')
    print()

