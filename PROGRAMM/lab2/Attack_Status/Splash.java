package Attack_Status;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Splash extends StatusMove {
    public Splash(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected String describe(){
        return "Splash";
    }

}
