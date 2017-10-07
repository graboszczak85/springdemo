package pl.inkomp.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.inkomp.springdemo.model.Metadata;
import pl.inkomp.springdemo.repository.MetadataRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/metadatas")
public class MetadataGetRestController {

    @Autowired
    private MetadataRepository metadataRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Metadata> getMetadata() {
        List<Metadata> result = new ArrayList<>();
        metadataRepository.findAll().forEach(result::add);
        return result;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createMetadata(@RequestBody Metadata newRecord) {
        metadataRepository.save(newRecord);
    }

}
