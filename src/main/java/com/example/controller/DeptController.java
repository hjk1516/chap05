package com.example.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.DeptVO;
import com.example.repository.DeptRepository;

import lombok.extern.java.Log;

@Controller
@RequestMapping("/dept")
@Log
public class DeptController {

	@Inject
	DeptRepository deptrepository;

	@GetMapping("/list")
	public String list(Model model) {

		log.info("/dept/list 호출됨");

		List<DeptVO> depts = deptrepository.findAll();
		depts.forEach(e -> {
			System.out.println(e);
		});
		model.addAttribute("depts",depts);

		return "jsp/dept/list";
	}
}
