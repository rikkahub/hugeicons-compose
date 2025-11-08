package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TextFont: ImageVector
    get() {
        if (_textFont != null) {
            return _textFont!!
        }
        _textFont = ImageVector.Builder(
            name = "TextFont",
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
        moveTo(14f, 19f)
        lineTo(11.1069f, 10.7479f)
        curveTo(9.76348f, 6.91597f, 9.09177f, 5f, 8f, 5f)
        curveTo(6.90823f, 5f, 6.23652f, 6.91597f, 4.89309f, 10.7479f)
        lineTo(2f, 19f)
        moveTo(4.5f, 12f)
        horizontalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.9692f, 13.9392f)
        verticalLineTo(18.4392f)
        moveTo(21.9692f, 13.9392f)
        curveTo(22.0164f, 13.1161f, 22.0182f, 12.4891f, 21.9194f, 11.9773f)
        curveTo(21.6864f, 10.7709f, 20.4258f, 10.0439f, 19.206f, 9.89599f)
        curveTo(18.0385f, 9.75447f, 17.1015f, 10.055f, 16.1535f, 11.4363f)
        moveTo(21.9692f, 13.9392f)
        lineTo(19.1256f, 13.9392f)
        curveTo(18.6887f, 13.9392f, 18.2481f, 13.9603f, 17.8272f, 14.0773f)
        curveTo(15.2545f, 14.7925f, 15.4431f, 18.4003f, 18.0233f, 18.845f)
        curveTo(18.3099f, 18.8944f, 18.6025f, 18.9156f, 18.8927f, 18.9026f)
        curveTo(19.5703f, 18.8724f, 20.1955f, 18.545f, 20.7321f, 18.1301f)
        curveTo(21.3605f, 17.644f, 21.9692f, 16.9655f, 21.9692f, 15.9392f)
        verticalLineTo(13.9392f)
        }
        }.build()

        return _textFont!!
    }

private var _textFont: ImageVector? = null
