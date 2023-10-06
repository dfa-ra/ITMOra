package Attack_Status;
import ru.ifmo.se.pokemon.*;

public class SandAttack extends StatusMove {
    public SandAttack(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected String describe(){
        return "Sand Attack";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.ACCURACY, -1);
        System.out.println("Эфект: точность -1");
    }
}
