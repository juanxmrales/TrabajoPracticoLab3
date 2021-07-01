package pizzzeria;

import java.util.HashMap;

public class Data<K,V>
{
	private HashMap<K,V> listaHashMap;
	
	public Data()
	{
		listaHashMap = new HashMap<K,V>();
	}
	
	public Data(K k, V v)
	{
		listaHashMap = new HashMap<K,V>();
	}

	public HashMap<K,V> getListaHashMap() {
		return listaHashMap;
	}

	public void setListaHashMap(HashMap<K,V> listaHashMap) {
		this.listaHashMap = listaHashMap;
	}
	

}
