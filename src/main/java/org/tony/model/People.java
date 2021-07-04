package org.tony.model;

import org.tony.db.SelectStatements;
import org.tony.repository.Repository;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
    private Planets homeworld;
    private List<Species> species;
    private List<Films> films;
    private List<Starships> starships;
    private List<Vehicles> vehicles;
    private String created;
    private String edited;
    private URL url;

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

    public Planets getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(Planets homeworld) {
        this.homeworld = homeworld;
    }

    public List<Films> getFilms() {
        return films;
    }

    public void setFilms(List<Films> films) {
        this.films = films;
    }

    public List<Species> getSpecies() {
        return species;
    }

    public void setSpecies(List<Species> species) {
        this.species = species;
    }

    public List<Vehicles> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicles> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Starships> getStarships() {
        return starships;
    }

    public void setStarships(List<Starships> starships) {
        this.starships = starships;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "People{" +
                "thisid=" + thisid +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", mass=" + mass +
                ", hair_color='" + hair_color + '\'' +
                ", skin_color='" + skin_color + '\'' +
                ", eye_color='" + eye_color + '\'' +
                ", birth_year='" + birth_year + '\'' +
                ", gender='" + gender + '\'' +
                ", homeworld='" + homeworld + '\'' +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
