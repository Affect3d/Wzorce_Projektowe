/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication85;
/**
 *
 * @author Student
 */
public class JavaApplication85 {
    
    public interface IMyList<T>{
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
        
        @Override
        public T remove(int index) {return null;}

        @Override
        public void add(T element) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void add(int index, T element) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void clear() {
            T[] tab = (T[])new Object[0];
            tablica = tab;
        }

        @Override
        public T pop() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    
    public static void main(String[] args) {
    System.out.println("DrugiProgram");
    
    }
    
}
