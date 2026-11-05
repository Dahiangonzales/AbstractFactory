public class OutfitEleganteFactory implements OutfitFactory{
   
    public Jean crearJean() {
        return new JeanBootcut();
    }

    public Camisa CrearCamisa() {
        return new CamisaMangaLarga();
    }
}