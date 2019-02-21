angular.module('produtoModule', [])
.controller('produtoController', function($scope, $http) {
    
    var urlServer = 'http://localhost:8080/'
    $http.get(urlServer+'/produto/consultaProduto').
    	then(function(response) {
    		$scope.produto = response.data;
    	});
    
    
});