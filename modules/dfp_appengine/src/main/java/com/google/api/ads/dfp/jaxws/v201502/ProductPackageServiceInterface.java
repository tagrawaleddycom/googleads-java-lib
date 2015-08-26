
package com.google.api.ads.dfp.jaxws.v201502;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for updating and retrieving {@link ProductPackage} objects.
 *       <p>
 *       A {@link PackageProduct} represents a group of products which will be sold together.
 *       
 *       <p>
 *       To use this service, you need to have the new sales management solution
 *       enabled on your network. If you do not see a "Sales" tab in
 *       <a href="https://www.google.com/dfp">DoubleClick for Publishers (DFP)</a>,
 *       you will not be able to use this service.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ProductPackageServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductPackageServiceInterface {


    /**
     * 
     *         Creates new {@link ProductPackage} objects.
     *         
     *         @param productPackages the product packages to create
     *         @return the persisted product packages with their ID filled in
     *       
     * 
     * @param productPackages
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201502.ProductPackage>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502")
    @RequestWrapper(localName = "createProductPackages", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502", className = "com.google.api.ads.dfp.jaxws.v201502.ProductPackageServiceInterfacecreateProductPackages")
    @ResponseWrapper(localName = "createProductPackagesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502", className = "com.google.api.ads.dfp.jaxws.v201502.ProductPackageServiceInterfacecreateProductPackagesResponse")
    public List<ProductPackage> createProductPackages(
        @WebParam(name = "productPackages", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502")
        List<ProductPackage> productPackages)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link ProductPackagePage} of {@link ProductPackage} objects
     *         that satisfy the filtering criteria specified by given {@link Statement#query}.
     *         The following fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ProductPackage#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link ProductPackage#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code notes}</td>
     *         <td>{@link ProductPackage#notes}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link ProductPackage#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isArchived}</td>
     *         <td>{@link ProductPackage#isArchived}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link ProductPackage#lastModifiedDateTime}</td>
     *         </tr>
     *         </table>
     *         
     *         @param statement a Publisher Query Language statement which specifies the
     *         filtering criteria over product packages
     *         @return the product packages that match the given statement
     *       
     * 
     * @param statement
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201502.ProductPackagePage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502")
    @RequestWrapper(localName = "getProductPackagesByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502", className = "com.google.api.ads.dfp.jaxws.v201502.ProductPackageServiceInterfacegetProductPackagesByStatement")
    @ResponseWrapper(localName = "getProductPackagesByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502", className = "com.google.api.ads.dfp.jaxws.v201502.ProductPackageServiceInterfacegetProductPackagesByStatementResponse")
    public ProductPackagePage getProductPackagesByStatement(
        @WebParam(name = "statement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502")
        Statement statement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link ProductPackage} objects that match the given
     *         {@link Statement#query}.
     *         
     *         @param action the action to perform
     *         @param statement a Publisher Query Language statement used to filter a set of product packages
     *         @return the result of the action performed
     *       
     * 
     * @param statement
     * @param action
     * @return
     *     returns com.google.api.ads.dfp.jaxws.v201502.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502")
    @RequestWrapper(localName = "performProductPackageAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502", className = "com.google.api.ads.dfp.jaxws.v201502.ProductPackageServiceInterfaceperformProductPackageAction")
    @ResponseWrapper(localName = "performProductPackageActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502", className = "com.google.api.ads.dfp.jaxws.v201502.ProductPackageServiceInterfaceperformProductPackageActionResponse")
    public UpdateResult performProductPackageAction(
        @WebParam(name = "action", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502")
        ProductPackageAction action,
        @WebParam(name = "statement", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502")
        Statement statement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link ProductPackage} objects.
     *         
     *         @param productPackages the product packages to update
     *         @return the updated product packages
     *       
     * 
     * @param productPackages
     * @return
     *     returns java.util.List<com.google.api.ads.dfp.jaxws.v201502.ProductPackage>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502")
    @RequestWrapper(localName = "updateProductPackages", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502", className = "com.google.api.ads.dfp.jaxws.v201502.ProductPackageServiceInterfaceupdateProductPackages")
    @ResponseWrapper(localName = "updateProductPackagesResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502", className = "com.google.api.ads.dfp.jaxws.v201502.ProductPackageServiceInterfaceupdateProductPackagesResponse")
    public List<ProductPackage> updateProductPackages(
        @WebParam(name = "productPackages", targetNamespace = "https://www.google.com/apis/ads/publisher/v201502")
        List<ProductPackage> productPackages)
        throws ApiException_Exception
    ;

}