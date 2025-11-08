package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Summation02: ImageVector
    get() {
        if (_summation02 != null) {
            return _summation02!!
        }
        _summation02 = ImageVector.Builder(
            name = "Summation02",
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
        moveTo(17.725f, 2.5f)
        curveTo(19.1145f, 2.65381f, 20.0498f, 3.00143f, 20.7479f, 3.78705f)
        curveTo(22f, 5.19617f, 22f, 7.46411f, 22f, 12f)
        curveTo(22f, 16.5359f, 22f, 18.8038f, 20.7479f, 20.213f)
        curveTo(20.0498f, 20.9986f, 19.1145f, 21.3462f, 17.725f, 21.5f)
        moveTo(6.27501f, 21.5f)
        curveTo(4.88551f, 21.3462f, 3.95021f, 20.9986f, 3.25212f, 20.213f)
        curveTo(2f, 18.8038f, 2f, 16.5359f, 2f, 12f)
        curveTo(2f, 7.46411f, 2f, 5.19617f, 3.25212f, 3.78705f)
        curveTo(3.95021f, 3.00143f, 4.88551f, 2.65381f, 6.27501f, 2.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.9998f, 14.4986f)
        curveTo(14.9981f, 15.0266f, 14.983f, 15.3137f, 14.8502f, 15.5299f)
        curveTo(14.5236f, 16.0612f, 13.8736f, 15.9976f, 13.3241f, 15.9976f)
        horizontalLineTo(10.7994f)
        curveTo(9.69158f, 15.9976f, 9.13766f, 15.9976f, 9.01957f, 15.6713f)
        curveTo(8.90149f, 15.345f, 9.32205f, 14.9765f, 10.1632f, 14.2394f)
        lineTo(11.8529f, 12.7588f)
        curveTo(12.2554f, 12.4062f, 12.4566f, 12.2298f, 12.4566f, 12f)
        curveTo(12.4566f, 11.7702f, 12.2554f, 11.5938f, 11.8529f, 11.2412f)
        lineTo(10.1632f, 9.76058f)
        curveTo(9.32205f, 9.02355f, 8.90149f, 8.65503f, 9.01957f, 8.3287f)
        curveTo(9.13766f, 8.00237f, 9.69158f, 8.00237f, 10.7994f, 8.00237f)
        horizontalLineTo(13.3241f)
        curveTo(13.8736f, 8.00237f, 14.5236f, 7.93885f, 14.8502f, 8.47006f)
        curveTo(14.983f, 8.68627f, 14.9981f, 8.97338f, 14.9998f, 9.50144f)
        }
        }.build()

        return _summation02!!
    }

private var _summation02: ImageVector? = null
