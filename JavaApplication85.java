/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorce_proj;

/**
 *
 * @author kuber
 */
public class Main {

    public interface IMyList<T> {

        public void add(T element);

        public void add(int index, T element);

        public void clear();

        public T pop();

        public T get(int index);

        public int size();

        T remove(int index);
    }

    public class MyCustomList<T> implements IMyList<T> {

        private T[] tablica;

//        public MyCustomList()
//        {
//            T[] tablica;
//        }
        @Override
        public T remove(int index) {
            return null;
        }

        @Override
        public void add(T element) {
            tablica[tablica.length] = element;
        }

        @Override
        public void add(int index, T element) {
            tablica[index] = element;
        }

        @Override
        public void clear() {
            T[] tab = (T[]) new Object[0];
            tablica = tab;
        }

        @Override
        public T pop() {
            T popped = tablica[tablica.length - 1];
            tablica[tablica.length - 1] = null;
            return popped;
        }

        @Override
        public T get(int index) {
            return tablica[index];
        }

        @Override
        public int size() {
            return tablica.length;
        }
    }

    public void main(String[] args) {
        // TODO code application logic here
        System.out.println("Help I've Mc'fallen");
        MyCustomList<> tablica = new MyCustomList<>();
    }

}
