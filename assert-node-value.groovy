// Script based assertion to verify the node value

// context - An object that holds information about a validation in-progress, such as the cursor of the content to be validated., etc.
def groovyUtils = new com.eviware.soapui.support.GroovyUtils( context );

// To get the response content
def responseContent = messageExchange.getResponseContentAsXml()
def holder = groovyUtils.getXmlHolder( responseContent );

// Get the node value
def actualDescription = holder.getNodeValue('//m:sDescription[1]')

// To assert whether node is null or not
assert actualDescription != null;

// To assert value of node
assert actualDescription == 'Match 1'
