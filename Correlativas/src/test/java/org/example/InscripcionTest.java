package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class InscripcionTest {
    @Test
    public void testInscripcionAprobada(){
        Materia paradigmas = new Materia(List.of());
        Materia algoritmos = new Materia(List.of());
        Materia sintaxis = new Materia(List.of());
        Materia disenioSistemas = new Materia(List.of(paradigmas, algoritmos));
        Materia baseDeDatos = new Materia(List.of(sintaxis));
        Alumno facundo = new Alumno(List.of(paradigmas, algoritmos, sintaxis));

        Inscripcion inscripcion = new Inscripcion(facundo, List.of(disenioSistemas, baseDeDatos));

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    public void testInscripcionRechazada(){
        Materia paradigmas = new Materia(List.of());
        Materia algoritmos = new Materia(List.of());
        Materia arquitectura = new Materia(List.of());
        Materia disenioSistemas = new Materia(List.of(paradigmas, algoritmos));
        Materia sistemasOperativos = new Materia(List.of(arquitectura));
        Alumno camila = new Alumno(List.of(paradigmas,arquitectura));

        Inscripcion inscripcion = new Inscripcion(camila, List.of(disenioSistemas, sistemasOperativos));

        Assertions.assertFalse(inscripcion.aprobada());
    }

    @Test
    public void testInscripcionSinCorrelativas(){
        Materia paradigmas = new Materia(List.of());
        Materia algoritmos = new Materia(List.of());
        Materia arquitectura = new Materia(List.of());
        Alumno eugenia = new Alumno(List.of(arquitectura));

        Inscripcion inscripcion = new Inscripcion(eugenia, List.of(paradigmas, algoritmos));

        Assertions.assertTrue(inscripcion.aprobada());
    }
}