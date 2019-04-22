<template>
  <div>
    <div>
      <input type="text">
      <button>Search</button>
    </div>
    <img src="../assets/map.png" width="746" height="375">
    <Branch></Branch>
    <Branch></Branch>
    <Branch></Branch>
  </div>
</template>

<script>
import Branch from "./Branch.vue";
export default {
  name: "Step2",
  components: {
    Branch
  }
};
</script>

<style scoped>
input {
  margin: 10px;
}

button {
  padding: 5px 20px;
}

button:hover {
  cursor: pointer;
}

img {
  margin-top: 15px;
}
</style>
