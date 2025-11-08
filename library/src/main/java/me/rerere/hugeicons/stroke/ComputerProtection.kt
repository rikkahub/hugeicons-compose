package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ComputerProtection: ImageVector
    get() {
        if (_computerProtection != null) {
            return _computerProtection!!
        }
        _computerProtection = ImageVector.Builder(
            name = "ComputerProtection",
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
        moveTo(22f, 13f)
        curveTo(21.9221f, 14.8723f, 21.671f, 16.0203f, 20.8614f, 16.8284f)
        curveTo(19.6878f, 18f, 17.7989f, 18f, 14.021f, 18f)
        horizontalLineTo(10.014f)
        curveTo(6.23617f, 18f, 4.34725f, 18f, 3.17362f, 16.8284f)
        curveTo(2f, 15.6569f, 2f, 13.7712f, 2f, 10f)
        curveTo(2f, 6.22876f, 2f, 4.34315f, 3.17362f, 3.17157f)
        curveTo(4.34725f, 2f, 6.23617f, 2f, 10.014f, 2f)
        horizontalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 18f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 22f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 15f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 5.5f)
        verticalLineTo(3f)
        curveTo(20f, 3f, 18.5f, 2f, 18.5f, 2f)
        curveTo(18.5f, 2f, 17f, 3f, 15f, 3f)
        verticalLineTo(5.5f)
        curveTo(15f, 9f, 18.5f, 10f, 18.5f, 10f)
        curveTo(18.5f, 10f, 22f, 9f, 22f, 5.5f)
        }
        }.build()

        return _computerProtection!!
    }

private var _computerProtection: ImageVector? = null
