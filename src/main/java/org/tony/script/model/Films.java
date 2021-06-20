package org.tony.script.model;

import java.net.URL;
import java.util.List;

public class Films extends StarWarsObj {
    private int filmsid;
    private String title;
    private int episode_id;
    private String opening_crawl;
    private String director;
    private String producer;
    private String release_date;
    private List<URL> species;
    private List<URL> starships;
    private List<URL> vehicles;
    private List<URL> characters;
    private List<URL> planets;
    private URL url;
    private String created;
    private String edited;
    private static String path = "https://swapi.dev/api/films/";

    public Films() {
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

    public List<URL> getSpecies() {
        return species;
    }

    public void setSpecies(List<URL> species) {
        this.species = species;
    }

    public List<URL> getStarships() {
        return starships;
    }

    public void setStarships(List<URL> starships) {
        this.starships = starships;
    }

    public List<URL> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<URL> vehicles) {
        this.vehicles = vehicles;
    }

    public List<URL> getCharacters() {
        return characters;
    }

    public void setCharacters(List<URL> characters) {
        this.characters = characters;
    }

    public List<URL> getPlanets() {
        return planets;
    }

    public void setPlanets(List<URL> planets) {
        this.planets = planets;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
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


    @Override
    public String toString() {
        return "Films{" +
                "filmsid=" + filmsid +
                ", title='" + title + '\'' +
                ", episode_id=" + episode_id +
                ", opening_crawl='" + opening_crawl + '\'' +
                ", director='" + director + '\'' +
                ", producer='" + producer + '\'' +
                ", release_date='" + release_date + '\'' +
                ", species=" + species +
                ", starships=" + starships +
                ", vehicles=" + vehicles +
                ", characters=" + characters +
                ", planets=" + planets +
                ", url=" + url +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                '}';
    }
}
