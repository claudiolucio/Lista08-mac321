package br.usp.ime.mac321.lista08.ex3;

import java.util.*;

class MulticonjuntoArrayList<T> {
    private List<T> elements;

    public MulticonjuntoArrayList() {
        elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(MulticonjuntoArrayList<T> m) {
        return elements.equals(m.elements);
    }

    public void addAll(MulticonjuntoArrayList<T> m) {
        elements.addAll(m.elements);
    }
    
    public int size() {
        return elements.size();
    }
}