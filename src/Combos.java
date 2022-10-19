public class Combos {
    Bruguer burguer =new Bruguer(100,"carne",15.00);
    Sobremesa sobremesa = new Sobremesa( "pudim", 7.00,"pequeno");
    Bebidas bebida= new Bebidas ( "suco",8.00,300);

private int tipo;
 public String CriarCombo(int tipo){

if (tipo==1)
   {
     burguer =new Bruguer(100,"carne",15.00);
    sobremesa = new Sobremesa( "pudim", 7.00,"pequeno");
     bebida= new Bebidas ( "suco",8.00,300);

    }
if (tipo==2)
    {
         burguer =new Bruguer(250,"carne",20.00);
         sobremesa = new Sobremesa( "pudim", 7.00,"medio");
         bebida= new Bebidas ( "suco",12.00,500);

    }
    return  "\nBebida: " + bebida.getDescricao() + bebida.getPreco() + bebida.getMl() +
            "\nSobremesa: " + sobremesa.getDescricao() + sobremesa.getPreco() + sobremesa.getTamanho() +
            "\nHambuguer: " + burguer.getGramas() + burguer.getDescricao() + burguer.getPreco();


    }

    @Override
    public  String toString()
    {
        return CriarCombo(tipo);
    }
}
