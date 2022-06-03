import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints, strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString(){
        return "Player { name=" + this.name + ", hitPoints=" + this.hitPoints + ", strength=" + this.strength + "}";
    }

    @Override
    public List<String> write() {
        List<String> info = new ArrayList<>();
        info.add(this.name);
        info.add(Integer.toString(this.hitPoints));
        info.add(Integer.toString(this.strength));
        return info;
    }

    @Override
    public void read(List<String> list) {
        if(!list.isEmpty() ) {
            this.name = list.get(0);
            this.hitPoints = Integer.parseInt(list.get(1));
            this.strength = Integer.parseInt(list.get(2));
        }
    }


}
