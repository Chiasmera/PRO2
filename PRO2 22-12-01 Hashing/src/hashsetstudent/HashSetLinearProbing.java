package hashsetstudent;

/**
 * This class implements a hash set using separate chaining.
 */
public class HashSetLinearProbing {
    private Object[] buckets;
    private int currentSize;
    private static final String DELETED = "DELETED";

    /**
     * Constructs a hash table.
     *
     * @param bucketsLength the length of the buckets array
     */
    public HashSetLinearProbing(int bucketsLength) {
        buckets = new Object[bucketsLength];
        currentSize = 0;
    }

    /**
     * Tests for set membership.
     *
     * @param x an object
     * @return true if x is an element of this set
     */
    public boolean contains(Object x) {
        int currentPos = hashValue(x);
        boolean found = false;
        boolean fullLoop = false;
        boolean emptyEncountered = false;
        while (!found && !emptyEncountered && !fullLoop) {
            if (buckets[currentPos] == null) {
                emptyEncountered = true;
            } else if (buckets[currentPos].equals(x)) {
                found = true;
            } else {
                currentPos = (currentPos + 1) % buckets.length;
                if (currentPos == hashValue(x)) {
                    fullLoop = true;
                }
            }
        }
        return found;
    }

    /**
     * Adds an element to this set.
     *
     * @param x an object
     * @return true if x is a new object, false if x was already in the set
     */
    public boolean add(Object x) {
        int hashCode = hashValue(x);
        int currentPosition = hashCode;
        boolean found = false;
        boolean currentEmpty = false;
        //continues through the array until either: an object matching the hashcode is found, or an empty space is found.
        while (!found && !currentEmpty) {
            if (buckets[currentPosition] == null || buckets[currentPosition].equals(DELETED)) {
                currentEmpty = true;
                buckets[currentPosition] = x;
                currentSize++;
            } else if (buckets[currentPosition].equals(x)) {
                found = true;
            } else {
                currentPosition = (currentPosition + 1) % buckets.length;
                if (currentPosition == hashValue(x)) {
                    throw new RuntimeException("HashSet is full!");
                }
            }
        }

        //Return false if match was found, true otherwise
        return !found;
    }

    /**
     * Removes an object from this set.
     *
     * @param x an object
     * @return true if x was removed from this set, false if x was not an
     * element of this set
     */
    public boolean remove(Object x) {
        int currentPos = hashValue(x);
        boolean found = false;
        boolean fullLoop = false;
        boolean emptyFound = false;
        //While object is not found, an empty space is not encountered and the whole list is not looped through...
        while (!found && !fullLoop && !emptyFound) {


            //if the current space has a matching object, delete it and srt found to true
            if (buckets[currentPos].equals(x)) {
                buckets[currentPos] = DELETED;
                found = true;
                currentSize--;
                //Else increment the position and check for a full loop
            } else if (buckets[currentPos] == null) {
                emptyFound = true;
            } else {
                currentPos = (currentPos + 1) % buckets.length;
                if (currentPos == hashValue(x)) {
                    fullLoop = true;
                }
            }

        }

        return found;
    }

    /**
     * Gets the number of elements in this set.
     *
     * @return the number of elements
     */
    public int size() {
        return currentSize;
    }

    private int hashValue(Object x) {
        int h = x.hashCode();
        if (h < 0) {
            h = -h;
        }
        h = h % buckets.length;
        return h;
    }

    // method only for test purpose
    public void writeOut() {
        for (int i = 0; i < buckets.length; i++) {
            System.out.println(i + "\t" + buckets[i]);
        }
    }

}
