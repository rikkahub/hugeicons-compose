package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HandPointingRight02: ImageVector
    get() {
        if (_handPointingRight02 != null) {
            return _handPointingRight02!!
        }
        _handPointingRight02 = ImageVector.Builder(
            name = "HandPointingRight02",
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
        moveTo(10f, 7.41601f)
        lineTo(13.5f, 7.41601f)
        moveTo(13.5f, 7.41601f)
        lineTo(19.75f, 7.41601f)
        curveTo(20.7165f, 7.41601f, 21.5f, 8.19951f, 21.5f, 9.16601f)
        curveTo(21.5f, 10.1325f, 20.7165f, 10.916f, 19.75f, 10.916f)
        lineTo(14.5f, 10.916f)
        lineTo(14.0224f, 13.993f)
        curveTo(13.7331f, 15.9216f, 13.5885f, 16.886f, 13.1816f, 17.5652f)
        curveTo(12.5094f, 18.6872f, 11.5f, 19.5f, 10.0264f, 19.5f)
        curveTo(9f, 19.5f, 8.3114f, 19.2463f, 6.46127f, 18.6296f)
        curveTo(5.28733f, 18.2383f, 4.70036f, 18.0426f, 4.23571f, 17.7236f)
        curveTo(3.47073f, 17.1983f, 2.91219f, 16.4233f, 2.65576f, 15.5315f)
        curveTo(2.5f, 14.9898f, 2.5f, 14.3711f, 2.5f, 13.1336f)
        lineTo(2.5f, 11.7287f)
        curveTo(2.5f, 9.94422f, 2.5f, 9.05198f, 2.83495f, 8.28584f)
        curveTo(2.98627f, 7.9397f, 3.18587f, 7.61674f, 3.42779f, 7.32659f)
        curveTo(3.96326f, 6.68438f, 4.7613f, 6.28535f, 6.35738f, 5.48731f)
        curveTo(7.65171f, 4.84015f, 8.29887f, 4.51657f, 8.96984f, 4.50082f)
        curveTo(9.27244f, 4.49372f, 9.57436f, 4.53246f, 9.86537f, 4.61571f)
        curveTo(10.5106f, 4.80031f, 11.0552f, 5.27678f, 12.1442f, 6.2297f)
        lineTo(13.5f, 7.41601f)
        }
        }.build()

        return _handPointingRight02!!
    }

private var _handPointingRight02: ImageVector? = null
