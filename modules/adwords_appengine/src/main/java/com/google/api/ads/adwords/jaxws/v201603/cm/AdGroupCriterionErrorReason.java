
package com.google.api.ads.adwords.jaxws.v201603.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdGroupCriterionError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdGroupCriterionError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AD_GROUP_CRITERION_LABEL_DOES_NOT_EXIST"/>
 *     &lt;enumeration value="AD_GROUP_CRITERION_LABEL_ALREADY_EXISTS"/>
 *     &lt;enumeration value="CANNOT_ADD_LABEL_TO_NEGATIVE_CRITERION"/>
 *     &lt;enumeration value="TOO_MANY_OPERATIONS"/>
 *     &lt;enumeration value="CANT_UPDATE_NEGATIVE"/>
 *     &lt;enumeration value="CONCRETE_TYPE_REQUIRED"/>
 *     &lt;enumeration value="BID_INCOMPATIBLE_WITH_ADGROUP"/>
 *     &lt;enumeration value="CANNOT_TARGET_AND_EXCLUDE"/>
 *     &lt;enumeration value="ILLEGAL_URL"/>
 *     &lt;enumeration value="INVALID_KEYWORD_TEXT"/>
 *     &lt;enumeration value="INVALID_DESTINATION_URL"/>
 *     &lt;enumeration value="MISSING_DESTINATION_URL_TAG"/>
 *     &lt;enumeration value="KEYWORD_LEVEL_BID_NOT_SUPPORTED_FOR_MANUALCPM"/>
 *     &lt;enumeration value="INVALID_USER_STATUS"/>
 *     &lt;enumeration value="CANNOT_ADD_CRITERIA_TYPE"/>
 *     &lt;enumeration value="CANNOT_EXCLUDE_CRITERIA_TYPE"/>
 *     &lt;enumeration value="INVALID_PRODUCT_PARTITION_HIERARCHY"/>
 *     &lt;enumeration value="PRODUCT_PARTITION_UNIT_CANNOT_HAVE_CHILDREN"/>
 *     &lt;enumeration value="PRODUCT_PARTITION_SUBDIVISION_REQUIRES_OTHERS_CASE"/>
 *     &lt;enumeration value="PRODUCT_PARTITION_REQUIRES_SAME_DIMENSION_TYPE_AS_SIBLINGS"/>
 *     &lt;enumeration value="PRODUCT_PARTITION_ALREADY_EXISTS"/>
 *     &lt;enumeration value="PRODUCT_PARTITION_DOES_NOT_EXIST"/>
 *     &lt;enumeration value="PRODUCT_PARTITION_CANNOT_BE_REMOVED"/>
 *     &lt;enumeration value="INVALID_PRODUCT_PARTITION_TYPE"/>
 *     &lt;enumeration value="PRODUCT_PARTITION_ADD_MAY_ONLY_USE_TEMP_ID"/>
 *     &lt;enumeration value="CAMPAIGN_TYPE_NOT_COMPATIBLE_WITH_PARTIAL_FAILURE"/>
 *     &lt;enumeration value="OPERATIONS_FOR_TOO_MANY_SHOPPING_ADGROUPS"/>
 *     &lt;enumeration value="CANNOT_MODIFY_URL_FIELDS_WITH_DUPLICATE_ELEMENTS"/>
 *     &lt;enumeration value="CANNOT_SET_WITHOUT_FINAL_URLS"/>
 *     &lt;enumeration value="CANNOT_CLEAR_FINAL_URLS_IF_FINAL_MOBILE_URLS_EXIST"/>
 *     &lt;enumeration value="CANNOT_CLEAR_FINAL_URLS_IF_FINAL_APP_URLS_EXIST"/>
 *     &lt;enumeration value="CANNOT_CLEAR_FINAL_URLS_IF_TRACKING_URL_TEMPLATE_EXISTS"/>
 *     &lt;enumeration value="CANNOT_CLEAR_FINAL_URLS_IF_URL_CUSTOM_PARAMETERS_EXIST"/>
 *     &lt;enumeration value="CANNOT_SET_BOTH_DESTINATION_URL_AND_FINAL_URLS"/>
 *     &lt;enumeration value="CANNOT_SET_BOTH_DESTINATION_URL_AND_TRACKING_URL_TEMPLATE"/>
 *     &lt;enumeration value="FINAL_URLS_NOT_SUPPORTED_FOR_CRITERION_TYPE"/>
 *     &lt;enumeration value="FINAL_MOBILE_URLS_NOT_SUPPORTED_FOR_CRITERION_TYPE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdGroupCriterionError.Reason")
@XmlEnum
public enum AdGroupCriterionErrorReason {


    /**
     * 
     *                 No link found between the AdGroupCriterion and the label.
     *               
     * 
     */
    AD_GROUP_CRITERION_LABEL_DOES_NOT_EXIST,

    /**
     * 
     *                 The label has already been attached to the AdGroupCriterion.
     *               
     * 
     */
    AD_GROUP_CRITERION_LABEL_ALREADY_EXISTS,

    /**
     * 
     *                 Negative AdGroupCriterion cannot have labels.
     *               
     * 
     */
    CANNOT_ADD_LABEL_TO_NEGATIVE_CRITERION,

    /**
     * 
     *                 Too many operations for a single call.
     *               
     * 
     */
    TOO_MANY_OPERATIONS,

    /**
     * 
     *                 Negative ad group criteria are not updateable.
     *               
     * 
     */
    CANT_UPDATE_NEGATIVE,

    /**
     * 
     *                 Concrete type of criterion (keyword v.s. placement) is required for
     *                 ADD and SET operations.
     *               
     * 
     */
    CONCRETE_TYPE_REQUIRED,

    /**
     * 
     *                 Bid is incompatible with ad group's bidding settings.
     *               
     * 
     */
    BID_INCOMPATIBLE_WITH_ADGROUP,

    /**
     * 
     *                 Cannot target and exclude the same criterion at once.
     *               
     * 
     */
    CANNOT_TARGET_AND_EXCLUDE,

    /**
     * 
     *                 The URL of a placement is invalid.
     *               
     * 
     */
    ILLEGAL_URL,

    /**
     * 
     *                 Keyword text was invalid.
     *               
     * 
     */
    INVALID_KEYWORD_TEXT,

    /**
     * 
     *                 Destination URL was invalid.
     *               
     * 
     */
    INVALID_DESTINATION_URL,

    /**
     * 
     *                 The destination url must contain at least one tag (e.g. {lpurl})
     *               
     * 
     */
    MISSING_DESTINATION_URL_TAG,

    /**
     * 
     *                 Keyword-level cpm bid is not supported
     *               
     * 
     */
    KEYWORD_LEVEL_BID_NOT_SUPPORTED_FOR_MANUALCPM,

    /**
     * 
     *                 For example, cannot add a biddable ad group criterion that had been removed.
     *               
     * 
     */
    INVALID_USER_STATUS,

    /**
     * 
     *                 Criteria type cannot be targeted for the ad group. Either the account
     *                 is restricted to keywords only, the criteria type is incompatible
     *                 with the campaign's bidding strategy, or the criteria type can only
     *                 be applied to campaigns.
     *               
     * 
     */
    CANNOT_ADD_CRITERIA_TYPE,

    /**
     * 
     *                 Criteria type cannot be excluded for the ad group. Refer to the
     *                 documentation for a specific criterion to check if it is excludable.
     *               
     * 
     */
    CANNOT_EXCLUDE_CRITERIA_TYPE,

    /**
     * 
     *                 Ad group is invalid due to the product partitions it contains.
     *               
     * 
     */
    INVALID_PRODUCT_PARTITION_HIERARCHY,

    /**
     * 
     *                 Product partition unit cannot have children.
     *               
     * 
     */
    PRODUCT_PARTITION_UNIT_CANNOT_HAVE_CHILDREN,

    /**
     * 
     *                 Subdivided product partitions must have an "others" case.
     *               
     * 
     */
    PRODUCT_PARTITION_SUBDIVISION_REQUIRES_OTHERS_CASE,

    /**
     * 
     *                 Dimension type of product partition must be the same as that of its siblings.
     *               
     * 
     */
    PRODUCT_PARTITION_REQUIRES_SAME_DIMENSION_TYPE_AS_SIBLINGS,

    /**
     * 
     *                 Product partition cannot be added to the ad group because it already exists.
     *               
     * 
     */
    PRODUCT_PARTITION_ALREADY_EXISTS,

    /**
     * 
     *                 Product partition referenced in the operation was not found in the ad group.
     *               
     * 
     */
    PRODUCT_PARTITION_DOES_NOT_EXIST,

    /**
     * 
     *                 Recursive removal failed because product partition subdivision is being created or modified
     *                 in this request.
     *               
     * 
     */
    PRODUCT_PARTITION_CANNOT_BE_REMOVED,

    /**
     * 
     *                 Product partition type is not allowed for specified AdGroupCriterion type.
     *               
     * 
     */
    INVALID_PRODUCT_PARTITION_TYPE,

    /**
     * 
     *                 Product partition in an ADD operation specifies a non temporary CriterionId.
     *               
     * 
     */
    PRODUCT_PARTITION_ADD_MAY_ONLY_USE_TEMP_ID,

    /**
     * 
     *                 Partial failure is not supported for shopping campaign mutate operations.
     *               
     * 
     */
    CAMPAIGN_TYPE_NOT_COMPATIBLE_WITH_PARTIAL_FAILURE,

    /**
     * 
     *                 Operations in the mutate request changes too many shopping ad groups. Please split
     *                 requests for multiple shopping ad groups across multiple requests.
     *               
     * 
     */
    OPERATIONS_FOR_TOO_MANY_SHOPPING_ADGROUPS,

    /**
     * 
     *                 Not allowed to modify url fields of an ad group criterion if there are duplicate elements
     *                 for that ad group criterion in the request.
     *               
     * 
     */
    CANNOT_MODIFY_URL_FIELDS_WITH_DUPLICATE_ELEMENTS,

    /**
     * 
     *                 Cannot set url fields without also setting final urls.
     *               
     * 
     */
    CANNOT_SET_WITHOUT_FINAL_URLS,

    /**
     * 
     *                 Cannot clear final urls if final mobile urls exist.
     *               
     * 
     */
    CANNOT_CLEAR_FINAL_URLS_IF_FINAL_MOBILE_URLS_EXIST,

    /**
     * 
     *                 Cannot clear final urls if final app urls exist.
     *               
     * 
     */
    CANNOT_CLEAR_FINAL_URLS_IF_FINAL_APP_URLS_EXIST,

    /**
     * 
     *                 Cannot clear final urls if tracking url template exists.
     *               
     * 
     */
    CANNOT_CLEAR_FINAL_URLS_IF_TRACKING_URL_TEMPLATE_EXISTS,

    /**
     * 
     *                 Cannot clear final urls if url custom parameters exist.
     *               
     * 
     */
    CANNOT_CLEAR_FINAL_URLS_IF_URL_CUSTOM_PARAMETERS_EXIST,

    /**
     * 
     *                 Cannot set both destination url and final urls.
     *               
     * 
     */
    CANNOT_SET_BOTH_DESTINATION_URL_AND_FINAL_URLS,

    /**
     * 
     *                 Cannot set both destination url and tracking url template.
     *               
     * 
     */
    CANNOT_SET_BOTH_DESTINATION_URL_AND_TRACKING_URL_TEMPLATE,

    /**
     * 
     *                 Final urls are not supported for this criterion type.
     *               
     * 
     */
    FINAL_URLS_NOT_SUPPORTED_FOR_CRITERION_TYPE,

    /**
     * 
     *                 Final mobile urls are not supported for this criterion type.
     *               
     * 
     */
    FINAL_MOBILE_URLS_NOT_SUPPORTED_FOR_CRITERION_TYPE,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AdGroupCriterionErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
