package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.FlashOff: ImageVector
    get() {
        if (_flashOff != null) {
            return _flashOff!!
        }
        _flashOff = ImageVector.Builder(
            name = "FlashOff",
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
        moveTo(16f, 16f)
        lineTo(11.6667f, 21.6535f)
        curveTo(11.1282f, 22.356f, 10.1188f, 21.9188f, 10.1188f, 20.9829f)
        verticalLineTo(14.0301f)
        curveTo(10.1188f, 13.4695f, 9.72302f, 13.015f, 9.23474f, 13.015f)
        horizontalLineTo(5.88582f)
        curveTo(5.12506f, 13.015f, 4.71954f, 11.9851f, 5.22212f, 11.3294f)
        lineTo(7.7741f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 5.72714f)
        lineTo(12.4969f, 2.35038f)
        curveTo(13.0221f, 1.63999f, 14.0067f, 2.08215f, 14.0067f, 3.02843f)
        verticalLineTo(10.059f)
        curveTo(14.0067f, 10.6258f, 14.3928f, 11.0854f, 14.8691f, 11.0854f)
        horizontalLineTo(18.1359f)
        curveTo(18.878f, 11.0854f, 19.2736f, 12.1268f, 18.7833f, 12.7898f)
        lineTo(17.8885f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }
        }.build()

        return _flashOff!!
    }

private var _flashOff: ImageVector? = null
