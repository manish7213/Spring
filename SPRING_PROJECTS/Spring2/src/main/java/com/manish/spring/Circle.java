package com.manish.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;
@Component
public class Circle implements ShapeInterface,ApplicationEventPublisherAware{
	
	private Point center;
	private MessageSource messageSource;
	private ApplicationEventPublisher publisher;
	
	

	public MessageSource getMessageSource() {
		return messageSource;
	}
	@Autowired
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	public Point getCenter() {
		return center;
	}
	/*@Autowired
	@Qualifier("circle_related")*/
	@Resource(name="point2")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println(this.messageSource.getMessage("circle.draw",null,"Default Circle draw",null));
		System.out.println(this.messageSource.getMessage("point.draw",new Object[] {center.getX(),center.getY()},"Default point draw",null));
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
		
		//System.out.println(this.messageSource.getMessage("greeting",null,"Default Greeting",null));
		
	}
	@PostConstruct
	public void initializeCircle(){
		
		System.out.println("After initialize");
	}
	@PreDestroy
	public void destroyCircle(){
		System.out.println("Before Destroy");
	}
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher=publisher;
	}
	
	

}
