package Taller3.Punto2;

/*
 Punto 2
 Author
    * Juan David Ramirez Grismaldo 202067654-3743
    * Santiago Garcia Gil 202060017
    * Jennifer Castaño Ledesma 202067525
    * Monica Andrea Cifuentes 202067536

 * */


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class test_ListaEnlazadaMuseo
{

    @Test
    void agregarReplica()
    {
        //se hacen la pruebas para verificar que agregar replica funcione correctamente
        ListaEnlazadaMuseo lista = new ListaEnlazadaMuseo();
        lista.agregarReplica("Mona Lisa");
        lista.agregarReplica("La noche estrellada");
        lista.agregarReplica("La noche estrellada");
    }

    @Test
    void venderReplica()
    {
        // se hacen las pruebas para verificar que vender replica funcione correctamente
        ListaEnlazadaMuseo lista = new ListaEnlazadaMuseo();
        lista.venderReplica("Mona Lisa");
        lista.venderReplica("La noche estrellada");
    }

    @Test
    void listarReplicas()
    {
        //se hacen las pruebas para verificar que listar replica funcione correctamente

        //ejemplo 1 **************************************************************************************
        ListaEnlazadaMuseo lista = new ListaEnlazadaMuseo();

        lista.agregarReplica("El hombre de Vitruvio");
        lista.agregarReplica("gioonda");
        lista.agregarReplica("gioonda");
        lista.agregarReplica("gioonda");
        lista.agregarReplica("persistencia de la memoria");
        lista.agregarReplica("persistencia de la memoria");
        lista.agregarReplica("persistencia de la memoria");
        lista.agregarReplica("persistencia de la memoria");
        lista.agregarReplica("persistencia de la memoria");

        lista.venderReplica("gioonda");

        //se comprueba que la lista se haya creado correctamente
        assert lista.head.dato.getNombre().equals("El hombre de Vitruvio");
        assert lista.head.dato.getCantidad()==1;
        assert lista.head.getSiguiente().dato.getNombre().equals("gioonda");
        assert lista.head.getSiguiente().dato.getCantidad()==2;
        assert lista.head.getSiguiente().getSiguiente().dato.getNombre().equals("persistencia de la memoria");
        assert lista.head.getSiguiente().getSiguiente().dato.getCantidad()==5;


        // Test para la funcion listar replicas
        assert lista.listarReplicas().equals("El hombre de Vitruvio,1;gioonda,2;persistencia de la memoria,5;");





        //ejemplo 2 *************************************************************************************************
        ListaEnlazadaMuseo lista2 = new ListaEnlazadaMuseo();

        lista2.agregarReplica("fada");
        lista2.agregarReplica("fada");
        lista2.agregarReplica("fada");
        lista2.agregarReplica("sistemas operativos");
        lista2.agregarReplica("sistemas operativos");
        lista2.agregarReplica("sistemas operativos");
        lista2.agregarReplica("sistemas operativos");
        lista2.agregarReplica("probabilidad");
        lista2.agregarReplica("hola");



        lista2.venderReplica("fada");
        lista2.venderReplica("fada");
        lista2.venderReplica("probabilidad");



        assert lista2.head.dato.getNombre().equals("fada");
        assert lista2.head.dato.getCantidad()==1;
        assert lista2.head.getSiguiente().dato.getNombre().equals("sistemas operativos");
        assert lista2.head.getSiguiente().dato.getCantidad()==4;
        assert lista2.head.getSiguiente().getSiguiente().dato.getNombre().equals("hola");
        assert lista2.head.getSiguiente().getSiguiente().dato.getCantidad()==1;

        // Test para la funcion listar replicas
        assert lista2.listarReplicas().equals("fada,1;sistemas operativos,4;hola,1;");




        //ejemplo 3 **************************************************************************************

        ListaEnlazadaMuseo lista3 = new ListaEnlazadaMuseo();

        lista3.agregarReplica("chelsea");
        lista3.agregarReplica("chelsea");
        lista3.agregarReplica("chelsea");
        lista3.agregarReplica("chelsea");
        lista3.agregarReplica("arsenal");
        lista3.agregarReplica("arsenal");
        lista3.agregarReplica("arsenal");
        lista3.agregarReplica("arsenal");
        lista3.agregarReplica("arsenal");
        lista3.agregarReplica("arsenal");


        lista3.venderReplica("chelsea");
        lista3.venderReplica("arsenal");
        lista3.venderReplica("arsenal");

        assert lista3.head.dato.getNombre().equals("chelsea");
        assert lista3.head.dato.getCantidad()==3;
        assert lista3.head.getSiguiente().dato.getNombre().equals("arsenal");
        assert lista2.head.getSiguiente().dato.getCantidad()==4;


        // Test para la funcion listar replicas
        assert lista3.listarReplicas().equals("chelsea,3;arsenal,4;");
    }
}