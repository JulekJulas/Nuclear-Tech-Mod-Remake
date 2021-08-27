package at.martinthedragon.nucleartech.datagen.localisation

import at.martinthedragon.nucleartech.NuclearTech
import at.martinthedragon.nucleartech.datagen.NuclearLanguageProviders
import net.minecraft.block.Block
import net.minecraft.data.DataGenerator
import net.minecraft.data.DirectoryCache
import net.minecraft.entity.EntityType
import net.minecraft.inventory.container.ContainerType
import net.minecraft.item.Item
import net.minecraft.item.SpawnEggItem
import net.minecraft.util.DamageSource
import net.minecraft.util.SoundEvent
import net.minecraftforge.common.data.LanguageProvider
import java.util.function.Supplier

abstract class NuclearLanguageProvider(
    dataGenerator: DataGenerator,
    private val locale: String,
    private val exceptionOnMissing: Boolean = true
) : LanguageProvider(dataGenerator, NuclearTech.MODID, locale) {
    override fun getName() = "Nuclear Tech ${super.getName()}"

    override fun run(cache: DirectoryCache) {
        super.run(cache)
        validate()
    }

    protected open fun validate() {
        if (!super.data.keys.containsAll(NuclearLanguageProviders.keys)) {
            val missingTranslations = NuclearLanguageProviders.keys subtract super.data.keys
            val errorMessage = StringBuilder().appendLine("Missing translations in locale $locale for following keys:")
            for (missing in missingTranslations) errorMessage.appendLine(missing.prependIndent())
            if (exceptionOnMissing) throw IllegalStateException(errorMessage.toString())
            else NuclearTech.LOGGER.error(errorMessage.toString())
        }

        if (!NuclearLanguageProviders.keys.containsAll(super.data.keys)) {
            val extraTranslations = super.data.keys subtract NuclearLanguageProviders.keys
            val errorMessage = StringBuilder().appendLine("Extra translations in locale $locale that are non-existent in default locale:")
            for (extra in extraTranslations) errorMessage.appendLine(extra.prependIndent())
            NuclearTech.LOGGER.error(errorMessage.toString())
        }
    }

    protected fun addBlockDesc(supplier: Supplier<out Block>, desc: String) {
        add("${supplier.get().descriptionId}.desc", desc)
    }

    protected fun addItemDesc(supplier: Supplier<out Item>, desc: String) {
        add("${supplier.get().descriptionId}.desc", desc)
    }

    protected fun addContainerType(key: Supplier<out ContainerType<*>>, name: String) {
        add("container.${key.get().registryName!!.namespace}.${key.get().registryName!!.path}", name)
    }

    protected fun addSound(key: Supplier<out SoundEvent>, name: String) {
        add("subtitle.${key.get().registryName!!.namespace}.${key.get().registryName!!.path}", name)
    }

    protected fun addDamageSource(key: DamageSource, name: String) {
        add("death.attack.${key.msgId}", name)
    }

    /** What to append to the spawn egg name */
    abstract val spawnEggSuffix: String // TODO maybe some languages prefix it?
    /** What to replace spaces with in the name of the entity for the spawn egg */
    open val spawnEggEntityStringWordSeparator = ' '

    protected fun addEntityTypeWithSpawnEgg(key: Supplier<out EntityType<*>>, name: String) {
        val spawnEgg = SpawnEggItem.byId(key.get()) ?: throw IllegalStateException("No spawn egg registered for entity $name")
        addEntityType(key, name)
        add(spawnEgg, name.replace(' ', spawnEggEntityStringWordSeparator) + spawnEggSuffix)
    }

    companion object {
        @JvmStatic
        protected val MODID = NuclearTech.MODID
    }
}
