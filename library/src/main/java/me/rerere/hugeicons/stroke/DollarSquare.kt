package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.DollarSquare: ImageVector
    get() {
        if (_dollarSquare != null) {
            return _dollarSquare!!
        }
        _dollarSquare = ImageVector.Builder(
            name = "DollarSquare",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.77027f, 2.5f, 5.6554f, 3.69797f, 4.25276f)
        curveTo(3.86808f, 4.05358f, 4.05358f, 3.86808f, 4.25276f, 3.69797f)
        curveTo(5.6554f, 2.5f, 7.77027f, 2.5f, 12f, 2.5f)
        curveTo(16.2297f, 2.5f, 18.3446f, 2.5f, 19.7472f, 3.69797f)
        curveTo(19.9464f, 3.86808f, 20.1319f, 4.05358f, 20.302f, 4.25276f)
        curveTo(21.5f, 5.6554f, 21.5f, 7.77027f, 21.5f, 12f)
        curveTo(21.5f, 16.2297f, 21.5f, 18.3446f, 20.302f, 19.7472f)
        curveTo(20.1319f, 19.9464f, 19.9464f, 20.1319f, 19.7472f, 20.302f)
        curveTo(18.3446f, 21.5f, 16.2297f, 21.5f, 12f, 21.5f)
        curveTo(7.77027f, 21.5f, 5.6554f, 21.5f, 4.25276f, 20.302f)
        curveTo(4.05358f, 20.1319f, 3.86808f, 19.9464f, 3.69797f, 19.7472f)
        curveTo(2.5f, 18.3446f, 2.5f, 16.2297f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.7102f, 10.0611f)
        curveTo(14.6111f, 9.29844f, 13.7354f, 8.06622f, 12.1608f, 8.06619f)
        curveTo(10.3312f, 8.06616f, 9.56136f, 9.07946f, 9.40515f, 9.58611f)
        curveTo(9.16145f, 10.2638f, 9.21019f, 11.6571f, 11.3547f, 11.809f)
        curveTo(14.0354f, 11.999f, 15.1093f, 12.3154f, 14.9727f, 13.956f)
        curveTo(14.836f, 15.5965f, 13.3417f, 15.951f, 12.1608f, 15.9129f)
        curveTo(10.9798f, 15.875f, 9.04764f, 15.3325f, 8.97266f, 13.8733f)
        moveTo(11.9734f, 6.99805f)
        verticalLineTo(8.06982f)
        moveTo(11.9734f, 15.9031f)
        verticalLineTo(16.998f)
        }
        }.build()

        return _dollarSquare!!
    }

private var _dollarSquare: ImageVector? = null
