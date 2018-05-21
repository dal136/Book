package com.peng;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by penghaibing on 2018/5/21 22:00.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(String reader);

}
