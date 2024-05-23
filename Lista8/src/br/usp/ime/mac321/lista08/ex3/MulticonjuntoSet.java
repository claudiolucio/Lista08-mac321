package br.usp.ime.mac321.lista08.ex3;

import java.util.*;

class MulticonjuntoSet<T> {
    private Set<T> elements;

    public MulticonjuntoSet() {
        elements = new HashSet<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(MulticonjuntoSet<T> m) {
        return elements.equals(m.elements);
    }

    public void addAll(MulticonjuntoSet<T> m) {
        elements.addAll(m.elements);
    }
    
    public int size() {
        return elements.size();
    }
}