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

public class Species extends StarWarsObj {
    private int speciesid;
    private String name;
    private String classification;
    private String designation;
    private String average_height;
    private String skin_colors;
    private String hair_colors;
    private String eye_colors;
    private String average_lifespan;
    private String language;
    private HashSet<People> people;
    private HashSet<Films> films;
    private HashSet<Planets> planets;

    public Species() {
    }
    
    public Species(ResultSet rs) throws SQLException, MalformedURLException {
        this.setSpeciesid(rs.getInt("speciesid"));
        this.setName(rs.getString("name"));
        this.setClassification(rs.getString("classification"));
        this.setDesignation(rs.getString("designation"));
        this.setAverage_height(rs.getString("average_height"));
        this.setSkin_colors(rs.getString("skin_colors"));
        this.setHair_colors(rs.getString("hair_colors"));
        this.setEye_colors(rs.getString("eye_colors"));
        this.setAverage_lifespan(rs.getString("average_lifespan"));
        this.setLanguage(rs.getString("language"));
        this.setCreated(rs.getString("created"));
        this.setEdited(rs.getString("edited"));
        this.setUrl(new URL(rs.getString("url")));
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getSpeciesid() {
        return speciesid;
    }

    public void setSpeciesid(int speciesid) {
        this.speciesid = speciesid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAverage_height() {
        return average_height;
    }

    public void setAverage_height(String average_height) {
        this.average_height = average_height;
    }

    public String getSkin_colors() {
        return skin_colors;
    }

    public void setSkin_colors(String skin_colors) {
        this.skin_colors = skin_colors;
    }

    public String getHair_colors() {
        return hair_colors;
    }

    public void setHair_colors(String hair_colors) {
        this.hair_colors = hair_colors;
    }

    public String getEye_colors() {
        return eye_colors;
    }

    public void setEye_colors(String eye_colors) {
        this.eye_colors = eye_colors;
    }

    public String getAverage_lifespan() {
        return average_lifespan;
    }

    public void setAverage_lifespan(String average_lifespan) {
        this.average_lifespan = average_lifespan;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public HashSet<People> getPeople() {
        return people;
    }

    public void setPeople(HashSet<People> people) {
        this.people = people;
    }

    public HashSet<Films> getFilms() {
        return films;
    }

    public void setFilms(HashSet<Films> films) {
        this.films = films;
    }

    public HashSet<Planets> getPlanets() {
        return planets;
    }

    public void setPlanets(HashSet<Planets> planets) {
        this.planets = planets;
    }

    public HashSet<Integer> getAssociatedPeopleIds(int speciesId) throws SQLException, ClassNotFoundException {
        HashSet<Integer> peopleIdList = new HashSet<>();
        ResultSet speciesPeopleSet = selectSpeciesFromPeopleSpecies(speciesId);
        while(speciesPeopleSet.next()) {
            int peopleId = speciesPeopleSet.getInt("peopleid");
            peopleIdList.add(peopleId);
        }
        return peopleIdList;
    }
    
    public HashSet<Integer> getAssociatedFilmIds(int speciesId) throws SQLException, ClassNotFoundException {
        HashSet<Integer> filmsIdList = new HashSet<>();
        ResultSet speciesFilmsSet = selectSpeciesFromFilmsSpecies(speciesId);
        while(speciesFilmsSet.next()) {
            int filmId = speciesFilmsSet.getInt("filmsid");
            filmsIdList.add(filmId);
        }
        return filmsIdList;
    }

    public HashSet<Integer> getAssociatedPlanetIds(int speciesId) throws SQLException, ClassNotFoundException {
        HashSet<Integer> planetsIdList = new HashSet<>();
        ResultSet speciesPlanetsSet = selectSpeciesFromSpeciesPlanets(speciesId);
        while(speciesPlanetsSet.next()) {
            int planetId = speciesPlanetsSet.getInt("planetsid");
            planetsIdList.add(planetId);
        }
        return planetsIdList;
    }

    @Override
    public String toString() {
        return "Species{\n" +
                "speciesid=\n" + speciesid +
                ", name='\n" + name + '\'' +
                ", designation='\n" + designation + '\'' +
                ", average_height=\n" + average_height +
                ", skin_colors='\n" + skin_colors + '\'' +
                ", hair_colors='\n" + hair_colors + '\'' +
                ", eye_colors='\n" + eye_colors + '\'' +
                ", average_lifespan=\n" + average_lifespan +
                ", language='\n" + language + '\'' +
                "}\n" + super.toString();
    }
}
