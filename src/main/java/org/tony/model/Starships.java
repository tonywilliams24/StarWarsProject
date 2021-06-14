package org.tony.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URL;
import java.util.List;

public class Starships extends StarWarsObj {
    int starshipsid;
    String name;
    String model;
    String manufacturer;
    long cost_in_credits;
    float length;
    int max_atmosphering_speed;
    int crew;
    int passengers;
    long cargo_capacity;
    String consumables;
    float hyperdrive_rating;
    String MGLT;
    String mglt;
    String starship_class;
    List<URL> films;
    List<URL> pilots;
    String created;
    String edited;
    URL url;

    public Starships() {
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

    public long getCost_in_credits() {
        return cost_in_credits;
    }

    public void setCost_in_credits(long cost_in_credits) {
        this.cost_in_credits = cost_in_credits;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public int getMax_atmosphering_speed() {
        return max_atmosphering_speed;
    }

    public void setMax_atmosphering_speed(int max_atmosphering_speed) {
        this.max_atmosphering_speed = max_atmosphering_speed;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public long getCargo_capacity() {
        return cargo_capacity;
    }

    public void setCargo_capacity(long cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }

    public String getConsumables() {
        return consumables;
    }

    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    public float getHyperdrive_rating() {
        return hyperdrive_rating;
    }

    public void setHyperdrive_rating(float hyperdrive_rating) {
        this.hyperdrive_rating = hyperdrive_rating;
    }

    public String getStarship_class() {
        return starship_class;
    }

    public void setStarship_class(String starship_class) {
        this.starship_class = starship_class;
    }

    public List<URL> getFilms() {
        return films;
    }

    public void setFilms(List<URL> films) {
        this.films = films;
    }

    public List<URL> getPilots() {
        return pilots;
    }

    public void setPilots(List<URL> pilots) {
        this.pilots = pilots;
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
}
