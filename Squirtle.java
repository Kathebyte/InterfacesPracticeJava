import metodos.IAgua;

public class Squirtle extends Pokemon implements IAgua{

    @Override
    protected void atacarPlacaje() {
       System.out.println("Squirtle Ataque placaje");
        
    }

    @Override
    protected void atacarAraniazo() {
       System.out.println("Squirtle Atalque Araniazo");
        
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle ataque Mordisco");
        
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle atacarHidrobomba");
        
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle atacarPistolaAgua");
        
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle atacarBurbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Squirtle atacarHidropulso");
    }
    
}
