package com.camiloopes.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.camilolopes.springmvc.model.Shop;

@Controller
@RequestMapping("/shop")
public class ShopJSonController {
	@RequestMapping(value="{name}", method=RequestMethod.GET)
	public @ResponseBody List<Shop> getShop(@PathVariable String name) {
		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[]{"camilo", "lopes"});
		List<Shop> listShops = new ArrayList();
		listShops.add(shop);
		return  listShops;
	}
}
