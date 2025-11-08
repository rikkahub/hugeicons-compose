package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PointingLeft03: ImageVector
    get() {
        if (_pointingLeft03 != null) {
            return _pointingLeft03!!
        }
        _pointingLeft03 = ImageVector.Builder(
            name = "PointingLeft03",
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
        moveTo(12.671f, 7.87124f)
        lineTo(14.5f, 10.0051f)
        lineTo(4.75f, 10.0051f)
        curveTo(3.7835f, 10.0051f, 3f, 10.7886f, 3f, 11.7551f)
        curveTo(3f, 12.7216f, 3.7835f, 13.5051f, 4.75f, 13.5051f)
        horizontalLineTo(10f)
        lineTo(10.4776f, 16.493f)
        curveTo(10.7669f, 18.4216f, 10.9115f, 19.386f, 11.3184f, 20.0652f)
        curveTo(11.9906f, 21.1872f, 13f, 22f, 14.4736f, 22f)
        curveTo(15.5f, 22f, 16.1886f, 21.7463f, 18.0387f, 21.1296f)
        curveTo(19.2127f, 20.7383f, 19.7996f, 20.5426f, 20.2643f, 20.2236f)
        curveTo(21.0293f, 19.6983f, 21.5878f, 18.9233f, 21.8442f, 18.0315f)
        curveTo(22f, 17.4898f, 22f, 16.8711f, 22f, 15.6336f)
        verticalLineTo(14.5847f)
        curveTo(22f, 12.9395f, 22f, 12.1169f, 21.6981f, 11.3846f)
        curveTo(21.644f, 11.2533f, 21.5829f, 11.1249f, 21.5151f, 11.0001f)
        curveTo(21.1371f, 10.304f, 20.4987f, 9.78533f, 19.2219f, 8.74791f)
        lineTo(15.0883f, 5.38941f)
        curveTo(14.4531f, 4.87331f, 13.5441f, 4.86987f, 12.905f, 5.38114f)
        curveTo(12.1369f, 5.99565f, 12.0308f, 7.12437f, 12.671f, 7.87124f)
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

        return _pointingLeft03!!
    }

private var _pointingLeft03: ImageVector? = null
