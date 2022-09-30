package Opgave3;

import java.util.ArrayList;

public class SammensatFigur extends Figur {


    //Fields ---------------------------------------------------------------------------------------------------------
    private ArrayList<Figur> children = new ArrayList<>();

    //Constructors ---------------------------------------------------------------------------------------------------


    public SammensatFigur(String navn) {
        super(navn);
    }

    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------
    @Override
    public void add(Figur f) {
        if (!children.contains(f)) {
            children.add(f);
        }
    }

    @Override
    public void remove(Figur f) {
        if (children.contains(f)) {
            children.remove(f);
        }
    }

    @Override
    public Figur getChild(int index) {
        return children.get(index);
    }

    //Methods - Other ------------------------------------------------------------------------------------------------
    @Override
    public void tegn() {
        for (Figur f : children) {
            f.tegn();
        }

    }

    @Override
    public double getAreal() {
        double samletareal = 0;
        for (Figur f : children) {
            samletareal += f.getAreal();
        }
        return samletareal;
    }


}
