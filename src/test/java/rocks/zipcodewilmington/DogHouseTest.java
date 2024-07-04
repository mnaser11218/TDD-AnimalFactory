package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
       int numberOfDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(1, numberOfDogs);
        DogHouse.clear();
    }
    @Test
    public void testAddDog(){
        Dog dog = AnimalFactory.createDog("dog 1", new Date());
        Dog dog2 = AnimalFactory.createDog("dog 1", new Date());
        DogHouse.add(dog);
        DogHouse.add(dog2);
        int numberOfDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(2, numberOfDogs);
        DogHouse.clear();
    }

    @Test
    public void testRemoveDog(){
        Dog dog = AnimalFactory.createDog("dog 1", new Date());
        Dog dog2 = AnimalFactory.createDog("dog 1", new Date());
        DogHouse.add(dog);
        DogHouse.add(dog2);
        DogHouse.remove(dog2);
        int numberOfDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(1, numberOfDogs);
        DogHouse.clear();
    }

    @Test
    public void testRemoveDogById(){

        Dog dog = new Dog("dog1",new Date(), 45 );
        Dog dog2 = new Dog("dog 2", new Date(), 66);
        DogHouse.add(dog);
        DogHouse.add(dog2);
        DogHouse.remove(45);
        Dog dogIdOf2= DogHouse.getDogById(45);
        int dogHouseNum = DogHouse.getNumberOfDogs();
        Assert.assertEquals(null, dogIdOf2);

        DogHouse.clear();
    }


    @Test
    public void testGetDogById(){
        Dog dog = new Dog("dog1",new Date(), 45 );
        Dog dog2 = new Dog("dog 2", new Date(), 66);
        DogHouse.add(dog);
        DogHouse.add(dog2);
        Dog dogIdOf2= DogHouse.getDogById(45);
        Assert.assertEquals(dog, dogIdOf2);
        DogHouse.clear();
    }
    @Test
    public void testGetNumOfDogs(){
        Dog dog = new Dog("dog1",new Date(), 45 );
        Dog dog2 = new Dog("dog 2", new Date(), 66);
        DogHouse.add(dog);
        DogHouse.add(dog2);
       int numOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(2, numOfDogs);
        DogHouse.clear();
    }



}
