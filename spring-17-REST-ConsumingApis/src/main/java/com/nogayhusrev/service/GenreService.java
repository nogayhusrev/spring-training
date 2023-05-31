package com.nogayhusrev.service;

import com.nogayhusrev.dto.GenreDTO;

public interface GenreService {

    GenreDTO save(GenreDTO genreDTO);
    void deleteById(Long id);

}
