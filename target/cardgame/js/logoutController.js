(function () {
    'use strict';
	var baseUrl = '/cardgame/api'

    angular.module('cgApp').controller('logoutController', LogoutController);

    LogoutController.$inject = ['$http', '$location', '$localStorage'];
    function LogoutController($http, $location, $localStorage) {

      $localStorage.$reset();
      $location.path('/join');

	  $http.post(baseUrl + '/leave').success(function(data, status) {
	  });
    }

})();
