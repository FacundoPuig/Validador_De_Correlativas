package org.example;


import java.util.List;


public class Materia {
    private List<Materia> correlativas;

    public List<Materia> getCorrelativas() {
        return correlativas;
    }
    public Materia(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }
}
