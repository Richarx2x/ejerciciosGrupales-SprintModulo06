package cl.g5.ej3Mod6.model.dto;

public class UsuarioDTO {
    private int id;
    private String nombre;
    private String username;
    private String password;

    public UsuarioDTO() {
    }
    public UsuarioDTO(int id,  String nombre, String username){
        this.id=id;
        this.nombre = nombre;
        this.username = username;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
