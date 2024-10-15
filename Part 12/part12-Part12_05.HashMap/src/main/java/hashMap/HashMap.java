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
public class HashMap<K, V> {

    private List<Pair<K, V>>[] valueSet;
    private int firstFreeIndex;

    public HashMap() {
        valueSet = new List[32];
        firstFreeIndex = 0;
    }

    public String checkConstruction() {
        return "created at: " + valueSet;
    }

    //returns value assigned to a key in the set
    public V get(K key) {
        int keyHash = Math.abs(key.hashCode() % valueSet.length);
        if (valueSet[keyHash] == null) {
            return null;
        }

        List<Pair<K, V>> matchedValues = valueSet[keyHash];
        for (int i = 0; i < matchedValues.size(); i++) {
            if (matchedValues.getValue(i).getKey().equals(key)) {
                return matchedValues.getValue(i).getValue();
            }
        }
        return null;
    }

    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            firstFreeIndex++;
        } else {
            valuesAtIndex.getValue(index).setValue(value);
        }
        if (1.0 * firstFreeIndex / valueSet.length > 0.75) {
            grow();
        }
    }
    
    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        //Check existance of val at key provided
        if(valuesAtIndex.size() == 0) {
            return null; 
        }
        int index = getIndexOfKey(valuesAtIndex, key); 
        if(index < 0) {
            return null; 
        }
       // Checks passed
       Pair<K, V> pair = valuesAtIndex.getValue(index);
       valuesAtIndex.remove(pair);
       return pair.getValue();        
    }

    //helpers
    private List<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % valueSet.length);
        if (valueSet[hashValue] == null) {
            valueSet[hashValue] = new List<>();
        }

        return valueSet[hashValue];
    }

    private int getIndexOfKey(List<Pair<K, V>> list, K key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.getValue(i).getKey().equals(key)) {
                return i;
            }
        }

        return -1;
    }

    private void grow() {
        List<Pair<K, V>>[] newValueSet = new List[valueSet.length * 2];
        for (int i = 0; i < valueSet.length; i++) {
            copy(newValueSet, i);
        }
        //return new ptr
        valueSet = newValueSet;
    }

    private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
        for (int i = 0; i < valueSet[fromIdx].size(); i++) {
            Pair<K, V> value = valueSet[fromIdx].getValue(i);
            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new List<>();
            }
            newArray[hashValue].add(value);
        }
    }
}
