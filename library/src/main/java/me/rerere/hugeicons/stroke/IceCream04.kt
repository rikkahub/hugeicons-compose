package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.IceCream04: ImageVector
    get() {
        if (_iceCream04 != null) {
            return _iceCream04!!
        }
        _iceCream04 = ImageVector.Builder(
            name = "IceCream04",
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
        moveTo(16.9689f, 9.04176f)
        curveTo(16.8199f, 9.01423f, 16.6664f, 8.99984f, 16.5094f, 8.99984f)
        curveTo(15.6895f, 8.99984f, 14.9616f, 9.39251f, 14.5043f, 9.99958f)
        moveTo(16.9689f, 9.04176f)
        curveTo(18.7733f, 9.37521f, 19.5986f, 11.5609f, 18.5145f, 13f)
        horizontalLineTo(6.48388f)
        curveTo(5.28562f, 11.4092f, 6.44796f, 8.99984f, 8.48899f, 8.99984f)
        moveTo(16.9689f, 9.04176f)
        curveTo(17.5621f, 5.23504f, 13.3655f, 6.22849f, 12.6771f, 3.92272f)
        curveTo(12.4926f, 3.30496f, 12.6431f, 2.57097f, 13.5018f, 2f)
        curveTo(10.9742f, 2f, 9.22685f, 3.55661f, 9.57139f, 5.17479f)
        moveTo(9.57139f, 5.17479f)
        curveTo(9.70516f, 5.80304f, 10.1542f, 6.44057f, 10.9954f, 6.99989f)
        moveTo(9.57139f, 5.17479f)
        curveTo(7.31821f, 6.06511f, 7.59942f, 9.46523f, 9.99282f, 9.94981f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.80394f, 18.8677f)
        lineTo(6.5f, 13f)
        horizontalLineTo(18.5f)
        lineTo(17.1961f, 18.8677f)
        curveTo(16.8624f, 20.3694f, 16.6955f, 21.1202f, 16.1471f, 21.5601f)
        curveTo(15.5987f, 22f, 14.8296f, 22f, 13.2913f, 22f)
        horizontalLineTo(11.7087f)
        curveTo(10.1704f, 22f, 9.4013f, 22f, 8.85289f, 21.5601f)
        curveTo(8.30448f, 21.1202f, 8.13763f, 20.3694f, 7.80394f, 18.8677f)
        }
        }.build()

        return _iceCream04!!
    }

private var _iceCream04: ImageVector? = null
