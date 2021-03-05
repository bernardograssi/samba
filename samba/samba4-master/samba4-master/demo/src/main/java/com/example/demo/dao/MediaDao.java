package com.example.demo.dao;
/**
 * The MediaDao is a basic interface used in the MediaService.java.
 *
 * @author  Bernardo Grassi
 * @version 1.0
 * @since   26-02-2020
 */
import java.util.List;
import java.util.Optional;
import java.util.Random;
import com.example.demo.model.Media;

public interface MediaDao {
    String insertMedia(Media media);
    List<Media> selectAllMedia();
    Optional<Media> selectMediaById(int id);
}