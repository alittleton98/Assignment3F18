# README

# Purpose
- The purpose of GitPic is to allow fellow Reddit users to download pictures to their computer easily from a webpage. The program will also allow the user to pick the save location of the picture on his/her computer. This can be achieved either through entering the link to the desired post to attain the picture, or commenting on that post, selecting your save location in the UI. After this, the program will use web scraping to find the picture on the web page and save it to your device and project the image enlarged onto the users screen.

# GUI Display
1. Interactive pop up java window will display on the users screen
2. will have a combo box of options of where you can choose to place your soon to be downloaded image
3. URL imput bar will be located at the top in which the user will past a URl to a reddit page where an image will be scraped and down loaded on to the users machine
4. Begin image scrape button will be an option on the pop up window, for it runs another java file that downloads an image off of website and downloads it into the designated location on the machine.
5. Once the image hass been sucesfully scraped and downloaded another java pop up window will appear showing the downloaded image.
6. If the user wishes to exit the program there is an exit button that force shuts down the program.

# Images.java
- Images.java is the code that works inside of the GUI display that runs all the actual functions of the program.
1. A web scraper is added to take an valid inputted URL withholding an Image and will hold onto the image as a file
2. A folder path command is present to save the file in any location valid in the machine (location options provided in the GUI display)
3. After the image file is downloaded the file is displayed to the user

# Instructions 
1. Run the GUI.java main to activate the program (Images.java will not work unless GUI.java main method is activated)
2. Insert or paste a valid reddit URL into the URL search bar
2. Click the option labled "choose Location", and pick an option of where you want the image to be saved on your machine
3. Click the button labled "begin image scrape"
4. If you wish to close the prpgram entirely click the button labled "exit"

# Project Approach
- 
-
-
-
