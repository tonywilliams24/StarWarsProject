package org.tony.repository;

import org.tony.model.*;

import java.net.MalformedURLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.tony.db.SelectStatements.*;

public class Repository {
    public static List<People> peopleRepository = new ArrayList<>();
    public static List<Films> filmsRepository = new ArrayList<>();
    public static List<Planets> planetsRepository = new ArrayList<>();
    public static List<Species> speciesRepository = new ArrayList<>();
    public static List<Starships> starshipsRepository = new ArrayList<>();
    public static List<Vehicles> vehiclesRepository = new ArrayList<>();

    public static void retrieveAllPeopleFromDb() throws SQLException, ClassNotFoundException, MalformedURLException {
        if(peopleRepository.isEmpty()) {
            ResultSet peopleSet = selectAllPeople();
            while (peopleSet.next()) {
                People people = new People(peopleSet);
                peopleRepository.add(people);
            }
        }
    }

    public static void retrieveAllFilmsFromDb() throws SQLException, ClassNotFoundException, MalformedURLException {
        if(filmsRepository.isEmpty()) {
            ResultSet filmsSet = selectAllFilms();
            while (filmsSet.next()) {
                Films film = new Films(filmsSet);
                filmsRepository.add(film);
            }
        }
    }

    public static void retrieveAllPlanetsFromDb() throws SQLException, ClassNotFoundException, MalformedURLException {
        if(planetsRepository.isEmpty()) {
            ResultSet planetsSet = selectAllPlanets();
            while (planetsSet.next()) {
                Planets planet = new Planets(planetsSet);
                planetsRepository.add(planet);
            }
        }
    }

    public static void retrieveAllSpeciesFromDb() throws SQLException, ClassNotFoundException, MalformedURLException {
        if(speciesRepository.isEmpty()) {
            ResultSet speciesSet = selectAllSpecies();
            while (speciesSet.next()) {
                Species species = new Species(speciesSet);
                speciesRepository.add(species);
            }
        }
    }

    public static List<People> getPeopleRepository() {
        return peopleRepository;
    }

    public static void setPeopleRepository(List<People> peopleRepository) {
        Repository.peopleRepository = peopleRepository;
    }

    public static List<Films> getFilmsRepository() {
        return filmsRepository;
    }

    public static void setFilmsRepository(List<Films> filmsRepository) {
        Repository.filmsRepository = filmsRepository;
    }

    public static List<Planets> getPlanetsRepository() {
        return planetsRepository;
    }

    public static void setPlanetsRepository(List<Planets> planetsRepository) {
        Repository.planetsRepository = planetsRepository;
    }

    public static List<Species> getSpeciesRepository() {
        return speciesRepository;
    }

    public static void setSpeciesRepository(List<Species> speciesRepository) {
        Repository.speciesRepository = speciesRepository;
    }

    public static List<Starships> getStarshipsRepository() {
        return starshipsRepository;
    }

    public static void setStarshipsRepository(List<Starships> starshipsRepository) {
        Repository.starshipsRepository = starshipsRepository;
    }

    public static List<Vehicles> getVehiclesRepository() {
        return vehiclesRepository;
    }

    public static void setVehiclesRepository(List<Vehicles> vehiclesRepository) {
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
    }

