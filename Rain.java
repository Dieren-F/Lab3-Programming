import java.util.Objects; 
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
        System.out.println(this);
    }
    @Override 
    public String toString() { 
        String str = "Дождь льет и льет";
        if (RainPower>7) {str = "Ливень льет и льет";}
        return str;
    }
    @Override
    public int hashCode() { 
        return Objects.hash(this.toString()); 
    } 
}
