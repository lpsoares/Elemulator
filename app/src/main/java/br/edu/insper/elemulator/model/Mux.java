package br.edu.insper.elemulator.model;

public class Mux {
    public boolean[] execute (boolean[] a, boolean[] b, boolean load) {
        if(load) {
            return a;
        }

        else {
            return b;
        }
    }
}
