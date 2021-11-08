public class Forest implements Move{
    private Integer WaterLine;
    private Integer Day;
    public Forest(Integer WaterLine) {
        this.WaterLine = WaterLine;
        Day = 1;
    }
    public Integer GetWaterLine() {
        return WaterLine;
    }
    public void OneAction(Integer WaterLevel) {
        WaterLine += WaterLevel;
        System.out.print("День ");
        System.out.println(Day);
        System.out.print("Уровень воды поднялся до ");
        System.out.println(WaterLine);
        Day++;
    }
    @Override 
    public String toString() { 
        return "Сегодня " + Day + 
        " день. Уровень воды в лесу - " + WaterLine + "."; 
    }
}
