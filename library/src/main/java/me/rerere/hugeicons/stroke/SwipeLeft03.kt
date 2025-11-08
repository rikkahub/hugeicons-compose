package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SwipeLeft03: ImageVector
    get() {
        if (_swipeLeft03 != null) {
            return _swipeLeft03!!
        }
        _swipeLeft03 = ImageVector.Builder(
            name = "SwipeLeft03",
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
        moveTo(5.87124f, 12.671f)
        lineTo(8.00514f, 14.5f)
        verticalLineTo(4.75f)
        curveTo(8.00514f, 3.7835f, 8.78864f, 3f, 9.75514f, 3f)
        curveTo(10.7216f, 3f, 11.5051f, 3.7835f, 11.5051f, 4.75f)
        verticalLineTo(10f)
        lineTo(14.493f, 10.4776f)
        curveTo(16.4216f, 10.7669f, 17.386f, 10.9115f, 18.0652f, 11.3184f)
        curveTo(19.1872f, 11.9906f, 20f, 13f, 20f, 14.4736f)
        curveTo(20f, 15.5f, 19.7463f, 16.1886f, 19.1296f, 18.0387f)
        curveTo(18.7383f, 19.2127f, 18.5426f, 19.7996f, 18.2236f, 20.2643f)
        curveTo(17.6983f, 21.0293f, 16.9233f, 21.5878f, 16.0315f, 21.8442f)
        curveTo(15.4898f, 22f, 14.8711f, 22f, 13.6336f, 22f)
        horizontalLineTo(12.5847f)
        curveTo(10.9395f, 22f, 10.1169f, 22f, 9.38462f, 21.6981f)
        curveTo(9.25329f, 21.644f, 9.12494f, 21.5829f, 9.00012f, 21.5151f)
        curveTo(8.30405f, 21.1371f, 7.78533f, 20.4987f, 6.74791f, 19.2219f)
        lineTo(3.38941f, 15.0883f)
        curveTo(2.87331f, 14.4531f, 2.86987f, 13.5441f, 3.38114f, 12.905f)
        curveTo(3.99565f, 12.1369f, 5.12437f, 12.0308f, 5.87124f, 12.671f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 4.5f)
        lineTo(21f, 4.5f)
        moveTo(15f, 4.5f)
        curveTo(15f, 3.79977f, 16.9943f, 2.49153f, 17.5f, 2f)
        moveTo(15f, 4.5f)
        curveTo(15f, 5.20023f, 16.9943f, 6.50847f, 17.5f, 7f)
        }
        }.build()

        return _swipeLeft03!!
    }

private var _swipeLeft03: ImageVector? = null
