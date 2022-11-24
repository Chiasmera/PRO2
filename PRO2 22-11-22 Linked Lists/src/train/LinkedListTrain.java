package train;

import java.util.NoSuchElementException;

public class LinkedListTrain {
    private WagonNode firstWagon;

    /**
     * Constructs an empty linked list train.
     */
    public LinkedListTrain() {
        this.firstWagon = null;
    }

    /**
     * Returns the first wagon node in the linked list train.
     *
     * @return the first wagon node
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode getFirst() {
        if (this.firstWagon == null) {
            throw new NoSuchElementException();
        }
        return this.firstWagon;
    }

    /**
     * Adds a wagon node to the front of the linked list train.
     *
     * @param wagon the wagon node to add
     */
    public void addFirst(WagonNode wagon) {
        // TODO: Assignment 1: Implement this add method...
        wagon.setNextWagon(firstWagon);
        firstWagon = wagon;
    }

    /**
     * Removes the first wagon node in the linked list train.
     *
     * @return the removed wagon node
     * @throws NoSuchElementException if the train has no wagon nodes
     */
    public WagonNode removeFirst() {
        // TODO: Assignment 2: Implement this remove method...
        if (firstWagon == null) {
            throw new NoSuchElementException("This train has no wagons");
        } else {
            WagonNode temp = firstWagon;
            firstWagon = temp.getNextWagon();
            temp.setNextWagon(null);
            return temp;
        }

        /*        throw new UnsupportedOperationException("Not implemented");*/
    }

    /**
     * Counts the total number of wagon nodes in the linked list train.
     *
     * @return the number of wagon nodes
     */
    public int count() {
        // TODO: Assignment 3: Implement this count method...
        WagonNode currentWagon = firstWagon;
        int count = 0;
        while (currentWagon != null) {
            count++;
            currentWagon = currentWagon.getNextWagon();
        }
        return count;

        /*throw new UnsupportedOperationException("Not implemented");*/
    }

    /**
     * Removes the first wagon node in the linked list train.
     *
     * @param wagon the wagon node to remove
     * @return <code>true</code> if the wagon node was found and removed;
     * <code>false</code> otherwise
     */
    public boolean remove(WagonNode wagon) {
        boolean found = false;
        WagonNode previous = firstWagon;
        if (firstWagon.equals(wagon)) {
            firstWagon = firstWagon.getNextWagon();
            wagon.setNextWagon(null);
            found = true;
        } else {
            while (!found && previous.getNextWagon() != null) {
                if (previous.getNextWagon().equals(wagon)) {
                    WagonNode temp = previous.getNextWagon();
                    previous.setNextWagon(temp.getNextWagon());
                    temp.setNextWagon(null);
                    found = true;
                } else {
                    previous = previous.getNextWagon();
                }
            }
        }
        return found;
        /*        throw new UnsupportedOperationException("Not implemented");*/
    }

    /**
     * Inserts a wagon node at a given position in the linked list train.
     *
     * @param wagon    the wagon node to add
     * @param position the position where to add the wagon node
     */
    public void insertAt(WagonNode wagon, int position) {
        if (position == 0) {
            addFirst(wagon);
        } else {
            int indexCount = 1;
            WagonNode previous = firstWagon;
            while (indexCount < position && previous.getNextWagon() != null) {
                previous = previous.getNextWagon();
                ;
                indexCount++;
            }
             if (previous.getNextWagon() == null) {
                wagon.setNextWagon(null);
                previous.setNextWagon(wagon);
            } else {
                 wagon.setNextWagon(previous.getNextWagon());
                 previous.setNextWagon(wagon);
             }
        }

        /*throw new UnsupportedOperationException("Not implemented");*/
    }

    /**
     * @param wagon
     */
    public void setFirstWagon(WagonNode wagon) {
        firstWagon = wagon;
    }
}
