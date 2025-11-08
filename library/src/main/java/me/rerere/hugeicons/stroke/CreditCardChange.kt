package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CreditCardChange: ImageVector
    get() {
        if (_creditCardChange != null) {
            return _creditCardChange!!
        }
        _creditCardChange = ImageVector.Builder(
            name = "CreditCardChange",
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
        horizontalLineTo(11f)
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
        moveTo(19.3333f, 12.5f)
        lineTo(20.1565f, 13.2579f)
        curveTo(20.3357f, 13.434f, 20.4253f, 13.5221f, 20.3938f, 13.5969f)
        curveTo(20.3622f, 13.6717f, 20.2355f, 13.6717f, 19.9821f, 13.6717f)
        horizontalLineTo(16.8777f)
        curveTo(15.2884f, 13.6717f, 14f, 14.938f, 14f, 16.5f)
        curveTo(14f, 16.8521f, 14.0655f, 17.1891f, 14.185f, 17.5f)
        moveTo(16.6667f, 20.5f)
        lineTo(15.8435f, 19.7421f)
        curveTo(15.6643f, 19.566f, 15.5747f, 19.4779f, 15.6062f, 19.4031f)
        curveTo(15.6378f, 19.3283f, 15.7645f, 19.3283f, 16.0179f, 19.3283f)
        horizontalLineTo(19.1223f)
        curveTo(20.7116f, 19.3283f, 22f, 18.062f, 22f, 16.5f)
        curveTo(22f, 16.1479f, 21.9345f, 15.8109f, 21.815f, 15.5f)
        }
        }.build()

        return _creditCardChange!!
    }

private var _creditCardChange: ImageVector? = null
