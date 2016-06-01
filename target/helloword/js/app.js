(function() {

    'use strict';

    angular.module('cgApp', ['ui.router', 'ui.bootstrap', 'ngTouch', 'ngAnimate', 'ngStorage']);

    angular.module('cgApp').config(function($stateProvider, $urlRouterProvider) {

      $urlRouterProvider.otherwise('/join');

      $stateProvider.state("dashboard", {
        url: "/dashboard",
        templateUrl: "templates/dashboard.html",
        controller: "dashboardCtrl"
      });

      $stateProvider.state("join", {
        url: "/join",
        templateUrl: "templates/join.html",
        controller: "joinController"
      });

      $stateProvider.state("logout", {
        url: "/logout",
        templateUrl: "",
        controller: "logoutController"
      });

    });

    angular.module('cgApp').service('dataService', function() {
      var token;

      this.setData = function(data){
        token = data;
      };

      this.getData = function(){
        return 'Bearer ' + token;
      };
    });

})();
