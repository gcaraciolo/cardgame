(function() {

    'use strict';

    angular.module('cgApp', ['ui.router', 'ui.bootstrap', 'ngTouch', 'ngAnimate']);

    angular.module('cgApp').config(function($stateProvider, $urlRouterProvider) {      

      $urlRouterProvider.otherwise('/dashboard');

      $stateProvider.state("dashboard", {
        url: "/dashboard",
        templateUrl: "templates/dashboard.html",
        controller: "dashboardCtrl"
      });

    });

})();
