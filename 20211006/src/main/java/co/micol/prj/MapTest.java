package co.micol.prj;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	private Map<String, String> map = new HashMap<String, String>();
				//k	  , v							k	,	v
	public void setMap(String id, String password) {
		map.put(id, password);
		
	}
	
	public String getMap(String id) {		//맵에서 Key 에 맞는 데이터를 가져온다.
		return map.get(id);
	}
}

