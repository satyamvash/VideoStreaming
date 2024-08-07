package com.video.VideoStreaming.repositories;

import com.video.VideoStreaming.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VideoRepository extends JpaRepository<Video, String> {
    Optional<Video> findByTitle(String title);
}
