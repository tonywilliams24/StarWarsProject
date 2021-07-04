package org.tony.model;

import org.tony.repository.Repository;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.tony.db.SelectStatements.*;

public class Planets extends StarWarsObj {
    private int planetsid;
    private String name;
    private String rotation_period;
    private String orbital_period;
    private String diameter;
    private String climate;
    private String gravity;
    private String terrain;
    private String surface_water;
    private String population;
    private HashSet<People> residents;
    private HashSet<Films> films;
    private HashSet<Species> species;

    public Planets() {
    }

    public Planets(ResultSet rs) throws SQLException, MalformedURLException {
        this.setPlanetsid(rs.getInt("planetsid"));
        this.setName(rs.getString("name"));
        this.setRotation_period(rs.getString("rotation_period"));
        this.setOrbital_period(rs.getString("orbital_period"));
        this.setDiameter(rs.getString("diameter"));
        this.setClimate(rs.getString("climate"));
        this.setGravity(rs.getString("gravity"));
        this.setTerrain(rs.getString("terrain"));
        this.setSurface_water(rs.getString("surface_water"));
        this.setPopulation(rs.getString("population"));
        this.setCreated(rs.getString("created"));
        this.setEdited(rs.getString("edited"));
        this.setUrl(new URL(rs.getString("url")));
    }

    public int getPlanetsid() {
        return planetsid;
    }

    public void setPlanetsid(int planetsid) {
        this.planetsid = planetsid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRotation_period() {
        return rotation_period;
    }

    public void setRotation_period(String rotation_period) {
        this.rotation_period = rotation_period;
    }

    public String getOrbital_period() {
        return orbital_period;
    }

    public void setOrbital_period(String orbital_period) {
        this.orbital_period = orbital_period;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getSurface_water() {
        return surface_water;
    }

    public void setSurface_water(String surface_water) {
        this.surface_water = surface_water;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public HashSet<People> getResidents() {
        return residents;
    }

    public void setResidents(HashSet<People> residents) {
        this.residents = residents;
    }

    public HashSet<Films> getFilms() {
        return films;
    }

    public void setFilms(HashSet<Films> films) {
        this.films = films;
    }

    public HashSet<Species> getSpecies() {
        return species;
    }

    public void setSpecies(HashSet<Species> species) {
        this.species = species;
    }

    public HashSet<Integer> getAssociatedPeopleIds(int planetsId) throws SQLException, ClassNotFoundException {
        HashSet<Integer> peopleIdList = new HashSet<>();
        ResultSet planetsPeopleSet = selectPlanetsFromPeoplePlanets(planetsId);
        while(planetsPeopleSet.next()) {
            int peopleId = planetsPeopleSet.getInt("peopleid");
            peopleIdList.add(peopleId);
        }
        return peopleIdList;
    }

    public HashSet<Integer> getAssociatedFilmIds(int planetsId) throws SQLException, ClassNotFoundException {
        HashSet<Integer> filmsIdList = new HashSet<>();
        ResultSet planetsFilmsSet = selectPlanetsFromFilmsPlanets(planetsId);
        while(planetsFilmsSet.next()) {
            int filmId = planetsFilmsSet.getInt("filmsid");
            filmsIdList.add(filmId);
        }
        return filmsIdList;
    }

    public HashSet<Integer> getAssociatedSpeciesIds(int planetsId) throws SQLException, ClassNotFoundException {
        HashSet<Integer> speciesIdList = new HashSet<>();
        ResultSet speciesPlanetsSet = selectPlanetsFromSpeciesPlanets(planetsId);
        while(speciesPlanetsSet.next()) {
            int speciesId = speciesPlanetsSet.getInt("speciesid");
            speciesIdList.add(speciesId);
        }
        return speciesIdList;
    }
    
}
