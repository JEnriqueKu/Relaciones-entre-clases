package ejercicioExtra3.entidades;

import java.util.ArrayList;

public class Cliente {
        private String nombre;
        private String apellido;
        private String documento;
        private String mail;
        private String domicilio;
        private String telefono;
        private ArrayList<Vehiculo> vehiculos;

        // Constructor

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String documento, String mail, String domicilio, String telefono) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.documento = documento;
            this.mail = mail;
            this.domicilio = domicilio;
            this.telefono = telefono;
        }

        // Getters y setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getDocumento() {
            return documento;
        }

        public void setDocumento(String documento) {
            this.documento = documento;
        }

        public String getMail() {
            return mail;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }

        public String getDomicilio() {
            return domicilio;
        }

        public void setDomicilio(String domicilio) {
            this.domicilio = domicilio;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", documento='" + documento + '\'' +
                ", mail='" + mail + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", telefono='" + telefono + '\'' +
                ", vehiculos=" + vehiculos +
                '}';
    }
}
