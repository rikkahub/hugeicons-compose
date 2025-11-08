package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SolarSystem01: ImageVector
    get() {
        if (_solarSystem01 != null) {
            return _solarSystem01!!
        }
        _solarSystem01 = ImageVector.Builder(
            name = "SolarSystem01",
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
        moveTo(3.5f, 6.72958f)
        curveTo(2.54913f, 8.25986f, 2f, 10.0658f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(13.0452f, 22f, 14.053f, 21.8396f, 15f, 21.5422f)
        moveTo(20.353f, 17.5f)
        curveTo(21.394f, 15.9221f, 22f, 14.0318f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(10.9548f, 2f, 9.94704f, 2.16035f, 9f, 2.4578f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 17f)
        curveTo(14.7614f, 17f, 17f, 14.7614f, 17f, 12f)
        curveTo(17f, 9.23858f, 14.7614f, 7f, 12f, 7f)
        curveTo(9.23858f, 7f, 7f, 9.23858f, 7f, 12f)
        curveTo(7f, 12.3425f, 7.03443f, 12.6769f, 7.10002f, 13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.009f, 12f)
        horizontalLineTo(12f)
        }
        }.build()

        return _solarSystem01!!
    }

private var _solarSystem01: ImageVector? = null
