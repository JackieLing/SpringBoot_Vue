<template>
  <div id="app">
      <a href="#/home">主页</a>
      <a href="#/user">用户管理</a>
         <a href="#/student">学生管理</a>
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>

</style>
