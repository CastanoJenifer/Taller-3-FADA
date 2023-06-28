package Taller3.Punto2;

/*
 Punto 2
 En esta clase se desarrolla la lista enlazada con las clases de agregar replica, venderreplica y listarreplica.

 Author
    * Juan David Ramirez Grismaldo 202067654-3743
    * Santiago Garcia Gil 202060017
    * Jennifer Castaño Ledesma 202067525
    * Monica Andrea Cifuentes 202067536

 * */


import Taller3.App;

public class ListaEnlazadaMuseo
{

    public Nodo head;

    public ListaEnlazadaMuseo()
    {
        this.head = null; //se inicializa la lista enlazada en null
    }

    //se crea el metodo que agrega obras a la lista enlazada, recibe el nombre de la obra e incrementa la cantidad en 1.
    public void agregarReplica(String nombre)
    {
        //se inicializa la lista enlazada
        Obra obra1 = new Obra(nombre,1);
        Nodo obra = new Nodo(obra1, null);


        if(this.head == null)  //se verifica si la lista esta vacia y se agrega la obra
        {
            this.head = obra; //si esto es cierto se agrega la obra
        }
        else
        {
            Nodo temp = this.head;  //se crea una variable temporal para recorrer la lista
            while(temp != null)  //se hace un while para recorrer la lista
            {
                //se verifica si el nombre de la obra es igual al nombre de la obra que se quiere agregar
                if(temp.dato.getNombre().equals(nombre))
                {
                    temp.dato.setCantidad(temp.dato.getCantidad() + 1); //se incrementa la cantidad de obras
                    break;  //se rompe el ciclo
                }
                else if(temp.getSiguiente() == null) // se verifica si el siguiente es nulo
                {
                    temp.setSiguiente(obra);  //se agrega la obra
                    break;  //se rompe el ciclo
                }

                temp=temp.getSiguiente();  //se recorre la lista
            }
        }
    }




    //se crea el metodo que vende obras. Recibe el nombre de la obra y decrementa su cantidad.
    public void venderReplica(String nombre) throws ArrayIndexOutOfBoundsException
    {
        Nodo temp = this.head;  //se crea una variable temporal para recorrer la lista

        while(temp != null)   //se hace un while para recorrer la lista
        {
            Nodo antiguo = this.head;
            if (antiguo.dato.getNombre() != nombre)  // Si el nombre es diferente se guardara el nodo anterior y el siguiente
            {
                antiguo = temp;
                temp = temp.getSiguiente();
            }

            if (temp.dato.getNombre().equals(nombre))  //se verifica si el nombre de la obra es igual al nombre de la obra que se quiere quitar
            {
                if (temp.dato.getCantidad() > 0)
                {
                    //se decrementa la cantidad de obras y de la cantidad
                    temp.dato.setCantidad(temp.dato.getCantidad() - 1);

                }
                if (temp.dato.getCantidad() == 0)  //se verifica si la cantidad de obras es igual a 0
                {
                    antiguo.setSiguiente(temp.getSiguiente());  //se elimina la obra
                }
                //fin del ciclo
                break;//se rompe el ciclo
            }

        }
    }

    //se crea el metodo que lista las obras de la lista enlazada.
    public String listarReplicas()
    {
        String salida= "";
        Nodo temp = this.head;  //se crea una variable temporal para recorrer la lista

        while(temp != null) //se hace un while para recorrer la lista
        {
            salida += temp.dato.getNombre();
            salida += ",";
            salida += temp.dato.getCantidad();
            salida += ";";

            temp=temp.getSiguiente();

        }

        return salida;
    }


}
