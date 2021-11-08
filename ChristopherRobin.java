public class ChristopherRobin extends Character implements Move, RobinAction{
    protected ROBINSTATE State;
    public ChristopherRobin(String name, Integer LivingHeight, Integer LivingPlace, ROBINSTATE State){
        super(name, LivingHeight, LivingPlace);
        this.State = State;
    }
    public void OneAction(Integer WaterLevel) {
        if (this.State == ROBINSTATE.THINKING) {System.out.println("Робин думает о разных вещах");}
        else {System.out.println("Робин весело смотрит вниз и любуется всей этой водой");}
    }
    public void Action(Integer WaterLevel) {
        if (WaterLevel>10) {this.State = ROBINSTATE.THINKING;}
        else {this.State = ROBINSTATE.LOOKING;}
    }
    @Override 
    public String toString() { 
        String str = "Робин думает о разных вещах";
        if (State == ROBINSTATE.LOOKING){
            str = "Робин весело смотрит вниз и любуется всей этой водой";
        }
        return str + ". Уровень воды - " + Height + 
        ". Место расположения - " + Place + "."; 
    }
}