package Taller3.Punto3;
/*
 Punto 3

 Author
    * Juan David Ramirez Grismaldo 202067654-3743
    * Santiago Garcia Gil 202060017
    * Jennifer Castaño Ledesma 202067525
    * Monica Andrea Cifuentes 202067536

 * */

public class PilaConColas
{
    public Cola c;

    public boolean estaVaciaPilaConColas() // Método que indica si la pila esta vacia o no
    {
        if (c.size == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    // Se hace el metodo que Añade el elemento como si fuera una cola  correctamente manteniendo el orden LIFO
    public void pushPilaConColas(Object o)
    {
        Cola c2 = new Cola(c.tamMax);//se declara la cola
        c2.enqueue((int) o);//se inicializa la variable de encolar para que se haga como pila
        int i = c.head; // indice  con la cabeza
        while(i != c.tail) // Si la cola es diferente a la cabeza
        {
            c2.enqueue(c.cola[i - 1]); //Se llama al método encolar restandole 1 a la cabeza
            i = (i >= c.tamMax) ? 1 : i + 1;
        }
        c = c2;
    }

    public int popPilaConColas() // Método que borra el último en entrar de la pila
    {
        int numero = c.dequeue(); // Se borra el último en entrar con la función dequeue
        return numero; // Se retorna el número que se ha borrado
    }


    public String mostrarPilaConCola() // Método que muestra todos los elementos de la pila
    {
        String mostrar = ""; // Variable en que se van a guardar los elementos
        int i = c.getHead() - 1; // inicio
        while(i != c.getTail() - 1) // Si la cabeza y cola no son iguales itera
        {
            mostrar += c.cola[i]; // Se añade el elemento
            mostrar += ",";
            i += 1;
        }
        mostrar = mostrar.substring(0, mostrar.length() - 1); //quita la última coma
        return mostrar; // se retorna el elemento
    }

    public Cola getC()
    {
        return c;
    }

    public void setC(Cola c)
    {
        this.c = c;
    }

}


