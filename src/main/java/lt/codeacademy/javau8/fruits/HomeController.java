package lt.codeacademy.javau8.fruits;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class HomeController {
	
	FruitService fruitService;
		
	
	public HomeController(FruitService fruitService) {
		this.fruitService = fruitService;
	}
	
	@GetMapping("/all")
	public List<Fruit> getAllFruits(){
		return fruitService.findAll();
	}
	
}
