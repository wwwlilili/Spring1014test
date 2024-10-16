package com.springformmvc;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import model.Office;
import model.OfficeDAO;

@RestController
@RequestMapping("/office")
public class OfficeController {
	@RequestMapping(value = "{code}", method = RequestMethod.GET)
	public String getById(@PathVariable("code") String code) {
		OfficeDAO officeDAO = new OfficeDAO();
		Office o = officeDAO.getOfficeById(code);
		Gson gson = new Gson();
		return gson.toJson(o);
	}
}
