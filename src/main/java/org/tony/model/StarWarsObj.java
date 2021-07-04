package org.tony.model;

import org.tony.repository.Repository;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

abstract public class StarWarsObj {

    private URL url;
    private String created;
    private String edited;

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

    public HashSet<People> getAssociatedPeople(HashSet<Integer> peopleIds) {
        HashSet<People> associatedPeople = new HashSet<>();
        for(People people: Repository.getPeopleRepository()) {
            if(peopleIds.contains(people.getPeopleid())) {
                associatedPeople.add(people);
            }
        }
        return associatedPeople;
    }

    public HashSet<Films> getAssociatedFilms(HashSet<Integer> filmIds) {
        HashSet<Films> associatedFilms = new HashSet<>();
        for(Films film: Repository.getFilmsRepository()) {
            if(filmIds.contains(film.getFilmsid())) {
                associatedFilms.add(film);
            }
        }
        return associatedFilms;
    }

    public HashSet<Planets> getAssociatedPlanets(HashSet<Integer> planetIds) {
        HashSet<Planets> associatedPlanets = new HashSet<>();
        for(Planets planet: Repository.getPlanetsRepository()) {
            if(planetIds.contains(planet.getPlanetsid())) {
                associatedPlanets.add(planet);
            }
        }
        return associatedPlanets;
    }

    public HashSet<Species> getAssociatedSpecies(HashSet<Integer> speciesIds) {
        HashSet<Species> associatedSpecies = new HashSet<>();
        for(Species species: Repository.getSpeciesRepository()) {
            if(speciesIds.contains(species.getSpeciesid())) {
                associatedSpecies.add(species);
            }
        }
        return associatedSpecies;
    }

    public HashSet<Starships> getAssociatedStarships(HashSet<Integer> starshipIds) {
        HashSet<Starships> associatedStarships = new HashSet<>();
        for(Starships starship: Repository.getStarshipsRepository()) {
            if(starshipIds.contains(starship.getStarshipsid())) {
                associatedStarships.add(starship);
            }
        }
        return associatedStarships;
    }

    public HashSet<Vehicles> getAssociatedVehicles(HashSet<Integer> vehicleIds) {
        HashSet<Vehicles> associatedVehicles = new HashSet<>();
        for(Vehicles vehicle: Repository.getVehiclesRepository()) {
            if(vehicleIds.contains(vehicle.getVehiclesid())) {
                associatedVehicles.add(vehicle);
            }
        }
        return associatedVehicles;
    }

    @Override
    public String toString() {
        return "StarWarsObj{\n" +
                "url=\n" + url +
                ", created='\n" + created + '\'' +
                ", edited='\n" + edited + '\'' +
                "}\n";
    }
}
