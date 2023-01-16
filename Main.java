
public class Main {
    public static void main(String[] args) {
        
        Bulbasaur bulbasaur= new Bulbasaur();
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();
        bulbasaur.atacarLatigoCepa();
        bulbasaur.atacarHojaAfilada();

        System.out.println(("\n\n"));
        Charmander charmander = new Charmander();
        charmander.atacarMordisco();
        charmander.atacarLanzallamas();
        charmander.atacarMordisco();
    }
    
}
