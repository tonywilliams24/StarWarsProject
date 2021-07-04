package org.tony.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.tony.db.SelectStatements.*;

public class Starships extends StarWarsObj {
    private int starshipsid;
    private String name;
    private String model;
    private String manufacturer;
    private String cost_in_credits;
    private String length;
    private String max_atmosphering_speed;
    private String crew;
    private String passengers;
    private String cargo_capacity;
    private String consumables;
    private String hyperdrive_rating;
    private String MGLT;
    private String starship_class;
    private HashSet<Films> films;
    private HashSet<People> pilots;

    public Starships() {
    }

    public Starships(ResultSet rs) throws SQLException, MalformedURLException {
        this.setStarshipsid(rs.getInt("starshipsid"));
        this.setName(rs.getString("name"));
        this.setModel(rs.getString("model"));
        this.setManufacturer(rs.getString("manufacturer"));
        this.setCost_in_credits(rs.getString("cost_in_credits"));
        this.setLength(rs.getString("length"));
        this.setMax_atmosphering_speed(rs.getString("max_atmosphering_speed"));
        this.setCrew(rs.getString("crew"));
        this.setPassengers(rs.getString("passengers"));
        this.setCargo_capacity(rs.getString("cargo_capacity"));
        this.setConsumables(rs.getString("consumables"));
        this.setHyperdrive_rating(rs.getString("hyperdrive_rating"));
        this.setMGLT(rs.getString("mglt"));
        this.setStarship_class(rs.getString("starship_class"));
        this.setCreated(rs.getString("created"));
        this.setEdited(rs.getString("edited"));
        this.setUrl(new URL(rs.getString("url")));
    }

    public String getMGLT() {
        return MGLT;
    }

    @JsonProperty("MGLT")
    public void setMGLT(String MGLT) {
        this.MGLT = MGLT;
    }

    public int getStarshipsid() {
        return starshipsid;
    }

    public void setStarshipsid(int starshipsid) {
        this.starshipsid = starshipsid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCost_in_credits() {
        return cost_in_credits;
    }

    public void setCost_in_credits(String cost_in_credits) {
        this.cost_in_credits = cost_in_credits;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getMax_atmosphering_speed() {
        return max_atmosphering_speed;
    }

    public void setMax_atmosphering_speed(String max_atmosphering_speed) {
        this.max_atmosphering_speed = max_atmosphering_speed;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public String getCargo_capacity() {
        return cargo_capacity;
    }

    public void setCargo_capacity(String cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }

    public String getConsumables() {
        return consumables;
    }

    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    public String getHyperdrive_rating() {
        return hyperdrive_rating;
    }

    public void setHyperdrive_rating(String hyperdrive_rating) {
        this.hyperdrive_rating = hyperdrive_rating;
    }

    public String getStarship_class() {
        return starship_class;
    }

    public void setStarship_class(String starship_class) {
        this.starship_class = starship_class;
    }

    public HashSet<Films> getFilms() {
        return films;
    }

    public void setFilms(HashSet<Films> films) {
        this.films = films;
    }

    public HashSet<People> getPilots() {
        return pilots;
    }

    public void setPilots(HashSet<People> pilots) {
        this.pilots = pilots;
    }

    public HashSet<Integer> getAssociatedPeopleIds(int starshipsId) throws SQLException, ClassNotFoundException {
        HashSet<Integer> peopleIdList = new HashSet<>();
        ResultSet starshipsPeopleSet = selectStarshipsFromPeopleStarships(starshipsId);
        while(starshipsPeopleSet.next()) {
            int peopleId = starshipsPeopleSet.getInt("peopleid");
            peopleIdList.add(peopleId);
        }
        return peopleIdList;
    }

    public HashSet<Integer> getAssociatedFilmIds(int starshipsId) throws SQLException, ClassNotFoundException {
        HashSet<Integer> filmsIdList = new HashSet<>();
        ResultSet starshipsFilmsSet = selectStarshipsFromFilmsStarships(starshipsId);
        while(starshipsFilmsSet.next()) {
            int filmId = starshipsFilmsSet.getInt("filmsid");
            filmsIdList.add(filmId);
        }
        return filmsIdList;
    }

}
