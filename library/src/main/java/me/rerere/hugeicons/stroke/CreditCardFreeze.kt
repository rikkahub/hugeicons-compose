package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CreditCardFreeze: ImageVector
    get() {
        if (_creditCardFreeze != null) {
            return _creditCardFreeze!!
        }
        _creditCardFreeze = ImageVector.Builder(
            name = "CreditCardFreeze",
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
        moveTo(22f, 9f)
        curveTo(21.9635f, 6.74771f, 21.7892f, 5.44656f, 20.9564f, 4.5129f)
        curveTo(20.7879f, 4.32403f, 20.6022f, 4.14935f, 20.4014f, 3.99087f)
        curveTo(19.1461f, 3f, 17.2659f, 3f, 13.5056f, 3f)
        horizontalLineTo(10.5041f)
        curveTo(6.74371f, 3f, 4.86352f, 3f, 3.60823f, 3.99087f)
        curveTo(3.40746f, 4.14935f, 3.22178f, 4.32403f, 3.05331f, 4.5129f)
        curveTo(2f, 5.69377f, 2f, 7.46252f, 2f, 11f)
        curveTo(2f, 14.5375f, 2f, 16.3062f, 3.05331f, 17.4871f)
        curveTo(3.22178f, 17.676f, 3.40746f, 17.8506f, 3.60823f, 18.0091f)
        curveTo(4.86352f, 19f, 6.74371f, 19f, 10.5041f, 19f)
        horizontalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 8f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 13f)
        verticalLineTo(14.7778f)
        moveTo(18f, 14.7778f)
        verticalLineTo(19.2222f)
        moveTo(18f, 14.7778f)
        lineTo(19.5f, 14f)
        moveTo(18f, 14.7778f)
        lineTo(16.5f, 14f)
        moveTo(18f, 19.2222f)
        lineTo(18f, 21f)
        moveTo(18f, 19.2222f)
        lineTo(16.5f, 20f)
        moveTo(18f, 19.2222f)
        lineTo(19.5f, 20f)
        moveTo(22f, 17f)
        lineTo(20.2222f, 17f)
        moveTo(20.2222f, 17f)
        lineTo(15.7778f, 17f)
        moveTo(20.2222f, 17f)
        lineTo(21f, 18.5f)
        moveTo(20.2222f, 17f)
        lineTo(21f, 15.5f)
        moveTo(15.7778f, 17f)
        lineTo(14f, 17f)
        moveTo(15.7778f, 17f)
        lineTo(15f, 15.5f)
        moveTo(15.7778f, 17f)
        lineTo(15f, 18.5f)
        }
        }.build()

        return _creditCardFreeze!!
    }

private var _creditCardFreeze: ImageVector? = null
