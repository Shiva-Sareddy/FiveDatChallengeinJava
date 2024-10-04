package com.FDC.Day05Tasks;

// Implementing Heirarical Inheritence
// Parent Class
class CollegeBatch2021 {
	void CollegeID() {
		System.out.println("College ID: \"BESTIU\"");
	}
	
	void CollegeName() {
		System.out.println("College Name: \"B.E.S.T Innovation University\"");
	}
	
	void EngineeringCourses() {
		System.out.println("Courses: \n\t1. Computer Science & Engineering\n\t2. Artificial Intelligence\n\t3. Cyber Security\n\t4. Data Science\n");
	}
}

class Branch1 extends CollegeBatch2021{
	void BranchDetails() {
		System.out.println("Branch ID: \"CSE01\"");
		System.out.println("Branch Name: \"Computer Science & Engineering\"");
		System.out.println("Branch Acronym: \"CSE\"");
	}
}

class Branch2 extends CollegeBatch2021{
	void BranchDetails() {
		System.out.println("Branch ID: \"AI02\"");
		System.out.println("Branch Name: \"Artificial Intelligence\"");
		System.out.println("Branch Acronym: \"AI\"");
	}
}

class Branch3 extends CollegeBatch2021{
	void BranchDetails() {
		System.out.println("Branch ID: \"CS03\"");
		System.out.println("Branch Name: \"Cyber Security\"");
		System.out.println("Branch Acronym: \"CS\"");
	}
}

class Branch4 extends CollegeBatch2021{
	void BranchDetails() {
		System.out.println("Branch ID: \"DS04\"");
		System.out.println("Branch Name: \"Data Science\"");
		System.out.println("Branch Acronym: \"DS\"");
	}
}
public class Question1 {

	public static void main(String[] args) {
		CollegeBatch2021 cb21 = new CollegeBatch2021();
		cb21.CollegeID();
		cb21.CollegeName();
		cb21.EngineeringCourses();
		
		System.out.println();
		
		Branch1 b1 = new Branch1();
		b1.BranchDetails();
		
		System.out.println();
		
		Branch2 b2 = new Branch2();
		b2.BranchDetails();
		
		System.out.println();
		
		Branch3 b3 = new Branch3();
		b3.BranchDetails();
		
		System.out.println();
		
		Branch4 b4 = new Branch4();
		b4.BranchDetails();

	}

}
