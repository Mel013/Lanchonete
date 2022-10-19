public class Bebidas extends Produtos {
     private int ml;

     public Bebidas(String descricao, double preco, int ml) {
          super(descricao, preco);
          this.ml = ml;
     }

     public int getMl() {
          return ml;
     }

     public void setMl(int ml) {
          this.ml = ml;
     }
}
