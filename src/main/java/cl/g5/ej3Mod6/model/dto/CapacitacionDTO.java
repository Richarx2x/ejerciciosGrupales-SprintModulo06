package cl.g5.ej3Mod6.model.dto;

public class CapacitacionDTO {
    private int id;
    private String nombre;
    private String detalle;
    private String fecha;// use tipo string para este sprint ** cambiar tipo de dato en la BD
    private String hora;
    private String lugar;
    private int duracion;
    private int cantidad;
 private int cliente_id;


    public CapacitacionDTO() {

    }

    public CapacitacionDTO(String nombre, String detalle) {
        this.nombre = nombre;
        this.detalle = detalle;
    }

    public CapacitacionDTO(String nombre, String detalle, String fecha, String hora, String lugar, int duracion, int cantidad, int cliente_id) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidad = cantidad;
        this.cliente_id =cliente_id;
    }
    public CapacitacionDTO(String nombre, String detalle, String lugar, int duracion, int cantidad, int cliente_id) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidad = cantidad;
        this.cliente_id =cliente_id;
    }

    public CapacitacionDTO(int id, String nombre, String detalle) {
        this.id=id;
        this.nombre = nombre;
        this.detalle = detalle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    @Override
    public String toString() {
        return "CapacitacionDTO{" +
                "nombre='" + nombre + '\'' +
                ", detalle='" + detalle + '\'' +
                '}';
    }
}
