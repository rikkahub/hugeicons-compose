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

val HugeIcons.MapMinus: ImageVector
    get() {
        if (_mapMinus != null) {
            return _mapMinus!!
        }
        _mapMinus = ImageVector.Builder(
            name = "MapMinus",
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
            moveTo(21.9961f, 18.474f)
            horizontalLineTo(14.9961f)
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
            moveTo(11.9961f, 20.2761f)
            curveTo(11.9465f, 20.2545f, 11.896f, 20.2326f, 11.8447f, 20.2102f)
            lineTo(9.39393f, 19.1441f)
            curveTo(8.70287f, 18.8435f, 8.35734f, 18.6931f, 7.99029f, 18.6776f)
            curveTo(7.62324f, 18.6621f, 7.2666f, 18.7828f, 6.55334f, 19.0241f)
            lineTo(5.94478f, 19.2301f)
            curveTo(4.14291f, 19.8397f, 3.24196f, 20.1446f, 2.61903f, 19.6888f)
            curveTo(1.99609f, 19.2331f, 1.99609f, 18.2691f, 1.99609f, 16.3411f)
            verticalLineTo(8.86462f)
            curveTo(1.99609f, 7.64368f, 1.99609f, 7.03322f, 2.29479f, 6.54263f)
            curveTo(2.59349f, 6.05205f, 3.13141f, 5.77904f, 4.20724f, 5.23302f)
            lineTo(4.67742f, 4.99439f)
            curveTo(6.30984f, 4.16589f, 7.12605f, 3.75164f, 8.00812f, 3.72533f)
            curveTo(8.89019f, 3.69902f, 9.72895f, 4.0639f, 11.4065f, 4.79367f)
            lineTo(13.4204f, 5.66979f)
            curveTo(14.1972f, 6.0077f, 14.5856f, 6.17666f, 14.9961f, 6.17666f)
            curveTo(15.4066f, 6.17666f, 15.795f, 6.0077f, 16.5718f, 5.66979f)
            lineTo(17.8143f, 5.12924f)
            curveTo(19.7032f, 4.30755f, 20.6476f, 3.89671f, 21.3218f, 4.34801f)
            curveTo(21.9961f, 4.79931f, 21.9961f, 5.84228f, 21.9961f, 7.9282f)
            verticalLineTo(14.474f)
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
            moveTo(7.99609f, 3.81775f)
            curveTo(7.99609f, 9.56564f, 7.99609f, 12.7883f, 7.99609f, 18.5361f)
            moveTo(14.9961f, 14.474f)
            verticalLineTo(6.35541f)
        }
        }.build()

        return _mapMinus!!
    }

private var _mapMinus: ImageVector? = null
