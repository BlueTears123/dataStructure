package fanyongquan.DataStructure.singlelist;

public class SingleLinker<T> {

    // 第一链表的头
    SNode<T> head = null;
    private int size =0;
    // 描述链表中的某个节点
    public class SNode<T> {
        private T value;
        private  SNode<T> next;
        SNode(T value, SNode<T> next){
            this.value = value;
            this.next = next;
        }
        public T getValue() {
            return this.value;
        }

    }
    // 初始化方法
    public SingleLinker(){
        this.head = new SNode<T>(null, null);
    }

    // 如何index ==0
    public SNode<T> delete(int index) {
        // index必须大于0 且小于长度-1；
        if(index <0 || index >= size) {
            throw  new RuntimeException("越界了");
        }
        // 找到当前节点的上一个节点index-1
        SNode<T> curNode = this.getNode(index);
        SNode<T> preNode = this.getNode(index-1);
        SNode<T> nextNode  = this.getNode(index+1);
        // 上一个节点的next = 下一个节点
        preNode.next = nextNode;
        size--;
        return curNode;
    }
    // 根据索引找到某个节点
    private SNode<T> getNode(int index) {

        SNode<T> startNode = this.head;
        //
        int iCount=0; //表示循环的此时
        while(iCount != index+1) {
            startNode = startNode.next;
            iCount++;
        }

        return startNode;
    }
    // 添加数据操作
    public void add(T value) {
        SNode<T> newNode = new SNode<T>(value, null);
        // 这个变量表示尾节点
        SNode<T> tailNode = null;
        SNode<T> startNode = this.head;
        while (startNode.next != null) {
            startNode = startNode.next;
        }
        tailNode = startNode;
        tailNode.next = newNode;
        size++;
    }

    //public
    // 获取链表的长度
    public int length(){
        return  size;
    }

    // 根据索引找到对应的节点的内容
    public T get(int index) {
        // index必须大于0 且小于长度-1；
        if(index <0 || index >= size) {
            throw  new RuntimeException("越界了");
        }
        return this.getNode(index).value;
    }
    // 实现链表的反转，基于头节点插入法
    public void reserve() {
        // 第一步个构建新链表的头
        // 思考一个问题： 不new一个新的头节点;
        SNode<T> newHead =  new SNode<T>(null, null);
        while (this.head.next != null) {
            // 第二步从原来链表中取出节点
            SNode<T> pickNode =   this.head.next;
            this.head.next = this.head.next.next;

            // 第三步将原来链表中取出的节点插入新链表的头之后
            pickNode.next =newHead.next;
            newHead.next = pickNode;
            // 循环第二步，直到原来链表中的节点全部取出
        }
        this.head = newHead;


//
//        if (this.head.next == null) {
//            return;
//        }
//        do {
//            this.head.next = this.head.next.next;
//            // 第三步将原来链表中取出的节点插入新链表的头之后
//            pickNode.next =newHead.next;
//            newHead.next = pickNode;
//            // 循环第二步，直到原来链表中的节点全部取出
//            i++;
//        }while (this.head.next != null);

    }

    /**
     *
     * 实现根据索引值在单链表中插入数据，-1表示在头节点后面插入数据
     * @param index
     * @param value
     */
    public void insert(int index, T value) {
        SNode<T> cur;
        if (index == -1) {
            cur = this.head;
        }else {
            // 找到index节点 cur
            cur = this.getNode(index);
        }
        SNode<T> newNode = new SNode<T>(value, null);
        // 新节点.next =  index节点的下一个
        newNode.next = cur.next;
        // cur.next = 新节点
        cur.next =  newNode;
        size++;

    }


    // 反转单链表方法二  就地反正
    public void reserve2() {
        // 当前链表为空
        if(this.head.next == null) {
            return;
        }
        // 需要反转的节点
        SNode<T> cur = this.head.next;
        // 反转节点的下一个节点
        SNode<T> next = cur.next;
        // 反转节点的上一个节点
        SNode<T> pre = this.head;
        while(cur.next != null) {
            cur.next = pre;
            pre = cur;
            cur = next;
            // if判断目的用来防止处理最后一个节点的时候报错
//            if (next != null) {
//            }
            next = next.next;
        }
        cur.next = pre;
        this.head.next.next = null;
        this.head.next = cur;

    }


    public static void main(String[] args) {
        SingleLinker<String> linker = new SingleLinker<String>();

        linker.add("1");
        linker.add("2");
        linker.add("3");

        System.out.println("反转之前:");

        for (int i=0; i<linker.length(); i++) {
            System.out.println(linker.get(i));
        }

        linker.reserve2();

        System.out.println("反转之后:");

        for (int i=0; i<linker.length(); i++) {
//            linker.delete(i);
            System.out.println(linker.get(i));
        }
    }
}

//
//class SNode<T> {
//    private T value;
//    private SingleLinker.SNode<T> next;
//    SNode(T value, SingleLinker.SNode<T> next){
//        this.value = value;
//        this.next = next;
//    }
//}
//
//
//SNode<String> a = new SNode<String>();
//SNode<A> b = new SNode<A>();
//
//a.t = "adsafasdfasdfasdfasd"
//b.t = 1;
//SNode<String> a = new SNode<String>();
//a.value = "1";
//
//SNode<String> b = new SNode<String>();
//b.value = "2";
//a.next =b;
//
//a.next.value
//mv
//
//int i =10;
//
//int j =i;
//class A {
//    int i;
//}
//new A()





//通过a如何访问b
//b.next



