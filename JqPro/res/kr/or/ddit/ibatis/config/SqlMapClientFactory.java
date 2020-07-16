package kr.or.ddit.ibatis.config;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class SqlMapClientFactory {
	private static SqlMapClient smc;
	
	static {
		try {
			// xml문서 읽어오기
			Charset charset = Charset.forName("UTF-8");		// 실행파일의 인코딩 설정
			Resources.setCharset(charset);
			
			// xml 파일 읽어오는 Reader 객체 생성
			// 웹으로 실행할때는 같은 디렉토리 안에 있어도 클래스 풀네임을 써주어야 한다.
			Reader rd = Resources.getResourceAsReader("kr/or/ddit/ibatis/config/SqlMapConfig.xml");
			
			// 위에서 읽어온 Reader 객체를 이용하여 실제 작업을 진행할 객체 생성
			smc = SqlMapClientBuilder.buildSqlMapClient(rd);
			
			// 모두 읽어온 후 자원 반납
			rd.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlMapClient getClient() {
		return smc;
	}
}