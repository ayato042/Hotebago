package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class HetebagoController {

	Date date = new Date();
	SimpleDateFormat format = new SimpleDateFormat("k");

	@GetMapping("/hotebago")
	public String hotebago(Model model) {

		model.addAttribute("date", format.format(date));
		return "index";
	}

	@GetMapping("return")
	public String returns(Model model) {
		model.addAttribute("date", format.format(date));
		return "index";
	}

	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}

	@PostMapping("/result")
	public String result(@Validated Info info, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("date", format.format(date));
			model.addAttribute("error", "※時刻を再選択してください");
			return "index";
		}
		if((info.getTime() > 26) || info.getTime() < 15) {
			model.addAttribute("date", format.format(date));
			model.addAttribute("error", "※時刻を再選択してください");
			return "index";
		}
		
		if(info.getPlace().equals("yokohama")) {
			if(info.getDate().equals("weekday")) {
				switch(info.getTime()) {				
				case 15:
				case 16:
					model.addAttribute("result1", "HOTEL SARASA");
					model.addAttribute("result2", "該当なし");
					model.addAttribute("result3", "該当なし");
					model.addAttribute("price1", "9050");
					model.addAttribute("price2", "");
					model.addAttribute("price3", "");
					break;
				case 17:
					model.addAttribute("result1", "HOTEL SARASA");
					model.addAttribute("result2", "HOTEL PLAGE");
					model.addAttribute("result3", "該当なし");
					model.addAttribute("price1", "9050");
					model.addAttribute("price2", "9600");
					model.addAttribute("price3", "");
					break;
				case 18:
					model.addAttribute("result1", "HOTEL SARASA");
					model.addAttribute("result2", "HOTEL ZAFIRO");
					model.addAttribute("result3", "HOTEL Belta");
					model.addAttribute("price1", "9050");
					model.addAttribute("price2", "9400");
					model.addAttribute("price3", "9400");
					break;
				case 19:
					model.addAttribute("result1", "ホテル二番館別館");
					model.addAttribute("result2", "HOTEL SARASA");
					model.addAttribute("result3", "HOTEL ZAFIRO");
					model.addAttribute("price1", "6900(全室均一)");
					model.addAttribute("price2", "9050");
					model.addAttribute("price3", "9400");
					break;
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
					model.addAttribute("result1", "ホテル二番館別館");
					model.addAttribute("result2", "北欧");
					model.addAttribute("result3", "リビエラ");
					model.addAttribute("price1", "6900(全室均一)");
					model.addAttribute("price2", "7900");
					model.addAttribute("price3", "8150");
					break;
				case 25:
				case 26:
				case 27:
					model.addAttribute("result1", "ホテル二番館別館");
					model.addAttribute("result2", "HOTEL PLAGE");
					model.addAttribute("result3", "北欧");
					model.addAttribute("price1", "6900(全室均一)");
					model.addAttribute("price2", "7350(全室均一)");
					model.addAttribute("price3", "7900");
					break;
				}
			}
			if(info.getDate().equals("friday")) {
				switch(info.getTime()) {
				case 15:
				case 16:
					model.addAttribute("result1", "該当なし");
					model.addAttribute("result2", "該当なし");
					model.addAttribute("result3", "該当なし");
					model.addAttribute("price1", "");
					model.addAttribute("price2", "");
					model.addAttribute("price3", "");
					break;
				case 17:
				case 18:
				case 19:
					model.addAttribute("result1", "HOTEL PLAGE");
					model.addAttribute("result2", "該当なし");
					model.addAttribute("result3", "該当なし");
					model.addAttribute("price1", "9600");
					model.addAttribute("price2", "");
					model.addAttribute("price3", "");
					break;
				case 20:
					model.addAttribute("result1", "HOTEL PLAGE");
					model.addAttribute("result2", "HOTEL VIGAD");
					model.addAttribute("result3", "HOTEL Belta");
					model.addAttribute("price1", "9600");
					model.addAttribute("price2", "11900");
					model.addAttribute("price3", "12400");
					break;
				case 21:
					model.addAttribute("result1", "HOTEL PLAGE");
					model.addAttribute("result2", "HOTEL VIGAD");
					model.addAttribute("result3", "HOTEL Angel");
					model.addAttribute("price1", "9600");
					model.addAttribute("price2", "11900");
					model.addAttribute("price3", "12200");
					break;
				case 22:
					model.addAttribute("result1", "ホテル二番館別館");
					model.addAttribute("result2", "HOTEL LaSee");
					model.addAttribute("result3", "HOTEL PLAGE");
					model.addAttribute("price1", "7900(全室均一)");
					model.addAttribute("price2", "9300");
					model.addAttribute("price3", "9600");
					break;
				case 23:
				case 24:
				case 25:
					model.addAttribute("result1", "ホテル二番館別館");
					model.addAttribute("result2", "HOTEL LaSee");
					model.addAttribute("result3", "HOTEL PLAGE");
					model.addAttribute("price1", "7900(全室均一)");
					model.addAttribute("price2", "9300");
					model.addAttribute("price3", "9600");
					break;
				}
			}
			if(info.getDate().equals("weekend")) {
				switch(info.getTime()) {
				case 15:
				case 16:
				case 17:
				case 18:
				case 19:
					model.addAttribute("result1", "該当なし");
					model.addAttribute("result2", "該当なし");
					model.addAttribute("result3", "該当なし");
					model.addAttribute("price1", "");
					model.addAttribute("price2", "");
					model.addAttribute("price3", "");
					break;
				case 20:
				case 21:
					model.addAttribute("result1", "HOTEL PLAGE");
					model.addAttribute("result2", "HOTEL Belta(祝前のみ)");
					model.addAttribute("result3", "HOTEL ZAFIRO(祝前のみ)");
					model.addAttribute("price1", "10600");
					model.addAttribute("price2", "12400");
					model.addAttribute("price3", "12750");	
					break;
				case 22:
					model.addAttribute("result1", "ホテル二番館別館");
					model.addAttribute("result2", "HOTEL SARASA(22:30〜)");
					model.addAttribute("result3", "HOTEL LaSee");
					model.addAttribute("price1", "7900");
					model.addAttribute("price2", "9700");
					model.addAttribute("price3", "10300");
					break;
				case 23:
				case 24:
				case 25:
					model.addAttribute("result1", "ホテル二番館別館");
					model.addAttribute("result2", "HOTEL SARASA");
					model.addAttribute("result3", "HOTEL LaSee");
					model.addAttribute("price1", "7900");
					model.addAttribute("price2", "9700");
					model.addAttribute("price3", "10300");
					break;
				}
			}
		}
		return "result";
	}
}
