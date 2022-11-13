package com.sam.sample.crudsample.repository;

import com.sam.sample.crudsample.ResourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface CrudRepository  extends JpaRepository<ResourceEntity, Long> {

    ResourceEntity findFirstById(@Param("id") long id);

    List<ResourceEntity> findAllBy();

    @Modifying
    @Query(value = "UPDATE ResourceEntity set name = :name WHERE id = :id")
    int updateResource(@Param("name") String name, @Param("id") long id);

    void deleteById(@Param("id") long id);
}
