package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HandPointingDown02: ImageVector
    get() {
        if (_handPointingDown02 != null) {
            return _handPointingDown02!!
        }
        _handPointingDown02 = ImageVector.Builder(
            name = "HandPointingDown02",
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
        moveTo(7.41601f, 10f)
        lineTo(7.41601f, 13.5f)
        moveTo(7.41601f, 13.5f)
        verticalLineTo(19.75f)
        curveTo(7.41601f, 20.7165f, 8.19951f, 21.5f, 9.16601f, 21.5f)
        curveTo(10.1325f, 21.5f, 10.916f, 20.7165f, 10.916f, 19.75f)
        verticalLineTo(14.5f)
        lineTo(13.993f, 14.0224f)
        curveTo(15.9216f, 13.7331f, 16.886f, 13.5885f, 17.5652f, 13.1816f)
        curveTo(18.6872f, 12.5094f, 19.5f, 11.5f, 19.5f, 10.0264f)
        curveTo(19.5f, 9f, 19.2463f, 8.3114f, 18.6296f, 6.46127f)
        curveTo(18.2383f, 5.28733f, 18.0426f, 4.70036f, 17.7236f, 4.23571f)
        curveTo(17.1983f, 3.47073f, 16.4233f, 2.9122f, 15.5315f, 2.65576f)
        curveTo(14.9898f, 2.5f, 14.3711f, 2.5f, 13.1336f, 2.5f)
        horizontalLineTo(11.7287f)
        curveTo(9.94422f, 2.5f, 9.05198f, 2.5f, 8.28584f, 2.83495f)
        curveTo(7.9397f, 2.98627f, 7.61674f, 3.18587f, 7.32659f, 3.42779f)
        curveTo(6.68438f, 3.96326f, 6.28536f, 4.7613f, 5.48731f, 6.35738f)
        curveTo(4.84015f, 7.65171f, 4.51657f, 8.29887f, 4.50083f, 8.96984f)
        curveTo(4.49373f, 9.27244f, 4.53246f, 9.57436f, 4.61571f, 9.86537f)
        curveTo(4.80031f, 10.5106f, 5.27678f, 11.0552f, 6.2297f, 12.1442f)
        lineTo(7.41601f, 13.5f)
        }
        }.build()

        return _handPointingDown02!!
    }

private var _handPointingDown02: ImageVector? = null
