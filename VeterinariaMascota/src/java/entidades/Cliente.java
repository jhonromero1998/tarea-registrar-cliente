package entidades;
// Generated 24-jun-2019 11:47:47 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private int idcliente;
     private String nombre;
     private String apellidos;
     private Date fechanacimiento;
     private String direccion;
     private String telefono;
     private String email;
     private Set mascotaporclientes = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(int idcliente, String nombre, String apellidos, Date fechanacimiento, String direccion, String telefono, String email) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
    public Cliente(int idcliente, String nombre, String apellidos, Date fechanacimiento, String direccion, String telefono, String email, Set mascotaporclientes) {
       this.idcliente = idcliente;
       this.nombre = nombre;
       this.apellidos = apellidos;
       this.fechanacimiento = fechanacimiento;
       this.direccion = direccion;
       this.telefono = telefono;
       this.email = email;
       this.mascotaporclientes = mascotaporclientes;
    }
   
    public int getIdcliente() {
        return this.idcliente;
    }
    
    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Date getFechanacimiento() {
        return this.fechanacimiento;
    }
    
    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getMascotaporclientes() {
        return this.mascotaporclientes;
    }
    
    public void setMascotaporclientes(Set mascotaporclientes) {
        this.mascotaporclientes = mascotaporclientes;
    }




}


