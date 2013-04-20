Programmer Profanity Preventer
==============================

A (mainly) just-for-fun tool that automatically replaces swearing from the source code files in a directory with more appropriate words. Inspired by the observations about the amount of swearing in the linux kernel - see [article] (http://durak.org/sean/pubs/kfc/) for details.

Features:
=========

* Recursively traverses a file directory and removes swearing from code files
* Replaces each term with a move appropriate word

Usage:
======

```java -jar PPP.jar```

Limitations:
============

* Only replaces based on the words and replacements currently defined in the source
* No facility for ignoring specific files is offered

TODO:

* Add the option for the user to change the swear replacement dictionary
* Move the UI stuff to a separate class
* Add ability to ignore the swearing in a file based on whether it has specific flag in its source
* Add the option for the user to changed the file suffixes checked


