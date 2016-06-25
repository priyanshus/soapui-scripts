/*
General forumal to read property using context

${[scope]propertyName[#xpath-expression]}

where scope can be one of the following literal values:
#Project# - references a Project property(Reference properties across a particular SoapUI project)
#TestSuite# - references a TestSuite property in the containing TestSuite
#TestCase# - references a TestCase property in the containing TestCase
#MockService# - references a MockService property in the containing MockService
#Global# - references a global property. Found in File>Preferences>Global Properties tab. Reference properties across all projects
#System# - references a system property. Found in Help>System properties.
#Env# - references an environment variable
[TestStep name]# - references a TestStep property
*/

// To read property from Properties Step
context.expand('${Properties#CityName}')

// To read property from Properties Step
context.expand('${#TestCase#propertyName}')


/*
Custom Properties can also be read by testRunner object given the
scope is at the level where property is defined.
For example to read the property from test case level
*/

testRunner.testStep.testCase.getPropertyValue('propertyName');

// Similarly to read property from Test Suite level

testRunner.testStep.testCase.testSuite.getPropertyValue('propertyName');
