/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 4. Your output prediction: 
 eye, head
 head, eye
 shoulders, head
 eyes and ears
 toes, knees
 shoulders, knees and toes
 
  
  
 */

/*
 6. Were you correct? Explain if you were not (what did you learn?)
 i forgot the basic part of the code and got confused near the end, i was trying to break it down and realize
 the blue as part of the answer
 
 */

public class P4_MysteryTouch {
	 public static void main(String[] args) {
	        String head = "shoulders";
	        String knees = "toes"; 
	        String elbow = "head";
	        String eye = "eyes and ears";
	        String ear = "eye"; 
	        
	        touch(ear, elbow);
	        touch(elbow, ear); 
	        touch(head, "elbow"); 
	        touch(eye, eye);
	        touch(knees, "Toes"); 
	        touch(head, "knees " + knees );
	    }
	    
	    public static void touch(String elbow, String ear) { 
	        System.out.println( "touch your " + elbow + " to your " + ear );
	    }


}
