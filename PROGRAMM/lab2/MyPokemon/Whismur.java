package MyPokemon;

import Attack_Phisical.RapidSpin;
import Attack_Phisical.ShadowPunch;
import Attack_Special.Aeroblast;
import Attack_Special.ThunderShock;
import Attack_Status.Substitute;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Whismur extends Pokemon {
    public Whismur(){
        super("Whismur", 1);
        setType(Type.NORMAL);
        setMove(new Substitute(), new ShadowPunch(), new Aeroblast());
        setStats(64, 51, 23, 51, 23, 28);
    }
}
