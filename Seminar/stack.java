package Seminar;

public class stack<E> {
    private E[] mass;

    public stack(int i) {
        mass = (E[]) new Object[i];
    }

    public Integer size() {
        int count = 0;
        for (E e : mass) {
            if (e != null) {
                count++;
            }
        }
        return count;
    }

    public boolean empty() {
        Boolean flag = true;
        if (mass[0] != null) {
            flag = false;
        }
        return flag;
    }

    public void push(E e){
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == null) {
                mass[i] = e;
                return;
            }
            
        }
    }

    public E peek(){
        return mass[this.size() - 1];
    }

    public E pop(){
        E elem = mass[this.size() - 1];
        mass[this.size()-1] = null;
        return elem;

    }

}
