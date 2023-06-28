package Taller3.Punto1;

/*
 * Punto 1 del taller 3
 *
 * @autores: Juan David ramirez Grismaldo 202067654
 * Santiago garcia gil 202060017
 * jennifer castaño ledesma 202067525
 * monica andrea cifuentes salcedo 202067536
 */


import org.junit.jupiter.api.Test;
import Taller3.Punto1.ListaEnlazada;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class test_listaEnlazada {

    @Test
    void add()
    {
        ListaEnlazada lista = new ListaEnlazada();

        lista.add(5);


        assert lista.head.dato == 5;
        assert lista.head.siguiente == null;

        lista.add(10);
        lista.add(20);

        assert lista.head.siguiente.dato == 10;
        assert lista.head.siguiente.siguiente != null;

        assert lista.head.siguiente.siguiente.dato ==20;
        assert lista.head.siguiente.siguiente.siguiente == null;

    }

    @Test
    void indexar()
    {
        ListaEnlazada lista = new ListaEnlazada();

        lista.add(5);
        lista.add(10);
        lista.add(20);
        lista.add(30);

        assert lista.indexar(0) == 5;
        assert lista.indexar(1) == 10;
        assert lista.indexar(2) == 20;
        assert lista.indexar(3) == 30;
        assertThrows(StackOverflowError.class, () -> lista.indexar(4));
    }

    @Test
    void combinar()
    {
        //ejemplo 1  **********************************************************************************

        ListaEnlazada lista1 = new ListaEnlazada();
        ListaEnlazada lista2 = new ListaEnlazada();

        lista1.add(3);
        lista1.add(7);
        lista1.add(9);


        lista2.add(1);
        lista2.add(3);
        lista2.add(8);


        ListaEnlazada listaCom1 = lista1.combinar(lista1, lista2);

        assert listaCom1.head.dato == 1;
        assert listaCom1.head.siguiente.dato == 3;
        assert listaCom1.head.siguiente.siguiente.dato == 3;
        assert listaCom1.head.siguiente.siguiente.siguiente.dato == 7;
        assert listaCom1.head.siguiente.siguiente.siguiente.siguiente.dato == 8;
        assert listaCom1.head.siguiente.siguiente.siguiente.siguiente.siguiente.dato == 9;
        assert listaCom1.head.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente == null;



        //ejemplo 2  ********************************************************************************

        ListaEnlazada lista3 = new ListaEnlazada();
        ListaEnlazada lista4 = new ListaEnlazada();

        lista3.add(1);
        lista3.add(3);
        lista3.add(10);
        lista3.add(23);


        lista4.add(3);
        lista4.add(3);
        lista4.add(11);
        lista4.add(25);


        ListaEnlazada listaCom2 = lista1.combinar(lista3, lista4);

        assert listaCom2.head.dato == 1;
        assert listaCom2.head.siguiente.dato == 3;
        assert listaCom2.head.siguiente.siguiente.dato == 3;
        assert listaCom2.head.siguiente.siguiente.siguiente.dato == 3;
        assert listaCom2.head.siguiente.siguiente.siguiente.siguiente.dato == 10;
        assert listaCom2.head.siguiente.siguiente.siguiente.siguiente.siguiente.dato == 11;
        assert listaCom2.head.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.dato == 23;
        assert listaCom2.head.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.dato == 25;
        assert listaCom2.head.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente == null;



        //ejemplo 3  ***************************************************************************************


        ListaEnlazada lista5 = new ListaEnlazada();
        ListaEnlazada lista6 = new ListaEnlazada();

        lista5.add(0);
        lista5.add(1);
        lista5.add(8);

        lista6.add(0);
        lista6.add(3);
        lista6.add(8);


        ListaEnlazada listaCom3 = lista1.combinar(lista5, lista6);
        assert listaCom3.head.dato == 0;
        assert listaCom3.head.siguiente.dato == 0;
        assert listaCom3.head.siguiente.siguiente.dato == 1;
        assert listaCom3.head.siguiente.siguiente.siguiente.dato == 3;
        assert listaCom3.head.siguiente.siguiente.siguiente.siguiente.dato == 8;
        assert listaCom3.head.siguiente.siguiente.siguiente.siguiente.siguiente.dato == 8;
        assert listaCom3.head.siguiente.siguiente.siguiente.siguiente.siguiente.siguiente == null;
    }

}