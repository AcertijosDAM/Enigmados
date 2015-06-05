package com.example.jsanz.enigmados;

/**
 * Created by jsanz on 5/06/15.
 */
public class ItemNivel {
    protected String rutaImagen;
    protected String nombre;
    protected long id;

    public ItemNivel(){
        this.nombre = "";
        this.rutaImagen="";
    }
    public ItemNivel(String nombre,String rutaImagen){
        this.nombre=nombre;
        this.rutaImagen="";
        this.id= id;
    }
    public ItemNivel(long id, String nombre, String tipo, String rutaImagen) {

        this.nombre = nombre;
        this.id=id;
        this.rutaImagen = rutaImagen;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}
