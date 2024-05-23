package br.usp.ime.mac321.lista08.ex4;
import java.util.*;

public class MulticonjuntoAdapter<T> implements Set<T> {
    private MulticonjuntoArrayList<T> multiconjunto;

    public MulticonjuntoAdapter(MulticonjuntoArrayList<T> multiconjunto) {
        this.multiconjunto = multiconjunto;
    }

    @Override
    public int size() {
        Set<T> uniqueElements = new HashSet<>(multiconjunto.elements);
        return uniqueElements.size();
    }

    @Override
    public boolean isEmpty() {
        return multiconjunto.elements.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return multiconjunto.elements.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return new MulticonjuntoIterator();
    }

    @Override
    public Object[] toArray() {
        return multiconjunto.elements.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return multiconjunto.elements.toArray(a);
    }

    @Override
    public boolean add(T t) {
        return multiconjunto.elements.add(t);
    }

    @Override
    public boolean remove(Object o) {
        return multiconjunto.elements.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return multiconjunto.elements.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return multiconjunto.elements.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return multiconjunto.elements.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return multiconjunto.elements.removeAll(c);
    }

    @Override
    public void clear() {
        multiconjunto.elements.clear();
    }

    private class MulticonjuntoIterator implements Iterator<T> {
        private Iterator<T> iterator = multiconjunto.iterator();
        private Set<T> uniqueElements = new HashSet<>(multiconjunto.elements);
        private Iterator<T> uniqueIterator = uniqueElements.iterator();

        @Override
        public boolean hasNext() {
            return uniqueIterator.hasNext();
        }

        @Override
        public T next() {
            return uniqueIterator.next();
        }

        @Override
        public void remove() {
            iterator.remove();
            uniqueIterator.remove();
        }
    }
}
