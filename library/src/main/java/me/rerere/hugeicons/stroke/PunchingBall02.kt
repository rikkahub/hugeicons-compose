package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PunchingBall02: ImageVector
    get() {
        if (_punchingBall02 != null) {
            return _punchingBall02!!
        }
        _punchingBall02 = ImageVector.Builder(
            name = "PunchingBall02",
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
        moveTo(14.6897f, 18.5f)
        horizontalLineTo(9.31035f)
        curveTo(8.63048f, 18.5f, 8.00273f, 18.8846f, 7.66542f, 19.5077f)
        lineTo(7.12621f, 20.5039f)
        curveTo(6.76535f, 21.1705f, 7.22133f, 22f, 7.94867f, 22f)
        horizontalLineTo(16.0513f)
        curveTo(16.7787f, 22f, 17.2347f, 21.1705f, 16.8738f, 20.5039f)
        lineTo(16.3346f, 19.5077f)
        curveTo(15.9973f, 18.8846f, 15.3695f, 18.5f, 14.6897f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12f)
        verticalLineTo(18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        curveTo(9.51472f, 2f, 7.5f, 3.17807f, 7.5f, 5.84619f)
        curveTo(7.5f, 8.18121f, 9.5105f, 8.74889f, 10.5152f, 10.9489f)
        curveTo(10.6595f, 11.2648f, 10.7316f, 11.4227f, 10.7782f, 11.4936f)
        curveTo(10.9831f, 11.8056f, 11.1795f, 11.9309f, 11.5517f, 11.9872f)
        curveTo(11.6363f, 12f, 11.7575f, 12f, 11.9999f, 12f)
        curveTo(12.2423f, 12f, 12.3636f, 12f, 12.4481f, 11.9873f)
        curveTo(12.8204f, 11.9311f, 13.0162f, 11.8063f, 13.2214f, 11.4945f)
        curveTo(13.268f, 11.4236f, 13.3404f, 11.2655f, 13.4853f, 10.9491f)
        curveTo(14.4901f, 8.75415f, 16.5f, 8.20205f, 16.5f, 5.84619f)
        curveTo(16.5f, 3.15386f, 14.4853f, 2f, 12f, 2f)
        }
        }.build()

        return _punchingBall02!!
    }

private var _punchingBall02: ImageVector? = null
