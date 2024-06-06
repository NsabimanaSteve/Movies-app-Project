
/**
 * CustomArrayList class provides a dynamic array implementation with additional methods
 * for adding, removing, retrieving, and manipulating elements in the list.
 */
public class CustomArrayList {
    private static final int MIN_INITIAL_CAPACITY = 5;// Minimum initial capacity constant
    private Object[] array; // Array to store elements
    private int size; // Current number of elements in the list

    // Default constructor
    public CustomArrayList() {
        this(MIN_INITIAL_CAPACITY); // Initialize with default capacity
    }

    // Constructor with initial capacity
    public CustomArrayList(int initialCapacity) {
        // If the initial capacity is less than or equal to 0, it's considered illegal.
        // Print a warning message to inform the user.
        if (initialCapacity <= 0) {
            System.out.println("Illegal Capacity: " + initialCapacity + ". Setting to default capacity of 10.");
            // Set the initial capacity to a default value of 10.
            initialCapacity = 10;
        }
        // Initialize the array with the specified initial capacity.
        array = new Object[initialCapacity];
        size = 0; // Initialize size to 0
    }


    /**
     * Method that adds an element to the end of the list.
     * @param element The element to be added.
     */
    public void add(Object element) {

        // Check if array is full
        if (size == array.length) { 
             // Resize array if it is full
            resizeArray();
        }
        array[size] = element; // Add element to the end of the array
        size++; //Increase the size 
    }

    /**
     * Method that removes an element at the specified index.
     * @param index The index of the element to be removed.
     * @return The removed element, or null if index is invalid.
     */
    public Object remove(int index) {
        try {
             // Check if index is out of bounds
            if (index < 0 || index >= size) {

            // Throw exception if index is out of bounds
                throw new IndexOutOfBoundsException("Invalid index: " + index);
            }
            //Store the removed element
            Object removedElement = array[index];
            // Shift elements to fill the gap
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            // Set the last element to null
            array[size - 1] = null;
            size--; //Decrease of size  of arraylist 
            return removedElement; // Return the removed element

        } catch (IndexOutOfBoundsException e) {  // Catch block to handle IndexOutOfBoundsException
            System.out.println(e.getMessage()); // Print the error message 
        
            return null;
        }
    }
    /**
     * Method that removes the first occurrence of the specified element.
     * @param element The element to be removed.
     * @return The removed element, or null if not found.
     */
    public Object remove(Object element) {
        for (int i = 0; i < size; i++) {
            if ((array[i] == null && element == null) || (array[i] != null && array[i].equals(element))) {
                return remove(i);
            }
        }
        return null; // Return null if the element is not found
    }

    /**
     * Method that retrieves the element at the specified index.
     * @param index The index of the element to retrieve.
     * @return The element at the specified index, or null if index is invalid.
     */
    public Object get(int index) {
        try {
            // Check if index is within bounds
            if (index >= 0 && index < size) {
                return array[index]; // Return the element at the specified index
            } else {
                throw new IndexOutOfBoundsException("Invalid index: " + index); // Throw exception if index is out of bounds
            }
        } catch (IndexOutOfBoundsException e) {  // Catch block to handle IndexOutOfBoundsException
            System.out.println(e.getMessage()); // Print the error message 
        
            return null;
        }
    }
    /**
     * Method that sets the element at the specified index.
     * @param index The index of the element to set.
     * @param element The element to set.
     */
    public void set(int index, Object element) {
        try {
            // Check if index is out of bounds
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index out of bounds: " + index);// Throw exception if index is out of bounds
            } else {
                array[index] = element; // Set the element at the specified index
            }
        } catch (IndexOutOfBoundsException e) { // Catch block to handle IndexOutOfBoundsException
            System.out.println(e.getMessage()); // Print the error message 
        
        }
    }

    /**
     * Method that returns the current number of elements in the list.
     * @return The current size of the list.
     */
    public int size() {
        return size; // Return the current size
    }

    /**
     * Method that checks if the list is empty.
     * @return true if the list is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0; // Return true if the list is empty, false otherwise
    }

    /**
     * Method that returns a string representation of the list elements.
     * @return A string representing the list elements.
     */
    public String display() {
        StringBuilder result = new StringBuilder("["); // StringBuilder to build the result string
       
        //Iterate through the array
        for (int i = 0; i < size; i++) {

            // Append the current element to the result string
            result.append(array[i]);
            
            // Check if it is not the last element
            if (i < size - 1) {
                result.append(", ");
            }
        }
        result.append("]"); // Append closing bracket
        return result.toString(); // Return the result string
    }

    // Private method to resize the internal array
    private void resizeArray() {

        // Double the capacity if the capacity is going to be full
        int newCapacity = array.length * 2;

        // Create a new array with doubled capacity
        Object[] newArray = new Object[newCapacity];

        // Copy elements from the old array to the new array
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray; // Update the reference
    }
}
