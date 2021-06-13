package org.tony.model;

import java.net.URL;
import java.util.List;

public class People extends StarWarsObj {
    int peopleid;
    String name;
    int height;
    int mass;
    String hair_color;
    String skin_color;
    String eye_color;
    String birth_year;
    String gender;
    URL homeworld;
    List<URL> films;
    List<URL> species;
    List<URL> vehicles;
    List<URL> starships;
    String created;
    String edited;
    URL url;

    public People() {
    }

    public int getPeopleid() {
        return peopleid;
    }

    public void setPeopleid(int peopleid) {
        this.peopleid = peopleid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
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

    public URL getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(URL homeworld) {
        this.homeworld = homeworld;
    }

    public List<URL> getFilms() {
        return films;
    }

    public void setFilms(List<URL> films) {
        this.films = films;
    }

    public List<URL> getSpecies() {
        return species;
    }

    public void setSpecies(List<URL> species) {
        this.species = species;
    }

    public List<URL> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<URL> vehicles) {
        this.vehicles = vehicles;
    }

    public List<URL> getStarships() {
        return starships;
    }

    public void setStarships(List<URL> starships) {
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
                "peopleid=" + peopleid +
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
