package Taller3.Punto3;

/*
 Punto 3

 Author
    * Juan David Ramirez Grismaldo 202067654-3743
    * Santiago Garcia Gil 202060017
    * Jennifer Castaño Ledesma 202067525
    * Monica Andrea Cifuentes 202067536

 * */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class test_PilaConColas
{


    @Test
    void pushPilaConColas()
    {

        // Ejemplo 1 ------------------------------------------------------------------------------------
        PilaConColas Cola = new PilaConColas();
        Cola.c = new Cola(6);

        assert Cola.estaVaciaPilaConColas() == true;


        Cola.pushPilaConColas(70);
        Cola.pushPilaConColas(1);
        Cola.pushPilaConColas(2);
        Cola.pushPilaConColas(15);
        Cola.pushPilaConColas(34);

        assert Cola.estaVaciaPilaConColas() == false;

        assert (Cola.c.cola[0] == 34);
        assert (Cola.c.cola[1] == 15);
        assert (Cola.c.cola[2] == 2);
        assert (Cola.c.cola[3] == 1);
        assert (Cola.c.cola[4] == 70);

        Cola.popPilaConColas();

        assert (Cola.c.cola[1] == 15);
        assert (Cola.c.cola[2] == 2);
        assert (Cola.c.cola[3] == 1);
        assert (Cola.c.cola[4] == 70);

        assert Cola.mostrarPilaConCola().equals("15,2,1,70");

    }



    @Test
    void popPilaConColas()
    {
        //Ejemplo 2 ------------------------------------------------------------------------------------
        PilaConColas Cola = new PilaConColas();
        Cola.c = new Cola(6);

        assert Cola.estaVaciaPilaConColas() == true;

        Cola.pushPilaConColas(70);
        Cola.pushPilaConColas(1);
        Cola.pushPilaConColas(2);
        Cola.pushPilaConColas(15);
        Cola.pushPilaConColas(34);

        assert Cola.mostrarPilaConCola().equals("34,15,2,1,70");
        assert Cola.estaVaciaPilaConColas() == false;
        Cola.popPilaConColas();
        Cola.popPilaConColas();

        Cola.pushPilaConColas(10);


        assert (Cola.c.cola[0] == 10);
        assert (Cola.c.cola[1] == 2);
        assert (Cola.c.cola[2] == 1);
        assert (Cola.c.cola[3] == 70);

        assert Cola.mostrarPilaConCola().equals("10,2,1,70");

    }



    @Test
    void mostrarPilaConColas()
    {
        // Ejemplo 3 -------------------------------------------------------------------------------------
        PilaConColas Cola = new PilaConColas();
        Cola.c = new Cola(10);
        Cola.pushPilaConColas(435);
        Cola.pushPilaConColas(723);
        Cola.pushPilaConColas(72340);
        Cola.pushPilaConColas(721230);
        Cola.pushPilaConColas(5668);

        Cola.popPilaConColas();
        Cola.popPilaConColas();
        Cola.popPilaConColas();
        Cola.popPilaConColas();
        Cola.popPilaConColas();

        assert Cola.estaVaciaPilaConColas() == true;


        Cola.pushPilaConColas(1);
        Cola.pushPilaConColas(2);
        Cola.pushPilaConColas(3);
        Cola.pushPilaConColas(4);
        Cola.pushPilaConColas(5);

        assert Cola.estaVaciaPilaConColas() == false;
        assert Cola.mostrarPilaConCola().equals("5,4,3,2,1");
    }


}