package Taller3.Punto3;

/*
 Punto 3

 Author
    * Juan David Ramirez Grismaldo 202067654-3743
    * Santiago Garcia Gil 202060017
    * Jennifer Castaño Ledesma 202067525
    * Monica Andrea Cifuentes 202067536

 * */
public class Cola
{
    int head;
    int tail;
    int tamMax;
    int size;
    int cola[];

    Cola(int n)
    {
        this.head = 1;
        this.size = 0;
        this.tamMax = n;
        this.tail = 1;
        this.cola = new int[n];
    }

    public void enqueue(int n) throws IndexOutOfBoundsException
    {
        if(this.tamMax == size)
        {
            throw new IndexOutOfBoundsException();
        }
        else
        {
            this.size++;
            cola[this.tail - 1] = n;
            this.tail = (this.tail>=this.tamMax) ? 1 : this.tail + 1;

        }
    }


    public int dequeue() throws IndexOutOfBoundsException
    {
        if (this.size == 0){
            throw new IndexOutOfBoundsException();
        }
        else{
            this.size--;
            int val = cola[this.head - 1];
            this.head = (this.head>=this.tamMax) ? 1 : this.head + 1;
            return val;
        }
    }


    public int getHead()
    {
        return head;
    }

    public void setHead(int head)
    {
        this.head = head;
    }

    public int getTail()
    {
        return tail;
    }

    public void setTail(int tail)
    {
        this.tail = tail;
    }

    public int getTamMax()
    {
        return tamMax;
    }

    public void setTamMax(int tamMax)
    {
        this.tamMax = tamMax;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public int[] getCola()
    {
        return cola;
    }

    public void setCola(int[] cola)
    {
        this.cola = cola;
    }

}
