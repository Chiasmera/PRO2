package Opgave2;

public class DictionaryLinked<K, V> implements Dictionary<K, V> {

    private Node start;
    private int size;

    /**
     * HashingMap constructor comment.
     */

    public DictionaryLinked() {
        // Sentinel (tomt listehoved - der ikke indeholder data)
        start = new Node();
        size = 0;
    }

    /**
     * Returnerer elementet hoerende til noeglen k, hvis noeglen ikke findes
     * returneres null
     *
     * @param key noeglen elementet skal findes til
     * @return objektet med noegle key
     */
    @Override
    public V get(K key) {
        Node currentNode = start;
        boolean found = false;
        V result = null;
        while (!found && currentNode.next != null) {
            if (currentNode.next.key.equals(key)) {
                found = true;
            } else {
                currentNode = currentNode.next;
            }
        }

        if (found) {
            result = currentNode.next.value;
        }
        return result;
    }

    /**
     * Returnerer om dictionary er tom
     *
     * @return om map'en er tom
     */
    @Override
    public boolean isEmpty() {

        return size == 0;
    }

    /**
     * Indsætter objektet value med nøgle key I dictionary. Hvis key allerede
     * eksisterer overskrives value hoerende til key vaerdi og den gamle value
     * returneres. Hvis key ikke er der returneres null. Hverken key eller value
     * maa vaere null
     *
     * @param key   noeglen objektet skal indsaettes med
     * @param value objektet der skal indsaettes
     * @return
     */
    @Override
    public V put(K key, V value) {
        Node currentNode = start;
        boolean found = false;

        while (currentNode.next != null && !found) {
            if (currentNode.next.key.equals(key)) {
                found = true;
            } else {
                currentNode = currentNode.next;
            }
        }

        V result = null;

        if (found) {
            result = currentNode.next.value;
            currentNode.next.value = value;
        } else {
            Node newNode = new Node();
            newNode.key = key;
            newNode.value = value;
            currentNode.next = newNode;
            size++;
        }

        return result;
    }

    /**
     * Fjerner (noegle, vaerdi)- parret med noeglen key fra dictionary'en og
     * value returneres.
     *
     * @param key noeglen der med tilhoerende objekt skal fjernes
     * @return objektet hoerende til noeglen key; null hvis key ikke findes
     */
    @Override
    public V remove(K key) {
        V result = null;
        boolean found = false;
        Node currentNode = start;
        while (currentNode.next != null && !found) {
            if (currentNode.next.key.equals(key)) {
                found = true;
            } else {
                currentNode = currentNode.next;
            }
        }

        if (found) {
            Node removedNode = currentNode.next;
            currentNode.next = removedNode.next;
            result = removedNode.value;
            removedNode.key = null;
            removedNode.value = null;
            size--;
        }

        return result;
    }

    @Override
    public int size() {

        return size;
    }

    private class Node {
        Node next;
        K key;
        V value;
    }

}
