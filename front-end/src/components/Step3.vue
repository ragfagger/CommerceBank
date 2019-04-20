<template>
  <div>
    <input type="date">
    <button>Submit</button><br>
    <Times class="times"></Times><br>
    <Times class="times"></Times><br>
    <Times class="times"></Times><br>
  </div>
</template>

<script>
import Times from "./Times.vue";

export default {
  name: "Step3",
  components: {
    Times
  }
};
</script>

<style scoped>
button {
  padding: 5px 10px;
  margin: 5px;
}

.times {
  margin: 10px;
}
</style>