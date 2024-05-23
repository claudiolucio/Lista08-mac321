package br.usp.ime.mac321.lista08.ex3;

import java.util.*;

class MulticonjuntoStack<T> {
    private Stack<T> elements;

    public MulticonjuntoStack() {
        elements = new Stack<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public boolean equals(MulticonjuntoStack<T> m) {
        return elements.equals(m.elements);
    }

    public void addAll(MulticonjuntoStack<T> m) {
        elements.addAll(m.elements);
    }
    
	public int size() {
		return elements.size();
	}
}
