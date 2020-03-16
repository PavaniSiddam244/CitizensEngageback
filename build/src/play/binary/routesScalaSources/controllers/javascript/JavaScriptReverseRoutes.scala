// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Downloads/Backend 27-02-2020/conf/routes
// @DATE:Thu Mar 12 15:06:34 IST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers.javascript {

  // @LINE:3
  class ReverseComplaintController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def getComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getComplaints",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getComplaints"})
        }
      """
    )
  
    // @LINE:24
    def getTopRankedList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getTopRankedList",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "topRankedList"})
        }
      """
    )
  
    // @LINE:7
    def getPendingComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getPendingComplaints",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pendingComplaints"})
        }
      """
    )
  
    // @LINE:8
    def getClosedComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getClosedComplaints",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "closedComplaints"})
        }
      """
    )
  
    // @LINE:21
    def getTopRankedComplaint: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getTopRankedComplaint",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "toprankedcomplaint"})
        }
      """
    )
  
    // @LINE:15
    def getRecentlyClosed: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getRecentlyClosed",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recentlyclosed"})
        }
      """
    )
  
    // @LINE:11
    def getUserClosedComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getUserClosedComplaints",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userClosedComplaints"})
        }
      """
    )
  
    // @LINE:18
    def getAdminIconMap: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getAdminIconMap",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adminIconMap"})
        }
      """
    )
  
    // @LINE:13
    def viewAndClose: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.viewAndClose",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "viewandclose"})
        }
      """
    )
  
    // @LINE:22
    def getActiveRegions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getActiveRegions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "activeRegions"})
        }
      """
    )
  
    // @LINE:10
    def getUserPendingComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getUserPendingComplaints",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userPendingComplaints"})
        }
      """
    )
  
    // @LINE:19
    def forgotPassword: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.forgotPassword",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "forgotPassword"})
        }
      """
    )
  
    // @LINE:14
    def getRecentlyCreated: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getRecentlyCreated",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "recentlycreated"})
        }
      """
    )
  
    // @LINE:3
    def addComplaint: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.addComplaint",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "complaint"})
        }
      """
    )
  
    // @LINE:9
    def getUserComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getUserComplaints",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userAllComplaints"})
        }
      """
    )
  
    // @LINE:12
    def getUserLeaderboard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getUserLeaderboard",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "userleaderboard"})
        }
      """
    )
  
    // @LINE:23
    def getLocationComplaints: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getLocationComplaints",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "locationComplaints"})
        }
      """
    )
  
    // @LINE:20
    def getUserIconMap: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ComplaintController.getUserIconMap",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userIconMap"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adminlogin"})
        }
      """
    )
  
  }

  // @LINE:1
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.addUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:6
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.profile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "details"})
        }
      """
    )
  
    // @LINE:2
    def getUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getUsers"})
        }
      """
    )
  
    // @LINE:16
    def editProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.editProfile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "editprofile"})
        }
      """
    )
  
    // @LINE:5
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}
