## Practica 4 - Programación 2

La **Distancia de edición**, tambien llamada [distancia de Damerau-Levenshtein](https://es.wikipedia.org/wiki/Distancia_de_Damerau-Levenshtein) es el **número mínimo de operaciones** requeridas para **transformar** una cadena de caracteres en otra.


### Uso

Primero compile el programa con el comando :

```
make
```

Lance el programa :

```
Uso: ./a.out [OPCIONES] <string1> <string2>

OPCIONES

        -h  : Muestra este mensaje
```

### Output

```
// Input : ./a.out "HolaMundo" "HolaMarte"

0 1 2 3 4 5 6 7 8
1 0 1 2 3 4 5 6 7
2 1 0 1 2 3 4 5 6
3 2 1 0 1 2 3 4 5
4 3 2 1 0 1 2 3 4
5 4 3 2 1 1 2 3 4
6 5 4 3 2 2 2 3 4
7 6 5 4 3 3 3 3 4
8 7 6 5 4 4 4 4 4

La distancia de edición es 4
```

> Nota: Puede verficar y comparar resultados del programa con resultados de otra **calculadora de distancias** de edición [ online](https://es.planetcalc.com/1721/).

### Diagrama UML

<br>

<p align="center">
  <img src="http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/KhalidCEU/practica4_p2/refs/heads/main/docs/diagram.puml" alt="Class Diagram" width=30%>
</p>
