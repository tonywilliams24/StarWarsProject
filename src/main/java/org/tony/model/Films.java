package org.tony.model;

import org.tony.repository.Repository;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.tony.db.SelectStatements.*;

public class Films extends StarWarsObj {
    private int filmsid;
    private String title;
    private int episode_id;
    private String opening_crawl;
    private String director;
    private String producer;
    private String release_date;
    private HashSet<Species> species;
    private HashSet<Starships> starships;
    private HashSet<Vehicles> vehicles;
    private HashSet<People> characters;
    private HashSet<Planets> planets;
    private static String path = "https://swapi.dev/api/films/";

    public Films() {
    }

    public  Films(ResultSet rs) throws SQLException, MalformedURLException {
        this.setFilmsid(rs.getInt("filmsid"));
        this.setTitle(rs.getString("title"));
        this.setEpisode_id(rs.getInt("episode_id"));
        this.setOpening_crawl(rs.getString("opening_crawl"));
        this.setDirector(rs.getString("director"));
        this.setProducer(rs.getString("producer"));
        this.setRelease_date(rs.getString("release_date"));
        this.setCreated(rs.getString("created"));
        this.setEdited(rs.getString("edited"));
        this.setUrl(new URL(rs.getString("url")));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getEpisode_id() {
        return episode_id;
    }

    public void setEpisode_id(int episode_id) {
        this.episode_id = episode_id;
    }

    public String getOpening_crawl() {
        return opening_crawl;
    }

    public void setOpening_crawl(String opening_crawl) {
        this.opening_crawl = opening_crawl;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public HashSet<Species> getSpecies() {
        return species;
    }

    public void setSpecies(HashSet<Species> species) {
        this.species = species;
    }

    public HashSet<Starships> getStarships() {
        return starships;
    }

    public void setStarships(HashSet<Starships> starships) {
        this.starships = starships;
    }

    public HashSet<Vehicles> getVehicles() {
        return vehicles;
    }

    public void setVehicles(HashSet<Vehicles> vehicles) {
        this.vehicles = vehicles;
    }

    public HashSet<People> getCharacters() {
        return characters;
    }

    public void setCharacters(HashSet<People> characters) {
        this.characters = characters;
    }

    public HashSet<Planets> getPlanets() {
        return planets;
    }

    public void setPlanets(HashSet<Planets> planets) {
        this.planets = planets;
    }

    public int getFilmsid() {
        return filmsid;
    }

    public void setFilmsid(int filmsid) {
        this.filmsid = filmsid;
    }

    public static String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public HashSet<Integer> getAssociatedPeopleIds(int filmId) throws SQLException, ClassNotFoundException {
        HashSet<Integer> peopleIdList = new HashSet<>();
        ResultSet peopleFilmsSet = selectFilmsFromPeopleFilms(filmId);
        while(peopleFilmsSet.next()) {
            int peopleId = peopleFilmsSet.getInt("peopleid");
            peopleIdList.add(peopleId);
        }
        return peopleIdList;
    }

    public HashSet<Integer> getAssociatedPlanetIds(int filmsId) throws SQLException, ClassNotFoundException {
        HashSet<Integer> planetsIdList = new HashSet<>();
        ResultSet filmsPlanetsSet = selectFilmsFromFilmsPlanets(filmsId);
        while(filmsPlanetsSet.next()) {
            int planetId = filmsPlanetsSet.getInt("planetsid");
            planetsIdList.add(planetId);
        }
        return planetsIdList;
    }


    public HashSet<Integer> getAssociatedSpeciesIds(int filmsId) throws SQLException, ClassNotFoundException {
        HashSet<Integer> speciesIdList = new HashSet<>();
        ResultSet filmsSpeciesSet = selectFilmsFromFilmsSpecies(filmsId);
        while(filmsSpeciesSet.next()) {
            int speciesId = filmsSpeciesSet.getInt("speciesid");
            speciesIdList.add(speciesId);
        }
        return speciesIdList;
    }

    public HashSet<Integer> getAssociatedStarshipIds(int filmsId) throws SQLException, ClassNotFoundException {
        HashSet<Integer> starshipsIdList = new HashSet<>();
        ResultSet filmsStarshipsSet = selectFilmsFromFilmsStarships(filmsId);
        while(filmsStarshipsSet.next()) {
            int starshipId = filmsStarshipsSet.getInt("starshipsid");
            starshipsIdList.add(starshipId);
        }
        return starshipsIdList;
    }

    public HashSet<Integer> getAssociatedVehicleIds(int filmsId) throws SQLException, ClassNotFoundException {
        HashSet<Integer> vehiclesIdList = new HashSet<>();
        ResultSet filmsVehiclesSet = selectFilmsFromFilmsVehicles(filmsId);
        while(filmsVehiclesSet.next()) {
            int vehicleId = filmsVehiclesSet.getInt("vehiclesid");
            vehiclesIdList.add(vehicleId);
        }
        return vehiclesIdList;
    }


    @Override
    public String toString() {
        return "Films{\n" +
                "filmsid=\n" + filmsid +
                ", title='\n" + title + '\'' +
                ", episode_id=\n" + episode_id +
                ", opening_crawl='\n" + opening_crawl + '\'' +
                ", director='\n" + director + '\'' +
                ", producer='\n" + producer + '\'' +
                ", release_date='\n" + release_date + '\'' +
                ", species=\n" + species +
                ", starships=\n" + starships +
                ", vehicles=\n" + vehicles +
                ", characters=\n" + characters +
                ", planets=\n" + planets +
                "}\n" + super.toString();
    }
}
