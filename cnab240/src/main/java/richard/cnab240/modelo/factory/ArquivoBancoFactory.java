package richard.cnab240.modelo.factory;

public class ArquivoBancoFactory {
	private static ArquivoBancoFactory instance;
	
	private ArquivoBancoFactory(){
	}
	
	public static ArquivoBancoFactory getInstance(){
		if(instance==null){
			instance = new ArquivoBancoFactory();
		}
		return instance;
	}

}
