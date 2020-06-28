package ua.lviv.lgs;

public class Main 
{
	
	public static void main(String[] args) throws WrongAmountOfLetters 
	{
		//1
		String word1 = "monom";
		System.out.println("\nI\n" + WorkWithText.isPalindrome(word1));
		
		//2
		StringBuffer sentence1 = new StringBuffer("For accessing individual characters of a String in Java, we have String.charAt(2). Is there any inbuilt function to remove an individual character of a String in java? ");
		WorkWithText.replaceVowels(sentence1);
		System.out.println("\nII\n" + sentence1);
		
		//3
		System.out.println("\nIII\n" + WorkWithText.countWords("\n" + sentence1.toString()));
		
		//4
		StringBuffer sentence2 = new StringBuffer(
				"Thaddeus Leon Lockridge, a practicing physician in Whitefish, Montana, approached Frank Lloyd Wright to commission him for the design of a new medical clinic building in 1958. Reportedly, Lockridge and his wife chose Wright, by then one of the most famous architects in America, after a Montana architectural firm quoted them a price so \"exorbitantly high\" that they decided they \"may as well have Frank Lloyd Wright design it\".[7] Wright drew up plans for the building with his close assistant, John H. \"Jack\" Howe.[2] The design was among Wright's last works, as he died the following year. Construction began in the summer of 1959, after Wright's death, with the carpenter visiting Taliesin to study Wright's methods.[8] Taliesin Associated Architects (Wright's successor firm) was not involved with the construction process.[9] John T. Whalen, a Whitefish doctor, and Bruce C. McIntyre, who had just closed his blood bank in St. John, Washington to move to Whitefish,[10] joined Lockridge's practice in anticipation of the building's completion, although they protested the Wright design.\r\n" + 
				"\r\n" + 
				"At 5,000 square feet (460 m2), the clinic was one of the town's largest buildings, and was compared to \"half of Montana\". Its layout was based around a grid with units of four feet.[11] The design of the building was based on Wright's Usonian houses. Its most noticeable design element, a ceiling-high plastic sphere embedded in the front facade and surrounded by a planter, was removed later after a \"vehicular mishap\",[3] to provide a more direct entrance to the lobby.[12] The sphere, which was well-lit and resembled a full moon, was used as a terrarium, and later owners of the building attempted to restore it to the facade but could not find any remaining pieces.[7] The building's prominent rooftop gardens remained, but the flowers were removed to make way for HVAC equipment.[5]\r\n" + 
				"\r\n" + 
				"The clinic opened for business in 1960. Dr. Lockridge died in 1963,[13] and the other doctors moved out the following year. First State Bank occupied the building from 1964 to 1980, and after that it was divided into three professional offices, which held a variety of tenants including the administrative offices for Iron Horse, an upscale subdivision and golf course in Whitefish. In 2002, the building was purchased again and became the law offices of Sharon and Frank Morrison and Sean and Diana Frampton.[9] The Morrisons, inspired by Wright's Harvey P. Sutton House in their hometown of McCook, Nebraska, decided to restore the building.[7] It was listed on the National Register of Historic Places in 2012.[1]\r\n" + 
				"\r\n" + 
				"After the law partnership between the Morrisons and Framptons ended in 2016, the building, locally known as the Frank Lloyd Wright Building, was sold to Mick Ruis, a developer from Columbia Falls, Montana who presented his plans to demolish the building and replace it with a three-story mixed-use development late that year.[14] He was apparently unaware when he submitted the plans that the building was protected and considered historic, but after being made aware of this he nevertheless continued with his plans to raze it,[5] which was originally slated for late 2018.[15] Local residents and members of the Montana Preservation Alliance led a movement to save the building.[14]\r\n" + 
				"\r\n" + 
				"On January 3, 2018, the owner began preparing for demolition, leading the Frank Lloyd Wright Building Conservancy to reach out with an offer to purchase the building. The conservancy and its allies were willing to pay the full asking price, but sparred with the developers over whether the deposit could be refundable. According to the conservancy, the time frame of one week was not enough for them to raise funds to pay the non-refundable deposit. Ruis had set a January 10 deadline for the negotiations, which ended without a deal on the afternoon of the 10th. Hours later, before preservationists could make any effort to start a second round of negotiations, the building was demolished overnight.[3][5][15]\r\n" + 
				"\r\n" + 
				"The demolition outraged preservationists and scholars of Wright and modern architecture, both locally and across the country. A billboard appeared in Whitefish two months after the clinic building was razed, calling for residents to boycott Ruis and the development that would replace the building.[16] "
				);
		
		System.out.println("\nIV\n" + "The most popular word is " + WorkWithText.theMostPopularWord(sentence2));
		
		
		
	}

}
