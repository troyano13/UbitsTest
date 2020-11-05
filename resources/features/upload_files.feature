#Author: your.email@your.domain.com
Feature: upload files
  user want to upload files

  @upload_files
  Scenario: Upload files and  to choose license
    Given user is login in the home page
    When user upload file and to can select  'Creative Commons - ShareAlike' for Choose license
    Then user can to see upload file
