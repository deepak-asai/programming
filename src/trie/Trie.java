package trie;

class TrieNode {
	TrieNode[] children = new TrieNode[26];
	boolean isEnd;
	public TrieNode() {
		for(int i=0; i<26; i++) {
			children[i] = null;
		}
		isEnd = false;
	}
	
}
public class Trie {

	TrieNode root;
	void insert(String s) {
		TrieNode crawl = new TrieNode();
		crawl = root;
		for(int i=0; i<s.length(); i++) {
			if(crawl.children[s.charAt(i) - 'a']  == null ) {
				crawl.children[s.charAt(i) - 'a'] = new TrieNode();
			}
			crawl = crawl.children[s.charAt(i) - 'a'];
			
		}
		crawl.isEnd = true;
	}
	
	boolean search(String s) {
		
		TrieNode crawl = root;
		for(int i=0; i<s.length(); i++) { 
			if(crawl.children[s.charAt(i) - 'a'] == null) {
				return false;
			}
			crawl = crawl.children[s.charAt(i) - 'a'];
		}
		if(crawl.isEnd == true) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Trie t = new Trie();
		String s = "deepak";
		
		t.root = new TrieNode();
		t.insert(s);
		s = "deepika";
		t.insert(s);
		
		//System.out.println(t.search("deepika"));
		
		System.out.println(5 ^ 2);
		System.out.println(7 ^ 2);
		System.out.println(7 ^ 5);
		
	}
}
