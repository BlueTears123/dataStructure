package fanyongquan.DataStructure.stack;

import fanyongquan.DataStructure.singlelist.SingleLinker;

public class Stack<T> {

    // 用单链表存在栈的数据
    SingleLinker<T> linker = new SingleLinker<T>();
    // 入栈操作
    public void push(T value) {
        // 在链表头部插入新节点
        linker.insert(-1, value);
    }
    // 出栈
    public T pop() {
        SingleLinker<T>.SNode<T> cur = linker.delete(0);
        return cur.getValue() ;
    }

    public boolean isEmpty(){
        if (linker.length() == 0)
            return true;
        return false;
    }
    // 出栈
    public void peek() {

    }

    // 传入字符串，判断字符串中括号是否匹配
    public static boolean ckeckValid(String str) {
        return  false;
    }

/*
    public static void main(String args[]) {
//        SingleLinker<String> linker = new  SingleLinker<String>();
//        linker.add("1");
//        linker.add("2");
//        linker.add("3");
//        linker.add("4");
//
//
//        Stack<SingleLinker<String>.SNode<String>> stack1
//                = new Stack<SingleLinker<String>.SNode<String>>();
//        while (linker.length() != 0) {
//            stack1.push(linker.delete(0));
//        }
//        System.out.println(stack1.pop().getValue());

        Stack<String> stack = new Stack<String>();
        stack.push("hello workd");
        stack.push("你好");
        stack.push("1");
        stack.push("2");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
    */
}
