package pl.sgorecki.bootstrap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sgorecki.bootstrap.domain.City;
import pl.sgorecki.bootstrap.domain.CityRepository;

import java.util.List;

/**
 * @author Sebastian Górecki <gorecki.sebastian@gmail.com>
 */
@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> fetchAllCities() {
        return cityRepository.findAll();
    }
}
