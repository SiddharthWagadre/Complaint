package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cg.entity.Complaint;

import com.cg.repository.ComplaintRepository;
import com.cg.service.ComplaintService;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ComplaintServiceTests {

	@MockBean
	private ComplaintRepository repo;
	
	@Autowired
	private ComplaintService foodService;
	
	Complaint food;
	List<Complaint> list;
	List<Complaint> emptyList;
	
	/*
	@Before
	public void setUp() throws Exception{
		food=new Complaint(1001, "Lunch", "Modak",200.0);
		list=new ArrayList<Complaint>();
		emptyList = new ArrayList<Complaint>();
		list.add(food);
		
	}
	
	@Test
	public void getAllFoodsShouldReturnListOfFoods(){
		Mockito.when(repo.findAll()).thenReturn(list);
		assertEquals(list,foodService.getAllFoods());
	}
	
	
	
	@Test
	public void getAllFoodsForWithZeroValuesPresentFailure(){
		Mockito.when(repo.findAll()).thenReturn(new ArrayList<>());
		assertNotEquals(list, foodService.getAllFoods());
	}
	
	
	
	@Test
	public void testAddFoodShouldReturnFood() throws FoodAlreadyExistsException {
		food=new Complaint(1001, "Lunch", "Modak",200.0);
		Mockito.when(repo.existsById(food.getFoodId())).thenReturn(false);
		Mockito.when(repo.save(food)).thenReturn(food);
		assertEquals(food, foodService.addFood(food));
	}
	
	
	
//	@Test
//	public void testUpdateFoodByIdShouldReturnFood() throws FoodNotFoundException  {
//		food=new Food(1001, "Lunch", "Modak",200.0);
//		Optional<Food>optFood=Optional.of(food);
//		Mockito.when(repo.existsById(food.getFoodId())).thenReturn(true);
//		Mockito.when(repo.findById(food.getFoodId())).thenReturn(optFood);
//		Mockito.when(repo.save(food)).thenReturn(food);
//		assertEquals(food, foodService.updateFoodInfo(food));
//	}
	
	@Test
	public void testUpdateFoodByIdShouldReturnFood() throws FoodNotFoundException  {
		food=new Complaint(1001, "Lunch", "Modak",200.0);
		Mockito.when(repo.existsById(food.getFoodId())).thenReturn(true);
		Mockito.when(repo.save(food)).thenReturn(food);
		assertEquals(food, foodService.updateFoodInfo(food));
	}
	
	@Test(expected =FoodNotFoundException.class )
	public void testUpdateFoodByIdShouldThrowFoodNotFoundException() throws FoodNotFoundException {
		food=new Complaint(1, "Lunch", "Modak",200.0);
		Mockito.when(repo.existsById(food.getFoodId())).thenReturn(false);
		foodService.updateFoodInfo(food);
	}

	@Test
	public void testDeleteFoodByFoodIdShouldReturnFood() throws FoodNotFoundException{
		
		int foodId = 1001;
		food=new Complaint(1001, "Lunch", "Modak",200.0);
		Mockito.when(repo.existsById(foodId)).thenReturn(true);
		Mockito.when(repo.findById(foodId)).thenReturn(Optional.of(food));
		assertEquals(food, foodService.deleteFoodByFoodId(foodId));	
	}
	
	@Test(expected = FoodNotFoundException.class)
	public void testDeleteHotelByHotelIdShouldThrowFoodNotFoundExceptionn() throws FoodNotFoundException{ 
		  int foodId = 1;
		  Mockito.when(repo.existsById(foodId)).thenReturn(false);
		  foodService.deleteFoodByFoodId(foodId);
	}
	 

	@Test
	public void getFoodsByTypeShouldReturnFoodList() throws FoodTypeNotFoundException{
		String type = "Lunch";
		Mockito.when(repo.findByTypeIgnoreCase(type)).thenReturn(list);
		assertEquals(list, foodService.getFoodDetailsByType(type));
	}
	
	@Test(expected = FoodTypeNotFoundException.class)
	public void getFoodsByTypeShouldThrowFoodTypeNotFoundException() throws FoodTypeNotFoundException{
		String type = "Snacks";
		Mockito.when(repo.findByTypeIgnoreCase(type)).thenReturn(emptyList);
		foodService.getFoodDetailsByType(type);		
	}
	*/
}
