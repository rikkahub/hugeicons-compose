package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CursorInWindow: ImageVector
    get() {
        if (_cursorInWindow != null) {
            return _cursorInWindow!!
        }
        _cursorInWindow = ImageVector.Builder(
            name = "CursorInWindow",
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
        moveTo(20f, 10f)
        curveTo(20f, 6.22876f, 20f, 4.34315f, 18.8284f, 3.17157f)
        curveTo(17.6569f, 2f, 15.7712f, 2f, 12f, 2f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 2f, 4.34315f, 2f, 3.17157f, 3.17157f)
        curveTo(2f, 4.34315f, 2f, 6.22876f, 2f, 10f)
        verticalLineTo(12f)
        curveTo(2f, 15.7712f, 2f, 17.6569f, 3.17157f, 18.8284f)
        curveTo(4.23467f, 19.8915f, 5.8857f, 19.99f, 9f, 19.9991f)
        horizontalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5285f, 21.0596f)
        curveTo(12.8812f, 21.1735f, 11.249f, 13.4909f, 12.3697f, 12.37f)
        curveTo(13.4905f, 11.2491f, 21.1736f, 12.8801f, 21.0598f, 14.5274f)
        curveTo(20.9814f, 15.6063f, 19.1553f, 16.033f, 19.2086f, 16.9918f)
        curveTo(19.2243f, 17.2726f, 19.579f, 17.5286f, 20.2885f, 18.0404f)
        curveTo(20.7815f, 18.3961f, 21.2841f, 18.7415f, 21.7687f, 19.1086f)
        curveTo(21.9621f, 19.2551f, 22.0385f, 19.5015f, 21.9817f, 19.7337f)
        curveTo(21.7089f, 20.8491f, 20.854f, 21.7078f, 19.7341f, 21.9817f)
        curveTo(19.5018f, 22.0385f, 19.2555f, 21.9621f, 19.109f, 21.7686f)
        curveTo(18.742f, 21.284f, 18.3967f, 20.7813f, 18.041f, 20.2882f)
        curveTo(17.5292f, 19.5786f, 17.2733f, 19.2239f, 16.9925f, 19.2082f)
        curveTo(16.0339f, 19.1549f, 15.6072f, 20.9812f, 14.5285f, 21.0596f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 7f)
        horizontalLineTo(20f)
        }
        }.build()

        return _cursorInWindow!!
    }

private var _cursorInWindow: ImageVector? = null
