package com.example;

import java.util.TreeSet;
import java.util.logging.Logger;
import java.util.Comparator;

public class treeset {
    public static final Logger Log = Logger.getLogger("InfoLogging");
  public static void main(String[] args) {
    TreeSet<String> names = new TreeSet<>();

    names.add("Vivin");
    names.add("Arun");
    names.add("Jeeva");
    names.add("Jerry");
    names.add("Bala");

    Log.info("TreeSet" + names);  
    TreeSet<String> sortedNames = new TreeSet<>(new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return s2.compareTo(s1);
      }
    });
    sortedNames.addAll(names);
    Log.info("Sorted TreeSet(descending order): " + sortedNames);  
    Log.info("Contains Jeeva" + names.contains("Jeeva"));
    names.remove("Jeeva");
    Log.info("TreeSet after removing Jim: " + names);  
    Log.info("First element: " + names.first()); 
    Log.info("Last element: " + names.last());  
    Log.info("Size: " + names.size());  
    names.clear();
    Log.info("Is the TreeSet empty? " + names.isEmpty());  
  }
}

