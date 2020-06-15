package net.loganwarlick.SpringFiveWebapp.repositories;

import net.loganwarlick.SpringFiveWebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
