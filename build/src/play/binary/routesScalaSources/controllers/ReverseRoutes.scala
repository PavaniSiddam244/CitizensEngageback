// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Downloads/Backend 27-02-2020/conf/routes
// @DATE:Thu Mar 12 15:06:34 IST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:3
  class ReverseComplaintController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:4
    def getComplaints(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getComplaints")
    }
  
    // @LINE:24
    def getTopRankedList(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "topRankedList")
    }
  
    // @LINE:7
    def getPendingComplaints(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pendingComplaints")
    }
  
    // @LINE:8
    def getClosedComplaints(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "closedComplaints")
    }
  
    // @LINE:21
    def getTopRankedComplaint(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "toprankedcomplaint")
    }
  
    // @LINE:15
    def getRecentlyClosed(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "recentlyclosed")
    }
  
    // @LINE:11
    def getUserClosedComplaints(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "userClosedComplaints")
    }
  
    // @LINE:18
    def getAdminIconMap(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "adminIconMap")
    }
  
    // @LINE:13
    def viewAndClose(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "viewandclose")
    }
  
    // @LINE:22
    def getActiveRegions(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "activeRegions")
    }
  
    // @LINE:10
    def getUserPendingComplaints(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "userPendingComplaints")
    }
  
    // @LINE:19
    def forgotPassword(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "forgotPassword")
    }
  
    // @LINE:14
    def getRecentlyCreated(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "recentlycreated")
    }
  
    // @LINE:3
    def addComplaint(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "complaint")
    }
  
    // @LINE:9
    def getUserComplaints(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "userAllComplaints")
    }
  
    // @LINE:12
    def getUserLeaderboard(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "userleaderboard")
    }
  
    // @LINE:23
    def getLocationComplaints(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "locationComplaints")
    }
  
    // @LINE:20
    def getUserIconMap(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "userIconMap")
    }
  
  }

  // @LINE:17
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def login(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "adminlogin")
    }
  
  }

  // @LINE:1
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def addUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:6
    def profile(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "details")
    }
  
    // @LINE:2
    def getUsers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "getUsers")
    }
  
    // @LINE:16
    def editProfile(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "editprofile")
    }
  
    // @LINE:5
    def login(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
