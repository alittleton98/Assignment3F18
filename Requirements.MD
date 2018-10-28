FoodSwipe
===================
###### Sammy Macrito, Andrew Littleton, Brandon Moy, Neha Patel, Kyle Lieu


- [1 Introduction](#1-introduction)
  - [1.1 Purpose](#11-purpose)
  - [1.2 Document Conventions](#12-document-conventions)
  - [1.3 Intended Audience and Reading Suggestions](#13-intended-audience-and-reading-suggestions)
  - [1.4 Product Scope](#14-product-scope)
  - [1.5 References](#15-references)
- [2 Overall Description](#2-overall-description)
  - [2.1 Product Perspective](#21-product-perspective)
  - [2.2 Product Functions](#22-product-functions)
  - [2.3 User Classes and Characteristics](#23-user-classes-and-characteristics)
  - [2.4 Operating Environment](#24-operating-environment)
  - [2.5 Design and Implementation Constraints](#25-design-and-implementation-constraints)
  - [2.6 User Documentation](#26-user-documentation)
  - [2.7 Assumptions and Dependencies](#27-assumptions-and-dependencies)
- [3 External Interface Requirements](#3-external-interface-requirements)
  - [3.1 User Interfaces](#31-user-interfaces)
  - [3.2 Software Interfaces](#32-software-interfaces)
- [4 System Features](#4-system-features)
  - [4.1 Swipe Function](#41-swipe-function)
  - [4.2 Criteria Matcher](#42-criteria-matcher)
- [5 Other Nonfunctional Requirements](#5-other-nonfunctional-requirements)
  - [5.1 Performance Requirements](#51-performance-requirements)
  - [5.2 Security Requirements](#52-security-requirements)
  - [5.3 Software Quality Attributes](#53-software-quality-attributes)
- [6 Market Research](#6-market-research)
  - [6.1 Primary Market Research](#61-primary-market-research)
  - [6.2 Secondary Market Research](#62-secondary-market-research)

1 Introduction
============

1.1 Purpose
--------

The purpose of GitPic is to allow fellow Reddit users to download pictures to their computer easily from a webpage. The program will also allow the user to pick the save location of the picture on his/her computer. This can be achieved either through entering the link to the desired post to attain the picture, or commenting on that post, selecting your save location in the UI. After this, the program will use web scraping to find the picture on the web page and save it to your device.

1.2 Document Conventions
--------------------

This project will use a simple UI in either command prompt or a very basic pop-up window. Within that, it will allow the user to specify the reddit URL as well as a save location for their computer. This will require the program to be able to read/write files onto the computer.

1.3 Intended Audience and Reading Suggestions
-----------------------------------------

The intended audience for GitPic is any user of reddit on a desktop environment. This program will be great for anyone that wants to save pictures from reddit, which is mostly popular on Earth photography subreddits because users enjoy using the pictures for wallpapers. This product will be useful to the normal user because as you are browsing, you can quickly comment on the post so the program will save it to the computer for you to worry about at a later date.

1.4 Product Scope
-------------

After users enter their determined restrictions including distance from the user’s location, their own dietary restrictions, etc., users will then get “cards” of restaurants that fit their requirements. These cards will provide an image of the restaurant or food from the restaurant, in which users will be able  to “thumbs up”( or swipe right) or “thumbs down”(or swipe left) to each restaurant presented. The "thumbs up"(or swiping right) indicates that the user is interested in the restaurant and will be added to a list, which the user can choose from  at the end. "Thumbs down" (or swiping left) indicates that the user is not interested and the restraunt will not be shown again in this search or added to the list at the end. The reason that the user is given the choice to either "thumbs up"/"thumbs down" or swipe left or right  is because we want to offer users an option in case their device has issues with either function.



2 Overall Description
===================

2.1 Product Perspective
-------------------

FoodSwipe™ is a mobile application designed to help users locate a restaurant that fits their dietary restrictions and otherwise. However, FoodSwipe™ is a self-contained product. A long-term goal would be to attach FoodSwipe™ to other sites for reviews, such as Yelp, Google Reviews, or TripAdvisor. FoodSwipe™ was conceived as a tool for users to decide on local food option in their area, designed in response to the growing number of food options and how difficult it has become for our users to decide between them.

The system of FoodSwipe™ is to be initially designed as a mobile application. The app will need to communicate with the user’s GPS in order to view the restaurants in the user’s vicinity. This functionality will be embedded into FoodSwipe™ so that other functions in the application may be accessed without any transition between applications.

The second part of the system will be a database used to store and reference information on restaurants around Loyola, as our first version. This database will be maintained separately from the application.

2.2 Product Functions
-----------------

* Our users choose the types of restaurants they want food from


* We take user’s current location into consideration


* The user then will be taken to a main menu, featuring “cards” of each restaurant is displayed, where the user can swipe right (approve) or swipe left (disapprove) on restaurants.



* The user can access their approved restaurants in their "Favorites" tab. When a restaurant is clicked on, the user will be brought to Google Maps with the restaurant's location.
    


2.3 User Classes and Characteristics
--------------------------------

We are going for simple and minimalistic so people can quickly decide what to eat. Since this is a food app, there is no target age or gender. However, FoodSwipe™ may be more useful for people in urban areas where there is a wide variety of restaurants to choose from in the area.

2.4 Operating Environment
---------------------

FoodSwipe™ will be compatible with Apple and Android smartphones because we are using React-Native, which helps us be able to make the app cross-platform. 

2.5 Design and Implementation Constraints
-------------------------------------

Internet connection is required to properly use FoodSwipe™, and the restaurants will be limited to the user’s area. New restaurants might be left out due to lack of information and appearance on Yelp or Google.

2.6 User Documentation
------------------

We will have several sources of documentation, including: user manuals, tutorials, and FAQ’s.

2.7 Assumptions and Dependencies
----------------------------

Our assumptions are that FoodSwipe™ will be used primarily within the application on the user’s mobile device. The application may not work as intended, crash, or provide inaccurate location data if the platform does not have the hardware resources available. We are also assuming that the GPS will work uniformly within browser platforms. We will be developing for Android 6.0 Marshmallow and up and iOS 10.1.1 and up.

3 External Interface Requirements
===============================

3.1 User Interfaces
---------------

Our user interface will be using a “card” interface, similar to applications such as Tinder. This user interface will allow users to “thumbs up” (or swipe right) and “thumbs down”(or swipe left) restaurants that fit their criteria.

![Alt text](/doc/WireFrame.png)
![Alt text](/doc/WireFrame2.png)
![Alt text](/doc/WireFrame3.png)


3.2 Software Interfaces
-------------------

* React-native
* Redux 

4 System Features
===============

4.1 Swipe Function
----------------

#### 4.1.1 Description and Priority

The swipe function is of high priority for FoodSwipe™. After inputting their criteria, the swipe functions allows the users to determine their restaurants of choice.

#### 4.1.2 Stimulus/Response Sequences

The swipe function is dynamic to the user’s interactions. Users can swipe right or “thumbs up”(or swipe right) restaurants they do like, and swipe left or “thumbs down”(or swipe left) on restaurants that they don’t like, or they feel like does not match their criteria.

4.2 Criteria Matcher
----------------

#### 4.2.1 Description and Priority

Within the FoodSwipe™ application, users input specific criteria for the restaurants they are searching for. Users can enter keywords that best identify with what they want.

#### 4.2.2 Stimulus/Response Sequences

Users are given the opportunity to enter keywords that best identify with what they’re interested in, in terms of restaurants. This search option would include: vegan/vegetarian options, gluten-free, Halal/Kosher, specific allergies, etc.


5 Other Nonfunctional Requirements
================================

5.1 Performance Requirements
------------------------

FoodSwipe™ should be able to quickly receive and usefully relay information to the users, no delays if possible. Once the user has designated the category of food they are searching for, they will be able to swipe through the available options. The goal is for users to have no delay when searching for restaurants. The user will be able to view detailed and accurate information once a restraunt has been selected. The user experience should be smooth and up-to-date so that they can have the best experience possible.

5.2 Security Requirements
---------------------

User authentication may be added at a later point in the project. However, the initial design does not require it.

5.3 Software Quality Attributes
---------------------------

We’re developing an app with cross-compatibility because of react-native. The information from the restaurants will be coming from the restaurants themselves, so the info will be as accurate as they make it online. Reliability depends on internet connection. Testing will be done in small focus groups before a release. It will be available on Google Play so we can provide the link to people with Android phones. Our intention is to show our focus groups how to navigate throughout the application, however the developers for FoodSwipe™ have in their utmost priority to make the interface seem familiar, without the need of teaching users how to operate the application.

6 Market Research
================================

6.1 Primary Market Research
---------------------------

This includes research gauging what our audience was looking for in an app. 
We included secondary market research under our References.

![Alt text](/doc/InterestGraph.png)
![Alt text](/doc/PrioritiesGraph.png)
![Alt text](/doc/DistancePieChart.png)

6.2 Secondary Market Research
---------------------------

Restaurants have seen a serious rise since 2001, providing a much wider diversity for users, and a more intense need for users to choose what services them best. More information located in a news article [here](https://www.nytimes.com/2017/10/31/business/too-many-restaurants-wall-street.html).

Online ordering provides a sense of control to the customers, increased order frequency, and contributed to savings of labor as cited [here](http://scholarship.sha.cornell.edu/cgi/viewcontent.cgi?article=1072&context=chrpubs).
