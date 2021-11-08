public class Main {
    public static void main(String[] args){ 
        System.out.println("lol");
        ChristopherRobin cr = new ChristopherRobin("Robin", 100, 1100, ROBINSTATE.LOOKING);
        Pooh p = new Pooh("Пух", 50, 700, POOHSTATE.CHILL);
        Forest f = new Forest(0);
        Rain r = new Rain();
        SwimingBear s = new SwimingBear("Плавучий Медведь", 50, 700, SWIMMINGBEARSTATE.FEEDTHEBEAR);
        f.OneAction(0);
        r.OneAction(0);
        while (s.BearSwim(cr.GetPlace())) { 
            f.OneAction(r.GetRainPower());
            r.OneAction(f.GetWaterLine());
            cr.Action(r.GetRainPower());
            cr.OneAction(r.GetRainPower());
            p.OneAction(f.GetWaterLine());
            if (p.GetState() == POOHSTATE.MAKEABOAT) {
                s.Makeaboat();
                while (p.Turn()<s.Turn()) {
                    System.out.println("Плавучий Медведь и Пух не могут договориться кто на ком плывет");
                }
                p.Swim();
            }
        }
        System.out.println("Пух приплыл к Робину");
    }
}
