# NepaliStemmer
Nepali Stemmer based on Suffix-stripping algorithm for Natural Language Processing, Machine Learning and more. This is a part of the Nepali Natural Language project that I am currently developing in private (Bitbucket). This portion is released for public use, review and improvement. I will be releasing other useful components slowly, or to someone who is willing to volunteer to my project.

@author Kushal Paudyal
<br/>www.inepal.org | www.icodejava.com

#### Disclaimer: Not a final solution. Use it at your own risk.
##### Developers - Feel free to fork it and send me pull requests with your improvements.
#### Found issues? Report it via Issues Tab.

## Usage 1 - Getting root words
<blockquote>String root = NepaliStemmer.getNepaliRootWord(someCompoundWord);</blockquote>

This stemmer is based suffix-stripping. It strips off the compound word forming text from the word, giving a potential root word (which is not the same as base word). I have categoriezed the suffixes into multiple files.
-> WordEndings (e.g. स्थानलगायत where लगायत is the WordEnding),
-> Name Endings (e.g. रामकुमार where कुमार is the Name Ending),
-> Place Endings ,
-> Actual Suffixes

Prefixes have not been integrated yet.

### Usage 2 - Getting Affirmative/Positive Verb Variations
<blockquote>
  
  String input = "अँगाल्नु";
  String output = NepaliStemmer.getAffirmativeVerbVariations(input).toString();
  
  </blockquote>
  
  This will result in a list of variations of that word.
  
  <blockquote>

[अँगाल, अँगाल्नु, अँगाल्यो, अँगाल्यौ, अँगालेँ, अँगालेको, अँगालेछ, अँगाले, अँगालिन, अँगालिस, अँगाली, अँगालि, अँगालिछे, अँगालुन्जेल, अँगालुञ्जेल, अँगाल्नोस, अँगाल्नुस, अँगाल्नुहोस, अँगाल्नेछु, अँगाल्नुहुनेछ, अँगाल्नेछन, अँगाल्न्छन, अँगाल्न्छिन, अँगाल्न्छु, अँगाल्न्छे, अँगाल्न्छ, अँगाल्नेछौ, अँगाल्नेछिन, अँगाल्नेछ, अँगाल्नुभयो]

  </blockquote>
  
  ### Usage 2 - Getting Affirmative/Positive Verb Variations
  This is work in progress. The idea is to produce a negative verb variations such as नअँगाल, नअँगाल्नु from the word "अँगाल्नु";
<blockquote>
  
  String input = "अँगाल्नु";
  String output = NepaliStemmer.getNegativeVerbVariations(input).toString();
  
  </blockquote>
  

## Need to add more to the list of suffixes?
You can do so by adding them to one of the following files.

src/main/java/org/inepal/products/nlp/compounds/CompoundWordEnding.java
src/main/java/org/inepal/products/nlp/compounds/CompoundWordEndingPeopleName.java
src/main/java/org/inepal/products/nlp/compounds/CompoundWordEndingPlaces.java
src/main/java/org/inepal/products/nlp/compounds/NepaliSuffixes.java
src/main/java/org/inepal/products/nlp/compounds/NepaliPrefixes.java (NOT INTEGRATED YET)

## How to contact me?
If you have any questions or feedback, you can contact me via my LinkedIn. https://www.linkedin.com/in/kushalp/

