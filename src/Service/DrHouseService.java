package Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import Model.*;

public class DrHouseService {



    public List<String> filterByFirstLetterUppercase(List<DrHouse> drHouses,char bigletter) {
        List<String> list = new ArrayList<>();
        for(DrHouse drHouse : drHouses) {
            if(drHouse.getPatient().charAt(0) == bigletter) {
                list.add(drHouse.getPatient());
            }
        }
        return list;
    }


    public void calculator(List<DrHouse> drHouses,String filename) {

        Map<String,Integer> points = new HashMap<>();
        for(DrHouse drHouse : drHouses) {
            if(drHouse.getKrankenhaus().equals(drHouse.getKrankenhaus()))
                points.put(drHouse.getKrankenhaus(), points.getOrDefault(drHouse.getKrankenhaus(), 0) + 1);
        }


        List<Map.Entry<String,Integer>> sortedPoints = new ArrayList<>(points.entrySet());
        sortedPoints.sort((a,b) -> b.getValue().compareTo(a.getValue()));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for(Map.Entry<String,Integer> entry : sortedPoints) {
                writer.write(entry.getKey() + "$" + entry.getValue() );
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println("Error writing in file"+ e.getMessage());
        }
    }

}
