package com.aiadaptive.repositories;

import java.util.*;

public interface Repository<T, ID> {

    void save(T entity);                 // Create / Update

    Optional<T> findById(ID id);         // Read

    List<T> findAll();                   // Read All

    void delete(ID id);                  // Delete
}
