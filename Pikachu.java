import metodos.IElectrico;

public class Pikachu extends Pokemon implements IElectrico{

    @Override
    protected void atacarPlacaje() {
        System.out.println("Pokemon ataque Placaje");
        
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pokemon Ataque Araniazo");
        
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pokemon ataque mordisco");
        
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pokemon atacarImpactrueno ");
        
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pokemon atacarImpactrueno  ");
        
    }

    @Override
    public void atacarRayo() {
        System.out.println("Pokemon atacarImpactrueno atacarRayo  ");
        
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Pokemon atacarImpactrueno atacarRayoCarga");
        
    }

   
    
}
