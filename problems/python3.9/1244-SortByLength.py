# -*- coding: utf-8 -*-

class SortByLength():
    ''' Realiza un ordenamiento sobre un string que se pase mediante input. Dicho ordenamiento
    toma como referencia la longitud de las palabras para ordenar.'''
    
    def __init__(self):
        pass
    
    def insert_input(self):
        ''' Recibe el input del usuario/juez para ser procesado. El programa supone
        que el usuario va introducir el input tal como se muestra en la pagina de 
        Beecrowd. '''
        strings = []
        while True:
            try:
                line = input()
                strings.append(line)
            except EOFError:
                break
        num_lineas = int(strings[0])
        result = self.ordena_lineas(num_lineas, strings)
        return result

    def ordena_lineas(self, num_lineas, strings):
        ''' Ordena las lineas de un string de acuerdo a la longitud de las palabras. Regresa el
        string con cada linea ordenada de forma decreciente de acuerdo a la longitud de las
        palabras.'''
        cadena = ""
        i = 1
        while i <= num_lineas:
            words = strings[i].split(" ")
            length = len(words)
            ordered_words = sorted(words, key=len, reverse=True)
            j = 0
            while j <= length-1:
                cadena = cadena + ordered_words[j]
                if j != length-1:
                    cadena = cadena + " "
                j = j + 1
            if i != num_lineas:
                cadena = cadena + "\n"
            i = i+1
        return cadena

if  __name__ == "__main__":
    sort = SortByLength()
    print(sort.insert_input())

