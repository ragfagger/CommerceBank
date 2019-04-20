<template>
  <div>
    <label>Thursday, 18th of April</label><br>
    <TimeButton/>
    <TimeButton/>
    <TimeButton/>
    <TimeButton/>
    <br>
    <TimeButton/>
    <TimeButton/>
    <TimeButton/>
  </div>
</template>

<script>
import TimeButton from "./TimeButton.vue";

export default {
  name: "Times",
  components: {
    TimeButton
  },
  props: ["date"]
}
</script>

<style scoped>
div {
  background-color: #ddfff1;
  width: 500px;
  padding: 10px;
  text-align: center;
  display: inline-block;
}
</style>