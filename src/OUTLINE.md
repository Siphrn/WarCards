War Card Game [First Draft]

- Card Class
    - Each card is its own object, with attributes of SUIT and RANK
    - 52 UNIQUE Cards initialized in the beginning of the game loop.
        - For loop to loop through suits, ranks and create 52 cards.

- Player Class
    - Player assigned 26 Card Objects
    
    - Method to play a card
        - Picks card from top of their deck.
        - Removes that card from its hand
        - Enters a global table checker:
      
    - Global Table Checker Function
        - Takes in two cards as a parameter
        - Checks which player has the higher ranked card
        - Returns the player that won and the card

