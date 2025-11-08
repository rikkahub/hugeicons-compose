package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CreditCard: ImageVector
    get() {
        if (_creditCard != null) {
            return _creditCard!!
        }
        _creditCard = ImageVector.Builder(
            name = "CreditCard",
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
        moveTo(2f, 12f)
        curveTo(2f, 8.46252f, 2f, 6.69377f, 3.0528f, 5.5129f)
        curveTo(3.22119f, 5.32403f, 3.40678f, 5.14935f, 3.60746f, 4.99087f)
        curveTo(4.86213f, 4f, 6.74142f, 4f, 10.5f, 4f)
        horizontalLineTo(13.5f)
        curveTo(17.2586f, 4f, 19.1379f, 4f, 20.3925f, 4.99087f)
        curveTo(20.5932f, 5.14935f, 20.7788f, 5.32403f, 20.9472f, 5.5129f)
        curveTo(22f, 6.69377f, 22f, 8.46252f, 22f, 12f)
        curveTo(22f, 15.5375f, 22f, 17.3062f, 20.9472f, 18.4871f)
        curveTo(20.7788f, 18.676f, 20.5932f, 18.8506f, 20.3925f, 19.0091f)
        curveTo(19.1379f, 20f, 17.2586f, 20f, 13.5f, 20f)
        horizontalLineTo(10.5f)
        curveTo(6.74142f, 20f, 4.86213f, 20f, 3.60746f, 19.0091f)
        curveTo(3.40678f, 18.8506f, 3.22119f, 18.676f, 3.0528f, 18.4871f)
        curveTo(2f, 17.3062f, 2f, 15.5375f, 2f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 16f)
        horizontalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 16f)
        lineTo(18f, 16f)
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
        }.build()

        return _creditCard!!
    }

private var _creditCard: ImageVector? = null
