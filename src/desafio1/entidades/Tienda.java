package desafio1.entidades;

import java.util.ArrayList;
import java.util.Objects;

public class Tienda {
    private Integer id;
    private ArrayList<Producto> productos = new ArrayList<>();
    private String direccion;
    private String representanteTienda;

    public Tienda(){

    }

    public Tienda(Integer id, String direccion, String representanteTienda) {
        this.id = id;
        this.direccion = direccion;
        this.representanteTienda = representanteTienda;
    }

    public Integer getId() {
        return id;
    }

    public void setid(int id) {
        id = id;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRepresentanteTienda() {
        return representanteTienda;
    }

    public void setRepresentanteTienda(String representanteTienda) {
        this.representanteTienda = representanteTienda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tienda tienda)) return false;
        return getId() == tienda.getId() && Objects.equals(getDireccion(), tienda.getDireccion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDireccion());
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", representanteTienda='" + representanteTienda + '\'' +
                '}';
    }
}
