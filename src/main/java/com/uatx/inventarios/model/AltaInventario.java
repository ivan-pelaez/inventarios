package com.uatx.inventarios.model;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "altainventario")
@SequenceGenerator(name = "AltaInventario_seq")
public class AltaInventario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "AltaInventario_seq")
    private Long id;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "cantidad")
    private Double cantidad;
    @Column(name = "producto")
    private Producto producto;

    public Long getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
