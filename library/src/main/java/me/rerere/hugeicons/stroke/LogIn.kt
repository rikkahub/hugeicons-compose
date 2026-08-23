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

val HugeIcons.LogIn: ImageVector
    get() {
        if (_logIn != null) {
            return _logIn!!
        }
        _logIn = ImageVector.Builder(
            name = "LogIn",
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
            moveTo(13.9959f, 12f)
            horizontalLineTo(3.99591f)
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
            moveTo(9.01935f, 18f)
            curveTo(9.06591f, 19.0934f, 9.20432f, 19.7902f, 9.61568f, 20.3263f)
            curveTo(9.77528f, 20.5343f, 9.96146f, 20.7205f, 10.1695f, 20.8801f)
            curveTo(10.9774f, 21.5f, 12.1502f, 21.5f, 14.4957f, 21.5f)
            curveTo(16.8413f, 21.5f, 18.0141f, 21.5f, 18.822f, 20.8801f)
            curveTo(19.03f, 20.7205f, 19.2162f, 20.5343f, 19.3758f, 20.3263f)
            curveTo(19.9957f, 19.5184f, 19.9957f, 18.3456f, 19.9957f, 16f)
            verticalLineTo(8f)
            curveTo(19.9957f, 5.65442f, 19.9957f, 4.48164f, 19.3758f, 3.67372f)
            curveTo(19.2162f, 3.46572f, 19.03f, 3.27954f, 18.822f, 3.11994f)
            curveTo(18.0141f, 2.5f, 16.8413f, 2.5f, 14.4957f, 2.5f)
            curveTo(12.1502f, 2.5f, 10.9774f, 2.5f, 10.1695f, 3.11994f)
            curveTo(9.96146f, 3.27954f, 9.77528f, 3.46572f, 9.61568f, 3.67372f)
            curveTo(9.20432f, 4.20981f, 9.06591f, 4.90656f, 9.01935f, 6f)
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
            moveTo(11.4959f, 15.5f)
            curveTo(11.4959f, 15.5f, 14.9959f, 12.9223f, 14.9959f, 12f)
            curveTo(14.9959f, 11.0777f, 11.4959f, 8.5f, 11.4959f, 8.5f)
        }
        }.build()

        return _logIn!!
    }

private var _logIn: ImageVector? = null
