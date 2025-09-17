class FoodRatings {
    Map<String,Integer> foodRating = new HashMap<>();
    Map<String,String> foodCuisine = new HashMap<>();
    Map<String,TreeMap<Integer,TreeSet<String>>> cuisineRatingMap = new HashMap<>();
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        int size = foods.length;
        for(int i=0;i<size;i++){
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];

            foodCuisine.put(food,cuisine);
            foodRating.put(food,rating);
            TreeMap<Integer,TreeSet<String>> cuisineRating;
            if(cuisineRatingMap.containsKey(cuisine)){
                cuisineRating = cuisineRatingMap.get(cuisine);
            }
            else{
                cuisineRating = new TreeMap<>();
            }

            TreeSet<String> foodset;
            if(cuisineRating.containsKey(rating)){
                foodset = cuisineRating.get(rating); 
            }
            else{
                foodset = new TreeSet<>();
            }

            foodset.add(food);
            cuisineRating.put(rating,foodset);
            cuisineRatingMap.put(cuisine,cuisineRating);
        } 
    }
    
    public void changeRating(String food, int newRating) {
        int prevRating=  foodRating.get(food);
        String cuisine = foodCuisine.get(food);
        TreeMap<Integer,TreeSet<String>> cuisineRating = cuisineRatingMap.get(cuisine);
        TreeSet<String> prevfood = cuisineRating.get(prevRating);
        prevfood.remove(food);
        foodRating.put(food,newRating);
        if(prevfood.isEmpty()) cuisineRating.remove(prevRating);

        TreeSet<String> newFood;
        if(cuisineRating.containsKey(newRating)){
            newFood = cuisineRating.get(newRating);
        }
        else{
            newFood = new TreeSet<>();
        }

        newFood.add(food);
        cuisineRating.put(newRating,newFood);
    }
    
    public String highestRated(String cuisine) {
        TreeMap<Integer,TreeSet<String>> cuisineRating = cuisineRatingMap.get(cuisine);
        Integer rating = cuisineRating.lastKey();
        TreeSet<String> foods = cuisineRating.get(rating);
        String food = foods.getFirst();
        System.out.println(food);
        return food;
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */