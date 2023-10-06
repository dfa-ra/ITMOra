package MyPokemon;

import Attack_Phisical.RapidSpin;
import Attack_Phisical.ShadowPunch;
import Attack_Special.Confusion;
import Attack_Special.ThunderShock;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Spinda extends Pokemon {
    public Spinda(){
        super("Spinda", 1);
        setType(Type.NORMAL);
        setMove(new ThunderShock(), new ShadowPunch(), new RapidSpin(), new Confusion());
        setStats(60, 60, 60, 60, 60, 60);
    }
}
