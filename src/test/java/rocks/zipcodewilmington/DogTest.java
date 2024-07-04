package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {


    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    //    Create tests for void setName(String name)
//    ensure that when .setName is invoked on an instance of Dog, the name field is being set to the respective value.
    //  TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        //Given
        Dog dog = new Dog();
        String bark = "bark!";

        // when
        String speakCalled = dog.speak();
        //then:

        Assert.assertEquals(speakCalled, bark);

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() throws ParseException {
        // given
        Dog dog = new Dog();
        String strDate = "01/09/2009";
        Date date = new SimpleDateFormat("mm/dd/yyyy").parse(strDate);

        //when
        dog.setBirthDate(date);

        //then
        Date returnDate = dog.getBirthDate();
        Assert.assertEquals(date, returnDate);

    }

    ;

    @Test
    public void getIdTest() {
        Dog dog = new Dog("mammal name", new Date(), 54);
        int dogId = dog.getId();
        Assert.assertEquals(54, dogId);
    }

    @Test
    public void mammalInstanceTest() {
        Dog dog = new Dog();
        assertTrue(dog instanceof Mammal);
    }

    @Test
    public void animalImplementsTest() {
        Dog dog = new Dog();
        assertTrue(dog instanceof Animal);
    }

}
