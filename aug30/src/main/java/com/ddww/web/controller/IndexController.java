package com.ddww.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
@GetMapping("/")
public String index() {
	return "index";
}

	//크롤링 2023-08-31
	@GetMapping("/clienzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz")
	public String clien(Model model) throws IOException {
		Document clien = Jsoup.connect("https://www.clien.net/").get();
		Elements somoim = clien.select(".somoim");
		System.out.println(somoim);
		List<String> list = new ArrayList<String>();
		for (Element e : somoim) {
			//System.out.println(e.text());
			list.add(e.text());
		}
		model.addAttribute("list", list);
		return "clien";
	}
	
	
}
