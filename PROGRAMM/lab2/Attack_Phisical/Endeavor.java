package Attack_Phisical;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Endeavor extends PhysicalMove {
    public Endeavor(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected String describe(){
        return "Endeavor";
    }

}
