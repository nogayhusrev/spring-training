package com.nogayhusrev.service;

import com.nogayhusrev.dto.MovieCinemaDTO;

import java.util.List;

public interface MovieCinemaService {

    List<MovieCinemaDTO> findAll();
    MovieCinemaDTO findById(Long id);

}
