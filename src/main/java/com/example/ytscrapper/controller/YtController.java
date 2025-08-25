package com.example.ytscrapper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ytscrapper.services.YtService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.ui.Model;



@Controller
public class YtController {
	@Autowired
	private YtService service;

	@GetMapping("/")
	public String getHome() {
		return "index.html";
	}

	@PostMapping("/processing")
	public String getData(@RequestParam String videoLink, Model model) {
		String videoId = service.extractVideoId(videoLink);
		System.out.println(videoId);
		if(videoId!=null) {
			try {
				JsonNode videoDetails = service.getVideoDetails(videoId);
				String title=videoDetails.path("title").asText();
				String description=videoDetails.path("description").asText();
				String thumUrl=videoDetails.path("thumbnails").path("standard").path("url").asText();
				String tags[]= new ObjectMapper().treeToValue(videoDetails.path("tags"),String[].class);
				
				model.addAttribute("vtitle",title);
				model.addAttribute("vdesc",description);
				model.addAttribute("vthumb",thumUrl);
				model.addAttribute("vtags",tags);
				//System.out.println(model);
				return "details.html";
				
			} catch (Exception e) {
				
				e.printStackTrace();
				return "error.html";
			}
		}
		return "error.html";
	}

}
