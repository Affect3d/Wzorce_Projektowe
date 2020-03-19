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

       public MyCustomList()
       {
           tablica=new T[0];
       }
        
        @Override
        public T remove(int index) {
            tablica[index]=0;
        }

        @Override
        public void add(T element) {
            T[] tab = new T[tablica.length+1];
            for (int i=0; i<tablica.length;i++){
                tab[i]=tablica[i];
            }
            tab[tab.length-1]=element;
            tablica = tab1;
        }

        @Override
        public void add(int index, T element) {
            T[] tab = new T[tablica.length+1];
            for (int i=0; i<tablica.length+1;i++){
                if (i==index) {
                    tab[i]=element;
                } else {
                    if(i>index) {
                        tab[i]=tablica[i-1];
                    } else {
                    tab[i]=tablica[i];
                    }
            }
            
            tablica = tab1;
        }

        @Override
        public void clear() {
            T[] tab = (T[]) new Object[0];
            tablica = tab;
        }

        @Override
        public T pop() {
            T popped = tablica[tablica.length - 1];
            T[] tab1 = new T[tablica.length-1];
            for (int i=0; i<tablica.length-1;i++){
                tab1[i]=tablica[i];
            }
            tablica = tab1;
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
