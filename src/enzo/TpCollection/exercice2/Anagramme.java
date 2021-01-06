package enzo.TpCollection.exercice2;

import java.util.* ;
import java.io.*;


public class Anagramme {
    private HashMap<String,Integer> map = new HashMap<String, Integer>();
    private int limit;

    public Anagramme(String filepath, int limit) throws IOException {
        this.map = readFile(filepath);
        this.limit = limit;
        searchAnagramme();
    }


    public HashMap<String, Integer> readFile(String filePath) throws IOException {

        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null)
        {
            String[] parts = line.split("\\s+");
            if (parts.length >= 1)
            {
                String key = parts[0];
                Integer value = key.length();
                map.put(key, value);
            } else {
                System.out.println("ignoring line: " + line);
            }
        }
        reader.close();
        return map;
    }

    public HashMap<String,Integer> getMap(){return map;}

    public void searchAnagramme(){
        ArrayList<String> listAnagramme = new ArrayList<String>();
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            Integer key = entry.getValue();
            String value =  entry.getKey();
            for (Map.Entry<String,Integer> entry2 : map.entrySet()) {
                Boolean isAna = isAnagram(value, entry2.getKey());
                if(isAna){
                    listAnagramme.add(entry2.getKey());
                }
            }
            if(listAnagramme.size() >= limit){
                System.out.println(listAnagramme.size() + ":" + listAnagramme);
            }
            //map.remove(listAnagramme);
            listAnagramme.clear();
        }
    }

    public boolean isAnagram(String firstWord, String secondWord) {
        Boolean result = false;
        if(firstWord.length() == secondWord.length()){
            char[] word1 = firstWord.replaceAll("\\s", "").toCharArray();
            char[] word2 = secondWord.replaceAll("\\s", "").toCharArray();
            Arrays.sort(word1);
            Arrays.sort(word2);
            result = Arrays.equals(word1, word2);
        }
        return result;
    }
}
