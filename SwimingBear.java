import java.util.Objects; 
public class SwimingBear extends Character implements Conversation, Swim{
    private SWIMMINGBEARSTATE State;
    public SwimingBear(String name, Integer LivingHeight, Integer LivingPlace, SWIMMINGBEARSTATE State) {
        super(name, LivingHeight, LivingPlace);
        this.State = State;
    }
    public Boolean BearSwim(Integer RobinPlace) {
        if (State == SWIMMINGBEARSTATE.TURNINTOBOAT) {
            System.out.println("Плавучий медведь и Пух плывут к Робину");
            Place += (int)(Math.random()*100);
            if (Place <= RobinPlace) {
                return true;
            }
        }
        if (State == SWIMMINGBEARSTATE.FEEDTHEBEAR) {
            return true;
        }
        else {
            return false;
        }
    }
    public Double Turn() {
        return Math.random();
    }
    public void Makeaboat() {
        State = SWIMMINGBEARSTATE.TURNINTOBOAT;
    }
    @Override 
    public String toString() { 
        String str = "Пока это горшок для мёда";
        if (State == SWIMMINGBEARSTATE.TURNINTOBOAT){
            str = "Теперь это Плавучий Медведь";
        }
        return str + ". Уровень воды - " + Height + 
        ". Место расположения - " + Place + "."; 
    }
    @Override
    public int hashCode() { 
        return Objects.hash(this.toString()); 
    } 
}
