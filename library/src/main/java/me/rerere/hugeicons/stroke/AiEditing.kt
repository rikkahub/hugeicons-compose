package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AiEditing: ImageVector
    get() {
        if (_aiEditing != null) {
            return _aiEditing!!
        }
        _aiEditing = ImageVector.Builder(
            name = "AiEditing",
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
        moveTo(6.53792f, 2.32172f)
        curveTo(6.69664f, 1.89276f, 7.30336f, 1.89276f, 7.46208f, 2.32172f)
        lineTo(8.1735f, 4.2443f)
        curveTo(8.27331f, 4.51403f, 8.48597f, 4.72669f, 8.7557f, 4.8265f)
        lineTo(10.6783f, 5.53792f)
        curveTo(11.1072f, 5.69664f, 11.1072f, 6.30336f, 10.6783f, 6.46208f)
        lineTo(8.7557f, 7.1735f)
        curveTo(8.48597f, 7.27331f, 8.27331f, 7.48597f, 8.1735f, 7.7557f)
        lineTo(7.46208f, 9.67828f)
        curveTo(7.30336f, 10.1072f, 6.69665f, 10.1072f, 6.53792f, 9.67828f)
        lineTo(5.8265f, 7.7557f)
        curveTo(5.72669f, 7.48597f, 5.51403f, 7.27331f, 5.2443f, 7.1735f)
        lineTo(3.32172f, 6.46208f)
        curveTo(2.89276f, 6.30336f, 2.89276f, 5.69665f, 3.32172f, 5.53792f)
        lineTo(5.2443f, 4.8265f)
        curveTo(5.51403f, 4.72669f, 5.72669f, 4.51403f, 5.8265f, 4.2443f)
        lineTo(6.53792f, 2.32172f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.4039f, 9.64136f)
        lineTo(15.8869f, 11.1244f)
        moveTo(6f, 22f)
        horizontalLineTo(7.49759f)
        curveTo(8.70997f, 22f, 9.31617f, 22f, 9.86124f, 21.7742f)
        curveTo(10.4063f, 21.5484f, 10.835f, 21.1198f, 11.6923f, 20.2625f)
        lineTo(19.8417f, 12.1131f)
        curveTo(20.3808f, 11.574f, 20.6503f, 11.3045f, 20.7944f, 11.0137f)
        curveTo(21.0685f, 10.4605f, 21.0685f, 9.81094f, 20.7944f, 9.25772f)
        curveTo(20.6503f, 8.96695f, 20.3808f, 8.69741f, 19.8417f, 8.15832f)
        curveTo(19.3026f, 7.61924f, 19.0331f, 7.3497f, 18.7423f, 7.20561f)
        curveTo(18.1891f, 6.93146f, 17.5395f, 6.93146f, 16.9863f, 7.20561f)
        curveTo(16.6955f, 7.3497f, 16.426f, 7.61924f, 15.8869f, 8.15832f)
        lineTo(7.73749f, 16.3077f)
        curveTo(6.8802f, 17.165f, 6.45156f, 17.5937f, 6.22578f, 18.1388f)
        curveTo(6f, 18.6838f, 6f, 19.29f, 6f, 20.5024f)
        verticalLineTo(22f)
        }
        }.build()

        return _aiEditing!!
    }

private var _aiEditing: ImageVector? = null
