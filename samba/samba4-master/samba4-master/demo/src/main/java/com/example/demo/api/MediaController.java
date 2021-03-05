package com.example.demo.api;
/**
 * The MediaController handles HTTP requests.
 *
 * @author  Bernardo Grassi
 * @version 1.0
 * @since   26-02-2020
 */
import com.example.demo.model.Media;
import com.example.demo.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@RequestMapping("medias")
@RestController
public class MediaController {

    private final MediaService mediaService;

    /**
     * mediaService constructor method.
     */
    @Autowired
    public MediaController(MediaService mediaService) {
        this.mediaService = mediaService;
    }

    /**
     * This method handles POST requests to add media.
     * @param media is of type Media.
     * @return String message.
     */
    @PostMapping
    public String addMedia(@Valid @NotNull @RequestBody Media media) {
        return mediaService.addMedia(media);
    }

    /**
     * This method handles GET requests to get all the medias.
     * @return List of type Media.
     */
    @GetMapping
    public List<Media> getAllMedia(){
        return mediaService.getAllMedia();
    }

    /**
     * This method handles GET requests to get a specific media based on its ID.
     * @param id is of type int.
     * @return a Media or a string message.
     */
    @GetMapping(path = "/{id}")
    public Object getMediaById(@PathVariable("id") int id){
        Optional<Media> mediaSelected = mediaService.getMediaById(id);

        if(mediaSelected.equals(Optional.empty())){
            return "Selected media ID:" +id +", does not exist.";
        }
        return mediaService.getMediaById(id);
    }

}
