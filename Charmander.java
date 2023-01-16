import metodos.IFuego;

public class Charmander extends Pokemon implements IFuego{

    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander ataque placaje");
        
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander ataque Aranizo");
        
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander Ataque Mordisco");
        
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Ataque punion fuego Charmander");
        
    }

    @Override
    public void atacarAscuas() {
        System.out.println( "Ataque ascuas Charmander");
        
    }

    @Override
    public void atacarLanzallamas() {
       System.out.println("Ataque lanza llamas Charmander");
        
    }

    
}
