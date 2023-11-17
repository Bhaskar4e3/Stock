package com.example.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;


@Controller
@EnableDiscoveryClient
@RequestMapping("/ui")
public class UiController {
	@GetMapping(value = "/hi/")
	public String say() {
		return "hello";
		
	}
	@GetMapping(value = "/index")
	public String uiIndex() {
		return "index";
		
	}
	@Autowired
	private StockTotalCalc stockTotalCalc;
	@GetMapping("/getPrice")
	public String stockTotalPrice(HttpServletRequest req,Model model) {
		String companyName=req.getParameter("companyName");
		String quantity=req.getParameter("quantity");
		String view=null;
		try {
		String res=stockTotalCalc.getTotalStockPrice(companyName,Integer.parseInt(quantity));
		res="total stocks price :: "+res;
		companyName="company name :: "+companyName;
		quantity="stocks quantity ::"+quantity;
		model.addAttribute("msg", res);
		model.addAttribute("company",companyName);
		model.addAttribute("quantity",quantity);
		view="index";
		}
		catch(Exception e) {
			view="indexErr";
		}
		return view;
		
		
		
	}
	@GetMapping("/getall")
	public String getall(Model model) {
		String res=stockTotalCalc.getall();
		model.addAttribute("message", res);
		return "index";
	}
}





//String companyName=req.getParameter("companyName");
//String quantity=req.getParameter("quantity");
//String res=stockTotalCalc.getTotalStockPrice(companyName,Integer.parseInt(quantity));
//res="total stocks price :: "+res;
//companyName="company name :: "+companyName;
//quantity="stocks quantity ::"+quantity;
//model.addAttribute("msg", res);
//model.addAttribute("company",companyName);
//model.addAttribute("quantity",quantity);
