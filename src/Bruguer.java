public class Bruguer extends Produtos {

    private int gramas;


    public Bruguer(int gramas,String descricao, double preco) {
        super(descricao, preco);
        this.gramas = gramas;
    }

    public int getGramas() {
        return gramas;
    }

    public void setGramas(int gramas) {
        this.gramas = gramas;
    }
}
