package com.example;

import java.util.HashMap;
import java.util.logging.Logger;

public class HashMapp{
  public static final Logger Log = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        HashMap<String,String> hmap = new HashMap<String,String>();

        hmap.put("emp012","jeeva");
        hmap.put("emp032","prakash");
        hmap.put("emp323","Arun");
        hmap.put("emp091","Asif");
        String hash = ""+hmap;
        Log.info(hash);
        Log.info("Size: "+Integer.toString(hmap.size()));
        String key = ""+hmap.keySet();
        Log.info(key);
        String val = ""+hmap.values();
        Log.info(val);
        hmap.remove("emp012");
        hash = ""+hmap;
        Log.info(hash);
        hmap.replace("emp091", "Pradeep");
        hash = ""+hmap;
        Log.info(hash);
        Log.info(hmap.get("emp323"));

    }

 
}
