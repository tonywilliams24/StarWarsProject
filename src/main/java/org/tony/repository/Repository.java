package org.tony.repository;

import org.tony.model.*;

import java.net.MalformedURLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.tony.db.SelectStatements.*;

public class Repository {
    public static List<People> allPeople = new ArrayList<>();
    public static List<Films> allFilms = new ArrayList<>();
    public static List<Planets> allPlanets = new ArrayList<>();
    public static List<Species> allSpecies = new ArrayList<>();
    public static List<Starships> allStarships = new ArrayList<>();
    public static List<Vehicles> allVehicles = new ArrayList<>();

    public static void retrieveAllPeopleFromDb() throws SQLException, ClassNotFoundException, MalformedURLException {
    
            ResultSet peopleSet = getAllPeople();
            while (peopleSet.next()) {
                People people = new People(peopleSet);
                allPeople.add(people);
            }
        
    }

    public static void retrieveAllFilmsFromDb() throws SQLException, ClassNotFoundException, MalformedURLException {
    
            ResultSet filmsSet = selectAllFilms();
            while (filmsSet.next()) {
                Films film = new Films(filmsSet);
                allFilms.add(film);
            }
        
    }

    public static void retrieveAllPlanetsFromDb() throws SQLException, ClassNotFoundException, MalformedURLException {
    
            ResultSet planetsSet = selectAllPlanets();
            while (planetsSet.next()) {
                Planets planet = new Planets(planetsSet);
                allPlanets.add(planet);
            }
        
    }

    public static void retrieveAllSpeciesFromDb() throws SQLException, ClassNotFoundException, MalformedURLException {
    
            ResultSet speciesSet = selectAllSpecies();
            while (speciesSet.next()) {
                Species species = new Species(speciesSet);
                allSpecies.add(species);
            }
        
    }

    public static void retrieveAllStarshipsFromDb() throws SQLException, ClassNotFoundException, MalformedURLException {
    
            ResultSet StarshipsSet = selectAllStarships();
            while (StarshipsSet.next()) {
                Starships starship = new Starships(StarshipsSet);
                allStarships.add(starship);
            }
        
    }

    public static void retrieveAllVehiclesFromDb() throws SQLException, ClassNotFoundException, MalformedURLException {
    
            ResultSet vehiclesSet = selectAllVehicles();
            while (vehiclesSet.next()) {
                Vehicles vehicle = new Vehicles(vehiclesSet);
                allVehicles.add(vehicle);
            }
        
    }
    
    
}
