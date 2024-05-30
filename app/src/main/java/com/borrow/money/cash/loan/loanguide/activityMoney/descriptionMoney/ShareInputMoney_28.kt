package com.borrow.money.cash.loan.loanguide.activityMoney.descriptionMoney

import android.content.ClipData
import android.content.ClipboardManager
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.borrow.money.cash.loan.loanguide.databinding.MoneyShareInputBinding

class ShareInputMoney_28 : AppCompatActivity() {
    private lateinit var mBinding: MoneyShareInputBinding
    var TwentySixPosi = 0
    var TwentySixData: String? = null
    var TwentySixTitle: String? = null
    var heading: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MoneyShareInputBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.conToolbar.heading.text = "Detail"

        if (intent != null) {
            TwentySixPosi = intent.getIntExtra("TwentySixType", 0)
            heading = intent.getStringExtra("heading")
        }
        when (TwentySixPosi) {
            0 -> {
                TwentySixData = "https://registration.shramsuvidha.gov.in/user/login"
                TwentySixTitle =
                    "→ An Employee Provident Fund is an initiative designed to offer social security benefits to employees of a particular organization, building stronger employee - employer bonds.  In order to enjoy these benefits to the hilt, employers need to follow a set of rules and guidelines laid out, with registration forming the first step.  + Employers need to provide the following details to successfully register themselves .  \n→ Name and address of company \n→ Head office and branch details \n→ Mention date of incorporation / registration of company Fill up details of employees - total employee strength \n→ Activity the business / enterprise is involved in - i.e.  manufacturing , production , service , etc.  \n→ Legal details - This pertains to legal status of a company , i.e.  whether it is a private firm / public company , partnership or society , etc.  \n→ Owner details , including designation and address of Directors and partners \n→ Particulars related to wage component of employees , i.e.  total wage disbursed during a month \n→ Details of bank with whom company has banking relationship \n→ PAN details \n→ Basic details of employ + Documents required for EPF Registration Online :- Copy of partnership deed if the company is a registered partnership firm - A copy of the  Certificate of incorporation for a Public or Private Limited Company.  This should be issued by the Registrar of Companies \n→ Societies should furnish a copy of their registration certificate \n→ Public and Private Limited Companies need to submit a copy of memorandum and Articles of Association \n→ Societies should furnish a copy of the rules and objects of the society  © All legal documents which might be required under the Income Tax Act \n→ PAN details of company > Partition deed \n→ Proof of incorporation - first sales invoice / license issued by competent authorities \n→ Salary details of employees \n→ Balance sheet details"
            }

            1 -> {
                TwentySixData = "https://unifiedportal-mem.epfindia.gov.in / memberinterface /"
                TwentySixTitle =
                    "→ Upload KYC details in EPF UAN : To upload the KYC document on the EPF UAN , follow the steps mentioned below : * Visit the EPFOs member portal http://vanmembers.epfoservices.in/ Once the page is displayed on your screen , click  on profile on the top bar .  From the drop down list, click on upload KYC document.  Once you have clicked on that , select the KYC information you wish to update .  Next , you will have to upload a scanned self - attested copy of the KYC document .  The document should be either in jpg , pdf or png format , and keep in mind that the maximum file size of your KYC document does not exceed 300 KB .  Once you have uploaded the document , the status of your KYC document will show as pending .  Only once your employer has verified the document and approved of it, the status will show as approved by employer.  Once your employer has approved your document, you will receive an SMS confirming the same.  From then on , the verification process when you make a claim will be much faster and you can expect an approval in no time.  Process of embedding KYC details in EPF UAN : Once your employer has verified and found the details matching and legitimate, he / she will digitally attest the document .  * Once your document has been approved, authorities of the EPFO bwill then verify your approved document to see if there is any mismatch, discrepancies and so on.  If your documents hasnt been approved you can contact the EPFOS helpline - 1800 118 005 -or mail them at vanepf@epfindia.gov.in .  Once this is all done , if you raise a claim , the verification process will be done in no time and your personal KYC details will be embedded in the EPF UAN system . "
            }

            2 -> {
                TwentySixData = "https://unifiedportal-mem.epfindia.gov.in/memberinterface/"
                TwentySixTitle =
                    "UMANG :→ Unified Mobile Application for New - age Governance ( UMANG ) app was launched in November 2017 as a means of creating a common portal for all the facilities offered by the government .  Additionally , other government developed programs such as the Aadhaar and Digilocker are integrated with the app .  \n→ Umang offers over 180 government services to its users .  One of these is the services offered by the EPFO.  The EPF service on the UMANG app allows users to access information about their EPF account.  This service is extended to both employers and employees .  Though the EPFO btab on the UMANG app, employees can file claims for EPF withdrawal as well as track the status of their claims.  Some of the requirements for using this facility is having your Aadhaar linked to the app, as well as an active UAN.  \n→ UMANG service has been made available on multiple channels like mobile application , web , IVR and SMS which can be accessed through smartphones , feature phones , tablets and desktops .  UMANG has been created with a thought to add convenience to your lifestyle.  UMANG will revolutionize the way how an Indian citizen avails government services today, because it leverages the current accelerated internet and smartphone penetration in our country. "
            }

            3 -> {
                TwentySixData = "https://unifiedportal-emp.epfindia.gov.in/epfo/"
                TwentySixTitle =
                    "→ ECR / Returns and Payments : Step 1 : Login to EPFO bportal using your ECR portal credentials : Once logged in , you can check the details of Establishment Name , Establishment ID , Exemption Status ( PF , Pension , EDLI ) , Establishment Address and PF  office.  Step 2 : To upload ECR , go to Payments tab >> ECR ( UPLOAD ] + Step 3: On next screen , ie ECR File Upload , click on ECR Help File to view the ECR file format To upload the ECR , select the Wage Month  and Salary Disbursal Date. Step 4 : Select your ECR text file to be uploaded. An ECR text file appears like the one below : Step 5 : Select the remaining fields like File Type ( Select ECR ) , Contribution Rate % ( Default value is 12  % ) , add comment , and click on Upload Button : Step 6 : Once uploaded , the file will be validated by the portal against the pre - defined conditions. Once validation is successful , you can see the following screen with Validation Successful message : Click  Verify button generate TRRN ( Temporary Return Reference Number ) . Step 7 : Generate ECR summary sheet by clicking on Prepare Challan button + Step 8 : On the next screen , you can adjust \\\\\\\" Total EDLI Contributions ( ER Share A / C 21 ) \\\\\\\" (  if required ) , enter Administration &amp; Inspection Cha  rges for \\\\\\\" Total EPF Charges ( A / C 2 ) \\\\\\\" &amp; \\\\\\\" Total EDLI Charges ( A / C 22 ) .  \\\\\\\" Once done , click on Generate Challan Button . Step 9 : From the challan list page that follows , click on \\\\\\\" Finalize \\\\\\\" icon after reviewing the Total Amount , under Draft Challan List . You can also download Acknowledgment File and Receipt File under \\\\\\\" In  - Process Challan List \\\\\\\" . Step 10 : The finalized ECR ( Electronic Challan - cum - Receipt ) will look similar to this : Step 11 : Once finalized , you can go ahead and make the payment. Click on \\\\\\\" Pay \\\\\\\" button to make the  payment : Step 12 : Please select Payment Mode as \\\\\\\" Online \\\\\\\" , and select the bank from the list from which you wish to make the payment. Once selected , click on \\\\\\\" Continue \\\\\\\" and this will navigate you to payment gateway for completing the payment  ."
            }

            4 -> {
                TwentySixData = "https://epfindia.gov.in/site_en/index.php"
                TwentySixTitle =
                    "→ We bring you steps that you must follow while applying for online EPF transfer.  Step 1: Go to the EPFO bwebsite, epfindia.com.  \n→ Step 2 : The home page will show a section called online transfer claim portal.  Click on it.  + Step 3 : Before logging in , check if you can apply online .  If not , you will have to submit a physical copy of Form 13 to either your present or your previous employer .  Step 4 : After checking the eligibility , log in and go to the claims section .  There, click on request for transfer of funds.  Step 5: Form 13 will open.  Fill your PF numbers with both previous and current employers and click on click here to get details.  The name and address of the establishment, the PF account held by the EPFO band your name will appear on the screen.  Step 6 : Your date of joining , date of leaving and father / spouses name also appear .  This is to make sure that the money is transferred to the right account.  Step 7 : You will be asked if you want to get the claim attested through your previous employer or your present employer + Step 8 : You will have to type the characters shown in the text box and click on Get Pin .  You will then have to agree to the declaration in the form by clicking on I Agree .  Step 9 : Enter the PIN received on the registered mobile .  The application is submitted .  Step 10: Tracking ID is generated.  Step 11 : The form will be saved in the system.  You have to take a printout of its PDF version, sign it and submit it to the employer within 15 days.  Step 12 : Note down the contact details of people authorized to sign on the form.  These are shown after the form is submitted .  Step 13 : Present and previous employers will verify your details electronically .  + Step 14 : Once approval comes from both employers , funds are credited to the members account by the EPFO bbranch office .  + Step 15 : The employer plays an important role in this process by verifying the authenticity and signature of the employee .  The EPFO bkeeps you updated through SMSes.  You can also track the application through the EPFO bwebsite. "
            }

            5 -> {
                TwentySixData = "https://passbook.epfindia.gov.in / Member PassBook / Login.jsp"
                TwentySixTitle =
                    "→ E - Passbook : To avail the e - Passbook facility , you will have to compulsorily register on the EPFO bofficial website .  The following details will have to be filled in while registering : \n→ Your mobile number \n→ PAN number \n→ Aadhar Card number \n→ National Population Register number \n→ Bank account number > Voter ID \n→ Driving license \n→ Passport number \n→ Ration Card number Your name as on the  official documents \n→ Email ID - > You will get a captcha image , which you must type in the box provided and you will get the PIN .  \n→ The PIN will be received on your registered mobile number via SMS.  After you submit the form , you will get a confirmation on your registered mobile and it completes the registration process .  You can then login to the EPFO bMember Portal and check your EPF status online.  The following is the process to generate your EPF e - Passbook : \n→ Once you have logged in to the member portal , you will get a screen that you can alter your details and also download e - Passbook from this page .  \n→ When you select download , you will be asked to select the state and you will have to select the PF office of that state.  \n→ If you have no idea which is your PF office, you can find the details at http://epf-india.co.in/.\\n- You can then enter the EPF account number and your name that is the same as in your EPFO brecords .  \n→ Fill in the captcha details and avail the PIN number .  - Enter the pin number that you receive on your registered mobile number via SMS.  Finally hit the button - Get Detail .  You can then download the PDF e - Passbook .  Remember the following while downloading EPF e - Passbook : \n→ Only one mobile number can be used for one registration .  - You can however edit the mobile number later on .  You can see only one EPF account under one establishment.  - You can transfer old EPF account to the new one.  \n→ You will not be able to see settled or inoperative accounts.  \n→ You can register using different ID proofs and mobile number to check the details of the different accounts.  Your EPF e - Passbook will contain the month and date wise transactions made in your account from the year in which the annual accounts were updated for the establishment ."
            }

            6 -> {
                TwentySixData = "https://return.shramsuvidha.gov.in/user/login"
                TwentySixTitle =
                    "→ In order to link an establishment with your account you need to be registered at USSP , follow below steps : * To get started using the Shram Suvidha Portal right away , just type the following address into your web browser or click on the link below .  https://shramsuvidha.gov.in Search establishment LIN to link an establishment : Check establishment LIN through know your LIN option at portal main page menu .  * If you find establishment LIN here, login to your Shram Suvidha account at portal home page.  Below screen will be displayed , here enter login details : 1. user id 2. password 3. verification code Click on the submit button to view the landing page .  .  After login, you will see a menu at left hand side.  Choose Link Establishment option from menu .  Now you will see link establishment form , fill out LIN number , previous representative contact details ( registered mobile number and registered email id ) .  * If you don't have mobile / email of previous representative , fill LIN number and choose generate authorization letter option .  Meet your regional head with generated letter . "
            }

            7 -> {
                TwentySixData = "https://mis.epfindia.gov.in/PensionPaymentEnquiry/enquiry.jsp"
                TwentySixTitle =
                    " → Procedure for Generating Jeevan Pramaan / Digital Life Certificate : o Pre - Requisites for Digital Life Certificate Generation The pensioner must have an Aadhaar number * The pensioner must have an existing mobile number * Registration of the Aadhaar number with Pension Disbursing Agency ( bank Post Office  etc ) should have been done already Biometric device list of supported devices is given on the JP portal ) PC with Windows 7.0 &amp; above Android Mobile / Tablet 4.0 &amp; above oso Internet Connectivity"
            }

            8 -> {
                TwentySixData = "https://iwi.mpfindia.gov.in/iw/"
                TwentySixTitle =
                    " What is a Coc ?  Employees who are going on an assignment to a country with which India has an operational Social Security Agreement are exempted from contributing towards social security schemes in the other country ( host country ) if a Cac has been obtained from the EPFO b.  + Stops under the new online process : + EPFO bhas issued a user manval detailing the steps to be followed by the employee and the employer to apply for a Cocas per the new online process .  Here is the step by step process for applying for a Coc.  For employee :- > 1. Visit the international workers portal on the EPFO bwebsite : https : // iwu.cpfindia.gov.in/iwu/ and select APPLICATION FOR COC.  - > 2. Mention Universal Account Number ( WAN ) and select appropriate member ID .  + 3. Complete and submit the application.  A reference number of the application will be generated upon submission and the pre - filled application will be available for download and print .  \n→ 4. Download and print the application.  Sign the application and upload it along with a copy of anes passport .  + To upload the signed application , visit the international workers portal and select UPLOAD SIGNED APPLICATION FOR COC .  The employee con download the pre - Filled application from here as well .  + For employer : Once the employee has uploaded the signed application , the employer needs to follow these steps : + 1. Visit the international workers portal and login using the same login credential used for the Unified Portal ( Employer ) .  + 2. Select Certificate of Coverage from the tab Application.  \n→ 3. Select the appropriate Reference Number to get the signed application uploaded by the employee, verify all the details and approve / reject the application accordingly.  - 4. Once the application is approved, download the application signed by the employee.  To download , select Signed applications Members under the tab Downloads .  \n→ 5. Take a print of the downloaded application and sign with date and stamp at the appropriate place .  6. Upload the duly signed and stamped application.  To upload, select Signed applications - Employer under the tab Upload.  - > Once the signed copy of the application is uploaded , the relevant PF office will process the application and generate the CoC accordingly, - > Both employee and employer can track the status of the application from the international workers portal by selecting TRACK APPLICATION FOR COC  and providing application reference number and date of birth of the employee . "
            }

            9 -> {
                TwentySixData = "https://iwu.epfindia.gov.in/eKYC/"
                TwentySixTitle =
                    "→ On 17 Oct 2017 , EPFO blaunched an online facility for its subscribers to link their 12 - digit unique Aadhaar number with their Universal ( portable PF ) Account Number ( UAN ) on Oct 2017. Using new facility eKYC at EPFOS website www.epfindia.  gov.in , EPFO bmembers can online link their respective UAN with Aadhaar .  In this process, your employer is not involved.  Use eKYC portal if your Aadhaar is not linked with your UAN .  Your details in UAN such as Name and Date of Birth should match Aadhaar .  + Section How to Verify your KYC ( PAN , Bank Details , Aadhaar ) in UAN explains that in detail.  Go to EPF website http: // www.epfindia.com + In Online Services section select eKYC Portal.  + On clicking eKYC portal you will be taken to new eKYC portal .  This portal contains two sections .  The first section is for EPFO bfield officer and second for EPFO bMember.  As you contribute to EPF you are a member.  In EPFO bmember section click on \\\\\\\" LINK UAN AADHAAR \\\\\\\".  * You will be taken to a new page where you need to provide your UAN after the mobile number which is linked to UAN gets displayed .  Click on \\\\\\\"Generate OTP\\\\\\\" button.  Enter the OTP, which you have to enter and provide your Aadhaar number.  + After the successful OTP verification and if your personal details between UAN - Aadhaar match then Aadhaar will be linked to your UAN .  + You can also track whether UAN is linked with Aadhar using eKYC portal through TRACK EKYC .  Track Linking of UAN and Aadhaar using eKYC Portal : Its easy to keep track of your whether your LAN is linked with Aadhar using eKYC Portal .  * Go to EPF website http: // www.epfindia.gov.in In Online Services section select eKYC Portal.  * On clicking eKYC portal you will be taken to new page the eKYC portal .  This portal contains two sections .  The first section is for EPFO bfield officer and second for EPFO bMember.  As you contribute to EPF you are a member.  In EPFO bmember section click on TRACK EKYC.  It takes you to another window , where you need to add UAN number as shown in image below"
            }
        }
        mBinding.tvDec1.text = TwentySixTitle
        mBinding.tvDec2.text = TwentySixData
        mBinding.overview.setCharacterDelay(150)
        mBinding.overview.animateText(heading)
        mBinding.ivCopy.setOnClickListener {

            (getSystemService(CLIPBOARD_SERVICE) as ClipboardManager).setPrimaryClip(
                ClipData.newPlainText("text", mBinding.tvDec2.text.toString())
            )
            Toast.makeText(
                this,
                "Text Copy To Clipboard...",
                Toast.LENGTH_SHORT
            ).show()
        }
        mBinding.conToolbar.btnBack.setOnClickListener {

            onBackPressed()
        }
    }

    override fun onBackPressed() {
                    finish()
    }
}