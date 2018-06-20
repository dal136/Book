package com.peng;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by penghaibing on 2018/5/28 23:37.
 */
public interface ReaderRepository extends JpaRepository<Reader, String> {
    Reader findByUsername(String username);
}
