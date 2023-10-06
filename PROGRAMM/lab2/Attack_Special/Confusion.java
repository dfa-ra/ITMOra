package Attack_Special;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Confusion extends SpecialMove {
    public Confusion(){
        super(Type.PSYCHIC, 50, 100);
    }

    @Override
    protected String describe(){
        return "Confusion";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().chance(0.1);
        e.confuse(p);
        System.out.println("Эфект: конфуза (шанс 10%)");
    }

}
