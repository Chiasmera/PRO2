package TestEksamen.navigation;

public class NavigationItem extends NavigationComponent
{
    private String name;
    private String link;

    public NavigationItem(String name, String link)
    {
        this.name = name;
        this.link = link;
    }

    //Samme i begge subklasser, burde kunne nedarves fra superklassen
    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String getLink()
    {
        return link;
    }

    @Override
    public void print()
    {
        System.out.println("\t"+name + " (" + link+")");
    }
}
