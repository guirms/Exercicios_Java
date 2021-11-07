package model.exceptions;

public class ErroBanco extends Exception{
	private static final long serialVersionUID = 1L;
	
	public ErroBanco(String msg){
		super(msg);
	}

}
