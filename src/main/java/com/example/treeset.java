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

    String tree ="TreeSet" + names;
    Log.info(tree);  
    TreeSet<String> sortedNames = new TreeSet<>(new Comparator<String>() {
      @Override
      public int compare(String s1, String s2) {
        return s2.compareTo(s1);
      }
    });
    sortedNames.addAll(names);
    String stree = "Sorted TreeSet(descending order): " + sortedNames;
    Log.info(stree);  
    stree ="Contains Jeeva " + names.contains("Jeeva");
    Log.info(stree);
    names.remove("Jeeva");
    stree = "TreeSet after removing Jeeva: " + names;
    Log.info(stree);  
    stree = "First element: " + names.first();
    Log.info(stree); 
    stree = "Last element: " + names.last();
    Log.info(stree);  
    String size = "Size: " + names.size();
    Log.info(size);  
    names.clear();
    size = "Size: " + names.size();
    Log.info("After clear(): "+size);
  }
}

