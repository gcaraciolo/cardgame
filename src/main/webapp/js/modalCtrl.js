
(function() {

    'use strict';

    angular.module('jhclApp').controller('modalCtrl', AuthController);

      AuthController.$inject = ['$scope', '$uibModalInstance', 'item'];

      function AuthController ($scope, $uibModalInstance, item){

        $scope.item = item;

        $scope.selected = {
          item: $scope.item
        };

        $scope.ok = function () {
          $uibModalInstance.close($scope.selected.item);
        };

        $scope.cancel = function () {
          $uibModalInstance.dismiss('cancel');
        };

      }

})();
