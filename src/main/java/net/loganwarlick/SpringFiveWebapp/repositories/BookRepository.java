package net.loganwarlick.SpringFiveWebapp.repositories;

import net.loganwarlick.SpringFiveWebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
