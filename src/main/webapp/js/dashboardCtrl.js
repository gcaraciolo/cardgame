
(function() {

    const dadosPrincipais = {
  "currentPlayer": {
    "username": "guilherme",
    "character": {
      "life": 5,
      "attack": 3,
      "defense": 1,
      "alive": true
    },
    "availableCards": [
      {
        "attack": 0,
        "defense": 0,
        "life": 0,
        "subject": {
          "name": "Math",
          "question": {
            "text": "questionText",
            "possibleAnswers": [
              {
                "text": "resp1",
                "id": 0
              },
              {
                "text": "resp2",
                "id": 1
              },
              {
                "text": "resp3",
                "id": 2
              },
              {
                "text": "resp4",
                "id": 3
              }
            ],
            "correctAnswer": {
              "text": "resp1",
              "id": 0
            },
            "id": 0
          },
          "id": 0
        }
      },
      {
        "attack": 0,
        "defense": 0,
        "life": 0,
        "subject": {
          "name": "Math",
          "question": {
            "text": "questionText",
            "possibleAnswers": [
              {
                "text": "resp1",
                "id": 0
              },
              {
                "text": "resp2",
                "id": 1
              },
              {
                "text": "resp3",
                "id": 2
              },
              {
                "text": "resp4",
                "id": 3
              }
            ],
            "correctAnswer": {
              "text": "resp1",
              "id": 0
            },
            "id": 0
          },
          "id": 0
        }
      },
      {
        "attack": 0,
        "defense": 0,
        "life": 0,
        "subject": {
          "name": "Math",
          "question": {
            "text": "questionText",
            "possibleAnswers": [
              {
                "text": "resp1",
                "id": 0
              },
              {
                "text": "resp2",
                "id": 1
              },
              {
                "text": "resp3",
                "id": 2
              },
              {
                "text": "resp4",
                "id": 3
              }
            ],
            "correctAnswer": {
              "text": "resp1",
              "id": 0
            },
            "id": 0
          },
          "id": 0
        }
      }
    ],
    "cardsInGame": [],
    "matchLastQuestion": false
  },
  "opponentPlayer": {
    "username": "sylvio",
    "character": {
      "life": 5,
      "attack": 3,
      "defense": 1,
      "alive": true
    },
    "availableCards": [
      {
        "attack": 0,
        "defense": 0,
        "life": 0,
        "subject": {
          "name": "Math",
          "question": {
            "text": "questionText",
            "possibleAnswers": [
              {
                "text": "resp1",
                "id": 0
              },
              {
                "text": "resp2",
                "id": 1
              },
              {
                "text": "resp3",
                "id": 2
              },
              {
                "text": "resp4",
                "id": 3
              }
            ],
            "correctAnswer": {
              "text": "resp1",
              "id": 0
            },
            "id": 0
          },
          "id": 0
        }
      },
      {
        "attack": 0,
        "defense": 0,
        "life": 0,
        "subject": {
          "name": "Math",
          "question": {
            "text": "questionText",
            "possibleAnswers": [
              {
                "text": "resp1",
                "id": 0
              },
              {
                "text": "resp2",
                "id": 1
              },
              {
                "text": "resp3",
                "id": 2
              },
              {
                "text": "resp4",
                "id": 3
              }
            ],
            "correctAnswer": {
              "text": "resp1",
              "id": 0
            },
            "id": 0
          },
          "id": 0
        }
      },
      {
        "attack": 0,
        "defense": 0,
        "life": 0,
        "subject": {
          "name": "Math",
          "question": {
            "text": "questionText",
            "possibleAnswers": [
              {
                "text": "resp1",
                "id": 0
              },
              {
                "text": "resp2",
                "id": 1
              },
              {
                "text": "resp3",
                "id": 2
              },
              {
                "text": "resp4",
                "id": 3
              }
            ],
            "correctAnswer": {
              "text": "resp1",
              "id": 0
            },
            "id": 0
          },
          "id": 0
        }
      }
    ],
    "cardsInGame": [
      {
        "attack": 0,
        "defense": 0,
        "life": 0,
        "subject": {
          "name": "Math",
          "question": {
            "text": "questionText",
            "possibleAnswers": [
              {
                "text": "resp1",
                "id": 0
              },
              {
                "text": "resp2",
                "id": 1
              },
              {
                "text": "resp3",
                "id": 2
              },
              {
                "text": "resp4",
                "id": 3
              }
            ],
            "correctAnswer": {
              "text": "resp1",
              "id": 0
            },
            "id": 0
          },
          "id": 0
        }
      }
    ],
    "matchLastQuestion": false
  },
  "winner": null
};

    'use strict';

    angular.module('cgApp').controller('dashboardCtrl', DashBoardController);

      DashBoardController.$inject = ['$scope', '$http', '$uibModal', '$log'];

      function DashBoardController ($scope, $http, $uibModal, $log){

        $scope.init = function () {
          $http.get('/cardgame-1.0/api/status').success(function(data){            
            $scope.data = dadosPrincipais;
          });
        };



        $scope.move = function(indice) {
          let params = {
            username: "guilherme", 
            position: indice
          }

          $http.post('/cardgame-1.0/api/move', params).success(function(data) {            
            
          });
          
        }




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
