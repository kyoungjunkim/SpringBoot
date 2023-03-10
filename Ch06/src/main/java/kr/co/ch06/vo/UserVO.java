package kr.co.ch06.vo;

import groovy.transform.ToString;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserVO {
	private String uid;
	private String name;
	private String hp;
	private int age;
	
}