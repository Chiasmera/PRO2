package snackssupply;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SnackBar
{
    public static <E extends Comparable<E>> List<E> sortSnacks (List<E> snackContainer)
    {
        List<E> list = snackContainer;
        Collections.sort(list);
        return list;
    }
    //
}
