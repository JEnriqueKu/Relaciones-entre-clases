package ejercicioExtra3.entidades;

import java.time.LocalDate;

public class Cuota {
        private int numeroCuota;
        private double montoTotal;
        private boolean pagada;
        private LocalDate fechaVencimiento;
        private String formaPago;
        private Vehiculo vehiculo;
        private Cliente cliente;

        // Constructor

    public Cuota() {
    }

    public Cuota(int numeroCuota, double montoTotal, boolean pagada, LocalDate fechaVencimiento, String formaPago, Vehiculo vehiculo, Cliente cliente) {
        this.numeroCuota = numeroCuota;
        this.montoTotal = montoTotal;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }

    public Cuota(int numeroCuota, double montoTotal, boolean pagada, LocalDate fechaVencimiento, String formaPago) {
            this.numeroCuota = numeroCuota;
            this.montoTotal = montoTotal;
            this.pagada = pagada;
            this.fechaVencimiento = fechaVencimiento;
            this.formaPago = formaPago;
        }

        // Getters y setters
        public int getNumeroCuota() {
            return numeroCuota;
        }

        public void setNumeroCuota(int numeroCuota) {
            this.numeroCuota = numeroCuota;
        }

        public double getMontoTotal() {
            return montoTotal;
        }

        public void setMontoTotal(double montoTotal) {
            this.montoTotal = montoTotal;
        }

        public boolean isPagada() {
            return pagada;
        }

        public void setPagada(boolean pagada) {
            this.pagada = pagada;
        }

        public LocalDate getFechaVencimiento() {
            return fechaVencimiento;
        }

        public void setFechaVencimiento(LocalDate fechaVencimiento) {
            this.fechaVencimiento = fechaVencimiento;
        }

        public String getFormaPago() {
            return formaPago;
        }

        public void setFormaPago(String formaPago) {
            this.formaPago = formaPago;
        }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuota{" +
                "numeroCuota=" + numeroCuota +
                ", montoTotal=" + montoTotal +
                ", pagada=" + pagada +
                ", fechaVencimiento=" + fechaVencimiento +
                ", formaPago='" + formaPago + '\'' +
                ", vehiculo=" + vehiculo +
                ", cliente=" + cliente +
                '}';
    }
}
