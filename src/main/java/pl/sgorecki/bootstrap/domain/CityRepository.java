package pl.sgorecki.bootstrap.domain;

import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @author Sebastian Górecki <gorecki.sebastian@gmail.com>
 */
public interface CityRepository extends Repository<City, Long> {

    List<City> findAll();

    City findByNameAndCountryAllIgnoreCase(String name, String country);
}
