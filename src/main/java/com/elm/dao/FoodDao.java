package com.elm.dao;
import java.util.List;
import com.elm.dao.impl.po.Food;
public interface FoodDao {
    public List<Food> listFoodByBusinessId(Integer businessId);
    public int saveFood(Food food);
    public Food getFoodById(Integer foodId);
    public int updateFood(Food food);
    public int removeFood(Integer foodId);
}
