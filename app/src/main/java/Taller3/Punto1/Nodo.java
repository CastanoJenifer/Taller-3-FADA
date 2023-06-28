package Taller3.Punto1;

/*
 Punto 1 del taller 3
 Se define la clase nodo y para utilizarla en la clase lista enlazada.


 @autores:
   * Juan David Ramirez Grismaldo 202067654
   * Santiago Garcia Gil 202060017
   * Jenifer Castaño Ledesma 202067525
   * Monica Andrea Cifuentes Salcedo 202067536

 */

public class Nodo
{
    int dato;
    Nodo siguiente;

    public Nodo(int dato, Nodo siguiente)
    {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public int getDato()
    {
        return dato; //se obtiene el dato
    }

    public void setDato(int dato)
    {
        this.dato = dato; //se modifica el dato
    }

    public Nodo getSiguiente()
    {
        return siguiente; //se obtiene el siguiente
    }

    public void setSiguiente(Nodo siguiente)
    {
        this.siguiente = siguiente;
    }


}

