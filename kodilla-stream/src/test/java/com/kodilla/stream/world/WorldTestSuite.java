package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Set<Continent> continents = new HashSet<>();
        Set<Country> countries = new HashSet<>();
        Continent continent1 = new Continent("Europe");
        Continent continent2 = new Continent("Asia");
        Continent continent3 = new Continent("North America");
        Country country1 = new Country("Poland", new BigDecimal("38000000"));
        Country country2 = new Country("Germany", new BigDecimal("83000000"));
        Country country3 = new Country("USA", new BigDecimal("326000000"));
        Country country4 = new Country("Canada", new BigDecimal("36000000"));
        Country country5 = new Country("China", new BigDecimal("1420000000"));
        Country country6 = new Country("Japan", new BigDecimal("125000000"));
        continents.add(continent1);
        continents.add(continent2);
        continents.add(continent3);
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent3.addCountry(country3);
        continent3.addCountry(country4);
        continent2.addCountry(country5);
        continent2.addCountry(country6);
        //When
        BigDecimal totalPeople = world.getPeopleQuantity(continents);
        //Then
        BigDecimal expected = new BigDecimal("2028000000");
        Assert.assertEquals(expected, totalPeople);


    }
}