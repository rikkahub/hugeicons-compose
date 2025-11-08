package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PointingLeft02: ImageVector
    get() {
        if (_pointingLeft02 != null) {
            return _pointingLeft02!!
        }
        _pointingLeft02 = ImageVector.Builder(
            name = "PointingLeft02",
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
        moveTo(22f, 19.8917f)
        horizontalLineTo(20.382f)
        curveTo(19.4564f, 19.8917f, 18.488f, 20.6158f, 17.6892f, 20.9983f)
        curveTo(16.2125f, 21.7055f, 13.3226f, 22.6731f, 11.9618f, 21.3209f)
        curveTo(9.81667f, 19.1893f, 9.42404f, 16.2081f, 9.5f, 14.4999f)
        lineTo(3.75f, 14.4999f)
        curveTo(2.7835f, 14.4999f, 2f, 13.7164f, 2f, 12.7499f)
        curveTo(2f, 11.7834f, 2.7835f, 10.9999f, 3.75f, 10.9999f)
        lineTo(10.0001f, 10.9999f)
        moveTo(10.0001f, 10.9999f)
        lineTo(14f, 10.9999f)
        moveTo(10.0001f, 10.9999f)
        curveTo(10.0177f, 10.9765f, 12.1753f, 8.12164f, 13.6086f, 7.62367f)
        curveTo(14.8916f, 7.17793f, 16.0336f, 8.03229f, 17.0914f, 8.67457f)
        curveTo(17.9105f, 9.1719f, 19.9316f, 11f, 21.0049f, 11f)
        horizontalLineTo(22f)
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

        return _pointingLeft02!!
    }

private var _pointingLeft02: ImageVector? = null
