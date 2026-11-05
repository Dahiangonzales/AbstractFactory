public class OutfitClasicoFactory implements OutfitFactory{
    
    public Jean crearJean() {
        return new SkinnyJean();
    }
    public Camisa CrearCamisa() {
        return new CamisaMangaCorta();
    }
}