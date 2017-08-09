

import com.kms.katalon.core.testobject.TestObject

import java.util.List


def static "newpackage.HighlightElement.run"(
    	TestObject objectto	) {
    (new newpackage.HighlightElement()).run(
        	objectto)
}

def static "randomData.TestDataGenerator.getRandomParagraphs"(
    	int a	
     , 	int b	) {
    (new randomData.TestDataGenerator()).getRandomParagraphs(
        	a
         , 	b)
}

def static "randomData.TestDataGenerator.getRandomName"(
    	int a	
     , 	int b	) {
    (new randomData.TestDataGenerator()).getRandomName(
        	a
         , 	b)
}

def static "randomData.TestDataGenerator.getRandomFemaleName"() {
    (new randomData.TestDataGenerator()).getRandomFemaleName()
}

def static "randomData.TestDataGenerator.getRandomMaleName"() {
    (new randomData.TestDataGenerator()).getRandomMaleName()
}

def static "randomData.TestDataGenerator.getRandomFirstName"() {
    (new randomData.TestDataGenerator()).getRandomFirstName()
}

def static "randomData.TestDataGenerator.getRandomLastName"() {
    (new randomData.TestDataGenerator()).getRandomLastName()
}

def static "randomData.TestDataGenerator.getRandomCity"() {
    (new randomData.TestDataGenerator()).getRandomCity()
}

def static "randomData.TestDataGenerator.getRandomHeading"(
    	int numberofWords	) {
    (new randomData.TestDataGenerator()).getRandomHeading(
        	numberofWords)
}

def static "randomData.TestDataGenerator.getRandomHeading_two"(
    	int Wordsfrom	
     , 	int wordstwo	) {
    (new randomData.TestDataGenerator()).getRandomHeading_two(
        	Wordsfrom
         , 	wordstwo)
}

def static "randomData.TestDataGenerator.getRandomEmail"() {
    (new randomData.TestDataGenerator()).getRandomEmail()
}

def static "randomData.TestDataGenerator.set_RandomNumber"(
    	long len	) {
    (new randomData.TestDataGenerator()).set_RandomNumber(
        	len)
}

def static "randomData.TestDataGenerator.set_RandomNumberWithText"(
    	int length	) {
    (new randomData.TestDataGenerator()).set_RandomNumberWithText(
        	length)
}

def static "newpackage.VerifyExpectedAndActualOptionsInDropdown.VerifyExpectedAndActual"(
    	TestObject objectto	
     , 	java.util.List<java.lang.String> listOfOptions	) {
    (new newpackage.VerifyExpectedAndActualOptionsInDropdown()).VerifyExpectedAndActual(
        	objectto
         , 	listOfOptions)
}

def static "newpackage.VerifyDrodownValues_AlphabeticalOrder.verifyOptionsInDropdownInAphabeticalOrder"(
    	TestObject objectto	) {
    (new newpackage.VerifyDrodownValues_AlphabeticalOrder()).verifyOptionsInDropdownInAphabeticalOrder(
        	objectto)
}
