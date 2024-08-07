package com.video.VideoStreaming.services.impl;

import com.video.VideoStreaming.entities.Video;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class VideoService implements com.video.VideoStreaming.services.VideoService {
    @Override
    public Video save(Video video, MultipartFile file) {

        //create path: create

        //folder path with fileName

        //copy file to the folder
        return null;
    }

    @Override
    public Video get(String videoId) {
        return null;
    }

    @Override
    public Video getByTitle(String title) {
        return null;
    }

    @Override
    public List<Video> getAll() {
        return null;
    }
}
