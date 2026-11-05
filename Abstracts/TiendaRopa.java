public class TiendaRopa{

        private OutfitFactory factory;

 public TiendaRopa(OutfitFactory factory) {
      this.factory = factory;
    }
    public void mostrarOutfit() {
        Jean jean = factory.crearJean();
        Camisa camisa = factory.CrearCamisa();
        
        jean.descripcion();
        camisa.descripcion();

    }

}
