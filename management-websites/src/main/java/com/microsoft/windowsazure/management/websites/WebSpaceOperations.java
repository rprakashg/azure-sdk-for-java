/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.websites;

import com.microsoft.windowsazure.exception.ServiceException;
import com.microsoft.windowsazure.management.websites.models.WebSiteListParameters;
import com.microsoft.windowsazure.management.websites.models.WebSpacesCreatePublishingUserParameters;
import com.microsoft.windowsazure.management.websites.models.WebSpacesCreatePublishingUserResponse;
import com.microsoft.windowsazure.management.websites.models.WebSpacesGetDnsSuffixResponse;
import com.microsoft.windowsazure.management.websites.models.WebSpacesGetResponse;
import com.microsoft.windowsazure.management.websites.models.WebSpacesListGeoRegionsResponse;
import com.microsoft.windowsazure.management.websites.models.WebSpacesListPublishingUsersResponse;
import com.microsoft.windowsazure.management.websites.models.WebSpacesListResponse;
import com.microsoft.windowsazure.management.websites.models.WebSpacesListWebSitesResponse;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.Future;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
* Operations for managing web spaces beneath your subscription.
*/
public interface WebSpaceOperations {
    /**
    * Creates a source control user with permissions to publish to this web
    * space.
    *
    * @param username Required. The user name.
    * @param password Required. The user password.
    * @param parameters Optional. Parameters supplied to the Create Publishing
    * User operation.
    * @throws ParserConfigurationException Thrown if there was an error
    * configuring the parser for the response body.
    * @throws SAXException Thrown if there was an error parsing the response
    * body.
    * @throws TransformerException Thrown if there was an error creating the
    * DOM transformer.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The Create Publishing User operation response.
    */
    WebSpacesCreatePublishingUserResponse createPublishingUser(String username, String password, WebSpacesCreatePublishingUserParameters parameters) throws ParserConfigurationException, SAXException, TransformerException, IOException, ServiceException;
    
    /**
    * Creates a source control user with permissions to publish to this web
    * space.
    *
    * @param username Required. The user name.
    * @param password Required. The user password.
    * @param parameters Optional. Parameters supplied to the Create Publishing
    * User operation.
    * @return The Create Publishing User operation response.
    */
    Future<WebSpacesCreatePublishingUserResponse> createPublishingUserAsync(String username, String password, WebSpacesCreatePublishingUserParameters parameters);
    
    /**
    * You can retrieve details for a specified web space name by issuing an
    * HTTP GET request.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn167017.aspx for
    * more information)
    *
    * @param webSpaceName Required. The name of the web space.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The Get Web Space Details operation response.
    */
    WebSpacesGetResponse get(String webSpaceName) throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException;
    
    /**
    * You can retrieve details for a specified web space name by issuing an
    * HTTP GET request.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn167017.aspx for
    * more information)
    *
    * @param webSpaceName Required. The name of the web space.
    * @return The Get Web Space Details operation response.
    */
    Future<WebSpacesGetResponse> getAsync(String webSpaceName);
    
    /**
    * Get the DNS Suffix for this subscription.
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The Get DNS Suffix operation response.
    */
    WebSpacesGetDnsSuffixResponse getDnsSuffix() throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * Get the DNS Suffix for this subscription.
    *
    * @return The Get DNS Suffix operation response.
    */
    Future<WebSpacesGetDnsSuffixResponse> getDnsSuffixAsync();
    
    /**
    * You can list the web spaces under the current subscription by issuing a
    * GET request.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166961.aspx for
    * more information)
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The List Web Spaces operation response.
    */
    WebSpacesListResponse list() throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * You can list the web spaces under the current subscription by issuing a
    * GET request.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn166961.aspx for
    * more information)
    *
    * @return The List Web Spaces operation response.
    */
    Future<WebSpacesListResponse> listAsync();
    
    /**
    * Get the available geo regions for this web space.
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The List Geo Regions operation response.
    */
    WebSpacesListGeoRegionsResponse listGeoRegions() throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * Get the available geo regions for this web space.
    *
    * @return The List Geo Regions operation response.
    */
    Future<WebSpacesListGeoRegionsResponse> listGeoRegionsAsync();
    
    /**
    * Get the source control users allowed to publish to this web space.
    *
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @return The List Publishing Users operation response.
    */
    WebSpacesListPublishingUsersResponse listPublishingUsers() throws IOException, ServiceException, ParserConfigurationException, SAXException;
    
    /**
    * Get the source control users allowed to publish to this web space.
    *
    * @return The List Publishing Users operation response.
    */
    Future<WebSpacesListPublishingUsersResponse> listPublishingUsersAsync();
    
    /**
    * You can retrieve a list of all web sites in a web space by issuing an
    * HTTP GET request.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn236429.aspx for
    * more information)
    *
    * @param webSpaceName Required. The name of the web space.
    * @param parameters Optional. Additional parameters.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws ParserConfigurationException Thrown if there was a serious
    * configuration error with the document parser.
    * @throws SAXException Thrown if there was an error parsing the XML
    * response.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The List Web Sites operation response.
    */
    WebSpacesListWebSitesResponse listWebSites(String webSpaceName, WebSiteListParameters parameters) throws IOException, ServiceException, ParserConfigurationException, SAXException, URISyntaxException;
    
    /**
    * You can retrieve a list of all web sites in a web space by issuing an
    * HTTP GET request.  (see
    * http://msdn.microsoft.com/en-us/library/windowsazure/dn236429.aspx for
    * more information)
    *
    * @param webSpaceName Required. The name of the web space.
    * @param parameters Optional. Additional parameters.
    * @return The List Web Sites operation response.
    */
    Future<WebSpacesListWebSitesResponse> listWebSitesAsync(String webSpaceName, WebSiteListParameters parameters);
}
