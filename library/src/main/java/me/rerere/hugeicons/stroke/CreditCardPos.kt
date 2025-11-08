package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CreditCardPos: ImageVector
    get() {
        if (_creditCardPos != null) {
            return _creditCardPos!!
        }
        _creditCardPos = ImageVector.Builder(
            name = "CreditCardPos",
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
        moveTo(3.3457f, 16.1976f)
        lineTo(16.1747f, 3.36866f)
        moveTo(18.6316f, 11.0556f)
        lineTo(16.4321f, 13.2551f)
        moveTo(14.5549f, 15.1099f)
        lineTo(13.5762f, 16.0886f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.17467f, 16.1411f)
        curveTo(1.60844f, 14.5749f, 1.60844f, 12.0355f, 3.17467f, 10.4693f)
        lineTo(10.4693f, 3.17467f)
        curveTo(12.0355f, 1.60844f, 14.5749f, 1.60844f, 16.1411f, 3.17467f)
        lineTo(20.8253f, 7.85891f)
        curveTo(22.3916f, 9.42514f, 22.3916f, 11.9645f, 20.8253f, 13.5307f)
        lineTo(13.5307f, 20.8253f)
        curveTo(11.9645f, 22.3916f, 9.42514f, 22.3916f, 7.85891f, 20.8253f)
        lineTo(3.17467f, 16.1411f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 22f)
        horizontalLineTo(20f)
        }
        }.build()

        return _creditCardPos!!
    }

private var _creditCardPos: ImageVector? = null
