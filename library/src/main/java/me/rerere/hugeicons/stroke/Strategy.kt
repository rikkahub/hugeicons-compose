package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Strategy: ImageVector
    get() {
        if (_strategy != null) {
            return _strategy!!
        }
        _strategy = ImageVector.Builder(
            name = "Strategy",
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
        moveTo(18f, 11f)
        lineTo(20.3458f, 8.84853f)
        curveTo(20.7819f, 8.44853f, 21f, 8.24853f, 21f, 8f)
        moveTo(18f, 5f)
        lineTo(20.3458f, 7.15147f)
        curveTo(20.7819f, 7.55147f, 21f, 7.75147f, 21f, 8f)
        moveTo(21f, 8f)
        curveTo(3f, 8f, 3f, 21f, 3f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 21f)
        lineTo(18f, 16f)
        moveTo(18f, 21f)
        lineTo(13f, 16f)
        }
        }.build()

        return _strategy!!
    }

private var _strategy: ImageVector? = null
