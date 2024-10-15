/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashMap;

/**
 *
 * @author Nikita
 */
public class List<Type> {
    private Type[] array;
    private int firstFreeIndex; 
    
    public List() {
        array = (Type[]) new Object[10];
        firstFreeIndex = 0; 
        //Note: At this stage all elems are null
    }
   
    public void add(Type value) {
        if(firstFreeIndex == array.length) {
            this.grow();
        }
        array[firstFreeIndex] = value;
        firstFreeIndex++; 
    }
    
    public boolean contains(Type value) {
        return getIndex(value) >= 0; // if grt 0 return true 
    }
    
    public int getIndex(Type value) {
        for(int i = 0; i < firstFreeIndex; i++) {
            if(array[i].equals(value)) {
                return i;
            }    
        }
        return -1; 
    }
    
    public void remove(Type value) {
        int startIndex;
        startIndex = this.getIndex(value); 
        if(startIndex < 0) {
            return;
        }
        for(int i = startIndex; i < firstFreeIndex - 1; i++) {
            array[i] = array[i+1];
        }
        // course's code retains a duplicate
        // hence this part. I think it makes more sense
        // to remove the duplicate and assign null
        // UPD:  basically shift turned to remove in one go. 
        array[firstFreeIndex-1] = null;
        firstFreeIndex--; 
    }
    
    public Type getValue(int index) {
        if(index < 0 || index >= firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index 
                    + " is out of bounds (index > " + firstFreeIndex 
                    +")"); 
        }
        return array[index]; 
    }
    
    //returns number of elements not the actual size of the object array
    public int size() {
        return firstFreeIndex; 
    }
    
    private void grow() {
        int newSize = array.length + array.length/2;
        Type[] newArray = (Type[]) new Object[newSize];
        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[i]; 
        }
        array = newArray; 
    }
    
    public String toString() {
        StringBuilder result = new StringBuilder(); 
        for(int i = 0; i < array.length; i++) {
            result.append((String) array[i] + ",");
        }
        
        return "[" + result + "]"; 
    }
}
