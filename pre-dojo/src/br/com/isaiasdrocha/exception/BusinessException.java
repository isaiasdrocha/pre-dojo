package br.com.isaiasdrocha.exception;

public class BusinessException extends RuntimeException{

	/*****************************************************************/
	/****************************ATRIBUTOS****************************/
	/*****************************************************************/
	private static final long serialVersionUID = 8025701291548994863L;

	
	/*****************************************************************/
	/*****************************METODOS*****************************/
	/*****************************************************************/
	public BusinessException(String message){
		super(message);
	}
	
	public BusinessException(Throwable exception){
		super( exception );
	}
	
	public BusinessException(String message, Throwable exception){
		super(message, exception);
	}
}