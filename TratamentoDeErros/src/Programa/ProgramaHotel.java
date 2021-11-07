package Programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;
import model.exceptions.ErroDominio;

public class ProgramaHotel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Número do quarto: ");
			int numeroQuarto = sc.nextInt();
			System.out.print("Data de check-in: ");
			Date checkIn = sdf1.parse(sc.next());
			System.out.print("Data de check-out: ");
			Date checkOut = sdf1.parse(sc.next());
			
			Reserva reserva = new Reserva(checkIn, checkOut, numeroQuarto);
			System.out.println("Reserva: " + reserva);
			
			System.out.println("\nData para atualizar a reserva:");
			System.out.print("Número do quarto: ");
			numeroQuarto = sc.nextInt();
			System.out.print("Data de check-in: ");
			checkIn = sdf1.parse(sc.next());
			System.out.print("Data de check-out: ");
			checkOut = sdf1.parse(sc.next());
			
			reserva.atualizarReserva(checkIn, checkOut);
			System.out.println("Reserva: " + reserva);
		}
		catch (ParseException pe){
			System.out.println("Datas inválidas");	
		}
		catch (ErroDominio ed) {
			System.out.println("Erro na reserva " +ed.getMessage());
		}
	}

}
