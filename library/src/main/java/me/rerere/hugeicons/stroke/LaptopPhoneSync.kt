package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LaptopPhoneSync: ImageVector
    get() {
        if (_laptopPhoneSync != null) {
            return _laptopPhoneSync!!
        }
        _laptopPhoneSync = ImageVector.Builder(
            name = "LaptopPhoneSync",
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
        moveTo(15.9999f, 13.5001f)
        verticalLineTo(17.5001f)
        curveTo(15.9999f, 18.9143f, 15.9999f, 19.6214f, 16.4392f, 20.0608f)
        curveTo(16.8786f, 20.5001f, 17.5857f, 20.5001f, 18.9999f, 20.5001f)
        curveTo(20.4141f, 20.5001f, 21.1212f, 20.5001f, 21.5605f, 20.0608f)
        curveTo(21.9999f, 19.6214f, 21.9999f, 18.9143f, 21.9999f, 17.5001f)
        verticalLineTo(13.5001f)
        curveTo(21.9999f, 12.0859f, 21.9999f, 11.3788f, 21.5605f, 10.9395f)
        curveTo(21.1212f, 10.5001f, 20.4141f, 10.5001f, 18.9999f, 10.5001f)
        curveTo(17.5857f, 10.5001f, 16.8786f, 10.5001f, 16.4392f, 10.9395f)
        curveTo(15.9999f, 11.3788f, 15.9999f, 12.0859f, 15.9999f, 13.5001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.99988f, 16.5005f)
        verticalLineTo(8.50049f)
        curveTo(3.99988f, 6.14347f, 3.99988f, 4.96495f, 4.73254f, 4.23272f)
        curveTo(5.46521f, 3.50049f, 6.64442f, 3.50049f, 9.00283f, 3.50049f)
        horizontalLineTo(16.007f)
        curveTo(18.3654f, 3.50049f, 19.5446f, 3.50049f, 20.2773f, 4.23272f)
        curveTo(20.8346f, 4.78969f, 20.9679f, 5.60486f, 20.9999f, 7.00049f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.9999f, 20.5005f)
        horizontalLineTo(2.51567f)
        curveTo(2.13273f, 20.5005f, 1.88367f, 20.1093f, 2.05493f, 19.7769f)
        lineTo(3.99988f, 16.5005f)
        horizontalLineTo(12.9999f)
        }
        }.build()

        return _laptopPhoneSync!!
    }

private var _laptopPhoneSync: ImageVector? = null
