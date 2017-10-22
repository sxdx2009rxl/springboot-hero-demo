package com.gradleSpringboot.mapper;

import java.util.List;
import com.gradleSpringboot.bean.Hero;

public interface HeroMapper {
	
	public List<Hero> getAllHero() throws Exception; 
	
	public Hero getHero(int id) throws Exception;
	
	public void deleteHero(int id) throws Exception;
	
	public void insertHero(Hero hero) throws Exception;
	
	public void updateHero(Hero hero) throws Exception;
	
	public List<Hero> searchHeroes(String name) throws Exception;
}