import Vue from 'vue'
import Router from 'vue-router'
import Home from '@/components/Home'
import Student from '@/components/Student'
import User from '@/components/User'
import UserAdd from '@/components/UserAdd'
import UserEdit from '@/components/UserEdit'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      redirect:'/Home'
    },
    {
      path: '/Student',
      name: 'Student',
      component: Student
    },
    {
      path: '/User',
      name: 'User',
      component:User,
      children:[
        {
          path:"add",
          component:UserAdd//用户添加的子路由
        },
        {
          path:"edit",
          component:UserEdit//用户添加的子路由
        }
      ],
      
    },
    {
      path: '/Home',
      name: 'Home',
      component: Home
    }


  ]
})
