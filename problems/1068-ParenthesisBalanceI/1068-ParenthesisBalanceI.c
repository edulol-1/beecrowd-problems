#include <stdio.h>

/** 
 * Este archivo toma el input del usuario como una expresion, y para cada expresion se muestra
 * en pantalla si es una expresion valida o no.
 * @author Eduardo Montaño Gomez.
 * @from Laboratorio Modelado y programacion.
 * */

/* 
 * Recibe una expresion que contiene parentesis y regresa 1 si la expresion es valida. 0 en caso
 * contrario.
 * @param expresion la expresion a evaluar.
 * @return 1 si la expresion es valida, 0 en otro caso.
*/
int esvalida(char expresion[]) {
  if (strlen(expresion) == 0)
    return 1;
  int numero_parentesis_derecha = 0;
  int numero_parentesis_izquierda = 0;
  int length = strlen(expresion);
  for (int i = 0; i < length; i++) {
    char c = expresion[i];
    if (c == ')')
      numero_parentesis_derecha++;
    if (numero_parentesis_derecha > numero_parentesis_izquierda)
      break;
    if (c == '(')
      numero_parentesis_izquierda++;
  }
  if (numero_parentesis_derecha != numero_parentesis_izquierda)
    return 0;
  return 1;
}

/* 
 * Recibe el input del usuario en modo estandar. Por cada expresion introducida, y hasta
 * que encuentre un salto de linea, imprimira si la expresion es valida de acuerdo a los
 * parentesis que esta contiene.
*/
void get_input() {
  char expresion[1001];
  while (scanf("%s", expresion) != EOF) {
    if (esvalida(expresion) == 1)
      printf("correct");
    else
      printf("incorrect");
    printf("\n");
  }
}

int main() {
  get_input();
 return 0;
}

