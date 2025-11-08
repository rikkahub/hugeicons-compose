package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PenToolMinus: ImageVector
    get() {
        if (_penToolMinus != null) {
            return _penToolMinus!!
        }
        _penToolMinus = ImageVector.Builder(
            name = "PenToolMinus",
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
        moveTo(14.5995f, 18.9737f)
        lineTo(7.63427f, 20.2672f)
        curveTo(6.2983f, 20.5153f, 5.63031f, 20.6393f, 5.24549f, 20.2545f)
        curveTo(4.86067f, 19.8697f, 4.98471f, 19.2016f, 5.2328f, 17.8656f)
        lineTo(6.52621f, 10.9001f)
        curveTo(6.73362f, 9.78311f, 6.83732f, 9.22463f, 7.20549f, 8.88719f)
        curveTo(7.57365f, 8.54975f, 8.24697f, 8.48389f, 9.59359f, 8.35218f)
        curveTo(10.8915f, 8.22524f, 12.1197f, 7.78032f, 13.4f, 6.5f)
        lineTo(19f, 12.1005f)
        curveTo(17.7197f, 13.3808f, 17.2746f, 14.6083f, 17.1474f, 15.9062f)
        curveTo(17.0155f, 17.253f, 16.9495f, 17.9264f, 16.6121f, 18.2945f)
        curveTo(16.2747f, 18.6626f, 15.7163f, 18.7663f, 14.5995f, 18.9737f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 14.7105f)
        curveTo(12.4405f, 14.6197f, 11.9289f, 14.3763f, 11.5263f, 13.9737f)
        moveTo(11.5263f, 13.9737f)
        curveTo(11.1237f, 13.5711f, 10.8803f, 13.0595f, 10.7895f, 12.5f)
        moveTo(11.5263f, 13.9737f)
        lineTo(6f, 19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 6.5f)
        curveTo(14.1332f, 5.56586f, 15.4907f, 3.66107f, 16.7613f, 3.50976f)
        curveTo(17.6287f, 3.40648f, 18.3472f, 4.12499f, 19.7842f, 5.56202f)
        lineTo(19.938f, 5.7158f)
        curveTo(21.375f, 7.15283f, 22.0935f, 7.87135f, 21.9902f, 8.73867f)
        curveTo(21.8389f, 10.0092f, 19.9341f, 11.3668f, 19f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 3.5f)
        horizontalLineTo(8f)
        }
        }.build()

        return _penToolMinus!!
    }

private var _penToolMinus: ImageVector? = null
