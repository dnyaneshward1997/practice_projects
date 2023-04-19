package com.cdac.cntr;

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

import com.cdac.model.Product;
import com.cdac.service.ProductService;
import com.cdac.service.ProductValidator;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@Autowired
	private ProductValidator productValidator;

	@RequestMapping(value = { "/product_add_form.htm" })
	public String productAddForm(ModelMap model) {
		model.put("product", new Product());
		return "product_add_form";
	}

	@RequestMapping(value = { "/product_added.htm" }, method = RequestMethod.POST)
	public String productAdd(Product product, BindingResult result, ModelMap model) {
		productValidator.validate(product, result);
		if (result.hasErrors())
			return "product_add_form";
		productService.add(product);
		model.put("product", product);
		return "product_added";
	}
	
	
	@RequestMapping(value = { "/product_list.htm" }, method = RequestMethod.GET)
	public String productList(ModelMap model) {
		List<Product> lst = productService.getAll();
		model.put("products", lst);
		return "product_list";
	}

	@RequestMapping(value = { "/product_delete.htm" }, method = RequestMethod.GET)
	public String productDelete(@RequestParam(name = "id") int id, ModelMap model) {
		productService.deleteById(id);
		List<Product> lst = productService.getAll();
		model.put("products", lst);
		return "product_list";
	}

	@RequestMapping(value = { "/product_update_form.htm" }, method = RequestMethod.GET)
	public String productUpdateForm(@RequestParam(name = "id") int id, ModelMap model) {
		Product p = productService.getById(id);
		model.put("product", p);
		return "product_update_form";
	}

	@RequestMapping(value = { "/product_update.htm" }, method = RequestMethod.POST)
	public String productUpdate(Product product, ModelMap model) {
		productService.modify(product);
		List<Product> lst = productService.getAll();
		model.put("products", lst);
		return "product_list";
	}

	@RequestMapping(value = { "/product_upload.htm" }, method = RequestMethod.POST)
	public String productUpload(@RequestParam int id, @RequestParam CommonsMultipartFile image, ModelMap model,
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
			productService.upload(id, fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<Product> lst = productService.getAll();
		model.put("products", lst);
		return "product_list";
	}
}
