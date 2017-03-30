package com.manish.springBoot.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TopicService {
	/*@Autowired
	private TopicRepositories repositories;*/

	private List<Topic> topics=new ArrayList<Topic>(Arrays.asList(new Topic("java", "core java", "core java Description"),
			new Topic("Spring core","Spring core","spring core description"),
			new Topic("ORM","Hibernate","Basic Hibernate")
			));

	public List<Topic> getAllTopics(){
		
		return topics;
	}

	public Topic getTopic(String id){

		for(int i=0;i<topics.size();i++){
			
			if(topics.get(i).getId().equals(id))
			{
				return topics.get(i);
			}
		}
		return null;
	}

	public void addTopic(Topic topic) {

		//repositories.save(topic);
		topics.add(topic);


	}

	public void updateTopic(String id,Topic topic) {
		 for(Topic t:topics){
			 
			 if(t.getId().equals(id)){
				 topics.add(topic);
			 }
		 }

	}

	public void delete(String id) {
		for(Topic t:topics){
			
			if(t.getId().equals(id)){
				topics.remove(t);
			}
		}
	}
}
