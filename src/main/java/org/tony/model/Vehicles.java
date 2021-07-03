package org.tony.model;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Vehicles extends StarWarsObj {
    private int vehiclesid;
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
    private String vehicle_class;
    private List<Films> films;
    private List<People> pilots;
    private String created;
    private String edited;
    private URL url;

    public Vehicles() {
    }

    public Vehicles(ResultSet rs) throws SQLException, MalformedURLException {
        this.setVehiclesid(rs.getInt("vehiclesid"));
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
        this.setVehicle_class(rs.getString("vehicle_class"));
        this.setCreated(rs.getString("created"));
        this.setEdited(rs.getString("edited"));
        this.setUrl(new URL(rs.getString("url")));
    }

    public void setCost_in_credits(String cost_in_credits) {
        this.cost_in_credits = cost_in_credits;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setMax_atmosphering_speed(String max_atmosphering_speed) {
        this.max_atmosphering_speed = max_atmosphering_speed;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public void setCargo_capacity(String cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
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

    public String getCost_in_credits() {
        return cost_in_credits;
    }

    public String getLength() {
        return length;
    }

    public String getMax_atmosphering_speed() {
        return max_atmosphering_speed;
    }

    public String getCrew() {
        return crew;
    }

    public String getPassengers() {
        return passengers;
    }

    public String getCargo_capacity() {
        return cargo_capacity;
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

    public List<Films> getFilms() {
        return films;
    }

    public void setFilms(List<Films> films) {
        this.films = films;
    }

    public List<People> getPilots() {
        return pilots;
    }

    public void setPilots(List<People> pilots) {
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
