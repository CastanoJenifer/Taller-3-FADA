package Taller3.Punto3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class test_Cola {

    @Test
    void enqueue() {
        Cola cola1 = new Cola(8);
        cola1.enqueue(5);
        cola1.enqueue(10);
        cola1.enqueue(15);
        cola1.enqueue(20);
        cola1.enqueue(25);
        cola1.enqueue(30);
        cola1.enqueue(35);
        cola1.enqueue(40);

        assert cola1.getCola()[0]== 5;
        assert cola1.getCola()[1]== 10;
        assert cola1.getCola()[2]== 15;
        assert cola1.getCola()[3]== 20;
        assert cola1.getCola()[4]== 25;
        assert cola1.getCola()[5]== 30;
        assert cola1.getCola()[6]== 35;
        assert cola1.getCola()[7]== 40;


        assert cola1.dequeue() == 5;
        assert cola1.dequeue() == 10;
        assert cola1.getHead() == 3;
        assert cola1.getCola()[(cola1.getHead()-1)] == 15;



    }

    @Test
    void dequeue() {
    }
}