// Sctipt to run a test step
testRunner.runTestStepByName('StepName')

// Control Flow, jump to specific step
testRunner.gotoStepByName('StepName')

// Namespace handler
def groovyUtils = new com.eviware.soapui.support.GroovyUtils( context )
def holder = groovyUtils.getXmlHolder( messageExchange.responseContent )
holder.namespaces["ns"] = "http://www.webserviceX.NET/"
def conversionRate = holder.getNodeValue("//ns:ConversionRateResult")
log.info conversionRate
