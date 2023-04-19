package com.cdac.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.cdac.model.Mobile;
import com.cdac.service.MobileService;
import com.cdac.service.MobileValidator;

@Controller
public class MobileController {

	@Autowired
	private MobileService mobileService;

	@Autowired
	private MobileValidator mobileValidator;

	@RequestMapping(value = { "/mobile_add_form.htm" })
	public String mobileAddForm(ModelMap model) {
		model.put("mobile", new Mobile());
		return "mobile_add_form";
	}

	@RequestMapping(value = { "/mobile_added.htm" }, method = RequestMethod.POST)
	public String mobileAdd(Mobile mobile, BindingResult result, ModelMap model) {
		mobileValidator.validate(mobile, result);
		if (result.hasErrors())
			return "mobile_add_form";
		mobileService.insert(mobile);
		model.put("mobile", mobile);
		return "mobile_added";
	}

	@RequestMapping(value = { "/mobile_list.htm" }, method = RequestMethod.GET)
	public String mobileList(ModelMap model) {
		List<Mobile> lst = mobileService.getAll();
		model.put("mobiles", lst);
		return "mobile_list";
	}

	@RequestMapping(value = { "/mobile_delete.htm" }, method = RequestMethod.GET)
	public String mobileDelete(@RequestParam(name = "id") int id, ModelMap model) {
		mobileService.deleteById(id);
		List<Mobile> lst = mobileService.getAll();
		model.put("mobiles", lst);
		return "mobile_list";
	}

	@RequestMapping(value = { "/mobile_update_form.htm" }, method = RequestMethod.GET)
	public String mobileUpdateForm(@RequestParam(name = "id") int id, ModelMap model) {
		Mobile m = mobileService.getById(id);
		model.put("mobile", m);
		return "mobile_update_form";
	}

	@RequestMapping(value = { "/mobile_update.htm" }, method = RequestMethod.POST)
	public String mobileUpdate(Mobile mobile, ModelMap model) {
		mobileService.update(mobile);
		List<Mobile> lst = mobileService.getAll();
		model.put("mobiles", lst);
		return "mobile_list";
	}

	@RequestMapping(value = { "/mobile_upload.htm" }, method = RequestMethod.POST)
	public String mobileUpload(@RequestParam int id, @RequestParam CommonsMultipartFile image, ModelMap model,
			HttpServletRequest request) {
		try {
			ServletContext sc = request.getServletContext();
			String filePath = sc.getRealPath("images");
			Path path = Paths.get(filePath);
			if (!Files.exists(path)) {
				Files.createDirectory(path);
			}
			String fileName = image.getOriginalFilename();
			fileName = fileName.substring(fileName.lastIndexOf('.'));
			fileName = id + fileName;
			path = path.resolve(fileName);
			Files.copy(image.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
			System.out.println(path);
			mobileService.upload(id, fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<Mobile> lst = mobileService.getAll();
		model.put("mobiles", lst);
		return "mobile_list";
	}

}
