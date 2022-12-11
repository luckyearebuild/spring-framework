package test1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test1.bean.FirstBean;
import test1.config.Config.MyConfig;

/**
 * @author qk
 * @version 1.0
 * @className Application
 * @description
 * @date 2022/12/11 20:26
 **/
public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		FirstBean firstBean = ac.getBean("firstBean", FirstBean.class);
		firstBean.sayHello();
	}
}
