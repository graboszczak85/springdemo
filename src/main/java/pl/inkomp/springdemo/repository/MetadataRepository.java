package pl.inkomp.springdemo.repository;

import org.springframework.data.repository.CrudRepository;
import pl.inkomp.springdemo.model.Metadata;

import java.util.List;

public interface MetadataRepository extends CrudRepository<Metadata, Long> {

    //List<Metadata> findAll();

}
