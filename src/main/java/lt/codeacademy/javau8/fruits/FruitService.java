package lt.codeacademy.javau8.fruits;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FruitService {

	List<Fruit> fruits;
	
	public FruitService() {
		fruits = new ArrayList<>();
		fruits.add( new Fruit( "Cherries", "$ 4.25", "/images/cherries.png" ) );
		fruits.add( new Fruit( "Avocados", "$ 3.88", "/images/avocados.png" ) );
		fruits.add( new Fruit( "Bananas", "$ 0.45", "/images/bananas.png" ) );
		fruits.add( new Fruit( "Watermelon", "$ 1.39", "/images/watermelon.png") );
		fruits.add( new Fruit( "Dragon fruit", "$ 7.79", "/images/dragon-fruits.png") );
		fruits.add( new Fruit( "Durian", "$ 6.39", "/images/durian.png") );
		fruits.add( new Fruit( "Lychees", "$ 2.39", "/images/lychees.png") );
		fruits.add( new Fruit( "Oranges", "$ 1.89", "/images/oranges.png") );
		fruits.add( new Fruit( "Snake fruits", "$ 8.49", "/images/snakefruit.png") );
		
	}

	public List<Fruit> findAll() {
		
		return fruits;
	}
	

	
}
