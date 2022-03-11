import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class CustomListTest {

    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("halifax", "NS"));
        assertEquals(list.getCount(),listSize+1);
    }

    @Test
    public void hasCityTest(){
        int listSize=list.getCount();
        list.addCity(new City("Edmonton","Alberta"));
        String newcity= "Edmonton";
        assertTrue(list.hasCity(newcity));
    }
    @Test
    public void deleteCityTest(){
        int listSize=list.getCount();
        City city=new City("Edmonton","Alberta");
        list.addCity(city);
        assertEquals(listSize+1,list.getCount());
        list.deleteCity(city);
        assertEquals(listSize,list.getCount());
    }

}
