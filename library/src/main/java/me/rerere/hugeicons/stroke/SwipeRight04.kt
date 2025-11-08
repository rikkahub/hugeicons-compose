package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SwipeRight04: ImageVector
    get() {
        if (_swipeRight04 != null) {
            return _swipeRight04!!
        }
        _swipeRight04 = ImageVector.Builder(
            name = "SwipeRight04",
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
        moveTo(6.41601f, 14.5f)
        verticalLineTo(11f)
        moveTo(6.41601f, 11f)
        verticalLineTo(4.75f)
        curveTo(6.41601f, 3.7835f, 7.19951f, 3f, 8.16601f, 3f)
        curveTo(9.1325f, 3f, 9.91601f, 3.7835f, 9.91601f, 4.75f)
        verticalLineTo(10f)
        lineTo(12.993f, 10.4776f)
        curveTo(14.9216f, 10.7669f, 15.886f, 10.9115f, 16.5652f, 11.3184f)
        curveTo(17.6872f, 11.9906f, 18.5f, 13f, 18.5f, 14.4736f)
        curveTo(18.5f, 15.5f, 18.2463f, 16.1886f, 17.6296f, 18.0387f)
        curveTo(17.2383f, 19.2127f, 17.0426f, 19.7996f, 16.7236f, 20.2643f)
        curveTo(16.1983f, 21.0293f, 15.4233f, 21.5878f, 14.5315f, 21.8442f)
        curveTo(13.9898f, 22f, 13.3711f, 22f, 12.1336f, 22f)
        horizontalLineTo(10.7287f)
        curveTo(8.94422f, 22f, 8.05198f, 22f, 7.28584f, 21.6651f)
        curveTo(6.9397f, 21.5137f, 6.61674f, 21.3141f, 6.32659f, 21.0722f)
        curveTo(5.68438f, 20.5367f, 5.28536f, 19.7387f, 4.48731f, 18.1426f)
        curveTo(3.84015f, 16.8483f, 3.51657f, 16.2011f, 3.50083f, 15.5302f)
        curveTo(3.49373f, 15.2276f, 3.53246f, 14.9256f, 3.61571f, 14.6346f)
        curveTo(3.80031f, 13.9894f, 4.27678f, 13.4448f, 5.2297f, 12.3558f)
        lineTo(6.41601f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 4.5f)
        lineTo(14.5f, 4.5f)
        moveTo(20.5f, 4.5f)
        curveTo(20.5f, 3.79977f, 18.5057f, 2.49153f, 18f, 2f)
        moveTo(20.5f, 4.5f)
        curveTo(20.5f, 5.20023f, 18.5057f, 6.50847f, 18f, 7f)
        }
        }.build()

        return _swipeRight04!!
    }

private var _swipeRight04: ImageVector? = null
