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

val HugeIcons.Home05: ImageVector
    get() {
        if (_home05 != null) {
            return _home05!!
        }
        _home05 = ImageVector.Builder(
            name = "Home05",
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
            moveTo(13f, 13.5033f)
            horizontalLineTo(11f)
            curveTo(10.1716f, 13.5033f, 9.5f, 14.1748f, 9.5f, 15.0033f)
            verticalLineTo(20.5013f)
            curveTo(9.5f, 21.0539f, 9.05114f, 21.5032f, 8.49854f, 21.4977f)
            curveTo(6.17337f, 21.4744f, 4.88133f, 21.3333f, 4.02513f, 20.4771f)
            curveTo(3f, 19.452f, 3f, 17.8021f, 3f, 14.5023f)
            verticalLineTo(11.9918f)
            curveTo(3f, 10.3106f, 3f, 9.47f, 3.3559f, 8.74232f)
            curveTo(3.71179f, 8.01464f, 4.37533f, 7.49855f, 5.70241f, 6.46638f)
            lineTo(7.70242f, 4.91082f)
            curveTo(9.76689f, 3.30512f, 10.7991f, 2.50227f, 12f, 2.50227f)
            curveTo(13.2009f, 2.50227f, 14.2331f, 3.30512f, 16.2976f, 4.91082f)
            lineTo(18.2976f, 6.46638f)
            curveTo(19.6247f, 7.49855f, 20.2882f, 8.01464f, 20.6441f, 8.74232f)
            curveTo(21f, 9.47f, 21f, 10.3106f, 21f, 11.9918f)
            verticalLineTo(14.5023f)
            curveTo(21f, 17.8021f, 21f, 19.452f, 19.9749f, 20.4771f)
            curveTo(19.1187f, 21.3333f, 17.8266f, 21.4744f, 15.5015f, 21.4977f)
            curveTo(14.9489f, 21.5032f, 14.5f, 21.0539f, 14.5f, 20.5013f)
            verticalLineTo(15.0033f)
            curveTo(14.5f, 14.1748f, 13.8284f, 13.5033f, 13f, 13.5033f)
            close()
        }
        }.build()

        return _home05!!
    }

private var _home05: ImageVector? = null
