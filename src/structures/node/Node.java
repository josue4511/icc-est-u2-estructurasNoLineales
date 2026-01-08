package structures.node;

import java.util.List;

public class Node<T> {

    public T value;
    public Node<T> left;
    public Node<T> right;

    // Nodo guarde listado de conocidos
    private List<Node<T>> conocidos;

    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.conocidos = null;
    }

    public T getValue() {
        return value;
    }
    
}