package com.ds.beanScope;

import org.springframework.stereotype.Component;

@Component
public class BeanAnnotationScopeFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "BeanAnnotationScopeFortuneService: Good Luck";
	}

}
