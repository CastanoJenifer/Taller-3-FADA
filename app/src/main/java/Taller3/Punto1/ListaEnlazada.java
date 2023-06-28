package Taller3.Punto1;
import Taller3.Punto1.Nodo;

/*
 Punto 1 del taller 3
 Se define la clase nodo y para utilizarla en la clase lista enlazada.


 @autores:
   * Juan David Ramirez Grismaldo 202067654
   * Santiago Garcia Gil 202060017
   * Jenifer Castaño Ledesma 202067525
   * Monica Andrea Cifuentes Salcedo 202067536

 */

public class ListaEnlazada
{
    public int size;   //se declara el tamaño de la lista
    public Nodo head;  // se declara la cabeza de la lista

    public ListaEnlazada()
    {
        //se crea el constructor de la lista enlazada
        this.size = 0;   //se inicializa en cero el tamaño de la lista
        this.head = null;   //se inicializa en nulo la cabeza de la lista
    }


    //se crea el metodo para agregar un nodo a la lista
    public void add(int dato)
    {
        Nodo nodo = new Nodo(dato,null);        //se crea el nodo

        if (this.head == null)   //condicion para saber si la lista esta vacia
        {
            this.head = nodo;//se agrega a la cabeza de la lista
        }
        else
        {
            Nodo temp = this.head;      //se crea un nodo temporal para recorrer la lista

            while(temp.siguiente != null)  //condicion para saber si el nodo siguiente es nulo
            {
                temp = temp.siguiente;   //se hace el recorrido de la lista
            }
            temp.siguiente = nodo;   //se agrega el nodo al final de la lista
        }
        this.size++;   // se incrementa el tamaño de la lista
    }



    //para indexar un nodo
    public int indexar(int i) throws StackOverflowError
    {
        int contador = 0;  // se inicializa el contador en cero
        Nodo temp = this.head;   //se crea un nodo temporal para recorrer la lista
        while((contador < i) && (temp != null))//si el contador es menor al indice y si el nodo temporal es diferente de nulo
        {
            temp = temp.siguiente;   //se hace el recorrido de la lista
            contador += 1;   //se incrementa el contador
        }
        if (temp == null)//si el nodo temporal es nulo
        {
            throw new StackOverflowError("El indice no existe");  //se lanza la excepcion
        }

        return temp.dato;  //se retorna el dato del nodo
    }



    //se crea el metodo para combinar las dos listas enlazadas y organizarlas de menor a mayor
    public ListaEnlazada combinar(ListaEnlazada lista1, ListaEnlazada lista2)
    {
        //se crea la lista enlazada que va a contener las dos listas enlazadas
        ListaEnlazada lista3 = new ListaEnlazada();

        Nodo temp1 = lista1.head;  //se crea un nodo temporal para recorrer la lista 1
        Nodo temp2 = lista2.head;  //se crea un nodo temporal para recorrer la lista 2

        while((temp1 != null) && (temp2 != null))//condicion para saber si los nodos temporales son diferentes de nulo
        {
            if (temp1.dato <= temp2.dato) // condicion para saber si el dato del nodo temporal 1 es menor o igual al dato del nodo temporal 2
            {
                lista3.add(temp1.dato);  //se agrega el dato del nodo temporal 1 a la lista 3
                temp1 = temp1.siguiente;  //se hace el recorrido de la lista 1
            }
            else
            {
                lista3.add(temp2.dato);   //se agrega el dato del nodo temporal 2 a la lista 3
                temp2 = temp2.siguiente;  //se hace el recorrido de la lista 2
            }
        }

        while(temp1 != null)//condicion para saber si el nodo temporal 1 es diferente de nulo
        {
            lista3.add(temp1.dato);  //se agrega el dato del nodo temporal 1 a la lista 3
            temp1 = temp1.siguiente;  //se hace el recorrido de la lista 1
        }

        while(temp2 != null) //condicion para saber si el nodo temporal 2 es diferente de nulo
        {
            lista3.add(temp2.dato);   //se agrega el dato del nodo temporal 2 a la lista 3
            temp2 = temp2.siguiente;  //se hace el recorrido de la lista 2
        }

        return lista3;//se retorna la lista 3
    }
    //final del codigo
}
