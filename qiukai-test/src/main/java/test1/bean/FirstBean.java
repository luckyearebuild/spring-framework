package test1.bean;

import org.springframework.stereotype.Service;

/**
 * @author qk
 * @version 1.0
 * @className FirstBean
 * @description
 * @date 2022/12/11 20:25
 **/
@Service
public class FirstBean {

	public void sayHello() {
		System.out.println("hello world");
	}
}
