package practicaPSPR;

import java.util.ArrayList;

public class Camarero extends Thread {

    private ArrayList<Integer> barra;
    private int iteraciones;

    public Camarero(ArrayList<Integer> barra, int iteraciones) {
        this.barra = barra;
        this.iteraciones = iteraciones;
    }

    public void run() {
        for (int i = 1; i <= iteraciones; i++) {
            barra.add(i);
            System.out.println("Culin de sidra número " + i + " servido");
            try {
                Thread.sleep((int)(Math.random() * 300));
            } catch (InterruptedException e) {}
        }
    }
}

