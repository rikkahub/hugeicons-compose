package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Cone02: ImageVector
    get() {
        if (_cone02 != null) {
            return _cone02!!
        }
        _cone02 = ImageVector.Builder(
            name = "Cone02",
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
        moveTo(12f, 19f)
        horizontalLineTo(15f)
        moveTo(15f, 19f)
        curveTo(15f, 18.2322f, 14.7071f, 17.4645f, 14.1213f, 16.8787f)
        curveTo(12.9497f, 15.7071f, 11.0503f, 15.7071f, 9.87868f, 16.8787f)
        curveTo(8.70711f, 18.0503f, 8.70711f, 19.9497f, 9.87868f, 21.1213f)
        curveTo(11.0503f, 22.2929f, 12.9497f, 22.2929f, 14.1213f, 21.1213f)
        curveTo(14.7071f, 20.5355f, 15f, 19.7678f, 15f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 3f)
        lineTo(12f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9998f, 12f)
        horizontalLineTo(12.0088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9998f, 9f)
        horizontalLineTo(12.0088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.94867f, 11.4964f)
        curveTo(4.92231f, 14.2156f, 8.24f, 16f, 12f, 16f)
        curveTo(15.76f, 16f, 19.0777f, 14.2156f, 21.0513f, 11.4964f)
        curveTo(21.7599f, 10.5203f, 22.1141f, 10.0322f, 21.9672f, 9.18232f)
        curveTo(21.8203f, 8.33248f, 21.1837f, 7.89241f, 19.9104f, 7.01228f)
        lineTo(14.3985f, 3.20228f)
        curveTo(13.239f, 2.40076f, 12.6592f, 2f, 12f, 2f)
        curveTo(11.3408f, 2f, 10.761f, 2.40076f, 9.60147f, 3.20228f)
        lineTo(4.08961f, 7.01228f)
        curveTo(2.81635f, 7.89241f, 2.17971f, 8.33248f, 2.03278f, 9.18232f)
        curveTo(1.88585f, 10.0322f, 2.24013f, 10.5203f, 2.94867f, 11.4964f)
        }
        }.build()

        return _cone02!!
    }

private var _cone02: ImageVector? = null
