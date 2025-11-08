package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TestTube03: ImageVector
    get() {
        if (_testTube03 != null) {
            return _testTube03!!
        }
        _testTube03 = ImageVector.Builder(
            name = "TestTube03",
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
        moveTo(8.0155f, 2.00177f)
        horizontalLineTo(15.975f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.53308f, 11.1499f)
        curveTo(5.53308f, 11.1499f, 8.53308f, 10.224f, 11.0331f, 13.0015f)
        moveTo(18.5331f, 11.6128f)
        curveTo(18.5331f, 11.6128f, 17.9215f, 12.592f, 17.0331f, 13.0017f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.0331f, 18.0037f)
        lineTo(10.0418f, 18.0013f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.0331f, 14.0037f)
        lineTo(14.0418f, 14.0013f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.52681f, 2.21466f)
        verticalLineTo(6.25726f)
        curveTo(9.52681f, 6.91922f, 9.17507f, 7.49f, 8.59392f, 7.80145f)
        curveTo(5.60873f, 9.40126f, 2.80483f, 13.9338f, 5.74597f, 18.5791f)
        curveTo(6.40428f, 19.7186f, 8.57672f, 21.9977f, 12f, 21.9977f)
        curveTo(15.4232f, 21.9977f, 17.5956f, 19.7186f, 18.2539f, 18.5791f)
        curveTo(21.1951f, 13.9338f, 18.3912f, 9.40126f, 15.406f, 7.80145f)
        curveTo(14.8248f, 7.49f, 14.4724f, 6.91922f, 14.4724f, 6.25726f)
        verticalLineTo(2.26344f)
        }
        }.build()

        return _testTube03!!
    }

private var _testTube03: ImageVector? = null
