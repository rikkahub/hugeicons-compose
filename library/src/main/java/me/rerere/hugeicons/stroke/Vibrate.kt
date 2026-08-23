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

val HugeIcons.Vibrate: ImageVector
    get() {
        if (_vibrate != null) {
            return _vibrate!!
        }
        _vibrate = ImageVector.Builder(
            name = "Vibrate",
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
            moveTo(17f, 15f)
            verticalLineTo(9f)
            curveTo(17f, 6.64298f, 17f, 5.46447f, 16.2678f, 4.73223f)
            curveTo(15.5355f, 4f, 14.357f, 4f, 12f, 4f)
            curveTo(9.64298f, 4f, 8.46447f, 4f, 7.73223f, 4.73223f)
            curveTo(7f, 5.46447f, 7f, 6.64298f, 7f, 9f)
            verticalLineTo(15f)
            curveTo(7f, 17.357f, 7f, 18.5355f, 7.73223f, 19.2678f)
            curveTo(8.46447f, 20f, 9.64298f, 20f, 12f, 20f)
            curveTo(14.357f, 20f, 15.5355f, 20f, 16.2678f, 19.2678f)
            curveTo(17f, 18.5355f, 17f, 17.357f, 17f, 15f)
            close()
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
            moveTo(22f, 8f)
            lineTo(20.3578f, 9.23167f)
            curveTo(20.1325f, 9.40059f, 20f, 9.66569f, 20f, 9.94721f)
            curveTo(20f, 10.286f, 20.1914f, 10.5957f, 20.4944f, 10.7472f)
            lineTo(21.5528f, 11.2764f)
            curveTo(21.8269f, 11.4134f, 22f, 11.6936f, 22f, 12f)
            curveTo(22f, 12.3064f, 21.8269f, 12.5866f, 21.5528f, 12.7236f)
            lineTo(20.4944f, 13.2528f)
            curveTo(20.1914f, 13.4043f, 20f, 13.714f, 20f, 14.0528f)
            curveTo(20f, 14.3343f, 20.1325f, 14.5994f, 20.3578f, 14.7683f)
            lineTo(22f, 16f)
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
            moveTo(2f, 8f)
            lineTo(3.64223f, 9.23167f)
            curveTo(3.86745f, 9.40059f, 4f, 9.66569f, 4f, 9.94721f)
            curveTo(4f, 10.286f, 3.80859f, 10.5957f, 3.50557f, 10.7472f)
            lineTo(2.44721f, 11.2764f)
            curveTo(2.17313f, 11.4134f, 2f, 11.6936f, 2f, 12f)
            curveTo(2f, 12.3064f, 2.17313f, 12.5866f, 2.44721f, 12.7236f)
            lineTo(3.50557f, 13.2528f)
            curveTo(3.80859f, 13.4043f, 4f, 13.714f, 4f, 14.0528f)
            curveTo(4f, 14.3343f, 3.86745f, 14.5994f, 3.64223f, 14.7683f)
            lineTo(2f, 16f)
        }
        }.build()

        return _vibrate!!
    }

private var _vibrate: ImageVector? = null
