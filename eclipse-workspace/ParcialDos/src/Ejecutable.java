
public class Ejecutable {
	public static void main(String args[]) {
		Serie Series[] = new Serie[5];
		Videojuego VideoJuegos[] = new Videojuego[5];
		
		Series[0] = new Serie("Victor es loca", 9, "Para adultos", "Victor");
		Series[1] = new Serie("Victor es loca", 8, "Para adultos", "Victor");
		Series[2] = new Serie("Victor es loca", 22, "Para adultos", "Victor");
		Series[3] = new Serie("Victor es loca", 2, "Para adultos", "Victor");
		Series[4] = new Serie("Victor es loca", 1, "Para adultos", "Victor");
		
		VideoJuegos[0] = new Videojuego("LOL", 9, "fantasia", "Nintendo");
		VideoJuegos[1] = new Videojuego("LOL", 9, "fantasia", "Nintendo");
		VideoJuegos[2] = new Videojuego("LOL", 14, "fantasia", "Nintendo");
		VideoJuegos[3] = new Videojuego("LOL", 9, "fantasia", "Nintendo");
		VideoJuegos[4] = new Videojuego("LOL", 9, "fantasia", "Nintendo");
		
		Series[0].entregar();
		Series[2].entregar();
		System.out.println(Series[0].toString());
		System.out.println(Series[2].toString());
		
		
		VideoJuegos[1].entregar();
		VideoJuegos[3].entregar();
		System.out.println(VideoJuegos[0].toString());
		System.out.println(VideoJuegos[3].toString());
		
		int c = 0;
		for(int i = 0; i < Series.length; i++) {
			if(Series[i].isEntregado() == true) {
				c = c + 1;
			}
		}
		
		System.out.println("Series entregados: " + c);

		
		int k = 0;
		for(int i = 0; i < VideoJuegos.length; i++) {
			if(VideoJuegos[i].isEntregado() == true) {
				k = k + 1;
			}
		}
		
		System.out.println("Videojuegos entregados: " + k);
		
		int maxx = 0;
		String datosSeries = null;
		
		for(int i = 0; i < Series.length; i++) {
			
			if(Series[i].getNumeroTemporadas() > maxx) {
				maxx = Series[i].getNumeroTemporadas();
				datosSeries = Series[i].toString();
			} 
		}

		System.out.println("Serie con mayor numero de temporadas: " + "\n" + datosSeries);
		
		int max = 0;
		String datos = null;
		
		for(int j = 0; j < VideoJuegos.length; j++) {
			
			if(VideoJuegos[j].getHorasEstimadas() > max) {
				max = VideoJuegos[j].getHorasEstimadas();
				datos = VideoJuegos[j].toString();
			} 
		}

		System.out.println("Videojuego con mas horas estimadas: " + "\n" + datos);
		
	}
}
