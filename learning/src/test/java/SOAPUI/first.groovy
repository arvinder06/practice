//*******Print on console

//Rahul WSDL - http://216.10.245.166:8080/axis2/services/EmployeeManagementService?wsdl

//log.info "Hello"

//*********access properties from different level

//log.info context.expand('${#TestCase#name}')
//log.info testRunner.testCase.getPropertyValue("name")
//log.info testRunner.testCase.testSuite.getPropertyValue("age")
//log.info testRunner.testCase.testSuite.testCases["add"].getPropertyValue("employeeID")
//log.info testRunner.testCase.testSuite.testCases["get"].getPropertyValue("department")
//log.info testRunner.testCase.testSuite.project.getPropertyValue("gender")
//testRunner.testCase.testSuite.project.getPropertyValue("gender")

//*******Set Property
//log.info testRunner.testCase.testSuite.testCases["get"].setPropertyValue("department","HR")


//************Access Request property 
//log.info testRunner.testCase.testSuite.testCases["get"].testSteps["getEmployeeDetails"].getPropertyValue("Request")

//*********Variable
//def project_gender=testRunner.testCase.testSuite.project.getPropertyValue("gender")
//log.info project_gender

//*********Hit add employee request with properties 

import com.eviware.soapui.support.XmlHolder  //for XML holder
import com.eviware.soapui.impl.wsdl.testcase.WsdlTestRunContext //To get the context variable of step we want to run


//Step 1 - Pull the request from the step
def request_addEmployee=testRunner.testCase.testSuite.testCases["add"].testSteps["addEmployee"].getPropertyValue("Request")
def xmlAddEmployee=new XmlHolder(request_addEmployee) //parse XML request

//Stpe 2 - Set values in request
xmlAddEmployee.setNodeValue("//typ:name","Arvi_Groovy")
xmlAddEmployee.setNodeValue("//typ:id","308197")
xmlAddEmployee.setNodeValue("//typ:Department","IT")
xmlAddEmployee.setNodeValue("//typ:age","35")

//Step 3 - Set above values in XML of addEmployee request
def newAddXML=xmlAddEmployee.getXml();
testRunner.testCase.testSuite.testCases["add"].testSteps["addEmployee"].setPropertyValue("Request",xmlAddEmployee.getXml())

//Step 4 - Get the context of add employee to be pass in run function
def addEmployeeTestStep=testRunner.testCase.testSuite.testCases["add"].testSteps["addEmployee"] //use with run function
def contextAddEmployee=new WsdlTestRunContext(addEmployeeTestStep) //parameter of context to run the request

//Step 5 - Hit the request
addEmployeeTestStep.run(testRunner,contextAddEmployee)


//*********Hit Get Employee and validate responce
