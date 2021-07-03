package org.tony.model;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
    private List<People> people;
    private List<Films> films;
    private String created;
    private String edited;
    private URL url;

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

    public List<People> getPeople() {
        return people;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    public List<Films> getFilms() {
        return films;
    }

    public void setFilms(List<Films> films) {
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
                ", language='" + language + '\'' +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
