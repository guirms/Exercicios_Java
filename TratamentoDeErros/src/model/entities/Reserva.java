package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.ErroDominio;

public class Reserva {

	private Date checkIn;
	private Date checkOut;
	private Integer numeroQuarto;

	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

	public Reserva(Date checkIn, Date checkOut, Integer numeroQuarto) throws ErroDominio {
		Date dataAtual = new Date(); {
			if (checkIn.before(dataAtual) || checkOut.before(dataAtual)) {
				throw new ErroDominio("Datas de reserva atualizadas precisam ser maiores do que a atual");
			}
			if (!checkOut.after(checkIn)){
				throw new ErroDominio("Datas de check-out precisam ser maiores do que a de check-in");
			}
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.numeroQuarto = numeroQuarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	private long noites() {
		long diferenca = checkIn.getTime() - checkOut.getTime();
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}

	public void atualizarReserva(Date checkIn, Date checkOut) throws ErroDominio {
		Date dataAtual = new Date(); {
			if (checkIn.before(dataAtual) || checkOut.before(dataAtual)) {
				throw new ErroDominio("atas de reserva atualizadas precisam ser maiores do que a atual");
			}
			if (!checkOut.after(checkIn)){
				throw new ErroDominio("Datas de check-out precisam ser maiores do que a de check-in");
			}
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		return "Quarto "
				+numeroQuarto
				+", check-in: "
				+sdf1.format(checkIn)
				+", check-out: "
				+sdf1.format(checkOut)
				+", "
				+noites()
				+" noites";
	}

}
