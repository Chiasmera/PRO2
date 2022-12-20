package TestEksamen.navigation;

import java.util.ArrayList;
import java.util.List;

public class NavigationMenu extends NavigationComponent
{
    private String name;
    private List<NavigationComponent> children;

    public NavigationMenu(String name)
    {
        this.name = name;
        this.children = new ArrayList<>();
    }


    //Samme i begge subklasser, burde kunne nedarves fra superklassen
    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void addChild(NavigationComponent navigationComponent)
    {
        if (!children.contains(navigationComponent)) {
            children.add(navigationComponent);
        }
    }

    @Override
    public ArrayList<NavigationComponent> getChildren()
    {
        return new ArrayList<>(children);
    }

    @Override
    public void print()
    {
        System.out.println(name);

        for (NavigationComponent c : children) {
            System.out.print("\t");
            c.print();
        }
    }
}
