package org.example;

import java.util.List;

public class Alumno {
    private List<Materia> MateriasAprobadas;


    public List<Materia> getMateriasAprobadas() {
        return MateriasAprobadas;
    }

    public Alumno(List<Materia> materiasAprobadas) {
        MateriasAprobadas = materiasAprobadas;
    }

}
