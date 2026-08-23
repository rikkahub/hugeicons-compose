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

val HugeIcons.History: ImageVector
    get() {
        if (_history != null) {
            return _history!!
        }
        _history = ImageVector.Builder(
            name = "History",
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
            moveTo(3.49902f, 14.9656f)
            curveTo(4.72475f, 18.4791f, 8.06749f, 21f, 11.999f, 21f)
            curveTo(16.9696f, 21f, 20.999f, 16.9706f, 20.999f, 12f)
            curveTo(20.999f, 7.02944f, 16.9696f, 3f, 11.999f, 3f)
            curveTo(8.29827f, 3f, 4.8984f, 5.6756f, 3.68943f, 8.5f)
        }

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
            moveTo(11.999f, 7f)
            verticalLineTo(12f)
            lineTo(14.999f, 14f)
        }

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
            moveTo(7.49751f, 8.74363f)
            curveTo(7.49751f, 8.74363f, 3.81388f, 9.3026f, 3.25487f, 8.7436f)
            curveTo(2.69585f, 8.1846f, 3.25488f, 4.50098f, 3.25488f, 4.50098f)
        }
        }.build()

        return _history!!
    }

private var _history: ImageVector? = null
