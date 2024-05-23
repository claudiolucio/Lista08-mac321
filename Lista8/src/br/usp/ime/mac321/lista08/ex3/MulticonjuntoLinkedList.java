package br.usp.ime.mac321.lista08.ex3;

import java.util.*;

class MulticonjuntoLinkedList<T> {
    private LinkedList<T> elements;

    public MulticonjuntoLinkedList() {
        elements = new LinkedList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(MulticonjuntoLinkedList<T> m) {
        return elements.equals(m.elements);
    }

    public void addAll(MulticonjuntoLinkedList<T> m) {
        elements.addAll(m.elements);
    }
    
    public int size() {
        return elements.size();
    }
}
