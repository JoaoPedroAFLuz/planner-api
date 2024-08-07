package br.com.joaopedroafluz.planner.link;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface LinkRepository extends JpaRepository<Link, Long> {

    List<Link> findAllByTripCode(UUID tripCode);

}
