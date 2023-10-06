package MyPokemon;

import Attack_Phisical.RapidSpin;
import Attack_Phisical.ShadowPunch;
import Attack_Special.ThunderShock;
import ru.ifmo.se.pokemon.*;

public class Grumpig extends Pokemon {
    public Grumpig() {
        super("Grumpig", 1);
        setType(Type.PSYCHIC);
        setMove(new ThunderShock(), new ShadowPunch(), new RapidSpin());
        setStats(80, 45, 65, 90, 110, 80);
    }
}
