class Solution {
    public boolean isAnagram(String s, String t) {
	var sLength = s.length();
	if (sLength != t.length())
		return false;

	var freq = new int[26];
	for (var i = 0; i < sLength; i++)
		freq[s.charAt(i) - 'a']++;

	for (var i = 0; i < sLength; i++) 
		if (freq[t.charAt(i) - 'a']-- == 0)
			return false;
	return true;  
    }
}