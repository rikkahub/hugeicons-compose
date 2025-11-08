package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Smile: ImageVector
    get() {
        if (_smile != null) {
            return _smile!!
        }
        _smile = ImageVector.Builder(
            name = "Smile",
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
        moveTo(8f, 15f)
        curveTo(8.91212f, 16.2144f, 10.3643f, 17f, 12f, 17f)
        curveTo(13.6357f, 17f, 15.0879f, 16.2144f, 16f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.00897f, 9f)
        lineTo(8f, 9f)
        moveTo(16f, 9f)
        lineTo(15.991f, 9f)
        }
        }.build()

        return _smile!!
    }

private var _smile: ImageVector? = null
