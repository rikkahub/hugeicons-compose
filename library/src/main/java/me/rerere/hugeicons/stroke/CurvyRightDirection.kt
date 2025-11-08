package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CurvyRightDirection: ImageVector
    get() {
        if (_curvyRightDirection != null) {
            return _curvyRightDirection!!
        }
        _curvyRightDirection = ImageVector.Builder(
            name = "CurvyRightDirection",
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
        moveTo(20.0029f, 15.0004f)
        curveTo(20.0029f, 15.0004f, 22.0019f, 13.5274f, 22.0019f, 13.0004f)
        curveTo(22.0019f, 12.4733f, 20.0029f, 11.0004f, 20.0029f, 11.0004f)
        moveTo(21.7771f, 12.8677f)
        curveTo(20.3654f, 13.1577f, 17.7194f, 13.2702f, 16.4089f, 10.8165f)
        curveTo(15.8656f, 9.95293f, 15.9675f, 8.50693f, 15.9675f, 6.8613f)
        curveTo(15.9336f, 6.19049f, 15.3622f, 4.97019f, 13.93f, 5.00081f)
        curveTo(12.4979f, 5.03143f, 12.0277f, 6.20757f, 11.9716f, 6.79182f)
        verticalLineTo(16.9024f)
        curveTo(11.9861f, 17.7541f, 11.4924f, 18.9995f, 9.97603f, 18.9995f)
        curveTo(8.49556f, 18.9995f, 7.91604f, 17.6875f, 8.04374f, 16.7039f)
        curveTo(8.38959f, 14.0398f, 7.58132f, 11.2475f, 4.08109f, 11.0033f)
        horizontalLineTo(1.99707f)
        }
        }.build()

        return _curvyRightDirection!!
    }

private var _curvyRightDirection: ImageVector? = null
