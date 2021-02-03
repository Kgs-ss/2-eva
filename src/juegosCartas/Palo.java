package juegosCartas;

public enum Palo {

		CORAZONES('\u2630'), PICAS('\u2630'), TREBOLES('\u2630'), DIAMANTES('\u2630');

		private char simbolo;
		private Palo(char simbolo) {
			this.simbolo = simbolo;
		}

		public char getSimbolo() {
			return simbolo;
		}

	}


