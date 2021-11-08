abstract class Character {
    protected String CharacterName;
    protected Integer Height;
    protected Integer Place;
    Character(String name, Integer LivingHeight, Integer LivingPlace){
        this.CharacterName = name;
        this.Height = LivingHeight;
        this.Place = LivingPlace;
    }
    public Integer GetHeight(){
        return Height;
    }
    public Integer GetPlace(){
        return Place;
    }
}
