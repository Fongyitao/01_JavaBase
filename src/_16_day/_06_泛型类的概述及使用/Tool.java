package _16_day._06_泛型类的概述及使用;

public class Tool<E> {          //泛型类
    private E e;

    public Tool(){}
    public Tool(E e) {
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E d) {
        this.e = e;
    }
    public void show(E e){
        System.out.println(e);
    }
    public<T> void sayHi(T t){  //泛型方法
        System.out.println(t);
    }
}
