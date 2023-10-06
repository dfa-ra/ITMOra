import ru.ifmo.se.pokemon.*;
import MyPokemon.*;

public class game {	
    public static void main(String[] args) {
        Battle b = new Battle();
        Duskull duskull = new Duskull();
        Grumpig grumpig = new Grumpig();
        Spinda spinda = new Spinda();
        Ledian ledian = new Ledian();
        Whismur whismur = new Whismur();
        Loudred loudred = new Loudred();
        b.addAlly(duskull);
        b.addAlly(grumpig);
        b.addAlly(spinda);
        b.addFoe(ledian);
        b.addFoe(whismur);
        b.addFoe(loudred);
        b.go();
    }
}