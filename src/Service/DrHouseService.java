package Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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

}
