(function () {
    'use strict';

    angular.module('cgApp').controller('joinController', JoinController);

    JoinController.$inject = ['$scope', '$http', '$location', '$rootScope', '$localStorage', '$uibModal', 'dataService'];
    function JoinController($scope, $http, $location, $rootScope, $localStorage, $uibModal, dataService) {

      if(typeof $localStorage.token !== 'undefined' ){
        dataService.setData($localStorage.token);
        $location.path('/dashboard');
        return;
      }


	  function join() {
		  $http.post('/cardgame/api/join').success(function(data, status) {
			  if(data.code === 1002 || data.code === 1001) return alert(data.msg);
			  $location.path('/dashboard');
          }).catch(function(err) {
            if(err.status == 401){
              alert("Login Invalido");
            }
            else{
              alert("Alguma coisa deu errado")
            }
          })
	  }

      function login(username, password) {
        let params = {
          	username: username,
          	password: password
        }

        $http.post('/cardgame/api/login', params).success(function(data, status) {
			$localStorage.token = data.token;
			$http.defaults.headers.post.Authorization = "Bearer " + data.token;
			join();
			dataService.setData(data.token);
        }).catch(function(err) {
          if(err.status == 401){
            alert("Login Invalido");
          }
          else{
            alert("Alguma coisa deu errado")
          }
        })
      };

	  function alert(message) {
		  var modalInstance = $uibModal.open({
			  animation: $scope.animationsEnabled,
			  templateUrl: 'templates/messageAlert.html',
			  controller: 'alertCtrl',
			  size: 'sm',
			  resolve: {
				  data: function () {
					  return {
						  message: message
					  }
				  }
			  }
		  })

		  modalInstance.result.then(function() {
		  }, function() {
			  $location.path('/dashboard');
		  })
	  }

	  $scope.login = login;
    }

})();
