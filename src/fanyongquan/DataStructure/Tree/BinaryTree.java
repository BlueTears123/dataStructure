package fanyongquan.DataStructure.Tree;

import java.rmi.server.ServerNotActiveException;
import java.util.Collection;
import java.util.List;

public class BinaryTree<T> {
    public TNode<T> head;


    public class TNode<T> {
        T value;
        private TNode<T> left;
        private TNode<T> right;

        public TNode(T value, TNode<T> left, TNode<T> right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public BinaryTree(T value) {
        this.head = new TNode<T>(value, null, null);
    }
}
