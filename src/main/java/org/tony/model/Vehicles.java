package org.tony.model;

import java.net.URL;
import java.util.List;

public class Vehicles extends StarWarsObj {
    int vehiclesid;
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
    String vehicle_class;
    List<URL> films;
    List<URL> pilots;
    String created;
    String edited;
    URL url;

    public Vehicles() {
    }

    public int getVehiclesid() {
        return vehiclesid;
    }

    public void setVehiclesid(int vehiclesid) {
        this.vehiclesid = vehiclesid;
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

    public String getVehicle_class() {
        return vehicle_class;
    }

    public void setVehicle_class(String vehicle_class) {
        this.vehicle_class = vehicle_class;
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