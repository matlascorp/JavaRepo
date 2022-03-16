
public class Pokemon {
	
	private String name;
	
	private Integer HP;
	
	private boolean evolved;
	
	public Pokemon(String name, Integer HP, Boolean evolved) {
		this.name = name;
		this.HP = HP;
		this.evolved = evolved;
	}
	
	public Integer setHP(Integer value) {
		this.HP = value;
		return this.HP;
	}
	
	public String getname() {
		
		return name;
		
	}
		
	public String getPokemonName() {
			
		return name;
		
	}
		
	public Integer getPokemonHP() {
			
			return HP;
	
	}
	
	public Boolean getPokemonEvolved() {
		
		return evolved;
		
		
	}
	
	public static void main (String[] args) {
		
		Pokemon firstPokemon = new Pokemon("Bulbasaur", 100, false);
		Pokemon secondPokemon = new Pokemon("Raichu", 300, true);
		Pokemon thirdPokemon = new Pokemon ("Mewtwo", 1000, false);
		
		System.out.println(firstPokemon.getPokemonName());
		System.out.println(firstPokemon.getPokemonHP());
		System.out.println(firstPokemon.getPokemonEvolved());
		System.out.println("-------");
		firstPokemon.setHP(10);
		System.out.println(firstPokemon.getPokemonName());
		System.out.println(firstPokemon.getPokemonHP());
		System.out.println(firstPokemon.getPokemonEvolved());
		System.out.println("-------");
		System.out.println(thirdPokemon.getPokemonName());
		System.out.println(thirdPokemon.getPokemonHP());
		thirdPokemon.setHP(10);
		System.out.println(thirdPokemon.getPokemonEvolved());
		System.out.println("-------");
		

	}

	
}


