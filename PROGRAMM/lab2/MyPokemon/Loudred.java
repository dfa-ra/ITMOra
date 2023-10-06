package MyPokemon;

import Attack_Phisical.Endeavor;
import Attack_Phisical.RapidSpin;
import Attack_Phisical.ShadowPunch;
import Attack_Special.Aeroblast;
import Attack_Special.ThunderShock;
import Attack_Status.Substitute;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Loudred extends Pokemon {
    public Loudred(){
        super("Loudred", 1);
        setType(Type.NORMAL);
        setMove(new Substitute(), new ShadowPunch(), new Aeroblast(), new Endeavor());
        setStats(84, 71, 43, 71, 43, 48);
    }
}
