package enzo.atelier6.exercice1;

import java.util.EmptyStackException;
    public class ConcreteStackArrayV2 implements AStackV2 {
        private Object tab[];
        private int indice_pile = 0;

        public ConcreteStackArrayV2(int taille_tab){
            tab = new Object[taille_tab];
        }

        @Override
        public String toString(){
            String result = "";
            if(!isEmpty()) {
                for (Object i : this.tab) {
                    if (i != null) {
                        result += (i + "|");
                    }
                }
            }
            else{
                result = "Pile vide";
            }
            return result;
        }

        @Override
        public boolean isEmpty() {

            return(this.indice_pile == 0);

        }

        @Override
        public void push(Object o) throws FullStackException{
            if(indice_pile>=tab.length) throw new FullStackException("Pile pleine");
            else{
                tab[indice_pile] = o;
                indice_pile++;
            }
        }

        @Override
        public Object peek(){
            Object result = null;
            if(isEmpty()) throw new EmptyStackException();
            else{
                result = tab[indice_pile-1];
                return result;
            }
        }

        @Override
        public Object pop(){
            Object result = null;
            if (isEmpty()) throw new EmptyStackException();
            else {
                indice_pile--;
                result = tab[indice_pile];
                tab[indice_pile] = null;
                return result;
            }
        }
    }
