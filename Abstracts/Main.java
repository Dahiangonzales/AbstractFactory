public class Main{
    public static void main(String[] args) {
        OutfitFactory factory = new OutfitUrbanoFactory();

        TiendaRopa tienda = new TiendaRopa(factory);
     

        tienda.mostrarOutfit();
      
    }
}