function validateItems() {

    var form = document.getElementById('form')
    var gname = document.getElementById('gname')
    var email = document.getElementById('email')
    var phone = document.getElementById('phone')



    if (gname.value == "") {
        alert("Please enter your name.");
    }

    if (email.value == "") {
        alert("Please enter your email.");
    }
    if (phone.value == "") {
        alert("Please enter phone number.");
    }
    if (gname.value != "" && email.value != "" && phone.value != "") {
        alert("Thank you! All necessary fields have been submitted successfully and the information is valid!");

        return false;
    }

}