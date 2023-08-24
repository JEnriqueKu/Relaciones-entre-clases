package ejercicioExtra4.entidades;

import java.util.HashSet;

public class Voto {
    private Alumno alumno;
    private HashSet<Alumno> alumnosVotados=new HashSet<>();

    public Voto() {
    }

    public Voto(Alumno alumno) {
        this.alumno = alumno;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public HashSet<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(HashSet<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }

    @Override
    public String toString() {
        return "Voto{" +
                "alumno=" + alumno +
                ", alumnosVotados=" + alumnosVotados +
                '}';
    }
}
