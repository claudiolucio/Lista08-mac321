package br.usp.ime.mac321.lista08.ex3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MulticonjuntoArrayListTest {
    @Test
    void testAdd() {
        MulticonjuntoArrayList<Integer> multiconjunto = new MulticonjuntoArrayList<>();
        multiconjunto.add(1);
        multiconjunto.add(2);
        multiconjunto.add(3);

        assertEquals(3, multiconjunto.size());
    }

    @Test
    void testEquals() {
        MulticonjuntoArrayList<Integer> multiconjunto1 = new MulticonjuntoArrayList<>();
        multiconjunto1.add(1);
        multiconjunto1.add(2);
        multiconjunto1.add(3);

        MulticonjuntoArrayList<Integer> multiconjunto2 = new MulticonjuntoArrayList<>();
        multiconjunto2.add(1);
        multiconjunto2.add(2);
        multiconjunto2.add(3);

        assertTrue(multiconjunto1.equals(multiconjunto2));
    }

    @Test
    void testAddAll() {
        MulticonjuntoArrayList<Integer> multiconjunto1 = new MulticonjuntoArrayList<>();
        multiconjunto1.add(1);
        multiconjunto1.add(2);

        MulticonjuntoArrayList<Integer> multiconjunto2 = new MulticonjuntoArrayList<>();
        multiconjunto2.add(3);
        multiconjunto2.add(4);

        multiconjunto1.addAll(multiconjunto2);

        assertEquals(4, multiconjunto1.size());
    }
}

class MulticonjuntoSetTest {
    @Test
    void testAdd() {
        MulticonjuntoSet<String> multiconjunto = new MulticonjuntoSet<>();
        multiconjunto.add("apple");
        multiconjunto.add("banana");
        multiconjunto.add("orange");

        assertEquals(3, multiconjunto.size());
    }

    @Test
    void testEquals() {
        MulticonjuntoSet<String> multiconjunto1 = new MulticonjuntoSet<>();
        multiconjunto1.add("apple");
        multiconjunto1.add("banana");
        multiconjunto1.add("orange");

        MulticonjuntoSet<String> multiconjunto2 = new MulticonjuntoSet<>();
        multiconjunto2.add("apple");
        multiconjunto2.add("banana");
        multiconjunto2.add("orange");

        assertTrue(multiconjunto1.equals(multiconjunto2));
    }

    @Test
    void testAddAll() {
        MulticonjuntoSet<String> multiconjunto1 = new MulticonjuntoSet<>();
        multiconjunto1.add("apple");
        multiconjunto1.add("banana");

        MulticonjuntoSet<String> multiconjunto2 = new MulticonjuntoSet<>();
        multiconjunto2.add("orange");
        multiconjunto2.add("grape");

        multiconjunto1.addAll(multiconjunto2);

        assertEquals(4, multiconjunto1.size());
    }
}

class MulticonjuntoLinkedListTest {
    @Test
    void testAdd() {
        MulticonjuntoLinkedList<Character> multiconjunto = new MulticonjuntoLinkedList<>();
        multiconjunto.add('a');
        multiconjunto.add('b');
        multiconjunto.add('c');

        assertEquals(3, multiconjunto.size());
    }

    @Test
    void testEquals() {
        MulticonjuntoLinkedList<Character> multiconjunto1 = new MulticonjuntoLinkedList<>();
        multiconjunto1.add('a');
        multiconjunto1.add('b');
        multiconjunto1.add('c');

        MulticonjuntoLinkedList<Character> multiconjunto2 = new MulticonjuntoLinkedList<>();
        multiconjunto2.add('a');
        multiconjunto2.add('b');
        multiconjunto2.add('c');

        assertTrue(multiconjunto1.equals(multiconjunto2));
    }

    @Test
    void testAddAll() {
        MulticonjuntoLinkedList<Character> multiconjunto1 = new MulticonjuntoLinkedList<>();
        multiconjunto1.add('a');
        multiconjunto1.add('b');

        MulticonjuntoLinkedList<Character> multiconjunto2 = new MulticonjuntoLinkedList<>();
        multiconjunto2.add('c');
        multiconjunto2.add('d');

        multiconjunto1.addAll(multiconjunto2);

        assertEquals(4, multiconjunto1.size());
    }
}

class MulticonjuntoStackTest {
    @Test
    void testAdd() {
        MulticonjuntoStack<Integer> multiconjunto = new MulticonjuntoStack<>();
        multiconjunto.add(1);
        multiconjunto.add(2);
        multiconjunto.add(3);

        assertEquals(3, multiconjunto.size());
    }

    @Test
    void testEquals() {
        MulticonjuntoStack<Integer> multiconjunto1 = new MulticonjuntoStack<>();
        multiconjunto1.add(1);
        multiconjunto1.add(2);
        multiconjunto1.add(3);

        MulticonjuntoStack<Integer> multiconjunto2 = new MulticonjuntoStack<>();
        multiconjunto2.add(1);
        multiconjunto2.add(2);
        multiconjunto2.add(3);

        assertTrue(multiconjunto1.equals(multiconjunto2));
    }

    @Test
    void testAddAll() {
        MulticonjuntoStack<Integer> multiconjunto1 = new MulticonjuntoStack<>();
        multiconjunto1.add(1);
        multiconjunto1.add(2);

        MulticonjuntoStack<Integer> multiconjunto2 = new MulticonjuntoStack<>();
        multiconjunto2.add(3);
        multiconjunto2.add(4);

        multiconjunto1.addAll(multiconjunto2);

        assertEquals(4, multiconjunto1.size());
    }
}