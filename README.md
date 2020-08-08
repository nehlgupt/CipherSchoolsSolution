# CipherSchoolsSolution
This is my submission for CipherSchoolSolution assignment
ENTER INPUT WITHOUT SPACE

Q: A bracket is considered to be following of the characters ‘(‘, ‘)’, ‘[‘, ‘]’, ‘{], ‘}’.
Two brackets are considered to be a matched pair if the an opening bracket
( i.e., (, [, or { ) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same
type. There are three types of matched pairs of brackets: [ ], { }, and ( ).
A matching pair of brackets is not balanced if the set of brackets it encloses are not
matched.
For example, { [ ( ] ) } is not balanced because the contents in
between { and } are not balanced. The pair of square brackets encloses a single,
unbalanced opening bracket, (, and the pair of parentheses encloses a single,
unbalanced closing square bracket, ].
By this logic, we say a sequence of brackets is balanced if the following conditions
are met:
1. It contains no unmatched brackets.
2. The subset of brackets enclosed within the confines of a matched pair of brackets
is also a matched pair of brackets.
Given n string of rackets, determine whether each sequence of brackets is
balanced. If string is balanced, return YES, otherwise return NO.
EXAMPLE:
Input:
2
[ ( { } ) ]
{ ( ] }
Output:
YES
NO


