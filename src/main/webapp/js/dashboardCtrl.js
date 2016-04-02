
(function() {

    'use strict';

    angular.module('cgApp').controller('dashboardCtrl', DashBoardController);

      DashBoardController.$inject = ['$scope', '$http', '$uibModal', '$log'];

      function DashBoardController ($scope, $http, $uibModal, $log){

        $scope.init = function () {
          $http.get('/cardgame-1.0/online').success(function(data){
            console.log(data);
            //$scope.works = data;
          });
        };




        // var vm = this;

    //     $scope.works = [];
      //
    //     $scope.animationsEnabled = true;
      //
        // $http.get('data.json').success(function(data){
        //   $scope.works = data;
        // });
      //
    //     $scope.open = function (work) {
      //
    //      var modalInstance = $uibModal.open({
    //        animation: $scope.animationsEnabled,
    //        templateUrl: 'myModalContent.html',
    //        controller: 'modalCtrl',
    //        size: 'lg',
    //        resolve: {
    //          item: function () {
    //            return work;
    //          }
    //        }
    //      });
      //
    //      modalInstance.result.then(function (selectedItem) {
    //        $scope.selected = selectedItem;
    //      }, function () {
    //        $log.info('Modal dismissed at: ' + new Date());
    //      });
    //   };
      //
    //   $scope.toggleAnimation = function () {
    //     $scope.animationsEnabled = !$scope.animationsEnabled;
    //   };

    }

})();
