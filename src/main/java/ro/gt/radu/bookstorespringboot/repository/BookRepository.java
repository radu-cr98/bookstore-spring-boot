package ro.gt.radu.bookstorespringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.gt.radu.bookstorespringboot.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
}
