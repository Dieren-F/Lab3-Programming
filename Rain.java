public class Rain implements Move{
    private Integer RainPower;
    public Rain() {
        RainPower = 1;
    }
    public Integer GetRainPower() {
        return RainPower;
    }
    public void OneAction(Integer WaterLevel) {
        if (Math.random()>0.5) {
            RainPower += 3;
        }
        if (Math.random()<0.1) {
            RainPower--;
            if (RainPower == 0) {RainPower++;}
        }
        if (RainPower>7) {System.out.println("Ливень льет и льет");}
        else {System.out.println("Дождь льет и льет");}
    }
}
