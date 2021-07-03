package org.tony.model;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Planets extends StarWarsObj {
    private int planetsid;
    private String name;
    private String rotation_period;
    private String orbital_period;
    private String diameter;
    private String climate;
    private String gravity;
    private String terrain;
    private String surface_water;
    private String population;
    private List<People> residents;
    private List<Films> films;
    private String created;
    private String edited;
    private URL url;

    public Planets() {
    }

    public Planets(ResultSet rs) throws SQLException, MalformedURLException {
        this.setPlanetsid(rs.getInt("planetsid"));
        this.setName(rs.getString("name"));
        this.setRotation_period(rs.getString("rotation_period"));
        this.setOrbital_period(rs.getString("orbital_period"));
        this.setDiameter(rs.getString("diameter"));
        this.setClimate(rs.getString("climate"));
        this.setGravity(rs.getString("gravity"));
        this.setTerrain(rs.getString("terrain"));
        this.setSurface_water(rs.getString("surface_water"));
        this.setPopulation(rs.getString("population"));
        this.setCreated(rs.getString("created"));
        this.setEdited(rs.getString("edited"));
        this.setUrl(new URL(rs.getString("url")));
    }

    public int getPlanetsid() {
        return planetsid;
    }

    public void setPlanetsid(int planetsid) {
        this.planetsid = planetsid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRotation_period() {
        return rotation_period;
    }

    public void setRotation_period(String rotation_period) {
        this.rotation_period = rotation_period;
    }

    public String getOrbital_period() {
        return orbital_period;
    }

    public void setOrbital_period(String orbital_period) {
        this.orbital_period = orbital_period;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getSurface_water() {
        return surface_water;
    }

    public void setSurface_water(String surface_water) {
        this.surface_water = surface_water;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public List<People> getResidents() {
        return residents;
    }

    public void setResidents(List<People> residents) {
        this.residents = residents;
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
}
