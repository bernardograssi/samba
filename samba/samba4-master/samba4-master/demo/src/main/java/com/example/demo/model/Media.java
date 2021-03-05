package com.example.demo.model;
/**
 * This project
 *
 * @author  Bernardo Grassi
 * @version 1.0
 * @since   26-02-2020
 */
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

public class Media {

    @NotNull
    @Range(min = 1, max = 100000000)
    private final int id;

    @NotBlank
    @Length(min = 1, max = 511)
    private final String name;

    @Length(min = 1, max = 511)
    private final String url;

    @Range(min = 1, max = 100000000)
    private final int duration;

    /**
     * This is the constructor method of the Media class.
     * @param id
     * @param name
     * @param url
     * @param duration
     */
    public Media(@JsonProperty("id") int id,
                 @JsonProperty("name") String name,
                 @JsonProperty("url") String url,
                 @JsonProperty("duration") int duration) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.duration = duration;
    }

    /**
     * The following four functions are the getters of the Media class.
     */

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public int getDuration() {
        return duration;
    }
}
