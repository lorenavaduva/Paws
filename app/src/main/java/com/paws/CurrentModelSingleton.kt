package com.paws

object CurrentModelSingleton {
    private lateinit var selectedModel : String

    fun setModel(model:String){
        selectedModel = model
    }

    fun getSelectedModel(): String{
        return when(selectedModel){
            "Sushi" -> "models/shib/scene.gltf"
            "Dixie" -> "models/fox.glb"
            "Muffin" -> "models/dog/scene.gltf"
            else -> "models/fox.glb"
        }
    }
}