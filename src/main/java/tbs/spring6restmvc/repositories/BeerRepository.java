package tbs.spring6restmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tbs.spring6restmvc.entities.Beer;

import java.util.UUID;

public interface BeerRepository extends JpaRepository<Beer, UUID> {
}
