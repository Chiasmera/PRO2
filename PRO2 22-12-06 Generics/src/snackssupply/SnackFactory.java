package snackssupply;

import snacks.Snack;

public class SnackFactory
{
    public <E> void getNewSnacks (E[] snackContainer) {
        try {
            Class arrayClass = snackContainer.getClass();
            Class elementClass =arrayClass.getComponentType();

            for (int i = 0; i < snackContainer.length; i++) {
                snackContainer[i] = (E) elementClass.newInstance();
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

}
