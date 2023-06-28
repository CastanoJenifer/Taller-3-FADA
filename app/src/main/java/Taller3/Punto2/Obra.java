package Taller3.Punto2;

/*
 Punto 2
 Author
    * Juan David Ramirez Grismaldo 202067654-3743
    * Santiago Garcia Gil 202060017
    * Jennifer Castaño Ledesma 202067525
    * Monica Andrea Cifuentes 202067536

 * */

public class Obra
{
    String nombre;//se crea la variable nombre
    int cantidad;//se crea la variable cantidad

    public Obra(String nombre, int cantidad) // Se crea el constructor
    {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

}
