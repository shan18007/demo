type AvailableDrinks = "coffee" | "tea" | "orange juice" | "lemonade";
let johnDrinks: AvailableDrinks;
johnDrinks="coffee";
//Gives error bcz maza is not available in availableDrinks
//johnDrinks = "maza";

type drinksJanesDoesntLike = "orange juice" | "coffee";
let janesDrinks: Exclude<AvailableDrinks,drinksJanesDoesntLike>;
//op will be tea and lemonade
console.log(janesDrinks);
//we cannot assign now coffe to janes 
//janesDrinks ="coffee";

type DrinksJanesLike = "tea" | "lemonade" | "mohito";
//tea and lemonade will be extracted bcz mohito is not present in Available Drinks
let janesCanDrinks: Extract<AvailableDrinks,DrinksJanesLike>;

