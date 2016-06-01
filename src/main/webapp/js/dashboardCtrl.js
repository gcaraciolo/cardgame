(function() {
	'use strict';
	let interval
	let loop
	var token
	var uibModal
	var baseUrl = '/cardgame/api'
	var statusMessage = false;

    angular.module('cgApp').controller('dashboardCtrl', ['$scope', '$http', '$uibModal', '$log', '$interval', '$rootScope', '$location', '$localStorage', 'dataService',
    function DashBoardController ($scope, $http, $uibModal, $log, $interval, $rootScope, $location, $localStorage, dataService) {
		token = dataService.getData();
		if(token == '' || typeof token == 'undefined' ){
			$location.path('/join');
			return;
		}

		$localStorage.token = token
		if(!$http.defaults.headers.post.Authorization){
			$http.defaults.headers.post.Authorization = token;
		}
      var vm = this
      $http.defaults.useXDomain = true
      $scope.works = []
      $scope.animationsEnabled = true

      interval = $interval
      uibModal = $uibModal

      $scope.init = function () {
        reloadData($http, $scope);
        loop = $interval(function() {
            reloadData($http, $scope);
        }, 3000)

      };

	  $scope.getCardSubject = function(card) {
		  if(!card) return {}
		  return {
			  geography: card.questionId.subjectId.name == 'Geografia',
			  history: card.questionId.subjectId.name == 'História',
			  math: card.questionId.subjectId.name == 'Matemática',
			  portuguese: card.questionId.subjectId.name == 'Portugues',
			  science: card.questionId.subjectId.name == 'Ciências'
		  }
	  }

      $scope.move = function(index) {
		  let params = {
			  position: index
		  }
		  if($scope.player1.timeToPlay) {
			  moveRequest($http, $scope, params);
		  }
	  }
      $scope.open = function(card) {
       var modalInstance = $uibModal.open({
         animation: $scope.animationsEnabled,
         templateUrl: 'templates/cardQuestion.html',
         controller: 'modalCtrl',
         size: 'lg',
         resolve: {
           data: function () {
              return {
                card: card,
                play: function($scope, params) {
                  playRequest($http, $scope, params)
                }
			}
           }
         }
        })
      }

      $scope.toggleAnimation = function () {
        $scope.animationsEnabled = !$scope.animationsEnabled;
      }

  }]);

	angular.module('cgApp').controller('modalCtrl', ['$scope', '$uibModalInstance', 'data',
	function ModalController ($scope, $uibModalInstance, data){
		if(data.card) {
			$scope.cardQuestionText = data.card.questionId.text
			$scope.cardPossibleAnswers = [{
				text: data.card.questionId.answer1Id.text,
				id: data.card.questionId.answer1Id.id
			}, {
				text: data.card.questionId.answer2Id.text,
				id: data.card.questionId.answer2Id.id
			}, {
				text: data.card.questionId.answer3Id.text,
				id: data.card.questionId.answer3Id.id
			}, {
				text: data.card.questionId.answer4Id.text,
				id: data.card.questionId.answer4Id.id
			}]
			$scope.button = "confirmar";
		}

		$scope.confirmar = function (answer) {
			let params = {
				answer_id: answer
			}
			data.play($scope, params)
		}

		$scope.atacar = function () {
			$uibModalInstance.dismiss('cancel');
		}

		$scope.ok = function () {
			$uibModalInstance.dismiss('cancel');
		}
	}]);

	function alert($scope, message) {
     statusMessage = true
     var modalInstance = uibModal.open({
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
    }


	function moveRequest($http, $scope, params) {
		$http.post(baseUrl + '/move', params).success(function(data, status) {
			console.log('move: ',data);
			reloadData($http, $scope, params.username)
		});
  }

  function playRequest($http, $scope, params) {
    $http.post(baseUrl + '/play', params).success(function(data, status) {
        console.log(data);
        $scope.response = data.msg;
        $scope.button = "atacar";
        if(statusMessage === false && data.code == 1011 ){
           alert($scope, data.msg)
        }
    });
  }

  function leaveGame($http, $scope, params) {
    $http.post(baseUrl + '/leave', params).success(function(data, status) {
    });
  }

	function reloadData($http, $scope) {
		$http.post(baseUrl + '/status').success(function(data, status) {
			console.log('reload: ', data);
			$scope.player1 = data.msg.player1;
			$scope.player2 = data.msg.player2;
			$scope.onlinePlayers = data.msg.audience;
			if(statusMessage === false && data.code == 1017) {
				alert($scope, data.msg)
			}
    })

  }


})();
