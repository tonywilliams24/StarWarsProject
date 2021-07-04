package org.tony.repository;

import org.tony.model.*;

import java.net.MalformedURLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;

import static org.tony.db.SelectStatements.*;

public class Repository {
    public static HashSet<People> peopleRepository = new HashSet<>();
    public static HashSet<Films> filmsRepository = new HashSet<>();
    public static HashSet<Planets> planetsRepository = new HashSet<>();
    public static HashSet<Species> speciesRepository = new HashSet<>();
    public static HashSet<Starships> starshipsRepository = new HashSet<>();
    public static HashSet<Vehicles> vehiclesRepository = new HashSet<>();

    public static void retrieveAllPeopleFromDb() throws SQLException, ClassNotFoundException, MalformedURLException {
        if (peopleRepository.isEmpty()) {
            ResultSet peopleSet = selectAllPeople();
            while (peopleSet.next()) {
                People people = new People(peopleSet);
                peopleRepository.add(people);
            }
        }
    }

    public static void retrieveAllFilmsFromDb() throws SQLException, ClassNotFoundException, MalformedURLException {
        if (filmsRepository.isEmpty()) {
            ResultSet filmsSet = selectAllFilms();
            while (filmsSet.next()) {
                Films film = new Films(filmsSet);
                filmsRepository.add(film);
            }
        }
    }

    public static void retrieveAllPlanetsFromDb() throws SQLException, ClassNotFoundException, MalformedURLException {
        if (planetsRepository.isEmpty()) {
            ResultSet planetsSet = selectAllPlanets();
            while (planetsSet.next()) {
                Planets planet = new Planets(planetsSet);
                planetsRepository.add(planet);
            }
        }
    }

    public static void retrieveAllSpeciesFromDb() throws SQLException, ClassNotFoundException, MalformedURLException {
        if (speciesRepository.isEmpty()) {
            ResultSet speciesSet = selectAllSpecies();
            while (speciesSet.next()) {
                Species species = new Species(speciesSet);
                speciesRepository.add(species);
            }
        }
    }

    public static HashSet<People> getPeopleRepository() {
        return peopleRepository;
    }

    public static void setPeopleRepository(HashSet<People> peopleRepository) {
        Repository.peopleRepository = peopleRepository;
    }

    public static HashSet<Films> getFilmsRepository() {
        return filmsRepository;
    }

    public static void setFilmsRepository(HashSet<Films> filmsRepository) {
        Repository.filmsRepository = filmsRepository;
    }

    public static HashSet<Planets> getPlanetsRepository() {
        return planetsRepository;
    }

    public static void setPlanetsRepository(HashSet<Planets> planetsRepository) {
        Repository.planetsRepository = planetsRepository;
    }

    public static HashSet<Species> getSpeciesRepository() {
        return speciesRepository;
    }

    public static void setSpeciesRepository(HashSet<Species> speciesRepository) {
        Repository.speciesRepository = speciesRepository;
    }

    public static HashSet<Starships> getStarshipsRepository() {
        return starshipsRepository;
    }

    public static void setStarshipsRepository(HashSet<Starships> starshipsRepository) {
        Repository.starshipsRepository = starshipsRepository;
    }

    public static HashSet<Vehicles> getVehiclesRepository() {
        return vehiclesRepository;
    }

    public static void setVehiclesRepository(HashSet<Vehicles> vehiclesRepository) {
        Repository.vehiclesRepository = vehiclesRepository;
    }

    public static void retrieveAllStarshipsFromDb() throws SQLException, ClassNotFoundException, MalformedURLException {
        if (starshipsRepository.isEmpty()) {
            ResultSet StarshipsSet = selectAllStarships();
            while (StarshipsSet.next()) {
                Starships starship = new Starships(StarshipsSet);
                starshipsRepository.add(starship);
            }
        }
    }

    public static void retrieveAllVehiclesFromDb() throws SQLException, ClassNotFoundException, MalformedURLException {
        if (vehiclesRepository.isEmpty()) {
            ResultSet vehiclesSet = selectAllVehicles();
            while (vehiclesSet.next()) {
                Vehicles vehicle = new Vehicles(vehiclesSet);
                vehiclesRepository.add(vehicle);
            }
        }
    }

    public static void retrievePeopleAssociations() throws SQLException, ClassNotFoundException {
        HashSet<People> allPeople = getPeopleRepository();
        for (People people : allPeople) {
            int peopleId = people.getPeopleid();
            HashSet<Integer> filmIds = people.getAssociatedFilmIds(peopleId);
            HashSet<Integer> planetIds = people.getAssociatedPlanetIds(peopleId);
            HashSet<Integer> speciesIds = people.getAssociatedSpeciesIds(peopleId);
            HashSet<Integer> starshipIds = people.getAssociatedStarshipIds(peopleId);
            HashSet<Integer> vehicleIds = people.getAssociatedVehicleIds(peopleId);
            HashSet<Films> associatedFilms = people.getAssociatedFilms(filmIds);
            HashSet<Planets> associatedPlanets = people.getAssociatedPlanets(planetIds);
            HashSet<Species> associatedSpecies = people.getAssociatedSpecies(speciesIds);
            HashSet<Starships> associatedStarships = people.getAssociatedStarships(starshipIds);
            HashSet<Vehicles> associatedVehicles = people.getAssociatedVehicles(vehicleIds);
            people.setFilms(associatedFilms);
            people.setHomeworld(associatedPlanets);
            people.setSpecies(associatedSpecies);
            people.setStarships(associatedStarships);
            people.setVehicles(associatedVehicles);
        }
    }
    
    public static void retrieveFilmsAssociations() throws SQLException, ClassNotFoundException {
        HashSet<Films> allFilms = getFilmsRepository();
        for (Films films : allFilms) {
            int filmsId = films.getFilmsid();
            HashSet<Integer> peopleIds = films.getAssociatedPeopleIds(filmsId);
            HashSet<Integer> planetIds = films.getAssociatedPlanetIds(filmsId);
            HashSet<Integer> speciesIds = films.getAssociatedSpeciesIds(filmsId);
            HashSet<Integer> starshipIds = films.getAssociatedStarshipIds(filmsId);
            HashSet<Integer> vehicleIds = films.getAssociatedVehicleIds(filmsId);
            HashSet<People> associatedPeople = films.getAssociatedPeople(peopleIds);
            HashSet<Planets> associatedPlanets = films.getAssociatedPlanets(planetIds);
            HashSet<Species> associatedSpecies = films.getAssociatedSpecies(speciesIds);
            HashSet<Starships> associatedStarships = films.getAssociatedStarships(starshipIds);
            HashSet<Vehicles> associatedVehicles = films.getAssociatedVehicles(vehicleIds);
            films.setCharacters(associatedPeople);
            films.setPlanets(associatedPlanets);
            films.setSpecies(associatedSpecies);
            films.setStarships(associatedStarships);
            films.setVehicles(associatedVehicles);
        }
    }
    
    public static void retrievePlanetsAssociations() throws SQLException, ClassNotFoundException {
        HashSet<Planets> allPlanets = getPlanetsRepository();
        for (Planets planets : allPlanets) {
            int planetsId = planets.getPlanetsid();
            HashSet<Integer> peopleIds = planets.getAssociatedPeopleIds(planetsId);
            HashSet<Integer> filmIds = planets.getAssociatedFilmIds(planetsId);
            HashSet<Integer> speciesIds = planets.getAssociatedSpeciesIds(planetsId);
            HashSet<People> associatedPeople = planets.getAssociatedPeople(peopleIds);
            HashSet<Films> associatedFilms = planets.getAssociatedFilms(filmIds);
            HashSet<Species> associatedSpecies = planets.getAssociatedSpecies(speciesIds);
            planets.setResidents(associatedPeople);
            planets.setFilms(associatedFilms);
            planets.setSpecies(associatedSpecies);
        }
    }
    
    public static void retrieveSpeciesAssociations() throws SQLException, ClassNotFoundException {
        HashSet<Species> allSpecies = getSpeciesRepository();
        for (Species species : allSpecies) {
            int speciesId = species.getSpeciesid();
            HashSet<Integer> peopleIds = species.getAssociatedPeopleIds(speciesId);
            HashSet<Integer> filmIds = species.getAssociatedFilmIds(speciesId);
            HashSet<Integer> planetIds = species.getAssociatedPlanetIds(speciesId);
            HashSet<People> associatedPeople = species.getAssociatedPeople(peopleIds);
            HashSet<Films> associatedFilms = species.getAssociatedFilms(filmIds);
            HashSet<Planets> associatedPlanets = species.getAssociatedPlanets(planetIds);
            species.setPeople(associatedPeople);
            species.setFilms(associatedFilms);
            species.setPlanets(associatedPlanets);
        }
    }
    
    public static void retrieveStarshipsAssociations() throws SQLException, ClassNotFoundException {
        HashSet<Starships> allStarships = getStarshipsRepository();
        for (Starships starships : allStarships) {
            int starshipsId = starships.getStarshipsid();
            HashSet<Integer> peopleIds = starships.getAssociatedPeopleIds(starshipsId);
            HashSet<Integer> filmIds = starships.getAssociatedFilmIds(starshipsId);
            HashSet<People> associatedPeople = starships.getAssociatedPeople(peopleIds);
            HashSet<Films> associatedFilms = starships.getAssociatedFilms(filmIds);
            starships.setPilots(associatedPeople);
            starships.setFilms(associatedFilms);
        }
    }
    
    public static void retrieveVehiclesAssociations() throws SQLException, ClassNotFoundException {
        HashSet<Vehicles> allVehicles = getVehiclesRepository();
        for (Vehicles vehicles : allVehicles) {
            int vehiclesId = vehicles.getVehiclesid();
            HashSet<Integer> peopleIds = vehicles.getAssociatedPeopleIds(vehiclesId);
            HashSet<Integer> filmIds = vehicles.getAssociatedFilmIds(vehiclesId);
            HashSet<People> associatedPeople = vehicles.getAssociatedPeople(peopleIds);
            HashSet<Films> associatedFilms = vehicles.getAssociatedFilms(filmIds);
            vehicles.setPilots(associatedPeople);
            vehicles.setFilms(associatedFilms);
        }
    }
    
}

