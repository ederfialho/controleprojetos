package br.com.cdp.commons.exception;

public class GlobalException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public GlobalException(String mensagem) {
	super(mensagem);
    }
}
