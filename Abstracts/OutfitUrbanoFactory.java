public class OutfitUrbanoFactory implements OutfitFactory{
    public Jean crearJean() {
        return new JeanCargo();
    }

    
    public Camisa CrearCamisa() {
        return new CamisaOversize();
    }
}