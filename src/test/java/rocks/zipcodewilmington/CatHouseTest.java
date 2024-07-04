package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

//    Create tests for void add(Cat cat)
//    ensure that when .add is invoked on the CatHouse, a respective Cat object can be retrieved from the house.
//    Create tests for void remove(Cat cat)
//    ensure that when .remove is invoked on the CatHouse, a respective Cat object can no longer be retrieved from the house.
//    Create tests for void remove(Integer id)
//    ensure that when .remove is invoked on the CatHouse, a Cat object with the respective id can no longer be retrieved from the house.
//    Create tests for Cat getCatById(Integer id)
//    ensure that when .getCatById is invoked on the CatHouse, a Cat with the respective id is returned.
//    Create tests for Integer getNumberOfCats()
//    ensure that when .getNumberOfCats() is invoked on the CatHouse, the respective number of Cat objects is returned.

    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
@Test
    public void addCatTest(){

        Cat cat = new Cat();
        CatHouse catHouser = new CatHouse();
        CatHouse.add(cat);
        int numberOfCats = CatHouse.getNumberOfCats();
        int amountofCats = 1;
        Assert.assertEquals(amountofCats,numberOfCats );
        CatHouse.clear();

    }
    @Test
    public void removeCatTest(){
        Cat cat = new Cat();
        CatHouse catHouser = new CatHouse();
        CatHouse.add(cat);
        CatHouse.remove(cat);
        int numberOfCats = CatHouse.getNumberOfCats();
        int amountofCats = 0;
        Assert.assertEquals(amountofCats,numberOfCats );
    }

    @Test
    public void removeCatIdTest(){
        Cat cat = new Cat("new cat", new Date(), 57);
        CatHouse catHouser = new CatHouse();
        CatHouse.add(cat);

       CatHouse.remove(57);
        Cat catById = CatHouse.getCatById(57);
//        int amountofCats = 0;
        Assert.assertEquals(null,catById);
    }

    @Test
    public void getCatIdTest(){
        Cat cat = new Cat("new cat", new Date(), 57);
        CatHouse catHouser = new CatHouse();
        CatHouse.add(cat);
        Cat catById = CatHouse.getCatById(57);
        Assert.assertEquals(cat,catById);
        CatHouse.clear();
    }


    @Test
    public void getNumberOfCats(){
    Cat cat = AnimalFactory.createCat("new cat", new Date());
        //Cat cat = new Cat("new cat", new Date(), 57);
        Cat cat2 = new Cat("new cat", new Date(), 59);
        CatHouse catHouser = new CatHouse();
        CatHouse.add(cat);
        CatHouse.add(cat2);
        int numberOCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(2,numberOCats);
    }



}
