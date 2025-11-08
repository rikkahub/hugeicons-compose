package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Facebook02: ImageVector
    get() {
        if (_facebook02 != null) {
            return _facebook02!!
        }
        _facebook02 = ImageVector.Builder(
            name = "Facebook02",
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
        moveTo(6.18182f, 10.3333f)
        curveTo(5.20406f, 10.3333f, 5f, 10.5252f, 5f, 11.4444f)
        verticalLineTo(13.1111f)
        curveTo(5f, 14.0304f, 5.20406f, 14.2222f, 6.18182f, 14.2222f)
        horizontalLineTo(8.54545f)
        verticalLineTo(20.8889f)
        curveTo(8.54545f, 21.8081f, 8.74951f, 22f, 9.72727f, 22f)
        horizontalLineTo(12.0909f)
        curveTo(13.0687f, 22f, 13.2727f, 21.8081f, 13.2727f, 20.8889f)
        verticalLineTo(14.2222f)
        horizontalLineTo(15.9267f)
        curveTo(16.6683f, 14.2222f, 16.8594f, 14.0867f, 17.0631f, 13.4164f)
        lineTo(17.5696f, 11.7497f)
        curveTo(17.9185f, 10.6014f, 17.7035f, 10.3333f, 16.4332f, 10.3333f)
        horizontalLineTo(13.2727f)
        verticalLineTo(7.55556f)
        curveTo(13.2727f, 6.94191f, 13.8018f, 6.44444f, 14.4545f, 6.44444f)
        horizontalLineTo(17.8182f)
        curveTo(18.7959f, 6.44444f, 19f, 6.25259f, 19f, 5.33333f)
        verticalLineTo(3.11111f)
        curveTo(19f, 2.19185f, 18.7959f, 2f, 17.8182f, 2f)
        horizontalLineTo(14.4545f)
        curveTo(11.191f, 2f, 8.54545f, 4.48731f, 8.54545f, 7.55556f)
        verticalLineTo(10.3333f)
        horizontalLineTo(6.18182f)
        }
        }.build()

        return _facebook02!!
    }

private var _facebook02: ImageVector? = null
