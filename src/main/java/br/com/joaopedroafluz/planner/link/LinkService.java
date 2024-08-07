package br.com.joaopedroafluz.planner.link;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class LinkService {

    private final LinkRepository linkRepository;

    public List<Link> findAllByTripCode(UUID tripCode) {
        return linkRepository.findAllByTripCode(tripCode);
    }

    public Link save(Link link) {
        return linkRepository.save(link);
    }

}
