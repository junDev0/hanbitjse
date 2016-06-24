package collection;

import java.util.HashSet;
import java.util.Set;

import school.StudentBean;

/**
 * @date     : 2016. 6. 23.
 * @author   : jun.dev
 * @fileName : HashSetEx.java
 * @story    : 
 */
public class HashSetEx {
	public static void main(String[] args) {
		String [] str = {"Java","Beans","Java","XML"};
		
		Set<StudentBean> stu = new HashSet<StudentBean>();

		StudentBean hong = new StudentBean("홍길동", "hong", "123", "800101-1", "2016-06-23");
		StudentBean kim = new StudentBean("김유신", "kim", "321", "900101-2", "2016-06-23");
		StudentBean lee = new StudentBean("이순신", "lee", "213", "700101-1", "2016-06-23");
		
		
		stu.add(hong);
		stu.add(kim);
		stu.add(lee);
		System.out.println();
	}
}
