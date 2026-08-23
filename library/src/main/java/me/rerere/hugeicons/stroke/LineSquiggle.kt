package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LineSquiggle: ImageVector
    get() {
        if (_lineSquiggle != null) {
            return _lineSquiggle!!
        }
        _lineSquiggle = ImageVector.Builder(
            name = "LineSquiggle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(11.254f, 3f)
            curveTo(3.69537f, 4.38462f, -1.46419f, 15.9844f, 8.53996f, 14f)
            curveTo(18.6227f, 12f, 19.5495f, 6.17775f, 17.1107f, 5f)
            curveTo(12.8099f, 2.92308f, 2.13632f, 14.193f, 10.9824f, 17.5385f)
            curveTo(20.1355f, 21f, 22.509f, 14.5768f, 20.1355f, 13.5f)
            curveTo(17.9313f, 12.5f, 11.8028f, 17f, 17.9313f, 21f)
        }
        }.build()

        return _lineSquiggle!!
    }

private var _lineSquiggle: ImageVector? = null
