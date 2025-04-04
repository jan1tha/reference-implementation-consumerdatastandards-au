/**
 * Copyright (c) 2024, WSO2 LLC. (https://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.cds.test.framework.constant

/**
 * Class for keep automation Page objects
 */
class AUPageObjects {

    public static String CONSENT_SUBMIT_XPATH = "//*[@id='approve']"
    public static String CONSENT_DENY_XPATH = "//*[@value='Deny']"
    public static String CONSENT_CANCEL_XPATH = "//*[@value='Cancel']"
    public static String CONFIRM_CONSENT_DENY_XPATH = "//*[@value='Yes cancel']"
    public static String ADR_NAME_HEADER_XPATH = "//h3[@class='ui header']"
    public static String SINGLE_ACCOUNT_XPATH = "//input[@id='account_1']"
    public static String ALT_SINGLE_ACCOUNT_XPATH = "//input[@id='account_2']"
    public static String LBL_WHERE_TO_MANAGE_INSTRUCTION_XPATH = "//div[contains(text(),'Where to manage this arrangement')]//h5"
    public static String LBL_NEW_PAYEES_INDICATOR_XPATH = "//button[contains(text(),'Saved payees')]/span[contains(text(),'New')]"
    public static String LBL_NEW_SHARING_DURATION_XPATH = "//button[@id='consent-expiry-date']/span[contains(text(),'New')]"
    public static String LBL_ACCOUNT_1_ID_XPATH = "//input[@id='account_1']//following::small[1]"
    public static String LBL_ACCOUNT_2_ID_XPATH = "//input[@id='account_2']//following::small[1]"
    public static String LBL_SELECT_THE_ACCOUNTS_XPATH = "//h4[contains(text(),'Select the accounts you wish to authorise')]"
    public static String CONSENT_EXPIRY_XPATH = "//button[@id='consent-expiry-date']"
    public static String NEGATIVE_SHARING_DURATION_ERROR_PATH = "//td[contains(text(),'Negative sharing_duration')]"
    public static String CONSENT_CONFIRM_XPATH = "//input[@id='approve']"
    public static String CONSENT_AUTHORIZE_FLOW_BACK_XPATH = "//input[@id='back']"

    public static String LBL_PERMISSION_HEADER_ORG_PROFILE = "//button[contains(text(),'Organisation profile')]"
    public static String LBL_PERMISSION_HEADER_ACC_NAME = "//button[contains(text(),'Account name, type, and balance')]"
    public static String LBL_PERMISSION_HEADER_ACC_BAL = "//button[contains(text(),'Account balance and details')]"
    public static String LBL_PERMISSION_HEADER_TRA_DETAILS = "//button[contains(text(),'Transaction details')]"
    public static String LBL_PERMISSION_HEADER_PAYMENT_READ = "//button[contains(text(),'Direct debits and scheduled payments')]"
    public static String LBL_PERMISSION_HEADER_PAYEES = "//button[contains(text(),'Saved payees')]"
    public static String LBL_PERMISSION_LIST_ITEM_1 = "//h4[text()='Data requested:']/following-sibling::div//ul[@class='scopes-list padding']//li[1]"
    public static String LBL_PERMISSION_LIST_ITEM_2 = "//h4[text()='Data requested:']/following-sibling::div//ul[@class='scopes-list padding']//li[2]"
    public static String LBL_PERMISSION_LIST_ITEM_3 = "//h4[text()='Data requested:']/following-sibling::div//ul[@class='scopes-list padding']//li[3]"
    public static String LBL_PERMISSION_LIST_ITEM_4 = "//h4[text()='Data requested:']/following-sibling::div//ul[@class='scopes-list padding']//li[4]"
    public static String LBL_PERMISSION_LIST_ITEM_5 = "//h4[text()='Data requested:']/following-sibling::div//ul[@class='scopes-list padding']//li[5]"
    public static String LBL_PERMISSION_LIST_ITEM_6 = "//h4[text()='Data requested:']/following-sibling::div//ul[@class='scopes-list padding']//li[6]"
    public static String LBL_PERMISSION_LIST_ITEM_7 = "//h4[text()='Data requested:']/following-sibling::div//ul[@class='scopes-list padding']//li[7]"
    public static String LBL_PERMISSION_LIST_ITEM_8 = "//h4[text()='Data requested:']/following-sibling::div//ul[@class='scopes-list padding']//li[8]"
    public static String LBL_PERMISSION_LIST_ITEM_9 = "//h4[text()='Data requested:']/following-sibling::div//ul[@class='scopes-list padding']//li[9]"
    public static String LBL_PERMISSION_LIST_ITEM_10 = "//h4[text()='Data requested:']/following-sibling::div//ul[@class='scopes-list padding']//li[10]"
    public static String LBL_PERMISSION_LIST_ITEM_11 = "//h4[text()='Data requested:']/following-sibling::div//ul[@class='scopes-list padding']//li[11]"
    public static String LBL_PERMISSION_HEADER = "//*[@class='padding']//button"
    public static String LBL_SECONDARY_ACCOUNT_INDICATION= "//button[@id='secondary_account']/span[contains(text(),'New')]"

    public static String LBL_AUTHORISED_STATUS = "//div[@id='heading0acc']//div[@class='p1 consent-status ml-3 ml-auto align-self-center']"
    public static String LBL_REVOKED_STATUS = "//div[@id='heading2acc']//div[@class='p1 consent-status ml-3 ml-auto align-self-center']"
    public static String LBL_CONSENT_ACCOUNT_1 = "//div[@id='heading0acc']"
    public static String LBL_CONSENT_ACCOUNT_DETAILS_LIST_ITEM_1 = "//div[@id='accordion0acc']//h4[contains(text(), " +
            "'Account name, type and balance')]"
    public static String LBL_STOP_SHARING_BUTTON_OF_ACCOUNT_1 = "//button[@id='denyBtn0acc']"
    public static String LBL_CONSENT_ACCOUNT_2 = "//div[@id='heading1acc']"
    public static String LBL_STOP_SHARING_BUTTON_OF_ACCOUNT_2 = "//button[@id='denyBtn1acc']"
    public static String LBL_TEXT_AREA_OF_REVOKE_REASON = "//textarea[@id='revokeReason']"
    public static String LBL_REVOKE_BUTTON = "//button[@id='denyConfirmBtn']"
    public static String LBL_CONSENT_GRANTED_DATE = "//div[@id='heading0acc']//h6[2]"
    public static String LBL_CONSENT_GAVE = "//div[@id='accordion0acc']//h5"
    public static String LBL_CONSENT_EXPIRE = "//div[@id='accordion0acc']//h5[2]"
    public static String LBL_OF_SHARING_PERIOD = "//div[@id='accordion0acc']//h5[3]"
    public static String LBL_CONSENT_GAVE_DATE = "//div[@id='accordion0acc']//div[@id='Directdebitsandscheduledpayments']" +
            "/following-sibling::div/h5[text()='When you gave consent']/following-sibling::ul[1]/li"
    public static String LBL_CONSENT_EXPIRE_DATE = "//div[@id='accordion0acc']//div[@id='Directdebitsandscheduledpayments']" +
            "/following-sibling::div/h5[text()='When you gave consent']/following-sibling::ul[2]/li"
    public static String LBL_OF_SHARING_PERIOD_DATE = "//div[@id='accordion0acc']//div[@id='Directdebitsandscheduledpayments']" +
            "/following-sibling::div/h5[text()='When you gave consent']/following-sibling::ul[3]/li"
    public static String LBL_BANK_ACCOUNT_BASIC_READ = "//div[@id='accordion0acc']//div[@id='headingAccountnametypeandbalance']//h4"
    public static String LBL_BANK_ACCOUNT_DETAIL_READ = "//div[@id='accordion0acc']//div[@id='headingAccountnumbersandfeatures']//h4"
    public static String LBL_BANK_PAYEES_READ = "//div[@id='accordion0acc']//div[@id='headingSavedpayees']//h4"
    public static String LBL_BANK_TRANSACTION_READ = "//div[@id='accordion0acc']//div[@id='headingTransactiondetails']//h4"
    public static String LBL_BANK_CUSTOMER_DETAIL_READ = "//div[@id='accordion0acc']//div[@id='headingOrganisationcontactdetails']//h4"
    public static String LBL_BANK_CUSTOMER_BASIC_READ = "//div[@id='accordion0acc']//div[@id='headingOrganisationprofile']//h4"
    public static String LBL_BANK_REGULAR_PAYMENTS_READ = "//div[@id='accordion0acc']//div[@id='headingDirectdebitsandscheduledpayments']//h4"
    public static String LBL_BANK_CUSTOMER_BASIC_READ_INDIVIDUAL = "//div[@id='accordion0acc']//div[@id='headingContactdetails']//h4"
    public static String LBL_BANK_CUSTOMER_DETAIL_READ_INDIVIDUAL = "//div[@id='accordion0acc']//div[@id='headingNameandoccupation']//h4"

    public static String LBL_NAME_OF_ACCOUNT_PATH = "//div[@id='accordion0acc']//div[@id='Accountnametypeandbalance']//li[1]"
    public static String LBL_TYPE_OF_ACCOUNT_PATH = "//div[@id='accordion0acc']//div[@id='Accountnametypeandbalance']//li[2]"
    public static String LBL_ACCOUNT_BALANCE_PATH = "//div[@id='accordion0acc']//div[@id='Accountnametypeandbalance']//li[3]"
    public static String LBL_ACCOUNT_NUMBER_PATH = "//div[@id='accordion0acc']//div[@id='Accountnumbersandfeatures']//li[1]"
    public static String LBL_ACCOUNT_MAIL_ADDRESS_PATH = "//div[@id='accordion0acc']//div[@id='Accountnumbersandfeatures']//li[2]"
    public static String LBL_RATES_FEES_DISCOUNT_PATH = "//div[@id='accordion0acc']//div[@id='Accountnumbersandfeatures']//li[3]"
    public static String LBL_ACCOUNT_TERMS_PATH = "//div[@id='accordion0acc']//div[@id='Accountnumbersandfeatures']//li[4]"
    public static String LBL_DETAILS_OF_SAVED_ACCOUNTS_PATH = "//div[@id='accordion0acc']//div[@id='Savedpayees']//li"
    public static String LBL_INCOMING_AND_OUTGOING_TRANSACTIONS_PATH = "//div[@id='accordion0acc']//div[@id='Transactiondetails']//li[1]"
    public static String LBL_AMOUNTS_AND_DATES_PATH = "//div[@id='accordion0acc']//div[@id='Transactiondetails']//li[2]"
    public static String LBL_DESCRIPTION_OF_TRANSACTION_PATH = "//div[@id='accordion0acc']//div[@id='Transactiondetails']//li[3]"
    public static String LBL_NAME_OF_MONEY_RECIPIENT_PATH = "//div[@id='accordion0acc']//div[@id='Transactiondetails']//li[4]"
    public static String LBL_PHONE_PATH = "//div[@id='accordion0acc']//div[@id='Contactdetails']//li[1]"
    public static String LBL_EMAIL_ADDRESS_PATH = "//div[@id='accordion0acc']//div[@id='Contactdetails']//li[2]"
    public static String LBL_MAIL_ADDRESS_PATH = "//div[@id='accordion0acc']//div[@id='Contactdetails']//li[3]"
    public static String LBL_RESIDENTIAL_ADDRESS_PATH = "//div[@id='accordion0acc']//div[@id='Contactdetails']//li[4]"
    public static String LBL_ORGANISATION_ADDRESS_PATH = "//div[@id='accordion0acc']//div[@id='Organisationcontactdetails']//li[1]"
    public static String LBL_ORGANISATION_MAIL_ADDRESS_PATH = "//div[@id='accordion0acc']//div[@id='Organisationcontactdetails']//li[2]"
    public static String LBL_PHONE_NUMBER_PATH = "//div[@id='accordion0acc']//div[@id='Organisationcontactdetails']//li[3]"
    public static String LBL_NAME_PATH = "//div[@id='accordion0acc']//div[@id='Nameandoccupation']//li[1]"
    public static String LBL_OCCUPATION_PATH = "//div[@id='accordion0acc']//div[@id='Nameandoccupation']//li[2]"
    public static String LBL_AGENT_NAME_ROLE_PATH = "//div[@id='accordion0acc']//div[@id='Organisationprofile']//li[1]"
    public static String LBL_ORGANISATION_NAME_PATH = "//div[@id='accordion0acc']//div[@id='Organisationprofile']//li[2]"
    public static String LBL_ORGANISATION_NUMBER_PATH = "//div[@id='accordion0acc']//div[@id='Organisationprofile']//li[3]"
    public static String LBL_CHARITY_STATUS_PATH = "//div[@id='accordion0acc']//div[@id='Organisationprofile']//li[4]"
    public static String LBL_ESTABLISHMENT_PATH = "//div[@id='accordion0acc']//div[@id='Organisationprofile']//li[5]"
    public static String LBL_INDUSTRY_PATH = "//div[@id='accordion0acc']//div[@id='Organisationprofile']//li[6]"
    public static String LBL_ORGANISATION_TYPE_PATH = "//div[@id='accordion0acc']//div[@id='Organisationprofile']//li[7]"
    public static String LBL_COUNTRY_OF_REGISTRATION_PATH = "//div[@id='accordion0acc']//div[@id='Organisationprofile']//li[8]"
    public static String LBL_DIRECT_DEBITS_PATH = "//div[@id='accordion0acc']//div[@id='Directdebitsandscheduledpayments']//li[1]"
    public static String LBL_SCHEDULED_PAYMENT_PATH = "//div[@id='accordion0acc']//div[@id='Directdebitsandscheduledpayments']//li[2]"

    public static String LBL_USER_ID_PATH = "//div[@class='form-group col-md-4']//input[contains(@id, 'user')]"
    public static String LBL_SEARCH_BUTTON_PATH = "//input[contains(@id, 'searchBtn')]"
    public static String LBL_CONSENT0_STATUS_PATH = "//div[@id='heading0']//div[@class='p1 consent-status ml-3 ml-auto align-self-center']"
    public static String LBL_CONSENT1_STATUS_PATH = "//div[@id='heading1']//div[@class='p1 consent-status ml-3 ml-auto align-self-center']"
    public static String LBL_CONSENT2_STATUS_PATH = "//div[@id='heading2']//div[@class='p1 consent-status ml-3 ml-auto align-self-center']"
    public static String LBL_APPLICATION_MENU_PATH = "//select[contains(@id,'app')]"
    public static String LBL_STATUS_PATH = "//input[contains(@id, 'AccountStatus')]"
    public static String LBL_DATE_RANGE_PATH = "//input[contains(@id, 'daterange')]"
    public static String LBL_APPLY_BUTTON_PATH = "//button[@class='applyBtn btn btn-sm btn-success']"
    public static String LBL_CONSENT0_PATH = "//div[@id='heading0']"
    public static String LBL_REVOKE_BUTTON_PATH = "//button[@id='denyBtn0']"
    public static String LBL_CONFIRM_REVOKE_BUTTON_PATH = "//button[@id='denyConfirm']"
    public static String LBL_USER_ID_VERIFY_PATH = "//div[@id='accordion0']//h5//em"
    public static String LBL_CONSENT0_CREATED_DATE = "//div[@id='heading0']//h6"
    public static String LBL_CONSENT1_CREATED_DATE = "//div[@id='heading1']//h6"

    public static String LBL_BANK_ACCOUNT_BASIC_READ_PATH = "//div[@id='accordion0']//div[@id='headingAccountname,typeandbalance']//h4"
    public static String LBL_BANK_ACCOUNT_DETAIL_READ_PATH = "//div[@id='accordion0']//div[@id='headingAccountnumbersandfeatures']//h4"
    public static String LBL_BANK_PAYEES_READ_PATH = "//div[@id='accordion0']//div[@id='headingSavedpayees']//h4"
    public static String LBL_BANK_TRANSACTION_READ_PATH = "//div[@id='accordion0']//div[@id='headingTransactiondetails']//h4"
    public static String LBL_BANK_CUSTOMER_BASIC_READ_INDIVIDUAL_PATH = "//div[@id='accordion0']//div[@id='headingContactdetails']//h4"
    public static String LBL_BANK_CUSTOMER_DETAIL_READ_PATH = "//div[@id='accordion0']//div[@id='headingOrganisationcontactdetails']//h4"
    public static String LBL_BANK_CUSTOMER_DETAIL_READ_INDIVIDUAL_PATH = "//div[@id='accordion0']//div[@id='headingNameandoccupation']//h4"
    public static String LBL_BANK_CUSTOMER_BASIC_READ_PATH = "//div[@id='accordion0']//div[@id='headingOrganisationprofile']//h4"
    public static String LBL_BANK_REGULAR_PAYMENTS_READ_PATH = "//div[@id='accordion0']//div[@id='headingDirectdebitsandscheduledpayments']//h4"

    public static String LBL_CCPORTAL_ACCOUNT_NAME_TYPE_TAB = "//div[@id='accordion0']//div[@id='Accountnametypeandbalance']//li"
    public static String LBL_CCPORTAL_ACCOUNT_NUMBER_AND_FEATURES_TAB = "//div[@id='accordion0']//div[@id='Accountnumbersandfeatures']//li"
    public static String LBL_CCPORTAL_SAVED_PAYEES_TAB = "//div[@id='accordion0']//div[@id='Savedpayees']//li"
    public static String LBL_CCPORTAL_TRANSACTIONS_DETAIL_TAB = "//div[@id='accordion0']//div[@id='Transactiondetails']//li"
    public static String LBL_CCPORTAL_CONTACT_DETAILS_TAB = "//div[@id='accordion0']//div[@id='Contactdetails']//li"
    public static String LBL_CCPORTAL_ORGANISATION_CONTACT_DETAILS_TAB = "//div[@id='accordion0']//div[@id='Organisationcontactdetails']//li"
    public static String LBL_CCPORTAL_NAME_AND_OCCUPATION_TAB = "//div[@id='accordion0']//div[@id='Nameandoccupation']//li"
    public static String LBL_CCPORTAL_ORGANISATION_PROFILE_TAB = "//div[@id='accordion0']//div[@id='Organisationprofile']//li"
    public static String LBL_CCPORTAL_DIRECT_DEBITS_TAB = "//div[@id='accordion0']//div[@id='Directdebitsandscheduledpayments']//li"

    //Selenium Constants
    public static String AU_USERNAME_FIELD_ID = "usernameUserInput"
    public static String AU_USERNAME_FIELD_XPATH_200 = "//form[@id=\"identifierForm\"]/div//input[@id=\"usernameUserInput\"]"
    public static String AU_PASSWORD_FIELD_ID = "password"
    public static String AU_HEADLESS_TAG = "--headless"
    public static String AU_ACCOUNT_SELECT_DROPDOWN_XPATH = "//*[@id=\"accselect\"]"
    public static String AU_AUTH_SIGNIN_XPATH = "//input[@value='Next']"
    public static String AU_CONSENT_DENY_XPATH = "//input[@value='Deny']"
    public static String AU_CONSENT_APPROVE_SUBMIT_ID = "approve"
    public static String AU_IS_USERNAME_ID = "txtUserName"
    public static String AU_IS_PASSWORD_ID = "txtPassword"
    public static String AU_BTN_IS_SIGNING = "//input[@value='Sign-in']"
    public static String AU_BTN_DEVPORTAL_SIGNIN = "//span[contains(text(),'Sign-in')]"
    public static String AU_BTN_CONTINUE = "//button[contains(text(),'Continue')]"
    public static String AU_TAB_APPLICATIONS = "//span[contains(text(),'Applications')]"
    public static String AU_TBL_ROWS = "//tbody/tr"
    public static String AU_TAB_SUBSCRIPTIONS = "//p[text()='Subscriptions']"
    public static String AU_CCPORTAL_SIGNIN_XPATH = "//button[contains(text(),'Sign in')]";

    // Second Factor Authenticator constants
    public static String AU_LBL_SMSOTP_AUTHENTICATOR = "//h3[text()='Authenticating with SMSOTP']"
    public static String AU_TXT_OTP_CODE_ID = "OTPcode"
    public static String AU_BTN_AUTHENTICATE = "//input[@id='authenticate']"

    public static String VALUE = "value"
    public static String TEXT = "text"
    public static String ORGANIZATION_A_PROFILE_SELECTION = "//input[@id='Organization A']"
    public static String ORGANIZATION_B_PROFILE_SELECTION = "//input[@id='Organization B']"
    public static String INDIVIDUAL_PROFILE_SELECTION = "//input[@id='Individual']"
    public static String PROFILE_SELECTION_NEXT_BUTTON = "//*[@id='btnNext']"
    public static String CHK_ORG_A_BUSINESS_ACCOUNT_1 = "//input[@id='business_account_1']"
    public static String CHK_ORG_B_BUSINESS_ACCOUNT_1 = "//input[@id='business_account_2']"
    public static String CHK_ORG_B_BUSINESS_ACCOUNT_2 = "//input[@id='business_account_3']"
    public static String SECONDARY_ACCOUNT_1 = "//input[@id='secondary_account_1']"
    public static String SECONDARY_ACCOUNT_2 = "//input[@id='secondary_account_2']"
    public static String LBL_ACCOUNTS_UNAVAILABLE_TO_SHARE= "//option[contains(text(),'Accounts unavailable to share')]"
    public static String LBL_FIRST_UNAVAILABLE_ACCOUNT= "//input[@id='unavailable_account_1']//following::small[1]"
    public static String SECONDARY_JOINT_ACCOUNT= "//input[@id='secondary_joint_account_1']"
    public static String LBL_SECONDARY_ACCOUNT_1 = "//input[@id='secondary_account_1']/.."
    public static String LBL_SECONDARY_ACCOUNT_2 = "//input[@id='secondary_account_2']/.."
    public static String LBL_SECONDARY_ACCOUNT_3 = "//input[@id='secondary_account_3']/.."
    public static String LBL_SECONDARY_JOINT_ACCOUNT_1 = "//input[@id='secondary_joint_account_1']/.."

    public static String LBL_BUSINESS_ACCOUNT_1 = "//strong[contains(text(),'business_account_1')]"
    public static String LBL_BUSINESS_ACCOUNT_2 = "//strong[contains(text(),'business_account_2')]"
    public static String BTN_SELECT_ALL = "//button[contains(text(),'Select all')]"
    public static String LBL_NO_ELIGIBLE_ACCOUNTS = "//form[@id='oauth2_authz_consent']//div//p"
    public static String BTN_CANCEL = "//input[@id='cancel']"
    public static String TEXT_ATTRIBUTE = "text"
    public static String JOINT_ACCOUNT_XPATH = "//input[@id='joint_account_1']"
    public static String ALT_JOINT_ACCOUNT_XPATH = "//input[@id='joint_account_3']"
    public static String LBL_ERROR_TRY_AGAIN = "//div[@id='error-msg']"
    public static String BTN_AUTHENTICATE = "//input[@id='authenticate']"
    public static String TXT_OTP_CODE = "OTPcode"
    public static BTN_CONSENT_EXPIRY_XPATH = "//button[@id='consent-expiry-date']"
    public static LBL_UNAVAILABLE_ACCOUNT = "//h4[contains(text(),'Accounts Unavailable To Share')]/following-sibling::div/"
    public static POPUP_UNAVAILABLE_ACCOUNTS = "//p[@id='UnavailableAccountPopover']"
    public static LBL_WHY_CANT_SHARE = "//h4[contains(text(),'Accounts Unavailable To Share')]/following-sibling::div/p[2]"

    static final String TXT_USERNAME = "//input[@id='txtUserName']"
    static final String TXT_PASSWORD = "//input[@id='txtPassword']"
    static final String BTN_SIGNIN = "//input[@value='Sign-in']"

    static final String LNK_SP_LIST =
            "//li[text()='Service Providers']/following-sibling::li//a[contains(@href,'list_service_providers_menu')]"
    static final String BTN_EDIT_SP = "//table[@id='ServiceProviders']/tbody/tr[1]/td[1]/following-sibling::td[2]/a[contains(@title,'Edit Service Providers')]"
    static final String CHK_UPLOAD_SP_CERT = "//input[@id='choose_upload_certificate']"
    static final String TXT_UPLOAD_CERT = "//textarea[@id='sp-certificate']"
    static final String BTN_UPDATE = "//input[@value='Update']"

    static final String LNK_ADD_USER_AND_ROLE = "//a[contains(@href,'user_mgt_menu_add')]"
    static final String LNK_ADD_NEW_USER = "//a[text()='Add New User']"
    static final String LNK_ADD_NEW_ROLE = "//a[text()='Add New Role']"

    static final String TXT_NEW_USER_NAME = "//input[@name='username']"
    static final String TXT_NEW_USER_PASSWORD = "//input[@name='password']"
    static final String TXT_NEW_USER_CONFIRM_PASSWORD = "//input[@id='password-repeat']"
    static final String BTN_NEXT = "//input[contains(@value,'Next')]"
    static final String CHK_SUBSCRIBER_ROLE = "//input[@type='checkbox' and @value='Internal/subscriber']"
    static final String BTN_FINISH = "//input[@value='Finish']"
    static final String LBL_MESSAGE_BOX = "//div[@id='messagebox-info']/p"
    static final String BTN_MESSAGEBOX_OK = "//div[@class='ui-dialog-buttonpane']/button[text()='OK']"
}
