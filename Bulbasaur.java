import metodos.IPlanta;

public class Bulbasaur extends Pokemon implements IPlanta {

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola este es el atacar Placaje Bulbasaur");
        
    }

    @Override
    protected void atacarAraniazo() {
       System.out.println("Hola este es el ataque Araniazo Bulbasaur");
        
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola este es el ataque mordisco de Bulbasaur ");
        
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur atacarParalizar ");
        
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur atacarDrenaje");
        
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Bulbasaur atacarHojaAfilada ");
        
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Bulbasaur atacarLatigoCepa ");
        
    }



    
}
