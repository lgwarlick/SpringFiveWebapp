package net.loganwarlick.SpringFiveWebapp.repositories;

import net.loganwarlick.SpringFiveWebapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
