package ejercicioExtra4.entidades;

import java.util.Objects;

public class Alumno {
    private String nombreCompleto;
    private Integer dni;
    private Integer cantidadVotos;
    private Voto voto;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, Integer dni, Integer cantidadVotos, Voto voto) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadVotos = cantidadVotos;
        this.voto = voto;
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(Integer cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    public Voto getVoto() {
        return voto;
    }

    public void setVoto(Voto voto) {
        this.voto = voto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno alumno)) return false;
        return Objects.equals(getDni(), alumno.getDni());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDni());
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", dni=" + dni +
                ", cantidadVotos=" + cantidadVotos +
                '}';
    }
}
