@regression
Feature:OrangeHrmLive demo
  As a user, i should login successfully

  @author_Beena @sanity @regression @smoke
  Scenario:Admin Should Add User SuccessFully
    Given      I am on Homepage
    When      Login to Application
    Then      click On "Admin" Tab
    And       Verify "System Users" Text
    And       I click On "Add" button
    And       Verify "Add User" Text
    And       Select User Role "Admin"
    And       enter Employee Name "rikku"
    And       enter Username
    And       Select status "Enabled"
    And       enter password
    And       enter Confirm Password
    And       click On "Save" Button
    And       verify message "Successfully Saved"

  @author_Beena @regression
  Scenario: Search The User Create And Verify It
    Given    I am on Homepage
    When     Login to Application
    Then     click On "Admin" Tab
    And      Verify "System Users" Text
    And       Enter Username
    And       Select User Role
    And       Select Satatus
    And       Click on "Search" Tag
    And       Verify the User should be in Result list.

  @author_Beena @regression
  Scenario: Verify That Admin Should Delete The User SuccessFully
    Given    I am on Homepage
    When     Login to Application
    Then     click On "Admin" Tab
    And      Verify "System Users" Text
    And       Enter Username
    And       Select User Role
    And       Select Satatus
    And       Click on "Search" Tag
    And       Verify the User should be in Result list.
    And       Click on Check box
    And       Click on Delete Button
    And       Popup will display
    And       Click on Ok Button on Popup
    And       verify message "Successfully Deleted"


  @author_Beena @regression
  Scenario Outline: Search The User And Verify The Message RecordFound
    Given           I am on Homepage
    When            Login to Application
    Then            click On "Admin" Tab
    And             Verify "System Users" Text
    And             Enter Username "<username >"
    And             Select User Role "<userRole>"
    And             Enter EmployeeName "<employeeName>"
    And             Select Satatus "<Status>"
    And             Click on "Search" Button
    And             verify message "(1) Record Found"
    And             Verify username <username>
    And             Click on Reset Tab

    Examples: login details
      | username     | userRole | employeeName  | Status |
      | Admin        | Admin    | Paul Collings | Enable |
      | Cassidy.Hope | ESS      | Cassidy Hope  | Enable |
      | Nina.Patel   | ESS      | Nina Patel    | Enable |
      | Odis.Adalwin | Admin    | Odis Adalwin  | Enable |