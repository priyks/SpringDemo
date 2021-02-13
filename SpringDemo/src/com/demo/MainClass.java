/**
 * 
 */
package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**In this class we are getting the object of Employee class from the IOC container 
 * using the getBean() method of BeanFactory
 * 
 * @author priyankaku
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BeanFactory employeeFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Employee emp=(Employee) employeeFactory.getBean("Employeebean");
		System.out.println(emp.geteName());
		System.out.println(emp.geteSalary());
		

	}

}
