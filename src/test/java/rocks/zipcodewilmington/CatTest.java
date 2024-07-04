package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 *
 * Create tests for void setName(String name)
 * ensure that when .setName is invoked on an instance of Cat, the name field is being set to the respective value.
 * Create tests for setBirthDate(Date birthDate)
 * ensure that when .setBirthDate is invoked on an instance of Cat, the birthDate field is being set to the respective value.
 * Create tests for String speak()
 * ensure that when .speak is invoked on an instance of Cat, the value "meow!" is returned.
 * Create tests for void eat(Food food)
 * ensure that when .eat is invoked on an instance of Cat, the numberOfMealsEaten is increased by 1.
 * Create tests for Integer getId()
 * ensure that when .getId is invoked on an instance of Cat, the respective id value is returned.
 * Create test to check Animal inheritance; google search java instanceof keyword
 * ensure that a Cat is an instanceof an Animal
 * Create test to check Mammal inheritance; google search java instanceof keyword
 * ensure that a Cat is an instanceof a Mammal
 */
public class CatTest {



    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create tests for `void setName(String name)`
@Test
   public void setName() throws ParseException {
        String strDate = "01/02/2009";
    Date date = new SimpleDateFormat("dd/mm/yyyy")
            .parse(strDate);
    String givenName = "new cat";
        Cat cat = new Cat(givenName, date, 45);
        String retrievedName = cat.getName();
        Assert.assertEquals(givenName, retrievedName);

    }

    // TODO - Create tests for `speak`
//    Create tests for setBirthDate(Date birthDate)
//
    @Test
    public void testSpeak() throws ParseException {

        Cat cat = new Cat();
        String results = cat.speak();
        Assert.assertEquals("meow!", results);
    };


//   ensure that when .setBirthDate is invoked on an instance of Cat, the birthDate field is being set to the respective value.
    @Test
    public void setBirthDate() throws ParseException {
        String strDate = "01/02/2009";
        Date date = new SimpleDateFormat("dd/mm/yyyy")
                .parse(strDate);
        String givenName = "new cat";
        Cat cat = new Cat(givenName, date, 45);
        Date retrievedName = cat.getBirthDate();
        Assert.assertEquals(date, retrievedName);
    }



  @Test  //TODO - Create tests for `void eat(Food food)`
//    Create tests for void eat(Food food)
//    ensure that when .eat is invoked on an instance of Cat, the numberOfMealsEaten is increased by 1.
public void eat(){
        Cat cat = new Cat();
        Food food = new Food();
        //cat.eat(food);
        int results = cat.getNumberOfMealsEaten();
        cat.eat(food);
        int newResult = cat.getNumberOfMealsEaten();
        Assert.assertEquals(newResult, results +1);
       // Assert.assertEquals();
      }
//
//    Create tests for Integer getId()
//    ensure that when .getId is invoked on an instance of Cat, the respective id value is returned.
// TODO - Create tests for `Integer getId()`
    @Test
    public void getId(){
        Cat cat = new Cat();
        Integer num = 0;
        Assert.assertEquals(num, cat.getId());
    };
//    Create test to check Animal inheritance; google search java instanceof keyword
//    ensure that a Cat is an instanceof an Animal
// TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

@Test
    public void mammalinheritance(){
    Cat cat = new Cat();
    assertTrue( cat instanceof Mammal);
}

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
//    Create test to check Mammal inheritance; google search java instanceof keyword
//    ensure that a Cat is an instanceof a Mammal
    @Test
    public void animalinheritance(){
        Cat cat = new Cat();
        assertTrue( cat instanceof Animal);
    }
}
