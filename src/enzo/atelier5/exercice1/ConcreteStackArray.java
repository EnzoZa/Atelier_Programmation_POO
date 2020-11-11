    package enzo.atelier5.exercice1;

    public class ConcreteStackArray implements AStack{
        private Object tab[];
        private int indice_pile = 0;

        public ConcreteStackArray(int taille_tab){
            tab = new Object[taille_tab];
        }

        public void printTab(){
            if(!isEmpty()) {
                for (Object i : this.tab) {
                    if (i != null) {
                        System.out.println(i);
                    }
                }
            }
            else{
                System.err.println("Pile vide");
            }
        }

        @Override
        public boolean isEmpty() {
            return(this.indice_pile == 0);
        }

        @Override
        public void push(Object o) {
            if(indice_pile<tab.length) {
                tab[indice_pile] = o;
                indice_pile++;
            }
            else{
                System.err.println("Pile complet");
            }
        }

        @Override
        public Object peek() {
            Object result = null;
            if(indice_pile != 0){
                result = tab[indice_pile-1];
            }
            else{
                System.err.println("Pile vide");
            }
            return result;
        }

        @Override
        public Object pop() {
            Object result = null;
            if(indice_pile != 0){
                indice_pile --;
                result = tab[indice_pile];
                tab[indice_pile] = null;
            }
            else{
                System.err.println("Pile vide");
            }
            return result;
        }
    }
