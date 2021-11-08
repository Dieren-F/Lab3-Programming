import java.util.Objects;
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
    @Override 
    public String toString() { 
        return "Character - " + CharacterName;
    } 
    @Override 
    public boolean equals(Object o) { 
        if (this == o) return true; 
        if (!(o instanceof Character)) return false;
        return false;
    } 
    @Override 
    public int hashCode() { 
        return Objects.hash(CharacterName); 
    } 
}
