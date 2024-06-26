package org.uniube.summit.repositories.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.uniube.summit.domain.Image;
import org.uniube.summit.repositories.entities.ImageEntity;
import org.uniube.summit.repositories.jpa.ImageRepositoryJPA;

import java.util.List;

@Repository
public class ImageRepository {
    @Autowired
    private ImageRepositoryJPA repositoryJPA;
    public List<ImageEntity> findAll(){
        return repositoryJPA.findAll();
    }

    public ImageEntity get(Long id){
        return repositoryJPA.findById(id).orElse(null);
    }

}
