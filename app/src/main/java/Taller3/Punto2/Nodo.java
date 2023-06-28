package Taller3.Punto2;
import Taller3.Punto2.Obra;

/*
 Punto 2
 Author
    * Juan David Ramirez Grismaldo 202067654-3743
    * Santiago Garcia Gil 202060017
    * Jennifer Castaño Ledesma 202067525
    * Monica Andrea Cifuentes 202067536

 * */

public class Nodo
{
    Obra dato;
    Taller3.Punto2.Nodo siguiente;

    public Nodo(Obra dato, Taller3.Punto2.Nodo siguiente)
    {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Obra getDato()
    {
        return dato;
    }

    public void setDato(Obra dato)
    {
        this.dato = dato;
    }

    public Nodo getSiguiente()
    {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente)
    {
        this.siguiente = siguiente;
    }

}
