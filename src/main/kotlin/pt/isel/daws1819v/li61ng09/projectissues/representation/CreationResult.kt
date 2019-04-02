package pt.isel.daws1819v.li61ng09.projectissues.representation

sealed class CreationResult
data class Created(val id: String) : CreationResult()
class BadValues() : CreationResult()
class AlreadyExists() : CreationResult()
class NotAllowed() : CreationResult()