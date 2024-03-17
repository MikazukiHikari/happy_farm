# happy_farm

## introduction
Happy Farm" was a once-popular Facebook game. To reminisce about those good times, a text-based farming game inspired by its style has been designed. The distinctive feature of this game lies in its daily changing weather conditions, which affect plant growth. Additionally, players can choose from different professions, and there are special plants available that can help regular plants yield better harvest results.
## How to play
Open cmd in code file first, then input 'java hw5' to start the game.

This game is mainly about planting, with nine plots arranged in a grid pattern. When the program is initially executed, users will see a welcome screen. The system will then prompt for the user's name and select a profession. After inputting these details, the game can begin. At the start of each new day, the system will display the day number, weather conditions, current stamina, and money. Players will then have various commands they can execute:

### 1-Enter player name and role
### 2-Display daily information:
  2-1: The system displays the player’s name and today’s day  
  2-2: The system displays today’s weather  
  2-3: The system displays the current physical strength  
  2-4: The system displays the current money  
### 3-Input instructions: (can be chosen arbitrarily)
  3-1: Water the plants and increase the soil humidity (+5) to allow the plants to grow. The format is water [field number] (ex.water 1), and the conditions are that there is a watering machine/sufficient physical strength/the plants have been planted  
  3-2: Fill and loosen the soil, add new soil and make it soft. The format is fill and loosen [soil name] [field number] (ex.fill and loosen sand 1), the condition is that you have a hoe/sufficient physical strength/have Buy unused soil  
  3-3: Planting, planting plant seeds into the soil, the format is plant [plant name] [field number] (ex.plant mulberry 1), the condition is that you have enough physical strength/have purchased unused plants  
  3-4: Harvest fruits. When the plants bear fruits, harvest them and sell them to the store. The format is reap and sell [plant name] [field number] (ex.reap and sell mulberry 1). The condition is that you have a sickle/stamina. enough/planted Plants bear fruit  
  3-5: Buy, select an item sold in the store you want to buy. The format is buy [item sold in the store you want to buy] (ex. buy watering can/buy chicken), provided you have enough money.  
  3-6: Check the field status, displaying the surviving plants in the current field, the number of days the plant has been growing, the number of days the plant is expected to mature, the amount of fruit the plant is expected to produce, the name of the soil used in the field, and the number of days the plant is expected to mature.  
The current humidity of the ground is in the format check [field number], and the condition is sufficient physical strength  
  3-7: Sleep command, the player ends one day's behavior and enters the next day. The format is sleep, unconditional, and it will be automatically triggered when the physical strength reaches zero.  
  3-8: Heating and thawing the plants. The format is heat [plant name] [field number] (ex.heat watermelon 1). The condition is that there is a heater/sufficient physical strength/survive for more than 30 days to unlock.  
  3-9: Check the items you hold, current physical strength and money. The format is backpack, unconditional  
  3-10: Sell eggs, sell the eggs to the store. The format is sell egg, and the condition is that there are eggs (you can buy chickens after surviving for more than 30 days, and chickens have a chance to lay eggs every morning (the chance changes with the weather of the day))  
  3-11: Weather forecast, showing the probability of occurrence of various weather tomorrow. The format is weather forecast, and the condition is to unlock after surviving for more than 60 days.  
  3-12: Surrender, end the game directly. The format is surrender, and the condition is to unlock after surviving for more than 100 days.  
### 4-Repeat step 3 until...
### 5-Game over:
  5-1: If the player has no money left, there are no living plants in the field, and there is no other way to make money, the system will display "Game over! You are bankrupt" and calculate how much money is left after surviving for several days.  
  5-2: If the player chooses to surrender, the system will display "Game over! You have chosen to surrender" and calculate how many days you have survived and how much money is left.  
### 6-End process
Some commands may require certain actions to be completed beforehand. The system will remind users of what needs to be done before executing these commands. These commands repeat in a loop until the player is penniless, has no plants planted, or there are no environmental factors left for the day, signaling the end of the game.  
## playing screen shot
![image](https://github.com/MikazukiHikari/happy_farm/assets/100305577/db7fbc20-0690-4058-8ff1-242d8ec70a3d)
![image](https://github.com/MikazukiHikari/happy_farm/assets/100305577/bbcb5142-b507-42cb-ba6b-89f3e46d0486)

