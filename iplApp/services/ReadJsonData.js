app.service('readJson',function($http)
{
  this.getJson=function(fileName){
    return $http.get(fileName).then(function(response){
      return response.data;
      // console.log(myData);
    });
  }
});
