package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import school.StudentBean;
import school.StudentService;
import school.StudentServiceImpl;

/**
 * @date     : 2016. 6. 23.
 * @author   : jun.dev
 * @fileName : VectorEx.java
 * @story    : 
 */
public class VectorEx {
	public static void main(String[] args) {
		List<StudentBean> v = new ArrayList<StudentBean>();
		System.out.println("======Vector생성시======");
		//System.out.println("size : "+v.size());
		StudentBean searchMan = new StudentBean();
		StudentBean hong = new StudentBean("홍길동", "hong", "123", "800101-1", "2016-06-23");
		StudentBean kim = new StudentBean("김유신", "kim", "321", "900101-2", "2016-06-23");
		StudentBean lee = new StudentBean("이순신", "lee", "213", "700101-1", "2016-06-23");
	
		v.add(hong);
		v.add(kim);
		v.add(lee);
		//System.out.println("size : "+v.size());
		//System.out.println(v.toString());
		String searchName = "홍길동";
		//searchMan = null;
		for (int i = 0; i < v.size(); i++) {
			if(v.get(i).getName().equals(searchName)){
				//int index = v.get(i).indexOf(searchname);
				searchMan = v.get(i);				
			}
		}
		if(searchName.equals(searchMan.getName())){
			System.out.println(searchMan.toString());
		}else{
			System.out.println(searchName+"라는 이름은 없습니다.");
		}
		if(v.contains(searchMan)){
			v.remove(v.indexOf(searchMan));
		}else{
			System.out.println("존재X");			
		}
		System.out.println(v);
	}
}
