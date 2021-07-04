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

public class People extends StarWarsObj {
    private int thisid;
    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String gender;
    private HashSet<Planets> homeworld;
    private HashSet<Species> species;
    private HashSet<Films> films;
    private HashSet<Starships> starships;
    private HashSet<Vehicles> vehicles;

    public People() {
    }

    public People(ResultSet rs) throws SQLException, MalformedURLException {
        this.setPeopleid(rs.getInt("peopleid"));
        this.setName(rs.getString("name"));
        this.setHeight(rs.getString("height"));
        this.setMass(rs.getString("mass"));
        this.setHair_color(rs.getString("hair_color"));
        this.setSkin_color(rs.getString("skin_color"));
        this.setEye_color(rs.getString("eye_color"));
        this.setBirth_year(rs.getString("birth_year"));
        this.setGender(rs.getString("gender"));
        this.setCreated(rs.getString("created"));
        this.setEdited(rs.getString("edited"));
        this.setUrl(new URL(rs.getString("url")));
    }

    public int getPeopleid() {
        return thisid;
    }

    public void setPeopleid(int thisid) {
        this.thisid = thisid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    public String getEye_color() {
        return eye_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public HashSet<Planets> getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(HashSet<Planets> homeworld) {
        this.homeworld = homeworld;
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

    public HashSet<Vehicles> getVehicles() {
        return vehicles;
    }

    public void setVehicles(HashSet<Vehicles> vehicles) {
        this.vehicles = vehicles;
    }

    public HashSet<Starships> getStarships() {
        return starships;
    }

    public void setStarships(HashSet<Starships> starships) {
        this.starships = starships;
    }

    public HashSet<Integer> getAssociatedFilmIds(int peopleId) throws SQLException, ClassNotFoundException {
        HashSet<Integer> filmsIdList = new HashSet<>();
        ResultSet peopleFilmsSet = selectPeopleFromPeopleFilms(peopleId);
        while(peopleFilmsSet.next()) {
            int filmId = peopleFilmsSet.getInt("filmsid");
            filmsIdList.add(filmId);
        }
        return filmsIdList;
    }

    public HashSet<Integer> getAssociatedPlanetIds(int peopleId) throws SQLException, ClassNotFoundException {
        HashSet<Integer> planetsIdList = new HashSet<>();
        ResultSet peoplePlanetsSet = selectPeopleFromPeoplePlanets(peopleId);
        while(peoplePlanetsSet.next()) {
            int planetId = peoplePlanetsSet.getInt("planetsid");
            planetsIdList.add(planetId);
        }
        return planetsIdList;
    }

    public HashSet<Integer> getAssociatedSpeciesIds(int peopleId) throws SQLException, ClassNotFoundException {
        HashSet<Integer> speciesIdList = new HashSet<>();
        ResultSet peopleSpeciesSet = selectPeopleFromPeopleSpecies(peopleId);
        while(peopleSpeciesSet.next()) {
            int speciesId = peopleSpeciesSet.getInt("speciesid");
            speciesIdList.add(speciesId);
        }
        return speciesIdList;
    }

    public HashSet<Integer> getAssociatedStarshipIds(int peopleId) throws SQLException, ClassNotFoundException {
        HashSet<Integer> starshipsIdList = new HashSet<>();
        ResultSet peopleStarshipsSet = selectPeopleFromPeopleStarships(peopleId);
        while(peopleStarshipsSet.next()) {
            int starshipId = peopleStarshipsSet.getInt("starshipsid");
            starshipsIdList.add(starshipId);
        }
        return starshipsIdList;
    }

    public HashSet<Integer> getAssociatedVehicleIds(int peopleId) throws SQLException, ClassNotFoundException {
        HashSet<Integer> vehiclesIdList = new HashSet<>();
        ResultSet peopleVehiclesSet = selectPeopleFromPeopleVehicles(peopleId);
        while(peopleVehiclesSet.next()) {
            int vehicleId = peopleVehiclesSet.getInt("vehiclesid");
            vehiclesIdList.add(vehicleId);
        }
        return vehiclesIdList;
    }

    @Override
    public String toString() {
        return "People{\n" +
                "thisid=\n" + thisid +
                ", name='\n" + name + '\'' +
                ", height=\n" + height +
                ", mass=\n" + mass +
                ", hair_color='\n" + hair_color + '\'' +
                ", skin_color='\n" + skin_color + '\'' +
                ", eye_color='\n" + eye_color + '\'' +
                ", birth_year='\n" + birth_year + '\'' +
                ", gender='\n" + gender + '\'' +
                ", homeworld='\n" + homeworld + '\'' +
                "}\n" + super.toString();
    }
}
