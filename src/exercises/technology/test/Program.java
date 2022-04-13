package exercises.technology.test;

import exercises.technology.AbstractEntity;
import exercises.technology.Computer;
import exercises.technology.Laptop;
import exercises.technology.SmartPhone;
import org.junit.Test;

import static org.junit.Assert.*;

public class Program {
    Computer testComputer;
    Laptop testLaptop;
    SmartPhone testSmartPhone;

    //test Computer Class
    @Test
    public void testComputerExtendsAbstractEntity(){
        testComputer = new Computer();
        assertTrue(testComputer instanceof AbstractEntity);
    }
    @Test
    public void testComputerGetsCorrectIDFromAbstractEntity(){
        testComputer = new Computer();
        assertEquals(AbstractEntity.getValue(), (int) testComputer.getDeviceID());
    }
    @Test
    public void testComputerSecondConstructorSetsFieldValues(){
        testComputer = new Computer("Jamie Miller","Executive","Active");
        String expected = "Computer{deviceID="+AbstractEntity.getValue()+", assignedTo='Jamie Miller', accessLevel='Executive', status='Active'}";
        assertEquals(expected,testComputer.toString());
    }

    //test Laptop Class
    @Test
    public void testLaptopExtendsComputer(){
        testLaptop = new Laptop("Windows 11","Jamie Miller","Administrator","Active");
        assertTrue(testLaptop instanceof Computer);
    }
    @Test
    public void testLaptopConstructorSetsAllFields(){
        testLaptop = new Laptop("iOS","Megan Dodson","User","Active");
        String expected = "Computer{deviceID="+AbstractEntity.getValue()+", assignedTo='Megan Dodson', accessLevel='User', status='Active'}\nLaptop{inService=" + testLaptop.getInService() + ", operatingSystem='iOS'}";
        assertEquals(expected, testLaptop.toString());
    }
    @Test
    public void testLaptopChangeStatusUpdatesDeviceStatus(){
        testLaptop = new Laptop("Windows 10","Philip Dodson","User","Out of Date");
        assertEquals("Out of Date", testLaptop.getStatus());
        testLaptop.updateStatus("Active");
        assertSame("Active", testLaptop.getStatus());
    }

    //test SmartPhone Class
    @Test
    public void testSmartPhoneExtendsComputer(){
        testSmartPhone = new SmartPhone("Android","Jamie Miller","User","Active");
        assertTrue(testSmartPhone instanceof Computer);
    }
    @Test
    public void testSmartPhoneConstructorSetsAllFields(){
        testSmartPhone = new SmartPhone("iOS","Jackie Nguyen","Instructor","Active");
        String expected = "Computer{deviceID="+AbstractEntity.getValue()+", assignedTo='Jackie Nguyen', accessLevel='Instructor', status='Active'}\nSmartPhone{inService=" + testSmartPhone.getInService() + ", operatingSystem='iOS'}";
        assertEquals(expected,testSmartPhone.toString());
    }
    @Test
    public void testSmartPhoneUpdatesAssignedTo(){
        testSmartPhone = new SmartPhone("Android","Kelsey Gasser", "TA", "Active");
        assertSame("Kelsey Gasser", testSmartPhone.getAssignedTo());
        testSmartPhone.updateAssignedTo("Andie Johnson");
        assertSame("Andie Johnson", testSmartPhone.getAssignedTo());
    }
}
