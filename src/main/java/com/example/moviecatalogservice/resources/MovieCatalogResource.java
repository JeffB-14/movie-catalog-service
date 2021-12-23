package com.example.moviecatalogservice.resources;

import com.example.moviecatalogservice.models.CatalogItem;
import com.example.moviecatalogservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){
        //get all rated movie ids
            //hard coded for initial testing
        List<Rating> ratings = Arrays.asList(
                new Rating(1234, 4),
                new Rating(5678,3)
        );

        return ratings.stream().map(rating -> {
            new CatalogItem("Transformers", "Movie description", 4)
        })
                .collect(Collectors.toList());
        //for each movie id, call movie info service and get details

        //put them all together

    }
}
