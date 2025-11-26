package practicaPSPR;

import java.util.ArrayList;

public class Cliente extends Thread {

    private ArrayList<Integer> barra;
    private int iteraciones;
    private int idCliente;

    public Cliente(ArrayList<Integer> barra, int iteraciones, int idCliente) {
        this.barra = barra;
        this.iteraciones = iteraciones;
        this.idCliente = idCliente;
    }

    public void run() {
        for (int i = 1; i <= iteraciones; i++) {
            if (!barra.isEmpty()) {
                int num = barra.remove(0);
                System.out.println("Cliente " + idCliente + " bebió el culin " + num);
            }
            try {
                Thread.sleep((int)(Math.random() * 250));
            } catch (InterruptedException e) {}
        }
    }
}

