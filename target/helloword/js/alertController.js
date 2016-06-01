angular.module('cgApp').controller('alertCtrl', ['$scope', '$uibModalInstance', '$localStorage', '$location', 'data',
function ModalController ($scope, $uibModalInstance, $localStorage, $location, data){
	$scope.message = data.message

	$scope.ok = function () {
		if(data.message === 'Game over') {
			$localStorage.$reset();
			$location.path('/join');
		}
		$uibModalInstance.dismiss();
	}
}]);
