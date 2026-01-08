@startuml
title Conjuntos String

class Main{
+{static}main(String[] args): void
}

class Par<A, B>{
-PRIMERO: A {readOnly}
-SEGUNDO: B {readOnly}
+toString(): String
}

interface Interface<T>{
agregar(elemento: T): void
vacio(): boolean
pertenencia(elemento: T): boolean
union(c2: Conjunto<T>): Conjunto<T>
interseccion(c2: Conjunto<T>): Conjunto<T>
diferencia(c2: Conjunto<T>): Conjunto<T>
subconjunto(c2: Conjunto<T>): boolean
subconjuntoPropio(c2: Conjunto<T>): boolean
pow(): Conjunto<Conjunto<T>>
igualdad(c2: Conjunto<T>): boolean
productoCartesiano(c2: Conjunto<T>): conjunto<Par<T, T>>
}

class Conjunto<T>{
-elementos: LinkedHashSet<T>
+agregar(elemento: T): void
+vacio(): boolean
+pertenencia(elemento: T): boolean
+union(c2: Conjunto<T>): Conjunto<T>
+interseccion(c2: Conjunto<T>): Conjunto<T>
+diferencia(c2: Conjunto<T>): Conjunto<T>
+subconjunto(c2: Conjunto<T>): boolean
+subconjuntoPropio(c2: Conjunto<T>): boolean
+pow(): Conjunto<Conjunto<T>>
+igualdad(c2: Conjunto<T>): boolean
+productoCartesiano(c2: Conjunto<T>): conjunto<Par<T, T>>
}

Main ..> Conjunto: usa
Conjunto ..> Par: usa
Conjunto ..|> Interface: implementa
@enduml
