# 2311TeamPorject
thing is a dogshit grammar checker

RULES

READ USER INPUT

APPLY RULES (if a rule is broken the class returns a true value otherwise it returns a false)
1) Check first character of sentence if it’s not capitalized return a true value for rule 1

2) Check last word of sentence and if it doesn’t have either a question mark, exclamation mark, or a period return a true value for rule 2

3) Check each word of the sentence and make sure the character between them is a single space character, if it isn’t return a false value for rule 3

4) Check each word individually and if it has a symbol anywhere from the start to before the last character. Return a false value for rule 4

5) Check the sentence if double negatives for “not not” appears consecutively. If consecutively return false for rule 5

6) Check each word individually and if it has a number(s) from between in front of the first character to the end of the word return a true value for rule 6

7) Check the sentence for the word are and if it's there make sure the word before is a noun and it is a plural, if not return a false value for rule 7

8) Check the sentence for an apostrophe character and if there is one, check the word it's in against a list of contracted words and if it doesn’t match any return a true value for rule 8

9) Check if who/whom are used properly. Return false value for rule 9 if not used properly 

10) Check that the letter “i” by itself is capitalized. Return false if not capitalized 









Grammar Checker

1) Output string saying you didn’t capitalize first character of the sentence

2) Output string saying you didn’t end the sentence with proper punctuation

3) Output string saying you double spaced

4) Output string saying you put a symbol inside of a word

5) Output string saying the sentence contains a double negative

6) Output string saying there’s a number detected 

7) Output string saying you didn't properly pluralize the noun

8) Output string saying you didn't use a contraction correctly after the comma

9) Output string saying you used improper use of who/whom

10) Output string saying you didn’t capitalize letter “i”

