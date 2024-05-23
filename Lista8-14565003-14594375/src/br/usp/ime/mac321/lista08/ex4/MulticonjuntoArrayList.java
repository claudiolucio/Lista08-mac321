package br.usp.ime.mac321.lista08.ex4;

import java.util.*;
import java.util.Iterator;

class MulticonjuntoArrayList<T> {
    List<T> elements;

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
    
    public Iterator<T> iterator() {
        return elements.iterator();
    }

}