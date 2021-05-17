# PracticasJava - Febrero 2021 Objetos 2.

Sistema Verificación Técnica Vehicular de la ciudad de Buenos Aires

La Verificación Técnica Vehicular es el control obligatorio periódico del estado mecánico y de emisión de
gases contaminantes de los automotores. Durante la misma, se realizan dos tipos de controles: basados en
observaciones y basados en mediciones. Las observaciones son el primer paso de una inspección y se relacionan
con aquello que un inspector de la VTV puede analizar visualmente: se revisan las luces, patente, espejos, chasis,
vidrios y seguridad y emergencia del vehículo. Las mediciones son determinadas por la maquinaria que evalúa el
sistema de frenos, suspensión, dirección y tren delantero; sistema de frenos y contaminación ambiental.
Una vez que se obtienen todos los datos se determina si un vehículo está: “apto” (si tiene observaciones y
mediciones aptas), “condicional” (si tiene por lo menos una observación o medición condicional) o “rechazado” (si
tiene por lo menos una observación o medición rechazada).
Un vehículo apto tiene una oblea con validez de un año, uno condicional no puede recibir la oblea pero
puede volver en el transcurso de una cantidad de días de la inspección con el arreglo en la parte desfavorable de
esta para poder hacer la VTV nuevamente sin volver a pagar, uno rechazado no recibe oblea y tiene que volver a
pagar para poder hacer la inspección.

<img src="https://i.imgur.com/FPj0163.png" />

Casos de uso:
1) + traerAutomotor (String dominio) : Automotor
2) + traerInspeccion (Automotor automotor) : Inspeccion
3) + traerInspeccion (int idInspeccion) : Inspeccion
4) + traerObservacion (Inspeccion inspeccion) : Observacion
5) + traerMedicion (Inspeccion inspeccion) : Medicion
6) + traerInspeccion (LocalDate fecha) : Inspeccion
7) + traerInspeccion (LocalDate fecha, long dniInspector) : Inspeccion
8) + traerInspeccion (LocalDate fecha, String estado) : Inspeccion
