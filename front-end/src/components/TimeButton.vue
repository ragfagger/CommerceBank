<template>
  <button>Time</button>
</template>

<script>
export default {
  name: "TimeButton",
  props: ["time", "booked"]
}
</script>

<style scoped>
  button {
    width: 100px;
    height: 50px;
    cursor: pointer;
    background: #9effe3;
    font-weight: bold;
    font-size: 14px;
    padding: 15px;
    margin: 2px;
    text-align: center;
    border: none;
  }
</style>
