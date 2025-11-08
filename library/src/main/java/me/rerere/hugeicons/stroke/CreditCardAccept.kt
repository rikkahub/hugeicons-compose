package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CreditCardAccept: ImageVector
    get() {
        if (_creditCardAccept != null) {
            return _creditCardAccept!!
        }
        _creditCardAccept = ImageVector.Builder(
            name = "CreditCardAccept",
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
        moveTo(11f, 20f)
        horizontalLineTo(10.5f)
        curveTo(6.74142f, 20f, 4.86213f, 20f, 3.60746f, 19.0091f)
        curveTo(3.40678f, 18.8506f, 3.22119f, 18.676f, 3.0528f, 18.4871f)
        curveTo(2f, 17.3062f, 2f, 15.5375f, 2f, 12f)
        curveTo(2f, 8.46252f, 2f, 6.69377f, 3.0528f, 5.5129f)
        curveTo(3.22119f, 5.32403f, 3.40678f, 5.14935f, 3.60746f, 4.99087f)
        curveTo(4.86213f, 4f, 6.74142f, 4f, 10.5f, 4f)
        horizontalLineTo(13.5f)
        curveTo(17.2586f, 4f, 19.1379f, 4f, 20.3925f, 4.99087f)
        curveTo(20.5932f, 5.14935f, 20.7788f, 5.32403f, 20.9472f, 5.5129f)
        curveTo(21.8957f, 6.57684f, 21.9897f, 8.11799f, 21.999f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 9f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 18f)
        curveTo(14f, 18f, 15f, 18f, 16f, 20f)
        curveTo(16f, 20f, 19.1765f, 15f, 22f, 14f)
        }
        }.build()

        return _creditCardAccept!!
    }

private var _creditCardAccept: ImageVector? = null
