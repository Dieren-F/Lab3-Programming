public class Pooh extends Character implements Move, Conversation{
    public POOHSTATE State;
    public Pooh(String name, Integer LivingHeight, Integer LivingPlace, POOHSTATE State){
        super(name, LivingHeight, LivingPlace);
        this.State = State;
    }
    public void OneAction(Integer WaterLevel) {
        if (WaterLevel<Height) {System.out.println("Пух сидит на дереве и ест мёд");}
        else {
            if (State != POOHSTATE.SWIMONBOAT) {
                this.State = POOHSTATE.MAKEABOAT;
            }
            else {
                System.out.println("Пух плывет на Плавучем Медведе");
            }
        }
    }
    public Double Turn() {
        return Math.random()/1.2;
    }
    public POOHSTATE GetState() {
        return State;
    }
    public void Swim() {
        State = POOHSTATE.SWIMONBOAT;
        System.out.println("Пух плывет на Плавучем Медведе");
    }
    @Override 
    public String toString() { 
        String str = "Пух сидит на дереве и ест мёд";
        if (State == POOHSTATE.SWIMONBOAT){
            str = "Пух плывет на Плавучем Медведе";
        }
        return str + ". Уровень воды - " + Height + 
        ". Место расположения - " + Place + "."; 
    }
}
