import java.util.ArrayList;

public class Saelger implements Observer {
    //Fields ---------------------------------------------------------------------------------------------------------
    private String navn;


    //Constructors ---------------------------------------------------------------------------------------------------

    public Saelger(String navn) {
        this.navn = navn;
    }


    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------

    public String getNavn() {
        return navn;
    }


    //Methods - Other ------------------------------------------------------------------------------------------------
    @Override
    public void update(Subject s) {
        Bogtitel b = null;
        if (s instanceof Bogtitel) {
            b = (Bogtitel) s;
        }

        ArrayList<Bogtitel> othersLikeThis = new ArrayList<>();

        if (b != null) {

            for (Kunde k : b.getKunder()) {
                for (Bogtitel kb : k.getBogtitler()) {
                    if (!kb.equals(b) && !othersLikeThis.contains(kb)) {
                        othersLikeThis.add(kb);
                    }
                }
            }
        }

        System.out.println("You may also like these titles:");
        for (Bogtitel bt : othersLikeThis) {
            System.out.println(bt.getTitel());
        }
    }

}
