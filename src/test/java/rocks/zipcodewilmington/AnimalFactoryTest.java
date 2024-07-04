package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
//    Create Test for Animal createDog(String name, Date birthDate)
//    ensure that when .createDog is invoked on AnimalFactoryTest a Dog is created with the respective name and birthDate value.

    @Test
    public void createDogTest() throws ParseException {
        String strDate = "01/02/2009";
        Date date = new SimpleDateFormat("dd/mm/yyyy")
                .parse(strDate);
        Dog dog1 = AnimalFactory.createDog("dog 1", date);

        Assert.assertEquals(dog1.getName(), "dog 1");
        Assert.assertEquals(dog1.getBirthDate(), date);
    }


    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest() throws ParseException {
        String strDate = "01/02/2009";
        Date date = new SimpleDateFormat("dd/mm/yyyy")
                .parse(strDate);
        Cat cat1 = AnimalFactory.createCat("cat 1", date);

        Assert.assertEquals(cat1.getName(), "cat 1");
        Assert.assertEquals(cat1.getBirthDate(), date);
    }

}
