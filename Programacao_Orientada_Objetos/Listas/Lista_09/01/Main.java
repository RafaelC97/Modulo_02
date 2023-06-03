public class Main
{
	public static void main(String[] args) {
		Pokedex pokedex = new Pokedex();
		
		pokedex.adicionarPokemon(new Pokemon("001", "Bulbasauro", "Grama"));
		pokedex.adicionarPokemon(new Pokemon("004", "Charmander", "Fogo"));
		pokedex.adicionarPokemon(new Pokemon("007", "Squirtle", "Água"));
		
		System.out.println(pokedex.getPokemons().get("001").getNome());
	}
}
