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

val HugeIcons.Speech: ImageVector
    get() {
        if (_speech != null) {
            return _speech!!
        }
        _speech = ImageVector.Builder(
            name = "Speech",
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
            moveTo(20.0001f, 7f)
            curveTo(21.2358f, 8.27961f, 22.0001f, 10.0474f, 22.0001f, 12f)
            curveTo(22.0001f, 13.9526f, 21.2358f, 15.7204f, 20.0001f, 17f)
            moveTo(17.1214f, 9.87868f)
            curveTo(17.6643f, 10.4216f, 18.0001f, 11.1716f, 18.0001f, 12f)
            curveTo(18.0001f, 12.8284f, 17.6643f, 13.5784f, 17.1214f, 14.1213f)
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
            moveTo(9.00012f, 20f)
            verticalLineTo(19f)
            curveTo(9.00012f, 18.0572f, 9.00012f, 17.5858f, 9.29302f, 17.2929f)
            curveTo(9.58591f, 17f, 10.0573f, 17f, 11.0001f, 17f)
            curveTo(12.1047f, 17f, 13.0001f, 16.1046f, 13.0001f, 15f)
            verticalLineTo(9.5f)
            curveTo(13.0001f, 6.46243f, 10.5377f, 4f, 7.50012f, 4f)
            curveTo(4.46256f, 4f, 2.00012f, 6.46243f, 2.00012f, 9.5f)
            curveTo(2.00012f, 10.3907f, 2.21187f, 11.232f, 2.58777f, 11.9763f)
            curveTo(3.03678f, 12.8652f, 3.37022f, 13.8573f, 3.15341f, 14.8294f)
            lineTo(2.00012f, 20f)
        }
        }.build()

        return _speech!!
    }

private var _speech: ImageVector? = null
