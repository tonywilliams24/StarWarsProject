package org.tony.model;

import java.net.URL;
import java.util.List;

public class Species extends StarWarsObj {
    int speciesid;
    String name;
    String classification;
    String designation;
    String average_height;
    String skin_colors;
    String hair_colors;
    String eye_colors;
    String average_lifespan;
    String homeworld;
    String language;
    List<URL> people;
    List<URL> films;
    String created;
    String edited;
    URL url;

    public Species() {
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

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<URL> getPeople() {
        return people;
    }

    public void setPeople(List<URL> people) {
        this.people = people;
    }

    public List<URL> getFilms() {
        return films;
    }

    public void setFilms(List<URL> films) {
        this.films = films;
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
        return "Species{" +
                "speciesid=" + speciesid +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", average_height=" + average_height +
                ", skin_colors='" + skin_colors + '\'' +
                ", hair_colors='" + hair_colors + '\'' +
                ", eye_colors='" + eye_colors + '\'' +
                ", average_lifespan=" + average_lifespan +
                ", homeworld='" + homeworld + '\'' +
                ", language='" + language + '\'' +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
