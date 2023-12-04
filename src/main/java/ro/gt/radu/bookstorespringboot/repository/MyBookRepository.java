package ro.gt.radu.bookstorespringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.gt.radu.bookstorespringboot.entity.MyBookList;

@Repository
public interface MyBookRepository extends JpaRepository<MyBookList, Integer> {

}
