var loginOperations = (function(){
    var login = function(){
        var userId = $('#userId').val();
        var password = $('#password').val();
        firebase.auth().signInWithEmailAndPassword(userId, password).catch(function(error) {
            var errorMessage = error.message;
            console.log("errmsg",errorMessage);
        });
        firebase.auth().onAuthStateChanged(function(user) {
            console.log(user);
            if (user) {
                window.location.href = "userProfile.html";
            } else {
                console.log("some error occured");
            }
        });
        

    };

    return{
        "login": login
    }
})();