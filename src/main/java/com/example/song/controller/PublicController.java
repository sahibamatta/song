package com.example.song.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.song.dto.SongDto;

@RestController
@RequestMapping("public")
public class PublicController {

	List<SongDto> songDtos = new ArrayList<>();

	@GetMapping("/get")
	public List<SongDto> getSong() {
		return songDtos;
	}
	
	@PostMapping("/post")
	public void postSong(@RequestBody SongDto songDto) {
		System.out.println("songDto ["+songDto+"]");
		songDtos.add(songDto);
	}

}
