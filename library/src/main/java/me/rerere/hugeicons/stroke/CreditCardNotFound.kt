package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CreditCardNotFound: ImageVector
    get() {
        if (_creditCardNotFound != null) {
            return _creditCardNotFound!!
        }
        _creditCardNotFound = ImageVector.Builder(
            name = "CreditCardNotFound",
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
        moveTo(4.46334f, 4.5f)
        curveTo(4.145f, 4.62804f, 3.86325f, 4.78886f, 3.60746f, 4.99087f)
        curveTo(3.40678f, 5.14935f, 3.22119f, 5.32403f, 3.0528f, 5.5129f)
        curveTo(2f, 6.69377f, 2f, 8.46252f, 2f, 12f)
        curveTo(2f, 15.5375f, 2f, 17.3062f, 3.0528f, 18.4871f)
        curveTo(3.22119f, 18.676f, 3.40678f, 18.8506f, 3.60746f, 19.0091f)
        curveTo(4.86213f, 20f, 6.74142f, 20f, 10.5f, 20f)
        horizontalLineTo(13.5f)
        curveTo(16.4923f, 20f, 18.2568f, 20f, 19.5f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 4.01578f)
        curveTo(8.7277f, 4f, 9.55437f, 4f, 10.5f, 4f)
        horizontalLineTo(13.5f)
        curveTo(17.2586f, 4f, 19.1379f, 4f, 20.3925f, 4.99087f)
        curveTo(20.5932f, 5.14935f, 20.7788f, 5.32403f, 20.9472f, 5.5129f)
        curveTo(22f, 6.69377f, 22f, 8.46252f, 22f, 12f)
        curveTo(22f, 14.3126f, 22f, 15.8693f, 21.7058f, 17f)
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

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 9f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 9f)
        lineTo(13.5f, 9f)
        }
        }.build()

        return _creditCardNotFound!!
    }

private var _creditCardNotFound: ImageVector? = null
