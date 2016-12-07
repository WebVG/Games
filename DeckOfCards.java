public class DeckOfCards {
	public static void main (String[] args) {
		
		// amount of cards in the deck, card types, sub-sets of cards, card name //
		int[] deck = new int[60]
		String[] Dcolor = ("black, blue, green, white, red");
		string[] Dtype = ("artifact, creature, enchantment, instant, land, planeswalker, tribal, sorcery");
		string[] Dsubtype = ("basic, legendary, snow, world");
		string[] Cname = ("");
		
		// this is the code to shuffle a deck to a certain amaount, it needs work //
		// I think parameteres would be used to include//
		/* artifact = 5, creature = 15, enchantment = 10, instant = 10, land = 5, planeswalker = 5, tribal = 5, 
		sorcery = 5
		*/ 
		for ( int i = 0; i < deck.length; i++) deck[i] = i;
		
		for ( int i = 0; i < deck.length; i++) {
			
				int index = (int)(Math.random() * deck.length); // randomize//
				int temp = deck[i];
				deck(i) = deck[index];
				deck[index] = temp;
		}
		
		for ( int i = 0; i < deck.length; i++) {
			String Dcolor = Dcolor[deck[i] / 1]; // this should create a random deck of 1 color // 
			String Dtype = Dtype[deck[i] % 8]; // made of 8 types
			// String Dsubtype = Dsubtype[deck[i] % 4]; * this sould make a refined randomized query *// 
			System.out.printin("Card " + Cname + " " + deck[i] + ": " + Dcolor + " or " + Dtype);
		}
	}
}

		