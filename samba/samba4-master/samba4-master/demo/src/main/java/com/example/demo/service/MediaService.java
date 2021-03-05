package com.example.demo.service;
/**
 * The MediaService class utilizes the MediaDao interface and Media Class.
 * @author  Bernardo Grassi
 * @version 1.0
 * @since   26-02-2020
 */
import com.example.demo.dao.MediaDao;
import com.example.demo.model.Media;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MediaService {

    private final MediaDao mediaDao;

    @Autowired
    public MediaService(@Qualifier("fakeDao") MediaDao mediaDao) {
        this.mediaDao = mediaDao;
    }
    /**
     * This method inserts a new media record in the DB.
     * @param media is of type Media.
     * @return String message.
     */
    public String addMedia(Media media){
        return mediaDao.insertMedia(media);
    }

    /**
     * This method gets all the medias from the DB.
     * @return List of type Media.
     */
    public List<Media> getAllMedia() {
        return mediaDao.selectAllMedia();
    }

    /**
     * This method gets a specific media from the DB based on its ID.
     * @param id is of type int.
     * @return a Media or a string message.
     */
    public Optional<Media> getMediaById(int id){
        return mediaDao.selectMediaById(id);
    }
}