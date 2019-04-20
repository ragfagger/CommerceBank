<template>
  <div class="branch-container">
    <p>Branch</p>
  </div>
</template>

<script>
export default {
  name: "Branch",
  props: ["address1", "address2", "openings", "distance"]
};
</script>

<style scoped>
.branch-container {
  background-color: #9effe3;
  width: 500px;
  text-align: center;
  margin: auto;
  margin-top: 12px;
  padding: 10px;
}
</style>