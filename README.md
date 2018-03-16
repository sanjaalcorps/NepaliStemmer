# NepaliStemmer
Nepali Stemmer for Natural Language Processing, Machine Learning and more

@author Kushal Paudyal
www.inepal.org | www.icodejava.com

## Usage
<blockquote>String root = NepaliStemmer.getNepaliRootWord(someCompoundWord);</blockquote>

This stemmer is based on 
WordEndings (e.g. स्थानलगायत where लगायत is the WordEnding)
Name Endings (e.g. रामकुमार where कुमार is the Name Ending)
Place Endings 
Suffixes

It strips off those compound word forming text from the word.

Prefixes have not been integrated yet.

## Need to add more to the list?
See the following files

<a href="https://github.com/kushalzone/NepaliStemmer/blob/master/src/main/java/org/inepal/products/nlp/compounds/CompoundWordEnding.java">CompoundWordEnding</a>

<a href="https://github.com/kushalzone/NepaliStemmer/blob/master/src/main/java/org/inepal/products/nlp/compounds/CompoundWordEndingPeopleName.java">CompoundWordEndingPeopleName.java</a>

<a href="https://github.com/kushalzone/NepaliStemmer/blob/master/src/main/java/org/inepal/products/nlp/compounds/CompoundWordEndingPlaces.java">CompoundWordEndingPlaces</a>

<a href="https://github.com/kushalzone/NepaliStemmer/blob/master/src/main/java/org/inepal/products/nlp/compounds/NepaliSuffixes.java">NepaliSuffixes</a>

<a href="https://github.com/kushalzone/NepaliStemmer/blob/master/src/main/java/org/inepal/products/nlp/compounds/NepaliPrefixes.java">NepaliPrefixes</a>

