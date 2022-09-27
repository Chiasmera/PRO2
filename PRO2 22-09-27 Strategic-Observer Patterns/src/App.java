public class App {
    public static void main(String[] args) {

        Saelger hansen = new Saelger("Hansen");
        Indkoeber jensen = new Indkoeber("Jensen");

        Bogtitel aa = new Bogtitel("Anders And", 6);
        Bogtitel java = new Bogtitel("Java", 8);

        Kunde lh1 = new Kunde("Læsehest 1");
        Kunde lh2 = new Kunde("Læsehest 2");
        Kunde lh3 = new Kunde("Læsehest 3");

        aa.addObserver(hansen);
        aa.addObserver(jensen);

        java.etKoeb(lh1);
        java.etKoeb(lh2);
        java.etKoeb(lh3);
        aa.etKoeb(lh1);
        aa.etKoeb(lh2);
        aa.etKoeb(lh3);



    }

}
