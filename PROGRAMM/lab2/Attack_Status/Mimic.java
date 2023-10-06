package Attack_Status;

import ru.ifmo.se.pokemon.*;

public class Mimic extends StatusMove {
    public Mimic(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected String describe(){
        return "Mimic";
    }

}
