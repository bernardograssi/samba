package com.example.demo.dao;
/**
 * The MediaData deals with the operations involving the database.
 *
 * @author  Bernardo Grassi
 * @version 1.0
 * @since   26-02-2020
 */
import com.example.demo.model.Media;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("fakeDao")
public class MediaData implements MediaDao {

    private static List<Media> DB = new ArrayList<>();

    /**
     * This method inserts a media in the DB.
     * @param mediaToInsert is of type Media.
     * @return String message.
     */
    @Override
    public String insertMedia(Media mediaToInsert) {
        Optional<Media> exists = Optional.empty();

        exists = selectMediaById(mediaToInsert.getId());

        if(exists.equals(Optional.empty())) {
            DB.add(new Media(mediaToInsert.getId(), mediaToInsert.getName(), mediaToInsert.getUrl(), mediaToInsert.getDuration()));
        }

        else {
            return "Error. ID already exists. Please try a new ID.";
        }

        return "Insert Successful.";
    }

    /**
     * This method returns the database.
     * @return List of type Media.
     */
    @Override
    public List<Media> selectAllMedia() {
        return DB;
    }

    /**
     * This method returns a specific media from the database based on its ID.
     * @param id is of type int.
     * @return a Media.
     */
    @Override
    public Optional<Media> selectMediaById(int id) {
        return DB.stream()
                .filter(media -> media.getId() == (id))
                .findFirst();
    }
}