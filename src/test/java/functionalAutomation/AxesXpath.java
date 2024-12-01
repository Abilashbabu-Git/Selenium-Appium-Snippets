package functionalAutomation;

public class AxesXpath {

	public static void main(String[] args) {
		
		/*
		 * http://leaftaps.com/opentaps/control/main
		 * 1. Parent to Child: Example: If I am in Madurai, if you want to meet me then you have to visit my father
		 * (Put the relative xpath of parent)/child_tagname
		 * Example: //form[@id='login']/p[2]
		 * 2. Child to Parent: Example: If I am in Chenai, if you want to meet my father then you have to visit me first
		 * child_xpath/..
		 * child_xpath/parent::parent_tagname
		 * Example: //input[@type='password']/parent::p or //input[@type='password']/.. or //label[text()='Password']/..
		 * 3. Grand parent to Grand Child [use // for connecting with grand-child as grand-child is under parent]
		 * grand-parent_xpath//grand-child_tagname
		 * Example: //form[@id='login']//input[1]
		 * 4. Grand child to Grand parent [we have to use ancestor because all tags above parent are ancestor]
		 * Grand-child_xpath/ancestor::ancestor_tagname
		 * Example: //input[@name='USERNAME']/ancestor::form
		 * 5.Elder Sibling: Above [preceding]
		 * Example: //input[@id='username']/preceding-sibling::label
		 * younger_xpath/preceding-sibling::elder-sibling_tagname
		 * 6.Younger Sibling: below [following]
		 * elder_xpath/following-sibling::younger-sibling_tagname
		 * Example://label[text()='Username']/following-sibling::input
		 * 7.Elder Cousin:
		 * younger_xpath/preceding::elder-cousin_tagname
		 * Example: //label[text()='Password']/preceding::label
		 * 8.Younger Cousin:
		 * elder_xpath/following::younger-cousin_tagname
		 * Example: //label[text()='Username']/following::label
		 */
		
		
	}

}
