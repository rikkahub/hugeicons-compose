package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Radar02: ImageVector
    get() {
        if (_radar02 != null) {
            return _radar02!!
        }
        _radar02 = ImageVector.Builder(
            name = "Radar02",
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
        moveTo(22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 12f)
        curveTo(18f, 15.3137f, 15.3137f, 18f, 12f, 18f)
        curveTo(8.68629f, 18f, 6f, 15.3137f, 6f, 12f)
        curveTo(6f, 8.68629f, 8.68629f, 6f, 12f, 6f)
        curveTo(12.9401f, 6f, 13.8296f, 6.21619f, 14.6217f, 6.60156f)
        curveTo(15.3346f, 6.94843f, 15.6911f, 7.12186f, 15.7764f, 7.63009f)
        curveTo(15.8617f, 8.13832f, 15.5173f, 8.48274f, 14.8284f, 9.17157f)
        lineTo(12f, 12f)
        }
        }.build()

        return _radar02!!
    }

private var _radar02: ImageVector? = null
