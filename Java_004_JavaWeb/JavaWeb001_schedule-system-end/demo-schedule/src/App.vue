<script setup>
  import {useRouter} from 'vue-router'
  import {ref} from 'vue'


  import Header from './components/Header.vue'




</script>

<template>



  <div>
    <hr>
    <Header></Header>
    <hr>
    <router-view></router-view>
  </div>
 
</template>

<style scoped>
</style>
