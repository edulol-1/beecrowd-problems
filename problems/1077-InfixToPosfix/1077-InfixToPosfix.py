# -*- coding: utf-8 -*-
from collections import deque
# Definimos cuales seran los operadores y su prioridad.
Prioridad = {'+':1, '-':1, '*':2, '/':2, '^':3}

def insert_input():
    ''' Recibe el input del usuario/juez para ser procesado. El programa supone
    que el usuario va introducir el input tal como se muestra en la pagina de Beecrowd. Convierte la
expresion infija a posfija y la imprime.'''
    expresiones = []
    while True:
        try:
            line = input()
            expresiones.append(line)
        except EOFError:
            break
    num_lineas = int(expresiones[0])
    for i in range(1, num_lineas+1):
        infijo_a_posfijo(expresiones[i])

def infijo_a_posfijo(expresion):
    ''' Recibe una cadena que contiene una expresion infija. El metodo supone que la expresion contiene
    una sintaxis valida. El metodo imprime la expresion en su forma posfija.'''
    stack = deque()
    output = ""
    for c in expresion:
        if c.isalpha() or c.isdigit(): # c es operando.
            output = output + c
        elif c == '(': # c es (.
            stack.append(c)
        elif c == ')': # c es ).
            while stack and stack[-1] != '(':
                output = output + stack.pop()
            stack.pop()
        else: # c es un operador.
            while stack and stack[-1] != '(' and Prioridad[c] <= Prioridad[stack[-1]]:
                output = output + stack.pop()
            stack.append(c)

    while stack:
        output = output + stack.pop()
    print(output)
    
insert_input()

