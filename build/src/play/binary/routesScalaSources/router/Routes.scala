// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/macadmin/Downloads/Backend 27-02-2020/conf/routes
// @DATE:Thu Mar 12 15:06:34 IST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  UserController_2: controllers.UserController,
  // @LINE:3
  ComplaintController_1: controllers.ComplaintController,
  // @LINE:17
  AdminController_0: controllers.AdminController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    UserController_2: controllers.UserController,
    // @LINE:3
    ComplaintController_1: controllers.ComplaintController,
    // @LINE:17
    AdminController_0: controllers.AdminController
  ) = this(errorHandler, UserController_2, ComplaintController_1, AdminController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UserController_2, ComplaintController_1, AdminController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.UserController.addUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getUsers""", """controllers.UserController.getUsers"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """complaint""", """controllers.ComplaintController.addComplaint"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getComplaints""", """controllers.ComplaintController.getComplaints"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UserController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """details""", """controllers.UserController.profile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pendingComplaints""", """controllers.ComplaintController.getPendingComplaints"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """closedComplaints""", """controllers.ComplaintController.getClosedComplaints"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userAllComplaints""", """controllers.ComplaintController.getUserComplaints"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userPendingComplaints""", """controllers.ComplaintController.getUserPendingComplaints"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userClosedComplaints""", """controllers.ComplaintController.getUserClosedComplaints"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userleaderboard""", """controllers.ComplaintController.getUserLeaderboard"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewandclose""", """controllers.ComplaintController.viewAndClose"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recentlycreated""", """controllers.ComplaintController.getRecentlyCreated"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """recentlyclosed""", """controllers.ComplaintController.getRecentlyClosed"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editprofile""", """controllers.UserController.editProfile"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminlogin""", """controllers.AdminController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminIconMap""", """controllers.ComplaintController.getAdminIconMap"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forgotPassword""", """controllers.ComplaintController.forgotPassword"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userIconMap""", """controllers.ComplaintController.getUserIconMap"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """toprankedcomplaint""", """controllers.ComplaintController.getTopRankedComplaint"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """activeRegions""", """controllers.ComplaintController.getActiveRegions"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """locationComplaints""", """controllers.ComplaintController.getLocationComplaints"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """topRankedList""", """controllers.ComplaintController.getTopRankedList"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_UserController_addUser0_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_UserController_addUser0_invoker = createInvoker(
    UserController_2.addUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addUser",
      Nil,
      "POST",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:2
  private[this] lazy val controllers_UserController_getUsers1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getUsers")))
  )
  private[this] lazy val controllers_UserController_getUsers1_invoker = createInvoker(
    UserController_2.getUsers,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUsers",
      Nil,
      "GET",
      this.prefix + """getUsers""",
      """""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_ComplaintController_addComplaint2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("complaint")))
  )
  private[this] lazy val controllers_ComplaintController_addComplaint2_invoker = createInvoker(
    ComplaintController_1.addComplaint,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "addComplaint",
      Nil,
      "POST",
      this.prefix + """complaint""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_ComplaintController_getComplaints3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getComplaints3_invoker = createInvoker(
    ComplaintController_1.getComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getComplaints",
      Nil,
      "GET",
      this.prefix + """getComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_UserController_login4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UserController_login4_invoker = createInvoker(
    UserController_2.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "login",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_UserController_profile5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("details")))
  )
  private[this] lazy val controllers_UserController_profile5_invoker = createInvoker(
    UserController_2.profile,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "profile",
      Nil,
      "POST",
      this.prefix + """details""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ComplaintController_getPendingComplaints6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pendingComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getPendingComplaints6_invoker = createInvoker(
    ComplaintController_1.getPendingComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getPendingComplaints",
      Nil,
      "GET",
      this.prefix + """pendingComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_ComplaintController_getClosedComplaints7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("closedComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getClosedComplaints7_invoker = createInvoker(
    ComplaintController_1.getClosedComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getClosedComplaints",
      Nil,
      "GET",
      this.prefix + """closedComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_ComplaintController_getUserComplaints8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userAllComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getUserComplaints8_invoker = createInvoker(
    ComplaintController_1.getUserComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getUserComplaints",
      Nil,
      "POST",
      this.prefix + """userAllComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ComplaintController_getUserPendingComplaints9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userPendingComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getUserPendingComplaints9_invoker = createInvoker(
    ComplaintController_1.getUserPendingComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getUserPendingComplaints",
      Nil,
      "POST",
      this.prefix + """userPendingComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ComplaintController_getUserClosedComplaints10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userClosedComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getUserClosedComplaints10_invoker = createInvoker(
    ComplaintController_1.getUserClosedComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getUserClosedComplaints",
      Nil,
      "POST",
      this.prefix + """userClosedComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ComplaintController_getUserLeaderboard11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userleaderboard")))
  )
  private[this] lazy val controllers_ComplaintController_getUserLeaderboard11_invoker = createInvoker(
    ComplaintController_1.getUserLeaderboard,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getUserLeaderboard",
      Nil,
      "GET",
      this.prefix + """userleaderboard""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ComplaintController_viewAndClose12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewandclose")))
  )
  private[this] lazy val controllers_ComplaintController_viewAndClose12_invoker = createInvoker(
    ComplaintController_1.viewAndClose,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "viewAndClose",
      Nil,
      "POST",
      this.prefix + """viewandclose""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_ComplaintController_getRecentlyCreated13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recentlycreated")))
  )
  private[this] lazy val controllers_ComplaintController_getRecentlyCreated13_invoker = createInvoker(
    ComplaintController_1.getRecentlyCreated,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getRecentlyCreated",
      Nil,
      "POST",
      this.prefix + """recentlycreated""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ComplaintController_getRecentlyClosed14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("recentlyclosed")))
  )
  private[this] lazy val controllers_ComplaintController_getRecentlyClosed14_invoker = createInvoker(
    ComplaintController_1.getRecentlyClosed,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getRecentlyClosed",
      Nil,
      "POST",
      this.prefix + """recentlyclosed""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_editProfile15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editprofile")))
  )
  private[this] lazy val controllers_UserController_editProfile15_invoker = createInvoker(
    UserController_2.editProfile,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "editProfile",
      Nil,
      "POST",
      this.prefix + """editprofile""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_AdminController_login16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminlogin")))
  )
  private[this] lazy val controllers_AdminController_login16_invoker = createInvoker(
    AdminController_0.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "login",
      Nil,
      "POST",
      this.prefix + """adminlogin""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ComplaintController_getAdminIconMap17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminIconMap")))
  )
  private[this] lazy val controllers_ComplaintController_getAdminIconMap17_invoker = createInvoker(
    ComplaintController_1.getAdminIconMap,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getAdminIconMap",
      Nil,
      "GET",
      this.prefix + """adminIconMap""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ComplaintController_forgotPassword18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forgotPassword")))
  )
  private[this] lazy val controllers_ComplaintController_forgotPassword18_invoker = createInvoker(
    ComplaintController_1.forgotPassword,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "forgotPassword",
      Nil,
      "POST",
      this.prefix + """forgotPassword""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ComplaintController_getUserIconMap19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userIconMap")))
  )
  private[this] lazy val controllers_ComplaintController_getUserIconMap19_invoker = createInvoker(
    ComplaintController_1.getUserIconMap,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getUserIconMap",
      Nil,
      "POST",
      this.prefix + """userIconMap""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ComplaintController_getTopRankedComplaint20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("toprankedcomplaint")))
  )
  private[this] lazy val controllers_ComplaintController_getTopRankedComplaint20_invoker = createInvoker(
    ComplaintController_1.getTopRankedComplaint,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getTopRankedComplaint",
      Nil,
      "GET",
      this.prefix + """toprankedcomplaint""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ComplaintController_getActiveRegions21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("activeRegions")))
  )
  private[this] lazy val controllers_ComplaintController_getActiveRegions21_invoker = createInvoker(
    ComplaintController_1.getActiveRegions,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getActiveRegions",
      Nil,
      "GET",
      this.prefix + """activeRegions""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ComplaintController_getLocationComplaints22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("locationComplaints")))
  )
  private[this] lazy val controllers_ComplaintController_getLocationComplaints22_invoker = createInvoker(
    ComplaintController_1.getLocationComplaints,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getLocationComplaints",
      Nil,
      "POST",
      this.prefix + """locationComplaints""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ComplaintController_getTopRankedList23_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("topRankedList")))
  )
  private[this] lazy val controllers_ComplaintController_getTopRankedList23_invoker = createInvoker(
    ComplaintController_1.getTopRankedList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComplaintController",
      "getTopRankedList",
      Nil,
      "POST",
      this.prefix + """topRankedList""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_UserController_addUser0_route(params@_) =>
      call { 
        controllers_UserController_addUser0_invoker.call(UserController_2.addUser)
      }
  
    // @LINE:2
    case controllers_UserController_getUsers1_route(params@_) =>
      call { 
        controllers_UserController_getUsers1_invoker.call(UserController_2.getUsers)
      }
  
    // @LINE:3
    case controllers_ComplaintController_addComplaint2_route(params@_) =>
      call { 
        controllers_ComplaintController_addComplaint2_invoker.call(ComplaintController_1.addComplaint)
      }
  
    // @LINE:4
    case controllers_ComplaintController_getComplaints3_route(params@_) =>
      call { 
        controllers_ComplaintController_getComplaints3_invoker.call(ComplaintController_1.getComplaints)
      }
  
    // @LINE:5
    case controllers_UserController_login4_route(params@_) =>
      call { 
        controllers_UserController_login4_invoker.call(UserController_2.login)
      }
  
    // @LINE:6
    case controllers_UserController_profile5_route(params@_) =>
      call { 
        controllers_UserController_profile5_invoker.call(UserController_2.profile)
      }
  
    // @LINE:7
    case controllers_ComplaintController_getPendingComplaints6_route(params@_) =>
      call { 
        controllers_ComplaintController_getPendingComplaints6_invoker.call(ComplaintController_1.getPendingComplaints)
      }
  
    // @LINE:8
    case controllers_ComplaintController_getClosedComplaints7_route(params@_) =>
      call { 
        controllers_ComplaintController_getClosedComplaints7_invoker.call(ComplaintController_1.getClosedComplaints)
      }
  
    // @LINE:9
    case controllers_ComplaintController_getUserComplaints8_route(params@_) =>
      call { 
        controllers_ComplaintController_getUserComplaints8_invoker.call(ComplaintController_1.getUserComplaints)
      }
  
    // @LINE:10
    case controllers_ComplaintController_getUserPendingComplaints9_route(params@_) =>
      call { 
        controllers_ComplaintController_getUserPendingComplaints9_invoker.call(ComplaintController_1.getUserPendingComplaints)
      }
  
    // @LINE:11
    case controllers_ComplaintController_getUserClosedComplaints10_route(params@_) =>
      call { 
        controllers_ComplaintController_getUserClosedComplaints10_invoker.call(ComplaintController_1.getUserClosedComplaints)
      }
  
    // @LINE:12
    case controllers_ComplaintController_getUserLeaderboard11_route(params@_) =>
      call { 
        controllers_ComplaintController_getUserLeaderboard11_invoker.call(ComplaintController_1.getUserLeaderboard)
      }
  
    // @LINE:13
    case controllers_ComplaintController_viewAndClose12_route(params@_) =>
      call { 
        controllers_ComplaintController_viewAndClose12_invoker.call(ComplaintController_1.viewAndClose)
      }
  
    // @LINE:14
    case controllers_ComplaintController_getRecentlyCreated13_route(params@_) =>
      call { 
        controllers_ComplaintController_getRecentlyCreated13_invoker.call(ComplaintController_1.getRecentlyCreated)
      }
  
    // @LINE:15
    case controllers_ComplaintController_getRecentlyClosed14_route(params@_) =>
      call { 
        controllers_ComplaintController_getRecentlyClosed14_invoker.call(ComplaintController_1.getRecentlyClosed)
      }
  
    // @LINE:16
    case controllers_UserController_editProfile15_route(params@_) =>
      call { 
        controllers_UserController_editProfile15_invoker.call(UserController_2.editProfile)
      }
  
    // @LINE:17
    case controllers_AdminController_login16_route(params@_) =>
      call { 
        controllers_AdminController_login16_invoker.call(AdminController_0.login)
      }
  
    // @LINE:18
    case controllers_ComplaintController_getAdminIconMap17_route(params@_) =>
      call { 
        controllers_ComplaintController_getAdminIconMap17_invoker.call(ComplaintController_1.getAdminIconMap)
      }
  
    // @LINE:19
    case controllers_ComplaintController_forgotPassword18_route(params@_) =>
      call { 
        controllers_ComplaintController_forgotPassword18_invoker.call(ComplaintController_1.forgotPassword)
      }
  
    // @LINE:20
    case controllers_ComplaintController_getUserIconMap19_route(params@_) =>
      call { 
        controllers_ComplaintController_getUserIconMap19_invoker.call(ComplaintController_1.getUserIconMap)
      }
  
    // @LINE:21
    case controllers_ComplaintController_getTopRankedComplaint20_route(params@_) =>
      call { 
        controllers_ComplaintController_getTopRankedComplaint20_invoker.call(ComplaintController_1.getTopRankedComplaint)
      }
  
    // @LINE:22
    case controllers_ComplaintController_getActiveRegions21_route(params@_) =>
      call { 
        controllers_ComplaintController_getActiveRegions21_invoker.call(ComplaintController_1.getActiveRegions)
      }
  
    // @LINE:23
    case controllers_ComplaintController_getLocationComplaints22_route(params@_) =>
      call { 
        controllers_ComplaintController_getLocationComplaints22_invoker.call(ComplaintController_1.getLocationComplaints)
      }
  
    // @LINE:24
    case controllers_ComplaintController_getTopRankedList23_route(params@_) =>
      call { 
        controllers_ComplaintController_getTopRankedList23_invoker.call(ComplaintController_1.getTopRankedList)
      }
  }
}
