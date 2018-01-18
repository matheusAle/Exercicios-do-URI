# -*- coding: utf-8 -*-
'''
	{@see http://marathoncode.blogspot.com.br/2013/08/josephus-problem.html} 
	{@see https://stackoverflow.com/questions/3323001/what-is-the-maximum-recursion-depth-in-python-and-how-to-increase-it} 
'''
import sys
sys.setrecursionlimit(10000000)

def josephus(n, k):
  if n == 1:
    return 1
  return ( josephus( n - 1, k ) + k - 1 ) % n + 1

nc = int(input())
for rodada in range(nc):
  n, k = input().split(' ')
  print('Case {}: {}'.format(rodada+1, josephus(int(n), int(k))))