GitPic
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
  - [4.1 Criteria Matcher](#42-criteria-matcher)
- [5 Other Nonfunctional Requirements](#5-other-nonfunctional-requirements)
  - [5.1 Performance Requirements](#51-performance-requirements)
  - [5.2 Security Requirements](#52-security-requirements)
  - [5.3 Software Quality Attributes](#53-software-quality-attributes)


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

The scope of the product will be an intuitive program that the user can utilize to download full resolution pictures from Reddit. The product will work on the web or offline if you have an archived web page.


2 Overall Description
===================

2.1 Product Perspective
-------------------
GitPic is a windows based application for users to sit back and allow the program to scrape the web for pictures to be used as wallpapers or educational editing purposes. This program will be open source, allowing for the community to add features and fix known issues that will be found as the program develops. The benefit to the program being open source is that it will be an everlasting project that will continue to evolve over years to come.

2.2 Product Functions
-----------------

* User finds a reddit post with a picture they would like to save locally


* User copies the URL from their web browser and pastes it into the program


* User can alternatively comment on the post to download the picture



* Program will automatically scrape the web page to find the picture
    


2.3 User Classes and Characteristics
--------------------------------

There is no particular class for our program, though it is limited to the scope of users that use Reddit.

2.4 Operating Environment
---------------------

GitPic will only be available on Windows in the beginning, eventually moving onto Mac. It will not move to mobile environments, as they have their own method of saving pictures from Reddit.

2.5 Design and Implementation Constraints
-------------------------------------

User will require internet to find the Reddit post of their choosing, but the program will accept an online or archived site to scrape.

2.6 User Documentation
------------------

The program will have a ReadME explaining how to use it.

2.7 Assumptions and Dependencies
----------------------------

Our groups assumptions are that our product will mainly be used by people looking for nice wallpapers for their desktop, or pictures to practice editing on.

3 External Interface Requirements
===============================

3.1 User Interfaces
---------------

Our user interface will be a simple UI with an entry box for the Reddit URL. It may possibly have an option to log-in to your Reddit account.

3.2 Software Interfaces
-------------------

* Java

4 System Features
===============

4.1 Criteria Matcher
----------------

#### 4.1.1 Description and Priority

In GitPic, users can enter the exact URL of the Reddit post they would like to obtain a picture from.

#### 4.1.2 Stimulus/Response Sequences

Application may have links to common photography subreddits or popular picture-restricted subreddits.


5 Other Nonfunctional Requirements
================================

5.1 Performance Requirements
------------------------

GitPic should be able to download the picture as quickly as the users' internet can allow. This program will be restricted by internet speed unless the user enters an archived website. In the case of an archived website, the program should come as close to possible to having a time-complexity of O(1), wherein the users' hardware read/write speeds being the restriction.

5.2 Security Requirements
---------------------

GitPic does not require authentication to scrape pictures from public subreddits. However, the user may need to log in to comment and retrieve pictures.

5.3 Software Quality Attributes
---------------------------

Our program should work seemlessly as long as the user selects posts that have pictures uploaded directly from Reddit. Posts that reroute to other photo websites like Imgur may cause problems. However, a feature to support third-party websites may be added in the future.
