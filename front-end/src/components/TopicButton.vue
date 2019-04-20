<template>
  <div class="button-container">
    <button @click="isSelected = !isSelected" :class="{ selected: isSelected }">
      <i :class="icon"></i>
      <br>
      {{ topic }}
    </button>
  </div>
</template>

<script>
export default {
  name: "TopicButton",
  props: ["topic", "icon"],
  data() {
    return {
      isSelected: false
    };
  }
};
</script>

<style scoped>
button {
  width: 210px;
  height: 145px;
  cursor: pointer;
  background: rgb(255, 255, 204);
  font-weight: bold;
  font-size: 14px;
  padding: 15px;
  border: 1px solid rgb(223, 215, 215);
}

button:active,
button:focus {
  outline: none;
}

button:hover {
  background: rgb(254, 241, 96);
  transition: background 0.2s ease-in-out;
}

.selected {
  background: rgb(4, 147, 114);
  color: white;
  border: 1px inset rgb(223, 215, 215);
}
</style>