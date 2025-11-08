package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CreditCardDefrost: ImageVector
    get() {
        if (_creditCardDefrost != null) {
            return _creditCardDefrost!!
        }
        _creditCardDefrost = ImageVector.Builder(
            name = "CreditCardDefrost",
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
        moveTo(22f, 9.5f)
        curveTo(21.9635f, 7.24771f, 21.7892f, 5.94656f, 20.9564f, 5.0129f)
        curveTo(20.7879f, 4.82403f, 20.6022f, 4.64935f, 20.4014f, 4.49087f)
        curveTo(19.1461f, 3.5f, 17.2659f, 3.5f, 13.5056f, 3.5f)
        horizontalLineTo(10.5041f)
        curveTo(6.74371f, 3.5f, 4.86352f, 3.5f, 3.60823f, 4.49087f)
        curveTo(3.40746f, 4.64935f, 3.22178f, 4.82403f, 3.05331f, 5.0129f)
        curveTo(2f, 6.19377f, 2f, 7.96252f, 2f, 11.5f)
        curveTo(2f, 15.0375f, 2f, 16.8062f, 3.05331f, 17.9871f)
        curveTo(3.22178f, 18.176f, 3.40746f, 18.3506f, 3.60823f, 18.5091f)
        curveTo(4.86352f, 19.5f, 6.74371f, 19.5f, 10.5041f, 19.5f)
        horizontalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 8.5f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.0161f, 12.5f)
        curveTo(11.8458f, 15.2942f, 17.3195f, 17.2518f, 15.0161f, 20.5f)
        moveTo(18.2161f, 12.5f)
        curveTo(15.0458f, 15.2942f, 20.5195f, 17.2518f, 18.2161f, 20.5f)
        moveTo(21.4161f, 12.5f)
        curveTo(18.2458f, 15.2942f, 23.7195f, 17.2518f, 21.4161f, 20.5f)
        }
        }.build()

        return _creditCardDefrost!!
    }

private var _creditCardDefrost: ImageVector? = null
