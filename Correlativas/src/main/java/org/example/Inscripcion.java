package org.example;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public boolean aprobada(){
        return this.materias.stream().allMatch(this :: cumpleCorrelativas);
    }
    public boolean cumpleCorrelativas(Materia materia){
        return this.alumno.getMateriasAprobadas().containsAll(materia.getCorrelativas());
    }

    public Inscripcion(Alumno alumno, List<Materia> materias) {
        this.alumno = alumno;
        this.materias = materias;
    }
}
