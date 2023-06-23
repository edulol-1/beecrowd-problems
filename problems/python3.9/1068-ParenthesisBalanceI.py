# -*- coding: utf-8 -*-

''' Recibe una expresion con parentesis de parte del usuario y verifica si esta es valida o no.'''

def get_input():
    ''' Recibe el input del usuario/juez para ser procesado. El programa supone
    que el usuario va introducir el input tal como se muestra en la pagina de Beecrowd.'''
    expresiones = []
    while True:
        try:
            line = input()
            expresiones.append(line)
        except EOFError:
            break
    n = len(expresiones)
    for i in range(0, n):
        if esvalida(expresiones[i]):
            print("correct")
        else:
            print("incorrect")

def esvalida(expresion):
    if expresion == None:
        return True
    sLeft = []
    sRight = []

    for c in expresion:
        if c == ')':
            sRight.append(c)
        if len(sRight) > len(sLeft):
            break
        if c == '(':
            sLeft.append(c)

    if len(sRight) != len(sLeft):
        return False
    return True
 
get_input()

