package org.tony.model;

import java.math.BigInteger;
import java.net.URL;
import java.util.List;

public class Planets extends StarWarsObj {
    int planetsid;
    String name;
    int rotational_period;
    int orbital_period;
    int diameter;
    String climate;
    String gravity;
    String terrain;
    int surface_water;
    long population;
    List<URL> residents;
    List<URL> films;
    String created;
    String edited;
    URL url;

    public Planets(String climate) {
        this.climate = climate;
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

    public int getRotational_period() {
        return rotational_period;
    }

    public void setRotational_period(int rotational_period) {
        this.rotational_period = rotational_period;
    }

    public int getOrbital_period() {
        return orbital_period;
    }

    public void setOrbital_period(int orbital_period) {
        this.orbital_period = orbital_period;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
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

    public int getSurface_water() {
        return surface_water;
    }

    public void setSurface_water(int surface_water) {
        this.surface_water = surface_water;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public List<URL> getResidents() {
        return residents;
    }

    public void setResidents(List<URL> residents) {
        this.residents = residents;
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
}
