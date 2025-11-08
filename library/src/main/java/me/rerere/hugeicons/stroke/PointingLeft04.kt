package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PointingLeft04: ImageVector
    get() {
        if (_pointingLeft04 != null) {
            return _pointingLeft04!!
        }
        _pointingLeft04 = ImageVector.Builder(
            name = "PointingLeft04",
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
        moveTo(14.5f, 9.91601f)
        lineTo(11f, 9.91601f)
        moveTo(11f, 9.91601f)
        lineTo(4.75f, 9.91601f)
        curveTo(3.7835f, 9.91601f, 3f, 10.6995f, 3f, 11.666f)
        curveTo(3f, 12.6325f, 3.7835f, 13.416f, 4.75f, 13.416f)
        horizontalLineTo(10f)
        lineTo(10.4776f, 16.493f)
        curveTo(10.7669f, 18.4216f, 10.9115f, 19.386f, 11.3184f, 20.0652f)
        curveTo(11.9906f, 21.1872f, 13f, 22f, 14.4736f, 22f)
        curveTo(15.5f, 22f, 16.1886f, 21.7463f, 18.0387f, 21.1296f)
        curveTo(19.2127f, 20.7383f, 19.7996f, 20.5426f, 20.2643f, 20.2236f)
        curveTo(21.0293f, 19.6983f, 21.5878f, 18.9233f, 21.8442f, 18.0315f)
        curveTo(22f, 17.4898f, 22f, 16.8711f, 22f, 15.6336f)
        verticalLineTo(14.2287f)
        curveTo(22f, 12.4442f, 22f, 11.552f, 21.6651f, 10.7858f)
        curveTo(21.5137f, 10.4397f, 21.3141f, 10.1167f, 21.0722f, 9.82659f)
        curveTo(20.5367f, 9.18438f, 19.7387f, 8.78536f, 18.1426f, 7.98731f)
        curveTo(16.8483f, 7.34015f, 16.2011f, 7.01657f, 15.5302f, 7.00083f)
        curveTo(15.2276f, 6.99373f, 14.9256f, 7.03246f, 14.6346f, 7.11571f)
        curveTo(13.9894f, 7.30031f, 13.4448f, 7.77678f, 12.3558f, 8.7297f)
        lineTo(11f, 9.91601f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 4.5f)
        lineTo(8f, 4.5f)
        moveTo(2f, 4.5f)
        curveTo(2f, 3.79977f, 3.9943f, 2.49153f, 4.5f, 2f)
        moveTo(2f, 4.5f)
        curveTo(2f, 5.20023f, 3.9943f, 6.50847f, 4.5f, 7f)
        }
        }.build()

        return _pointingLeft04!!
    }

private var _pointingLeft04: ImageVector? = null
