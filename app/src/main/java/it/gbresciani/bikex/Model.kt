package it.gbresciani.bikex

class Networks(val networks: List<Network>)
class Network(val id: String, val name: String, val company: List<String>, val location: Location)
class Location(val longitude: Double, val latitude: Double, val city: String, val country: String)

