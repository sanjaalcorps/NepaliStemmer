# NepaliStemmer
Nepali Stemmer for Natural Language Processing, Machine Learning and more. This is a part of the Nepali Natural Language project that I am currently developing in private (Bitbucket). This portion is released for public use, review and improvement. I will be releasing other useful components slowly, or to someone who is willing to volunteer to my project.

@author Kushal Paudyal
www.inepal.org | www.icodejava.com

#### Disclaimer: Not a final solution. Use it at your own risk.
##### Developers - Feel free to fork it and send me pull requests with your improvements.
#### Found issues? Report it via Issues Tab.

## Usage
<blockquote>String root = NepaliStemmer.getNepaliRootWord(someCompoundWord);</blockquote>

This stemmer is based on 
WordEndings (e.g. स्थानलगायत where लगायत is the WordEnding),
Name Endings (e.g. रामकुमार where कुमार is the Name Ending),
Place Endings ,
Suffixes

It strips off those compound word forming text from the word.

Prefixes have not been integrated yet.

## Need to add more to the list?
See the following files

src/main/java/org/inepal/products/nlp/compounds/CompoundWordEnding.java
src/main/java/org/inepal/products/nlp/compounds/CompoundWordEndingPeopleName.java
src/main/java/org/inepal/products/nlp/compounds/CompoundWordEndingPlaces.java
src/main/java/org/inepal/products/nlp/compounds/NepaliSuffixes.java
src/main/java/org/inepal/products/nlp/compounds/NepaliPrefixes.java

## How to contact me?
I am available at LinkedIn. You can contact me via there. https://www.linkedin.com/in/kushalp/

