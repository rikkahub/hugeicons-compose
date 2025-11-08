package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PoundSend: ImageVector
    get() {
        if (_poundSend != null) {
            return _poundSend!!
        }
        _poundSend = ImageVector.Builder(
            name = "PoundSend",
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
        moveTo(22f, 13f)
        horizontalLineTo(14.5f)
        moveTo(22f, 13f)
        curveTo(22f, 13.7002f, 20.0057f, 15.0085f, 19.5f, 15.5f)
        moveTo(22f, 13f)
        curveTo(22f, 12.2998f, 20.0057f, 10.9915f, 19.5f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.433f, 8.90854f)
        curveTo(12.433f, 6.22693f, 9.76214f, 2.33551f, 5.63149f, 4.76687f)
        curveTo(4.24262f, 5.6846f, 2.45068f, 8.7357f, 4.6139f, 11.9367f)
        curveTo(5.66599f, 13.4935f, 6.70504f, 13.7211f, 9.58852f, 13.7211f)
        horizontalLineTo(2f)
        moveTo(6.47402f, 14.0071f)
        curveTo(5.93571f, 15.5013f, 4.30627f, 18.8986f, 2.09506f, 19.9868f)
        horizontalLineTo(10.9808f)
        curveTo(11.3895f, 19.9868f, 12.6048f, 20.1989f, 14f, 18.9239f)
        }
        }.build()

        return _poundSend!!
    }

private var _poundSend: ImageVector? = null
