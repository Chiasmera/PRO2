import java.util.ArrayList;

public class Kunde {
    //Fields ---------------------------------------------------------------------------------------------------------
    public String navn;

    private ArrayList<Bogtitel> bogtitler = new ArrayList<>();

    //Constructors ---------------------------------------------------------------------------------------------------

    public Kunde(String navn) {
        this.navn = navn;
    }


    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------

    public String getNavn() {
        return navn;
    }

    public ArrayList<Bogtitel> getBogtitler() {
        return new ArrayList<>(bogtitler);
    }

    public void addBogtitel(Bogtitel b) {
        if (!bogtitler.contains(b)) {
            bogtitler.add(b);
            b.addKunde(this);
        }
    }

    public void removeBogtitel(Bogtitel b) {
        if (bogtitler.contains(b)) {
            bogtitler.remove(b);
            b.removeKunde(this);
        }
    }


    //Methods - Other ------------------------------------------------------------------------------------------------


}
