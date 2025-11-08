package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Claude: ImageVector
    get() {
        if (_claude != null) {
            return _claude!!
        }
        _claude = ImageVector.Builder(
            name = "Claude",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 12f)
        lineTo(18.5f, 5f)
        moveTo(7.63965f, 3f)
        lineTo(12.5f, 12f)
        lineTo(13.6865f, 3f)
        moveTo(4.48381f, 6.71679f)
        lineTo(11.9872f, 12f)
        moveTo(3f, 12f)
        lineTo(11.9872f, 12.473f)
        moveTo(12.2244f, 13.177f)
        lineTo(7f, 20f)
        moveTo(4.84194f, 16.8682f)
        lineTo(11.2824f, 12.9758f)
        moveTo(11.5f, 21f)
        lineTo(12.665f, 13.177f)
        moveTo(21f, 14f)
        lineTo(13.1846f, 12.668f)
        moveTo(21f, 10.5788f)
        lineTo(13f, 12.3223f)
        moveTo(16.779f, 19.646f)
        lineTo(12.8876f, 13.3772f)
        moveTo(19.3566f, 18.207f)
        lineTo(13.313f, 12.9893f)
        }
        }.build()

        return _claude!!
    }

private var _claude: ImageVector? = null
