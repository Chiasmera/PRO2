package binarysearchtreestuderende;

public class App {
    //Fields ---------------------------------------------------------------------------------------------------------


    //Constructors ---------------------------------------------------------------------------------------------------


    //Methods - Get, Set & Add ---------------------------------------------------------------------------------------


    //Methods - Other ------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        BinarySearchTree<Integer> bsTree = new BinarySearchTree<>();
        bsTree.add(45);
        bsTree.add(22);
        bsTree.add(77);
        bsTree.add(11);
        bsTree.add(30);
        bsTree.add(90);
        bsTree.add(15);
        bsTree.add(25);
        bsTree.add(88);

        bsTree.print();
        System.out.println("Højeste tal i træet: "+ bsTree.findMax());
        System.out.println();
        System.out.println("Laveste tal i træet: "+ bsTree.findMin());
        System.out.println();

        System.out.println("Fjern højeste tal: " + bsTree.removeMax());
        System.out.println();

        bsTree.print();
        System.out.println("Fjern laveste tal: " + bsTree.removeMin());

        bsTree.print();
    }

}
