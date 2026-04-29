/*
			* Use App.getDependency for Dependency Injection
			* eg: var DialogService = App.getDependency('DialogService');
			*/
		   
		   /* perform any action on widgets/variables within this block */
		   Page.onReady = function () {
			   /*
				* variables can be accessed through 'Page.Variables' property here
				* e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
				* Page.Variables.loggedInUser.getData()
				*
				* widgets can be accessed through 'Page.Widgets' property here
				* e.g. to get value of text widget named 'username' use following script
				* 'Page.Widgets.username.datavalue'
				*/
			   document.body.style.maxWidth = '1440px';
			   document.body.style.minHeight = '976px';
			   document.body.style.width = '100%';
		   };

		   /* on-submit handler for personal_details_form — invokes createPersonVariable with form field values */
		   Page.personal_details_formSubmit = function ($event, widget, $formData) {
			   Page.Variables.createPersonVariable.invoke({
				   inputFields: {
					   "Person.email": $formData.email_address,
					   "Person.firstName": $formData.first_name,
					   "Person.lastName": $formData.last_name,
					   "Person.phoneNumber": $formData.mobile_number,
					   "Person.address": $formData.address,
					   "Person.socialSecurityNumber": $formData.social_security_number,
					   "Person.dob": $formData.date_of_birth
				   }
			   });
		   };
