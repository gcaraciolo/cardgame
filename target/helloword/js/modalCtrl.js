'use strict';

(function() {

      angular.module('cgApp').controller('modalCtrl', ModalController);

      ModalController.$inject = ['$scope', '$uibModal', 'item'];

      function ModalController ($scope, $uibModal, item){
        $scope.button = "Save data";
        $scope.item = item;

        $scope.selected = {
          item: $scope.item
        };

        $scope.ok = function () {
          $uibModal.close($scope.selected.item);
        };

        $scope.cancel = function () {
          $uibModal.dismiss('cancel');
        };

      }

})();
