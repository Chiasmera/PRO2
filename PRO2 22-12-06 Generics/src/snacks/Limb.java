package snacks;

import java.util.Random;

public class Limb extends Snack implements Comparable<Limb>
{


    @Override
    public int compareTo(Limb o) {
        return this.getType().compareTo(o.getType());
    }

    public enum Types
    {
        Toe, Finger, Heel, Knee, Hand, Foot
    }




    private Types type;

    public Limb()
    {
        Random random = new Random();
        Types[] types = Types.values();
        this.type = types[random.nextInt(types.length)];
    }

    public Limb(Types type)
    {
        this.type = type;
    }

    public Types getType()
    {
        return type;
    }

    public String toString () {
        String result = String.valueOf(this.getType());
        return result;
    }
}
