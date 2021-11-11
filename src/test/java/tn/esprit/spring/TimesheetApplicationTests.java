package tn.esprit.spring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.*;
import tn.esprit.spring.services.*;

@SpringBootTest
class TimesheetApplicationTests {
	
	private static final Logger l = Logger.getLogger(TimesheetApplicationTests.class);
	@Autowired
	ITimesheetService TimesheetService;
	IEmployeService employeService ;
	@Test
	void testAjoutMission() {
		int k=0;
		try {
			k=TimesheetService.ajouterMission(new Mission("test1", "test JUnit"));/*addOrUpdateEmploye(new Employe("safsaf", "raslen", "raslensafsaf@gmail.com", "test", false, Role.ADMINISTRATEUR));*/
		boolean test=(k!=0)?true:false;
		//JUnit test
		assertEquals(test, true,"ajout avec success de la mission");
		//Log4j 
		if(test) {
			l.info(" mission avec id "+k+" a été ajouté avec succés");
		}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}



}
